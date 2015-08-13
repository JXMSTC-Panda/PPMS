package ppms.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.domain.TbRole;
import ppms.serviceimpl.AuthoritySrviceImp;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
* <p>Title: authorityAction</p>
* <p>Description: </p>
* <p>Company: </p> 
* @author QiuLinQian
* @date 2015-8-7上午8:40:48
*/
public class AuthorityAction extends ActionSupport{
	
	/** 
	* @Fields serialVersionUID : 1.3.0
	*/ 
	protected HttpServletResponse response;
	protected HttpServletRequest request;
	public String userAccountString;
	public String userPasswordString;
	public HttpSession session;
	
	@Autowired
	private AuthoritySrviceImp authoritySrviceImp;
	
	public AuthorityAction() {
		response = ServletActionContext.getResponse();
		request = ServletActionContext.getRequest();
		session = request.getSession(true);
		userAccountString = (String) session.getAttribute("userAccount");
		userPasswordString = (String) session.getAttribute("passWord");
	}
	
	@Action(value ="authority.null.roleSingle.roleAdd", results = {  
	        @Result(name = "success", location = "/WEB-INF/content/page/authority/roleSingleResult.jsp"),  
	        @Result(name = "faild", location="/WEB-INF/content/error.jsp")})
	public String roleSingleResult(){
		return "success";
	}
	
	@Action(value ="authority.null.roleSearch", results = {  
	        @Result(name = "success", location = "/WEB-INF/content/page/authority/roleSearch.jsp"),  
	        @Result(name = "faild", location="/WEB-INF/content/error.jsp")})
	public String roleSearch(){
		
		// 创建ActionContext的对象并调用getContext()方法
		ActionContext actionContext = ActionContext.getContext();
		// 获取出request对象
		Map<String, Object> map = (Map) actionContext.get("request");
		try {
			
			System.out.println("create skipSelectSingle");
			List<TbRole> tbRoles = new ArrayList<TbRole>();
			tbRoles = authoritySrviceImp.findAllRole();
			map.put("tbRoleslist",tbRoles);
			return "success";
		} catch (Exception e) {
			
			//e.printStackTrace();
			System.out.println("faild");
			return "faild";
		}
		
	}
	/**
	 * 
	* @Title: login 
	* @Description: 登录验证成功后跳转到控制台
	* @return String    
	* @author QiuLinQian
	* @time 2015年8月11日19:59:35   
	* @throws
	 */
	@Action(value = "index.tachometer", results = {  
		    @Result(name = "success", location = "/WEB-INF/content/page/tachometer.jsp"),  
	        @Result(name = "faild", location="/WEB-INF/content/error.jsp")})
	public String login(){
		System.out.println(userAccountString);
		return "success";
	}

}
