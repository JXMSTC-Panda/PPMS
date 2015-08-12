package ppms.action;

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
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.domain.TbPost;
import ppms.domain.TbRole;
import ppms.serviceimpl.userBaseInfoServiceImp;

import com.opensymphony.xwork2.ActionSupport;

/*
 * 人员基本信息单条录入类
 */

public class userBaseInfoAction extends ActionSupport implements InitPage {

	private TbEmployee tbEmployee;
	

	public TbEmployee getTbEmployee() {
		return tbEmployee;
	}

	public void setTbEmployee(TbEmployee tbEmployee) {
		this.tbEmployee = tbEmployee;
	}

	@Autowired
	private userBaseInfoServiceImp service;


	public userBaseInfoServiceImp getService() {
		return service;
	}

	public void setService(userBaseInfoServiceImp service) {
		this.service = service;
	}

	/*
	 * 处理人员基本信息录入
	 * 
	 * @return
	 */
	@Action(value = "userInfo.userBase.userBaseInfoSingle.result", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/userBaseInfoSingleResult.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String result() {
		try {
			service.adduserBaseInfo(tbEmployee);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}

	/*
	 * 
	 * 处理人员基本信息录入结果录入跳转
	 * 
	 * @return
	 */

	@Action(value = "userInfo.userBase.userBaseInfoSingle.resultBackSingle", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/userBaseInfoSingle.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String resultBack() {
		return "success";
	}

	/*
	 * 
	 * 处理人员基本信息录入结果查询跳转
	 * 
	 * @return
	 */

	@Action(value = "userInfo.userBase.userBaseInfoSearch.resultBackSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/userBaseInfoSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String resultBackSearch() {
		return "success";
	}

	@Override
	public Map<String, List<T>> initPage(ServletContext servletContext,String url) {
		// 实例化map
		Map map = new HashMap<>();

		userBaseInfoServiceImp service = WebApplicationContextUtils
				.getWebApplicationContext(servletContext).getBean(
						userBaseInfoServiceImp.class);
		// 获取所有营业厅
		switch (url) {
		case "userInfo.userBaseInfoSingle":
			List<OrganizationNj> organizations = service.getOrganizations();
			List<TbPost> tbPosts = service.getTbPosts();			
			List<TbJob> tbJobs =service.getTbJobs();
			List<TbEmployee> tbEmployees =service.getTbEmployees();
			List<TbRole> tbRoles =service.getTbRoles();
			map.put("roles", tbRoles);
			map.put("orgs", organizations);
			map.put("posts", tbPosts);
			map.put("jobs", tbJobs);
			map.put("employees", tbEmployees);
			break;
		
		default:
			break;
		}	
		return map;
	}

}
