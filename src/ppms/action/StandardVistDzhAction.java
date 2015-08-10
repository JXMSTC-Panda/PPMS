package ppms.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

public class StandardVistDzhAction extends ActionSupport{
	@Action(value ="show", results = {  
		    @Result(name = "success", location = "/WEB-INF/content/page/standardVisit/selectBatchBusinessHall.jsp"),  
	        @Result(name = "faild", location="/WEB-INF/content/error.jsp")})
	public String  show(){
		int i = 78;
		return "success";
	}
}
