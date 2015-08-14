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
	protected String tbEmployeeID;
	protected HttpSession sessionAuthority;
	
	@Autowired
	private AuthoritySrviceImp authoritySrviceImp;
	
	/**
	 * AuthorityAction构造函数
	 */
	public AuthorityAction() {
		
		response = ServletActionContext.getResponse();
		request = ServletActionContext.getRequest();
		
		sessionAuthority = request.getSession(true);
		tbEmployeeID = (String) sessionAuthority.getAttribute("tbEmployeeIDSession");
		request.setAttribute("tbEmployeeIDSession", tbEmployeeID);
	}
	
	/** 
	* @Title: roleSingleResult 
	* @Description: 角色添加
	* @return     
	* String     
	* @throws 
	*/
	@Action(value ="authority.null.roleSingle.roleAdd", results = {  
	        @Result(name = "success", location = "/WEB-INF/content/page/authority/roleSingleResult.jsp"),  
	        @Result(name = "faild", location="/WEB-INF/content/error.jsp")})
	public String roleSingleResult(){
		if(tbEmployeeID != null)
			return "success";
		else {
			return "faild";
		}
	}
	
	/** 
	* @Title: roleSearch 
	* @Description: roleSearch页面初始化
	* @return     
	* String     
	* @throws 
	*/
	@Action(value ="authority.null.roleSearch", results = {  
	        @Result(name = "success", location = "/WEB-INF/content/page/authority/roleSearch.jsp"),  
	        @Result(name = "faild", location="/WEB-INF/content/error.jsp")})
	public String roleSearch(){
		
		try {	
			
			List<TbRole> tbRoles = new ArrayList<TbRole>();
			//查询所有角色
			tbRoles = authoritySrviceImp.findAllRole();
			request.setAttribute("tbRoleslist", tbRoles);
			if(tbEmployeeID != null)
				return "success";
			else {
				return "faild";
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("faild");
			return "faild";			
		}
		
	}
	/**
	 * 
	* @Title: login 
	* @Description: 登录验证成功后跳转到控制台页面
	* @return String    
	* @author QiuLinQian
	* @time 2015年8月11日19:59:35   
	* @throws
	 */
	@Action(value = "index.tachometer", results = {  
		    @Result(name = "success", location = "/WEB-INF/content/page/tachometer.jsp"),  
	        @Result(name = "faild", location="/WEB-INF/content/error.jsp")})
	public String login(){
		if(tbEmployeeID != null)
			return "success";
		else {
			return "faild";
		}
	}

}
