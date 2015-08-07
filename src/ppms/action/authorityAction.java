package ppms.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
* <p>Title: authorityAction</p>
* <p>Description: </p>
* <p>Company: </p> 
* @author QiuLinQian
* @date 2015-8-7上午8:40:48
*/
public class authorityAction {
	
	@Action(value ="roleSingleResult", results = {  
	        @Result(name = "success", location = "/WEB-INF/content/page/authority/roleSingleResult.jsp"),  
	        @Result(name = "faild", location="/WEB-INF/content/error.jsp")})
	public String roleSingleResult(){
		return "success";
	}
	
	@Action(value ="roleSearch", results = {  
	        @Result(name = "success", location = "/WEB-INF/content/page/authority/roleSearch.jsp"),  
	        @Result(name = "faild", location="/WEB-INF/content/error.jsp")})
	public String roleSearch(){
		return "success";
	}
}
