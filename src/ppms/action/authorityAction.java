package ppms.action;

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

import ppms.action.interfaces.InitPage;
import ppms.serviceimpl.EmployeeServiceImp;

import com.opensymphony.xwork2.ActionSupport;

/**
* <p>Title: authorityAction</p>
* <p>Description: </p>
* <p>Company: </p> 
* @author QiuLinQian
* @date 2015-8-7上午8:40:48
*/
public class authorityAction extends ActionSupport implements InitPage{
	
	protected HttpServletResponse response;
	protected HttpServletRequest request;

	public authorityAction() {
		response = ServletActionContext.getResponse();
		request = ServletActionContext.getRequest();
	}
	
	@Action(value ="authority.null.roleSingle.roleAdd", results = {  
	        @Result(name = "success", location = "/WEB-INF/content/page/authority/roleSingleResult.jsp"),  
	        @Result(name = "faild", location="/WEB-INF/content/error.jsp")})
	public String roleSingleResult(){
		return "success";
	}
	
	@Action(value ="authority.null.roleSearch.roleSearch", results = {  
	        @Result(name = "success", location = "/WEB-INF/content/page/authority/roleSearch.jsp"),  
	        @Result(name = "faild", location="/WEB-INF/content/error.jsp")})
	public String roleSearch(){
		return "success";
	}

	@Override
	public Map<String, List<T>> initPage(ServletContext servletContext,
			String url) {
		// TODO Auto-generated method stub
		return null;
	}
}
