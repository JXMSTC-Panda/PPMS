package ppms.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;

import com.opensymphony.xwork2.ActionSupport;

public class MainAction extends ActionSupport {

	protected HttpServletResponse response;
	protected HttpServletRequest request;

	public MainAction() {
		response = ServletActionContext.getResponse();
		request = ServletActionContext.getRequest();
	}
	@Action(value = "authority.null.roleSingle.login")
	public void login() throws IOException {
		
		System.out.print("Success1");
		response.getWriter().write("Success");
	}
}
