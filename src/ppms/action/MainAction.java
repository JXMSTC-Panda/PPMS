package ppms.action;

import org.apache.struts2.convention.annotation.Action;

import com.opensymphony.xwork2.ActionSupport;


public class MainAction extends ActionSupport{
	
	@Action(value = "authority.null.roleSingle.login")
	public void login() {
		System.out.print("Success");
	}
}
