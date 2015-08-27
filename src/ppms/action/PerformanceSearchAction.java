package ppms.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.poi.ss.formula.functions.T;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.hibernate.criterion.Restrictions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ppms.action.interfaces.BaseInit;
import ppms.action.interfaces.InitPage;
import ppms.daoimpl.BaseDaoImp;
import ppms.domain.OrganizationNj;
import ppms.domain.TbBecomeemployeeexam;
import ppms.domain.TbEmployee;
import ppms.domain.TbFreshemployeeexam;

import ppms.domain.TbPerformance;

import ppms.serviceimpl.MonthPerformanceServicelmp;
import ppms.serviceimpl.PraiseCriticismServiceImp;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;

/**
 *        项目名称：PPMS   类名称：MonthPerformanceSearchAction   类描述：   创建人：SuperPcf
 * 创建时间：2015-8-11 上午10:52:53   修改人：（修改人的名字） 修改时间：2015-8-11 上午10:52:53   修改备注：  
 * 
 * @version       
 */
public class PerformanceSearchAction extends BaseInit {

	/**
	 * 
	 * @字段：tbPerformance : 绩效表实体类
	 */
	public TbPerformance tbPerformance;

	private HttpServletRequest request;

	/**
	 * @return the tbPerformance
	 */
	public TbPerformance getTbPerformance() {
		return tbPerformance;
	}

	/**
	 * @param tbPerformance
	 *            the tbPerformance to set
	 */
	public void setTbPerformance(TbPerformance tbPerformance) {
		this.tbPerformance = tbPerformance;
	}

	/**
	 * 
	 * @字段：service : 绩效表 service
	 */
	@Autowired
	public MonthPerformanceServicelmp service;
	/**
	 * 声明，调用API
	 */
	@Autowired
	@Qualifier("baseDaoImp")
	private BaseDaoImp dao;


	public PerformanceSearchAction() {

		request = ServletActionContext.getRequest();
	}

	/**
	 * 
	 * @方法名: monthPerformanceSearch
	 * 
	 * @描述: 月度绩查询 页面初始化
	 * 
	 * @param @return    设定文件
	 * 
	 * @return String    返回类型
	 * 
	 * @throws
	 */
	@Action(value = "performance.month.monthPerformanceSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/performance/monthPerformanceSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String monthPerformanceSearch() {

		initPage("performance.monthPerformanceSearch");
		toCache();
		return "success";
		
	}

