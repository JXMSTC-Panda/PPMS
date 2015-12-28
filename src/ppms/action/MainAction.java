package ppms.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import ppms.domain.TbEmployee;
import ppms.domain.TbRole;
import ppms.domain.TbRolefunction;
import ppms.domain.TbSystemfunction;
import ppms.serviceimpl.*;
import ppms.shiro.MyRealm;
import ppms.shiro.MySubject;

/**
 * <p>
 * Title: MainAction
 * </p>
 * <p>
 * Description: 主要实现登录验证
 * </p>
 * <p>
 * Company:（c）版权所有 2015 NCHU.QQL
 * </p>
 * <p>
 * Version:
 * </p>
 * 
 * @author TyurinTsien
 * @date 2015-8-13下午2:49:34
 */
public class MainAction extends ActionSupport {

	@Autowired
	EmployeeServiceImp employeeServiceImp;
	@Autowired
	AuthoritySrviceImp authoritySrviceImp;

	protected HttpServletResponse response;
	protected HttpServletRequest request;
	public String userAccountString;
	public String userPasswordString;
	private String ajaxState;

	/**
	 * MainAction构造函数
	 */
	public MainAction() {

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

		List<TbEmployee> employees = employeeServiceImp.loginHelp(
				userAccountString, userPasswordString);
		// 登录验证
		ajaxState = String.valueOf(employees.size());
		if (ajaxState.equals("1")) {

			TbEmployee tbEmployee = new TbEmployee();
			TbRole tbRole = new TbRole();
			TbRolefunction tbRolefunction = new TbRolefunction();

			// 验证通过记录session
			HttpSession session = request.getSession(true);
			tbEmployee = employees.get(0);
			// session记录员工ID
			session.setAttribute("tbEmployeeIDSession",
					tbEmployee.getEmployeeid());
			// 得到当前的角色ID
			String roleID = tbEmployee.getTbRole().getRoleid();
			System.out.println(roleID);
			// 角色信息
			tbRole = authoritySrviceImp.findRoleByRoleID(roleID);
			System.out.println(tbRole.getRoleid());
			// 角色功能
			tbRolefunction = authoritySrviceImp.findTbRoleFunction(roleID);
			System.out.println(tbRolefunction.getFunctionids());

			// 创建当前登录对象
			MySubject mySubject = new MySubject();
			mySubject.CreatMySubject(tbEmployee, tbRole, tbRolefunction);

			authoritySrviceImp.findAllSystemfunctions();
			
			System.out.println(mySubject.getTbEmployee().getEmployeeid()
					+ mySubject.getTbRole().getRoleid()
					+ mySubject.tbRolefunction.getFunctionids()
					+"\n"
					+"√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√");
			
		}
		System.out.println(request.getRequestURI());
		response.getWriter().write(ajaxState);
	}
	@Action(value = "menu")
	public void menu() throws IOException {
		
	}
}
