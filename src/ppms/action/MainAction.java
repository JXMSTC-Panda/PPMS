package ppms.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import ppms.serviceimpl.*;

public class MainAction extends ActionSupport {

	@Autowired
	EmployeeServiceImp employeeServiceImp;
	
	protected HttpServletResponse response;
	protected HttpServletRequest request;
	private String ajaxState;

	public MainAction() {
		response = ServletActionContext.getResponse();
		request = ServletActionContext.getRequest();
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
	@Action(value = "authority.null.roleSingle.login")
	public void login() throws IOException {
		
		String userAcount = request.getParameter("userAccount");
		String passWord = request.getParameter("passWord");
		//登录验证
		ajaxState = employeeServiceImp.findEmployeeForLogin(userAcount, passWord);
		response.getWriter().write(ajaxState);
	
	}
}
