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
<<<<<<< HEAD
	EmployeeServiceImp employeeServiceImp;
=======
	EmployeeServiceImp eImp;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	
	protected HttpServletResponse response;
	protected HttpServletRequest request;
	private String ajaxState;

	public MainAction() {
		response = ServletActionContext.getResponse();
		request = ServletActionContext.getRequest();
	}
	
	@Action(value = "authority.null.roleSingle.login")
	public void login() throws IOException {
		
		String userAcount = request.getParameter("userAccount");
		String passWord = request.getParameter("passWord");
 		
<<<<<<< HEAD
		ajaxState = employeeServiceImp.findEmployeeForLogin(userAcount, passWord);
		response.getWriter().write(ajaxState);
=======
		ajaxState = String.valueOf(eImp.findEmployeeForLogin(userAcount, passWord));
		response.getWriter().write(ajaxState + "1");
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	
	}
}
