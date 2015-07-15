package ppms.action;

import ppms.forms.UserForm;
import ppms.service.UserService;
import ppms.serviceimpl.UserServiceImp;


public class UserAction {

	private static final String SUCCESS = "success";
	private static final String ERROR = "error";
	
	private UserForm user;
	private UserService service;

	
	//提供get，set，structs2调用封装表单数据到userFrom
	public UserForm getUser() {
		return user;
	}
	public void setUser(UserForm user) {
		this.user = user;
	}
	public void setService(UserService service){
		
		this.service=service;
	}
	
	public String register(){
		
		if(!service.isExit(user)){
			if(service.insert_register(user)){
				return SUCCESS;
			}else{
				return ERROR;
			}
		}else{
			return ERROR;
		}
	}
	
}
