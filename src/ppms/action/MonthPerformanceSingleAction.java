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
public class MonthPerformanceSingleAction extends ActionSupport implements
		InitPage {

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

		MonthPerformanceServicelmp service = WebApplicationContextUtils
				.getWebApplicationContext(servletContext).getBean(
						MonthPerformanceServicelmp.class);
		// 获取所有营业厅
		switch (url) {

		case "performance.monthPerformanceSingle":
			List<OrganizationNj> organizations = service.getOrganizationNjs();
			List<TbEmployee> tbEmployees = service.getEmployees();
			List<TbPerformance> performances = service.getPerformances();

			map.put("performances", performances);
			map.put("orgs", organizations);

			map.put("employees", tbEmployees);
			break;

		default:
			break;
		}
		return map;
	}

	

	@Action(value = "performacesEmployeeSelect", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/selectSingleEmployee.jsp"),// 返回值为success时跳转的页面路径
			@Result(name = "error", location = "/WEB-INF/content/page/selectSingleEmployee.jsp") })
	
	// 返回值为error时跳转的页面路径
	public String performacesEmployeeSelect() {
		System.out.println("------>>>>>>ccz");
		ActionContext actionContext = ActionContext.getContext();// 创建ActionContext的对象并调用getContext()方法
		Map<String, Object> request = (Map) actionContext.get("request");// 获取出request对象
		try {

			System.out.println("create performacesEmployeeSelect");
			
			// 查询所有员工信息
			List<TbEmployee> employeeResults = service.getEmployees();

			// 新建一个TbEmployee类型的空的list，名称为emploeesInfo
			List<TbEmployee> emploeesInfo = new ArrayList<TbEmployee>();

			for (TbEmployee tbEmployee : employeeResults) {// 遍历
				
				OrganizationNj organizationNj = tbEmployee.getOrganizationNj();
				
				Integer orgid = organizationNj.getOrgid();
				
				List<OrganizationNj> organizationNjResults = service
						
						.getOrganizationNjs();// 执行findOrganizationNjInfor方法，根据营业厅编号查询同步营业厅信息
				
				tbEmployee.setOrganizationNj(organizationNjResults.get(0));// 将同步营业厅信息set进对象organizationNj中

				emploeesInfo.add(tbEmployee);// 设置对TbEmployee的策略
			}
			request.put("employeeInfos", emploeesInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("success");
		return "success";

	}

}
