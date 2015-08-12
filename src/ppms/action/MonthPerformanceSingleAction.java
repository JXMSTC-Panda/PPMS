
/**  
* @文件名: MonthPerformanceSingleAction.java 
* @包名 ppms.action 
* @描述: TODO 
* @修改人：
* @修改时间：2015-8-12 上午10:26:36 
* @修改内容：

* @version V1.0  
*/ 
package ppms.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.poi.ss.formula.functions.T;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ppms.action.interfaces.InitPage;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.domain.TbPerformance;
import ppms.domain.TbPost;
import ppms.domain.TbRole;
import ppms.serviceimpl.MonthPerformanceServicelmp;
import ppms.serviceimpl.userBaseInfoServiceImp;

import com.opensymphony.xwork2.ActionSupport;

/**   
 *    
 * 项目名称：PPMS   
 * 类名称：MonthPerformanceSingleAction   
 * 类描述：   
 * 创建人：SuperPcf 
 * 创建时间：2015-8-12 上午10:26:36   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-12 上午10:26:36   
 * 修改备注：   
 * @version    
 *    
 */
public class MonthPerformanceSingleAction extends ActionSupport implements
		InitPage {

	/** 
	
	* @字段：performance : 绩效表实体类
	
	*/ 
	private TbPerformance performance;
	/** 
	
	* @字段：tbArea :区域表实体类
	
	*/ 
	private TbArea tbArea;
	
	/**
	 * @return the tbArea
	 */
	public TbArea getTbArea() {
		return tbArea;
	}

	/**
	 * @param tbArea the tbArea to set
	 */
	public void setTbArea(TbArea tbArea) {
		this.tbArea = tbArea;
	}

	/**
	 * @return the performance
	 */
	public TbPerformance getPerformance() {
		return performance;
	}

	/**
	 * @param performance the performance to set
	 */
	public void setPerformance(TbPerformance performance) {
		this.performance = performance;
	}

	
	
	private MonthPerformanceServicelmp service;
	

	/*
	 * 处理“月度绩效单条录入”
	 * 
	 * @return
	 */
	@Action(value = "performance.month.monthPerformance.add", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/performance/monthPerformanceSingleResult.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String addMonthPerformance() {
		try {
			service.addPerformance(performance);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	} 
	
	@Override
	public Map<String, List<T>> initPage(ServletContext servletContext,
			String url) {

		// 实例化map
				Map map = new HashMap<>();

				MonthPerformanceServicelmp  service = WebApplicationContextUtils
						.getWebApplicationContext(servletContext).getBean(
								MonthPerformanceServicelmp.class);
				// 获取所有营业厅
				switch (url) {
				
				case "performance.monthPerformanceSingle":
					List<OrganizationNj> organizations = service.getOrganizationNjs();
					List<TbEmployee> tbEmployees =service.getEmployees();
					List<TbPerformance> performances=service.getPerformances();
					
					map.put("performances", performances);
					map.put("orgs", organizations);
					
					map.put("employees", tbEmployees);
					break;
				
				default:
					break;
				}	
				return map;
	}

}
