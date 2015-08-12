package ppms.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.formula.functions.T;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ppms.action.interfaces.InitPage;
import ppms.domain.OrganizationNj;
import ppms.domain.TbRole;
import ppms.serviceimpl.AuthoritySrviceImp;
import ppms.serviceimpl.EmployeeServiceImp;
import ppms.serviceimpl.InvocationServiceImp;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
* <p>Title: authorityAction</p>
* <p>Description: </p>
* <p>Company: </p> 
* @author QiuLinQian
* @date 2015-8-7上午8:40:48
*/
public class AuthorityAction extends ActionSupport{
	
	protected HttpServletResponse response;
	protected HttpServletRequest request;
	@Autowired
	private AuthoritySrviceImp authoritySrviceImp;
	
	public AuthorityAction() {
		response = ServletActionContext.getResponse();
		request = ServletActionContext.getRequest();
	}
	
	@Action(value ="authority.null.roleSingle.roleAdd", results = {  
	        @Result(name = "success", location = "/WEB-INF/content/page/authority/roleSingleResult.jsp"),  
	        @Result(name = "faild", location="/WEB-INF/content/error.jsp")})
	public String roleSingleResult(){
		return "success";
	}
	
	@Action(value ="authority.null.roleSearch", results = {  
	        @Result(name = "success", location = "/WEB-INF/content/page/authority/roleSearch.jsp"),  
	        @Result(name = "faild", location="/WEB-INF/content/error.jsp")})
	public String roleSearch(){
		
		List<TbRole> tbRoles = new ArrayList<TbRole>();
		tbRoles = authoritySrviceImp.findAllRole();
		
		//System.out.println(tbRoles.get(0).getRolename() + "1");
		//request.setAttribute("tbRole", tbRoles);
		ActionContext actionContext = ActionContext.getContext();
		@SuppressWarnings("unchecked")
		Map<String, Object> request = (Map<String, Object>)actionContext.get("request");
		request.put("tbRole", tbRoles);
		return "success";
	}

}
