package ppms.action;

import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.forms.UserForm;
import ppms.service.UserService;
import ppms.serviceimpl.UserServiceImp;


public class MainAction {

	@Autowired
	public UserServiceImp service;
	
	@Action("/test")
	public String Test(){
		
		service.test();
		return "success";
	}
}
