
/**  
* @文件名: MonthPerformanceSearchAction.java 
* @包名 ppms.action 
* @描述: TODO 
* @修改人：
* @修改时间：2015-8-11 上午10:52:53 
* @修改内容：

* @version V1.0  
*/ 
package ppms.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.domain.TbPerformance;
import ppms.gason.adapter.TargetStrategy;
import ppms.serviceimpl.MonthPerformanceServicelmp;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionSupport;

/**   
 *    
 * 项目名称：PPMS   
 * 类名称：MonthPerformanceSearchAction   
 * 类描述：   
 * 创建人：SuperPcf 
 * 创建时间：2015-8-11 上午10:52:53   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-11 上午10:52:53   
 * 修改备注：   
 * @version    
 *    
 */
public class MonthPerformanceSearchAction extends ActionSupport {
	
	
	/** 
	
	* @字段：tbPerformance : 绩效表实体类
	
	*/ 
	public TbPerformance tbPerformance;
	
	/**
	 * @return the tbPerformance
	 */
	public TbPerformance getTbPerformance() {
		return tbPerformance;
	}

	/**
	 * @param tbPerformance the tbPerformance to set
	 */
	public void setTbPerformance(TbPerformance tbPerformance) {
		this.tbPerformance = tbPerformance;
	}
	
	/** 
	
	* @字段：service : 绩效表 service
	
	*/ 
	@Autowired
	public MonthPerformanceServicelmp service;

	/**
	 * 点击菜单页面“月度绩效查询”处理初始化数据
	 * 
	 * @return                                             
	 * @throws IOException 
	 */
	@Action(value = "/resource/performance.month.monthPerformanceSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/performance/monthPerformanceSearch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String monthPerformanceSearch() throws IOException {

		List<TbPerformance> performances=null;
		try{
		
			performances=service.getPerformances();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		if (performances!= null) {
			
			Map map=new HashMap<String, List<TbPerformance>>();
			
			//设置对TbEmployee的策略
			TargetStrategy ts = new TargetStrategy(TbPerformance.class );  
			//表示仅转换TbEmployee中的employeename和employeeid属性  
			ts.setFields(new String[]{"performanceid","performancetype"});
			
			ts.setReverse(true);  
			Gson gson = new GsonBuilder().setExclusionStrategies(ts).create();  

			String grid_data = gson.toJson(map);
			HttpServletResponse response=ServletActionContext.getResponse();
			response.getWriter().write(grid_data);
			System.out.println(grid_data);
			return "success";
		} else {
			return "error";
		}
	}

}
