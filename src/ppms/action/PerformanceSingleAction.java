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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.formula.functions.T;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
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

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *        项目名称：PPMS   类名称：MonthPerformanceSingleAction   类描述：   创建人：SuperPcf
 * 创建时间：2015-8-12 上午10:26:36   修改人：（修改人的名字） 修改时间：2015-8-12 上午10:26:36   修改备注：  
 * 
 * @version       
 */
/**   
*    
* 项目名称：PPMS   
* 类名称：PerformanceSingleAction   
* 类描述：   
* 创建人：SuperPcf 
* 创建时间：2015-8-19 下午4:47:11   
* 修改人：（修改人的名字） 
* 修改时间：2015-8-19 下午4:47:11   
* 修改备注：   
* @version    
*    
*/ 
public class PerformanceSingleAction extends ActionSupport {

	/**
	 * 
	 * @字段：performance : 绩效表实体类
	 */
	private TbPerformance performance;
	/**
	 * 
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
	 * @param tbArea
	 *            the tbArea to set
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
	 * @param performance
	 *            the performance to set
	 */
	public void setPerformance(TbPerformance performance) {
		this.performance = performance;
	}

	@Autowired
	private MonthPerformanceServicelmp service;

	
	/** 
	
	* @方法名: monthPerformanceSingle 
	
	* @描述: menu.jsp菜单页跳转到monthPerformanceSingle.jsp月度绩效单条录入
	
	* @param @return    设定文件
	
	* @return String    返回类型
	
	* @throws 
	
	*/ 
	@Action(value="performance.month.monthPerformanceSingle",results={
			@Result(name = "success", location = "/WEB-INF/content/page/performance/monthPerformanceSingle.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp")})
	public String monthPerformanceSingle(){
		return "success";
	}
	
	
	
	/** 
	
	* @方法名: yearPerformanceSingle 
	
	* @描述: menu.jsp菜单页跳转到yearPerformanceSingle.jsp年度绩效单条录入
	
	* @param @return    设定文件
	
	* @return String    返回类型
	
	* @throws 
	
	*/ 
	@Action(value="performance.year.yearPerformanceSingle",results={
			@Result(name = "success", location = "/WEB-INF/content/page/performance/yearPerformanceSingle.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp")})
	public String yearPerformanceSingle(){
		return "success";
	}
	
	/** 
	
	* @方法名: monthPerformanceBatch 
	
	* @描述: menu.jsp菜单页跳转到monthPerformanceBatch.jsp 月度绩效批量导入
	
	* @param @return    设定文件
	
	* @return String    返回类型
	
	* @throws 
	
	*/ 
	@Action(value="performance.month.monthPerformanceBatch",results={
			@Result(name = "success", location = "/WEB-INF/content/page/performance/monthPerformanceBatch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp")})
	public String monthPerformanceBatch(){
		return "success";
	}
	
	/** 
	
	* @方法名: yearPerformanceBatch 
	
	* @描述: menu.jsp菜单页跳转到yearPerformanceBatch.jsp年度绩效批量导入
	
	* @param @return    设定文件
	
	* @return String    返回类型
	
	* @throws 
	
	*/ 
	@Action(value="performance.year.yearPerformanceBatch",results={
			@Result(name = "success", location = "/WEB-INF/content/page/performance/yearPerformanceBatch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp")})
	public String yearPerformanceBatch(){
		return "success";
	}
	
	/*
	 * 处理“‘——月——’度绩效单条录入”
	 * 
	 * @return
	 */
	@Action(value = "performance.month.monthPerformance.add", results = {
			
			//****************************************---------->>>>跳转待修改
			@Result(name = "success", location = "/WEB-INF/content/page/performance/monthPerformanceSingleResult.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String addMonthPerformance() {

		try {

			/**
			 * 这两条语句为测试用
			 */
			performance.setTbEmployee(null);
			performance.setOrganizationNj(null);

			if (!service.addPerformance(performance)) {
				System.out
						.print("**************************&&&&addPerformance失败！&&&*******************");
			}

			List<TbPerformance> tbPer = service.getPerformances();
			for (TbPerformance tb : tbPer) {
				System.out.println("---->>>>" + tb.getPerformanceid());
				System.out.println("----getPerformancedate->>>>"
						+ tb.getPerformancedate());
				System.out.println("---------------->>>>"
						+ tb.getGradestandardfilename());
				System.out.println("---------------------->>>>"
						+ tb.getPerformancescore());
				System.out.println("--------------------------->>>>"
						+ tb.getCreatedtime());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	/*
	 * 处理“‘——年——’度绩效单条录入”
	 * 
	 * @return
	 */
	@Action(value = "performance.year.yearPerformance.add", results = {
			
			//****************************************---------->>>>>>跳转待修改
			@Result(name = "success", location = "/WEB-INF/content/page/performance/yearPerformanceSingleResult.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String addYearPerformance() {

		try {

			/**
			 * 这两条语句为测试用
			 */
			performance.setTbEmployee(null);
			performance.setOrganizationNj(null);

			if (!service.addPerformance(performance)) {
				System.out
						.print("**************************&&&&addPerformance失败！&&&*******************");
			}

			List<TbPerformance> tbPer = service.getPerformances();
			for (TbPerformance tb : tbPer) {
				System.out.println("---->>>>" + tb.getPerformanceid());
				System.out.println("----getPerformancedate->>>>"
						+ tb.getPerformancedate());
				System.out.println("---------------->>>>"
						+ tb.getGradestandardfilename());
				System.out.println("---------------------->>>>"
						+ tb.getPerformancescore());
				System.out.println("--------------------------->>>>"
						+ tb.getCreatedtime());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}


}
