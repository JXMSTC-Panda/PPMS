package ppms.action;

import java.io.IOException;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import ppms.serviceimpl.*;

/**
* <p>Title: MainAction</p>
* <p>Description: 主要实现登录验证</p>
* <p>Company:（c）版权所有 2015 NCHU.QQL</p> 
* <p>Version:</p>
* @author TyurinTsien
* @date 2015-8-13下午2:49:34
*/
public class MainAction extends ActionSupport{

	@Autowired
	EmployeeServiceImp employeeServiceImp;

	protected HttpServletResponse response;
	protected HttpServletRequest request;
	public String userAccountString;
	public String userPasswordString;
	private String ajaxState;

	/**
	 * MainAction构造函数
	 */
	public MainAction(){

		response = ServletActionContext.getResponse();
		request = ServletActionContext.getRequest();
		userAccountString = request.getParameter("userAccount");
		userPasswordString = request.getParameter("passWord");
		ajaxState = "0";
	}

	/**
	 * 
	 * @Title: loginCheck
	 * @Description: 登录验证Ajax
	 * @throws IOException
	 * @return void
	 * @author QiuLinQian
	 * @time 2015年8月11日16:23:57
	 * @throws
	 */ 
	@Action(value = "login")
	public void loginCheck() throws IOException {

		// 登录验证
		ajaxState = employeeServiceImp.loginCheck(userAccountString,
				userPasswordString);
		if (ajaxState.equals("1")) {
			//验证通过记录session
			HttpSession session = request.getSession(true);
			//session记录员工ID
			session.setAttribute("tbEmployeeIDSession", 
					employeeServiceImp.findEmployeeID(userAccountString, userPasswordString));
		}
		System.out.println(request.getRequestURI());
		response.getWriter().write(ajaxState);
	}

}
