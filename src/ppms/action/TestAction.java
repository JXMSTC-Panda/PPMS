package ppms.action;

import org.apache.struts2.convention.annotation.Action;

public class TestAction {
	
	private User user;

	public void setUser(User user) {
		this.user = user;
	}

	@Action("/test")
	public String test(){
		
		System.out.println("test");
		return "success";
	}
}
