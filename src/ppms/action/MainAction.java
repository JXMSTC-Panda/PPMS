package ppms.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ppms.serviceimpl.UserServiceImp;

@Controller
public class MainAction {

	@Autowired
	public UserServiceImp service;

	@Action("/test")
	public String Test() {

		try {
			service.get();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return "success";
		}

	}
<<<<<<< HEAD
	
	@Action(value ="login", results = {  
	        @Result(name = "success", location = "/WEB-INF/content/page/userinfo/Demo.jsp"),  
	        @Result(name = "faild", location="/WEB-INF/content/error.jsp")})
	public String login(){
		
=======

	@Action(value = "login", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/Demo.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String login() {

>>>>>>> 587709422117a56a2a3a4615ac56bea1d5295f84
		return "success";

	}
}