	/**
	 * 
	 * @方法名: yearPerformanceSearch
	 * 
	 * @描述: 年度绩效查询数据初始化
	 * 
	 * @param @return    设定文件
	 * 
	 * @return String    返回类型
	 * 
	 * @throws
	 */
	@Action(value = "performance.year.yearPerformanceSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/performance/yearPerformanceSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String yearPerformanceSearch() {

		initPage("performance.yearPerformanceSearch");
		toCache();
		return "success";
		
	
	}
	
	
	
	
	private void initPage(String url) {
		

		try {
			// 获取所有营业厅
			switch (url) {
			case "performance.monthPerformanceSearch":
				List<TbPerformance> monthPerformances = dao
						.getEntitiestNotLazy(
								new TbPerformance(),
								new String[] { "organizationNj", "tbEmployee" },
								null);
				map.put("tbPerformance", monthPerformances);

				break;
			case "performance.yearPerformanceSearch":
				List<TbPerformance> yearPerformances = dao
						.getEntitiestNotLazy(
								new TbPerformance(),
								new String[] { "organizationNj", "tbEmployee" },
								null);
				map.put("tbPerformance", yearPerformances);
				System.out.println("year");
				break;
			default:
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 实例化map
	}
	
	
	
	

	/**
	 * 点击菜单页面“月度绩效查询”数据删除
	 * 
	 * @return
	 * @throws IOException
	 */
	@Action(value = "performance.month.monthPerformanceSearch.delete", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/performance/monthPerformanceSearch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String deleteMonthPerformance() throws IOException {

//		int i = 0;
//		System.out.println("-------------ok!");

		try {

			// String performanceid =(String)
			// request.getAttribute("performances");
			
			String performanceid = request.getParameter("performanceid");
			
//			System.out.println("-------------->>>" + performanceid);
//			java.util.logging.Logger.getGlobal().info(
//					"Logger------>>>" + performanceid);

			service.delete(performanceid);

			// 删除之后返回月度绩效查询页面并进行数据初始化
			monthPerformanceSearch();
			return "success";
			// service.deletePerformance(performanceid);

		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}

	}

	/**
	 * 点击菜单页面“年度绩效查询”数据删除
	 * 
	 * @return
	 * @throws IOException
	 */
	@Action(value = "performance.year.yearPerformanceSearch.delete", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/performance/yearPerformanceSearch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String deleteYearPerformance() throws IOException {

		int i = 0;
		System.out.println("-------------ok!");

		try {

			// String performanceid =(String)
			// request.getAttribute("performances");
			String performanceid = request.getParameter("performanceid");
//			//System.out.println("-------------->>>" + performanceid);
//			//java.util.logging.Logger.getGlobal().info(
//					"Logger------>>>" + performanceid);

			service.delete(performanceid);

			// //删除之后返回年度绩效查询页面并进行数据初始化
			yearPerformanceSearch();
			return "success";

			// service.deletePerformance(performanceid);

		} catch (Exception e) {

			e.printStackTrace();
			return "error";
		}

	}
	
	/** 
	
	* @方法名: monthPerformanceToUpdate 
	
	* @描述: 从月度绩效查询 跳转到  月度绩效单条修改
	
	* @param @return    设定文件
	
	* @return String    返回类型
	
	* @throws 
	
	*/ 
	@Action(value = "performance.month.monthPerformanceSearch.modify.toUpdate", results={
		@Result(name = "success", location="/WEB-INF/content/page/performance/monthPerformanceUpdate.jsp"),
		@Result(name ="faild", location = "/WEB-INF/content/error.jsp")})
	public String monthPerformanceToUpdate(){
		String performanceid = request.getParameter("performanceid");
		try {
			List<TbPerformance> tbPerformances= dao.getEntitiestNotLazy(new TbPerformance(), new String []{"organizationNj","tbEmployee"},Restrictions.eq("performanceid",performanceid));
			request.setAttribute("tbPerformance", tbPerformances);
			
		} catch (Exception e) {
			e.printStackTrace();
			return "faild";
		}
		return "success";
	}
	
	
	/** 
	
	* @方法名: updateMonthPerformance 
	
	* @描述: 月度绩效 单条修改
	
	* @param @return    设定文件
	
	* @return String    返回类型
	
	* @throws 
	
	*/ 
	@Action(value = "performance.month.monthPerformanceSearch.modify", results={
			@Result(name ="success", location= "/WEB-INF/content/page/performance/monthPerformanceSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp")})
	public String  updateMonthPerformance(){
		try {
			service.update(tbPerformance);
			monthPerformanceSearch();
		} catch (Exception e) {
			e.printStackTrace();
			return "faild";
		}
		
		return "success";
	}
	
	
/** 
	
	* @方法名: yearPerformanceToUpdate 
	
	* @描述: 从年度绩效查询 跳转到  年度绩效单条修改
	
	* @param @return    设定文件
	
	* @return String    返回类型
	
	* @throws 
	
	*/ 
	@Action(value = "performance.year.yearPerformanceSearch.modify.toUpdate", results={
		@Result(name = "success", location="/WEB-INF/content/page/performance/yearPerformanceUpdate.jsp"),
		@Result(name ="faild", location = "/WEB-INF/content/error.jsp")})
	public String yearPerformanceToUpdate(){
		String performanceid = request.getParameter("performanceid");
		try {
			List<TbPerformance> tbPerformances= dao.getEntitiestNotLazy(new TbPerformance(), new String []{"organizationNj","tbEmployee"},Restrictions.eq("performanceid",performanceid));
			request.setAttribute("tbPerformance", tbPerformances);
			
		} catch (Exception e) {
			e.printStackTrace();
			return "faild";
		}
		return "success";
	}
	
	
	/** 
	
	* @方法名: updateMonthPerformance 
	
	* @描述: 年度绩效 单条修改
	
	* @param @return    设定文件
	
	* @return String    返回类型
	
	* @throws 
	
	*/ 
	@Action(value = "performance.year.yearPerformanceSearch.modify", results={
			@Result(name ="success", location= "/WEB-INF/content/page/performance/yearPerformanceSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp")})
	public String  updateYearPerformance(){
		try {
			service.update(tbPerformance);
			yearPerformanceSearch();
		} catch (Exception e) {
			e.printStackTrace();
			return "faild";
		}
		
		return "success";
	}


}
