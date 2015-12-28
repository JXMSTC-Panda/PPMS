package ppms.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.domain.TbRole;
import ppms.serviceimpl.AuthoritySrviceImp;
import ppms.util.TimeStringUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RegexFieldValidator;
import com.sun.net.httpserver.Authenticator.Success;

/**
 * <p>
 * Title: AuthorityAction
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Company:（c）版权所有 2015 NCHU.QQL
 * </p>
 * <p>
 * Version:
 * </p>
 * 
 * @author TyurinTsien
 * @date 2015-8-7上午8:40:48
 */
public class AuthorityAction extends ActionSupport {

	/**
	 * @Fields serialVersionUID : 2.1.0
	 * @date 2015年8月13日19:21:44
	 * @author QiuLinQian
	 */

	@Autowired
	AuthoritySrviceImp authoritySrviceImp;

	protected HttpServletResponse response;
	protected HttpServletRequest request;
	protected String tbEmployeeID;
	protected HttpSession sessionAuthority;

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
	 * @Title: roleSingle
	 * @Description: 跳转到角色添加页面
	 * @return String
	 * @throws
	 */
	@Action(value = "authority.null.roleSingle", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/authority/roleSingle.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/paga/error.jsp") })
	public String roleSingle() {

		return "success";
	}

	/**
	 * @throws IOException
	 * @Title: roleSingleInit
	 * @Description: 角色添加页面初始化ztree(ajax)
	 * @return String
	 * @throws
	 */
	@Action(value = "authority.null.roleSingle.init")
	public void roleSingleInit() throws IOException {

		String[] fieldNames = new String[] { "functionid", "parentfunctionid",
				"functionname" };
		String systemFunctionString = authoritySrviceImp
				.findSystemFunctionJson(fieldNames).replace("functionid", "id")
				.replace("parentid", "pId").replace("functionname", "name");
		System.out.println(systemFunctionString);
		response.getWriter().write(systemFunctionString);
	}

	/**
	 * @throws IOException
	 * @Title: roleSingleResult
	 * @Description: 角色添加
	 * @return String
	 * @throws
	 */
	@Action(value = "authority.null.roleSingle.roleAdd")
	public void roleSingleResult() throws IOException {
		if (tbEmployeeID != null) {
			System.out.println("roleAdd");
			// 角色ID
			String roleID = TimeStringUtils.getTimeString();
			// 角色名称
			String roleNameString = (String) request.getParameter("roleName");
			// 系统管理员标识
			Boolean roleType = request.getParameter("roleType").equals("1") ? true
					: false;
			// 角色权限ID
			String roleNodes = request.getParameter("roleNodes");
			// 创建人
			String roleCreatBy = (String) sessionAuthority
					.getAttribute("tbEmployeeIDSession");

			System.out.println(roleNameString + roleType + roleNodes);

			// 写入数据库并返回结果
			Boolean roleSaveBoolean = authoritySrviceImp.saveRole(roleID,
					roleNameString, roleType, roleCreatBy, roleNodes);

			response.getWriter().write(roleSaveBoolean == true ? "1" : "0");
		} else {
			response.getWriter().write("false");
		}
	}

	/**
	 * @Title: roleSearch
	 * @Description: 角色查询页面加载及初始化
	 * @return String
	 * @throws
	 */
	@Action(value = "authority.null.roleSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/authority/roleSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/paga/error.jsp") })
	public String roleSearch() {

		try {

			List<TbRole> tbRoles = new ArrayList<TbRole>();
			// 查询所有角色
			tbRoles = authoritySrviceImp.findAllRole();
			request.setAttribute("tbRoleslist", tbRoles);
			if (tbEmployeeID != null)
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
	 * @Title: roleDelete
	 * @Description: 角色删除
	 * @return
	 * @throws IOException
	 *             String
	 * @throws
	 */
	@Action(value = "authority.null.roleSearch.delete", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/authority/roleSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/paga/error.jsp") })
	public void roleDelete() throws IOException {

		try {

			System.out.println("roleDelete");
			String roleID = request.getParameter("roleID");
			Boolean resultBoolean = authoritySrviceImp.deleteRole(roleID);
			response.getWriter().write(resultBoolean == true ? "1" : "0");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}

	}

	/**
	 * @Title: roleDetail
	 * @Description: 加载角色详情jsp
	 * @return
	 * @throws IOException
	 *             String
	 * @throws
	 */
	@Action(value = "authority.null.roleSearch.detail", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/authority/roleDetail.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/paga/error.jsp") })
	public String roleDetail() throws IOException {

		try {

			System.out.println("roleDetail");
			String roleID = request.getParameter("roleID");
			System.out.println(roleID);
			TbRole tbRole = authoritySrviceImp.findRoleByRoleID(roleID);
			request.setAttribute("roleID", roleID);
			request.setAttribute("roleName", tbRole.getRolename());
			request.setAttribute("roleNodes", authoritySrviceImp.findTbRoleFunction(roleID).getFunctionids());
			request.setAttribute("roleType",
					tbRole.getAdministratorflag() == true ? "1" : "0");
			return "success";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "faild";
		}

	}

	/**
	 * @Title: roleDetailInit
	 * @Description: 角色详情初始化
	 * @throws IOException
	 *             void
	 * @throws
	 */
	@Action(value = "authority.null.roleSearch.detail.init")
	public void roleDetailInit() throws IOException {

		String[] fieldNames = new String[] { "functionid","functiontype","functionurl","parentfunctionid",
				"functionname" };
		System.out.println("roleDetail.init");
		String roleID = request.getParameter("roleID");
		System.out.println(roleID);
		String roleJsonString = authoritySrviceImp
				.findSystemFunctionJson(fieldNames).replace("functionid", "id")
				.replace("parentid", "pId").replace("functionname", "name");
		System.out.println(roleJsonString);
		response.getWriter().write(roleJsonString);
	}

	/**
	 * @Title: roleModify
	 * @Description: 角色信息修改
	 * @throws IOException
	 *             void
	 * @throws
	 */
	@Action(value = "authority.null.roleSearch.modify.updataRole")
	public void roleModify() throws IOException {

		if (tbEmployeeID != null) {
			System.out.println("roleAdd");
			// 角色ID
			String roleID = request.getParameter("roleID");
			// 角色名称
			String roleNameString = request.getParameter("roleName");
			// 系统管理员标识
			Boolean roleType = request.getParameter("roleType").equals("true") ? true
					: false;
			// 角色权限ID
			String roleNodes = request.getParameter("roleNodes");
			// 创建人
			String roleCreatBy = (String) sessionAuthority
					.getAttribute("tbEmployeeIDSession");

			System.out.println(roleNameString + roleType + roleNodes);

			// 写入数据库并返回结果
			Boolean roleSaveBoolean = authoritySrviceImp.updateRole(roleID,
					roleNameString, roleType, roleCreatBy, roleNodes);

			response.getWriter().write(roleSaveBoolean == true ? "1" : "0");
		} else {
			response.getWriter().write("false");
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
			@Result(name = "faild", location = "/WEB-INF/content/page/error.jsp") })
	public String login() {
		if (tbEmployeeID != null)
			return "success";
		else {
			return "faild";
		}
	}
	
	@Action(value = "error", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/error.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/page/error.jsp") })
	public String error(){
		
		request.setAttribute("errorInfo", "出错了");
		return "faild";
	}

}
