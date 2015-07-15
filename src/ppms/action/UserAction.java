package ppms.action;

import ppms.forms.UserForm;
import ppms.service.UserService;
<<<<<<< HEAD
import ppms.serviceImpl.UserServiceImp;
=======
import ppms.serviceimpl.UserServiceImp;
>>>>>>> 26d1baed399ee2a111e8f775f2857a8b903a1b08

public class UserAction {

	private static final String SUCCESS = "success";
	private static final String ERROR = "error";
	
	private UserForm user;
	private UserService service;
<<<<<<< HEAD
	
	//提供get，set，structs2调用封装表单数据到userFrom
=======
>>>>>>> 26d1baed399ee2a111e8f775f2857a8b903a1b08
	public UserForm getUser() {
		return user;
	}
	public void setUser(UserForm user) {
		this.user = user;
	}
<<<<<<< HEAD
	//提供set方法，spring注入实例化service对象（applicationContext.xml配置体现即可）
=======
>>>>>>> 26d1baed399ee2a111e8f775f2857a8b903a1b08
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
