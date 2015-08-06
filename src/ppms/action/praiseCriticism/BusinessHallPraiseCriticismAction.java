package ppms.action.praiseCriticism;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Controller;


public class BusinessHallPraiseCriticismAction {

	@Action(value="login",results={
			@Result(name="success",location="/WEB-INF/content/page/userinfo/Demo.jsp"),
			@Result(name="error",location="/WEB-INF/content/page/userinfo/Demo.jsp")})
	public String login(){
		return null;
	}
}
