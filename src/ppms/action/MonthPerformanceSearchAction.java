
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

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import ppms.domain.TbPerformance;

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
	
	p

	/**
	 * 点击菜单页面“月度绩效查询”处理初始化数据
	 * 
	 * @return
	 */
	@Action(value = "/resource/performance.month.monthPerformanceSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/innovation/innovationSingleResult.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String singleUpload() {

		if (service.addInnovation(innovation)) {
			return "success";
		} else {
			return "error";
		}

	}

}
