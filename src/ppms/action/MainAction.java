package ppms.action;

import java.io.IOException;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import ppms.serviceimpl.*;

public class MainAction extends ActionSupport {

	@Autowired
	EmployeeServiceImp employeeServiceImp;
	
	protected HttpServletResponse response;
	protected HttpServletRequest request;
	public String userAccountString;
	public String userPasswordString;
	private String ajaxState;

	public MainAction() {
		response = ServletActionContext.getResponse();
		request = ServletActionContext.getRequest();
		ajaxState = "0";
	}
	
	/**
	 * 
	* @Title: login 
	* @Description: 登录验证Ajax
	* @throws IOException     
	* @return void
	* @author QiuLinQian
	* @time 2015年8月11日16:23:57     
	* @throws
	 */
	@Action(value = "login")
	public void loginCheck() throws IOException {
		
		userAccountString = request.getParameter("userAccount");
		userPasswordString = request.getParameter("passWord");
		//登录验证
		ajaxState = employeeServiceImp.findEmployeeForLogin(userAccountString, userPasswordString);
		response.getWriter().write(ajaxState);
	}
	/**
	 * 
	* @Title: login 
	* @Description: 登录验证成功后跳转到控制台
	* @return String    
	* @author QiuLinQian
	* @time 2015年8月11日19:59:35   
	* @throws
	 */
	@Action(value = "index.tachometer.login", results = {  
		    @Result(name = "success", location = "/WEB-INF/content/page/tachometer.jsp"),  
	        @Result(name = "faild", location="/WEB-INF/content/error.jsp")})
	public String login(){
		//记录Session
		HttpSession session = request.getSession(true);
		session.setAttribute("userAccount", userAccountString);
		session.setAttribute("userPassword", userPasswordString);
		return "success";
	}
	
}
