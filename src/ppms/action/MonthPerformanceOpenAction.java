package ppms.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.poi.ss.formula.functions.T;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;


import ppms.action.interfaces.InitPage;
import ppms.domain.OrganizationNj;
import ppms.serviceimpl.OrganizationNjServiceImp;


import com.opensymphony.xwork2.ActionSupport;

public class MonthPerformanceOpenAction  extends ActionSupport implements InitPage  {

	
	/** 
	
	* @字段：organizationNj : 营业厅实体类
	
	*/ 
	private OrganizationNj orgs;
	
	@Autowired
	private OrganizationNjServiceImp service;
	

	/** 
	
	* @字段：request : 定义一个request 前后台传值
	
	*/ 
	protected HttpServletRequest request;
	
	
	

	public MonthPerformanceOpenAction() {
		
		request = ServletActionContext.getRequest();
		
	}
	
	/**
	 * @return the organizationNj
	 */
	public OrganizationNj getOrganizationNj() {
		return orgs;
	}

	/**
	 * @param organizationNj the organizationNj to set
	 */
	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.orgs = organizationNj;
	}

//	/**
//	 * 营业厅 “月度绩效上传功能开通 ”页面数据初始化
//	 */
//	@Override
//	public Map<String, List<T>> initPage(ServletContext servletContext,String url) {
//		// 实例化map
//		Map map = new HashMap<>();
//
//		OrganizationNjServiceImp service = WebApplicationContextUtils
//				.getWebApplicationContext(servletContext).getBean(
//						OrganizationNjServiceImp.class);
//		// 获取所有营业厅
//		switch (url) {
//		case "userInfo.userBaseInfoSingle":
//			List<OrganizationNj> organizations = service.getOrganizations();
//			List<TbPost> tbPosts = service.getTbPosts();			
//			List<TbJob> tbJobs =service.getTbJobs();
//			List<TbEmployee> tbEmployees =service.getTbEmployees();
//			List<TbRole> tbRoles =service.getTbRoles();
//			map.put("roles", tbRoles);
//			map.put("orgs", organizations);
//			map.put("posts", tbPosts);
//			map.put("jobs", tbJobs);
//			map.put("employees", tbEmployees);
//			break;
//		case "userInfo.userBaseInfoSearch":
//			List<TbEmployee> employees =service.getTbEmployees();
//			map.put("employees", employees);
//		default:
//			break;
//		}	
//		return map;
//	}
	
	@Action(value = "performance.month.monthPerformanceOpen", results = {  
		    @Result(name = "success", location = "/WEB-INF/content/page/performance/monthPerformanceOpen.jsp"),  
	        @Result(name = "faild", location="/WEB-INF/content/error.jsp")})
	public String monthPerformanceOpen(){
		
		try {
			List<OrganizationNj> orgs=service.getOrganizationNjs();
			request.setAttribute("orgs", orgs);
		} catch (Exception e) {
			System.out.println("<<<<-------------->>>>>");
			e.printStackTrace();
		}
			
		
		return "success";
	}

	/* (non-Javadoc)
	 * @see ppms.action.interfaces.InitPage#initPage(javax.servlet.ServletContext, java.lang.String)
	 */
	@Override
	public Map<String, List<T>> initPage(ServletContext servletContext,
			String url) {
		// TODO Auto-generated method stub
		return null;
	}

}
