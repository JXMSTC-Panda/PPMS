package ppms.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Controller;

@Controller
public class MainAction {
	@Action(value ="login", results = {  
	        @Result(name = "success", location = "/WEB-INF/content/page/authority/roleSingle.jsp"),  
	        @Result(name = "faild", location="/WEB-INF/content/error.jsp")})
	public String login(){
		return "success";
	}
}
