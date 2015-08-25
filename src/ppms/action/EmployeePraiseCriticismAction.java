package ppms.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.poi.ss.formula.functions.T;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ppms.action.interfaces.BaseInit;
import ppms.action.interfaces.InitPage;
import ppms.domain.COrganizationNj;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbEmployee;
import ppms.domain.TbEmployeepraisecriticism;
import ppms.domain.TbJob;
import ppms.domain.TbMaster;
import ppms.domain.TbPost;
import ppms.domain.TbRole;
import ppms.serviceimpl.PraiseCriticismServiceImp;
import ppms.serviceimpl.userBaseInfoServiceImp;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EmployeePraiseCriticismAction extends BaseInit {

	private TbEmployeepraisecriticism tbEmployeepraisecriticism; // 创建员工奖惩信息的对象tbEmployeepraisecriticism

	@Autowired
	private PraiseCriticismServiceImp praiseCriticism;// 创建Service的对象praiseCriticism

	public TbEmployeepraisecriticism getTbEmployeepraisecriticism() {// tbEmployeepraisecriticism的get方法
		return tbEmployeepraisecriticism;
	}

	public EmployeePraiseCriticismAction() {

		System.out.println("create EmployeePraiseCriticismAction");
	}

	public void setTbEmployeepraisecriticism(// tbEmployeepraisecriticism的set方法
			TbEmployeepraisecriticism tbEmployeepraisecriticism) {
		this.tbEmployeepraisecriticism = tbEmployeepraisecriticism;
	}

	/**
	 * 员工单条录入点击submit按钮时跳进该action，执行插入数据的操作。
	 * 
	 * @return
	 */
	@Action(value = "praiseCriticism.employee.employeePraiseCriticismSingle.employeePraiseCriticismSingleSave", results = {// action的名称为employeePraiseCriticismSingleStart
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/employeePraiseCriticismSingleResult.jsp"),// 返回值为success时跳转的页面路径
			@Result(name = "error", location = "/WEB-INF/content/page/userinfo/Demo.jsp") })
	// 返回值为error时跳转的页面路径
	public String save() {
		ActionContext actionContext = ActionContext.getContext();// 创建ActionContext的对象并调用getContext()方法
		Map<String, Object> request = (Map) actionContext.get("request");// 获取出request对象
		try {
			String type = tbEmployeepraisecriticism.getPraisecriticismtype();
			String praisecriticismtype = "000" + type;
			tbEmployeepraisecriticism
					.setPraisecriticismtype(praisecriticismtype);
			String level = tbEmployeepraisecriticism.getPraisecriticismlevel();
			String praisecriticismlevel = "000" + level;
			tbEmployeepraisecriticism
					.setPraisecriticismlevel(praisecriticismlevel);
			System.out.println(tbEmployeepraisecriticism.getTbEmployee()
					.getEmployeeid());
			praiseCriticism.save(tbEmployeepraisecriticism);// 执行save方法，实现员工奖惩信息的单条录入
			request.put("results", "success!");
		} catch (Exception e) {
			e.printStackTrace();
			request.put("results", "error!");
		}
		return "success";
	}

	/**
	 * 员工单条录入点击选择员工时跳进该action，执行查询数据并整合的操作。
	 * 
	 * @return
	 */
	@Action(value = "praiseCriticism.employee.employeePraiseCriticismSingle.skipEmployeeSelectSingle", results = {// action的名称为skipEmployeeSelectSingle
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/selectEmployeesSingle.jsp"),// 返回值为success时跳转的页面路径
			@Result(name = "error", location = "/WEB-INF/content/page/selectSingleEmployee.jsp") })
	// 返回值为error时跳转的页面路径
	public String skipSelectSingle() {
		System.out.println("ccz");

		ActionContext actionContext = ActionContext.getContext();// 创建ActionContext的对象并调用getContext()方法
		Map<String, Object> request = (Map) actionContext.get("request");// 获取出request对象
		try {

			System.out.println("create skipSelectSingle");

			// 执行findAllEmployeeInfor方法，查询所有员工信息
			List<TbEmployee> employeeResults = praiseCriticism
					.findAllEmployeeInfor();

			// 新建一个TbEmployee类型的空的list，名称为emploeesInfo
			List<TbEmployee> emploeesInfo = new ArrayList<TbEmployee>();

			for (TbEmployee tbEmployee : employeeResults) {// 遍历
				List<COrganizationNj> cOrganizationNjInfor = praiseCriticism
						.findCOrganizationNjInfor(tbEmployee
								.getOrganizationNj().getOrgid());// 执行findCOrganizationNjInfor，根据营业厅编号获取营业厅区域关系表中的信息
				for (COrganizationNj cOrganizationNj : cOrganizationNjInfor) {// 遍历
					List<TbArea> areaInfor = praiseCriticism
							.findAreaDesc(cOrganizationNj.getTbArea()
									.getAreaid());// 执行findAreaDesc方法，根据区域编号获取区域名称
					if(areaInfor!=null)
					{
					String areadesc = areaInfor.get(0).getAreadesc();

					OrganizationNj organizationNj = tbEmployee
							.getOrganizationNj();

					Integer orgid = organizationNj.getOrgid();

					List<OrganizationNj> organizationNjResults = praiseCriticism
							.findOrganizationNjInfor(orgid);// 执行findOrganizationNjInfor方法，根据营业厅编号查询同步营业厅信息
					organizationNjResults.get(0).setAreadesc(areadesc);
					tbEmployee.setOrganizationNj(organizationNjResults.get(0));// 将同步营业厅信息set进对象organizationNj中
					}
				}
				List<TbPost> posts = praiseCriticism.findPostName(tbEmployee
						.getTbPost().getPostid());// 执行findPostName方法，根据岗职编号获取岗职信息
				if(posts!=null){
				TbPost tbPost = posts.get(0);
				tbEmployee.setTbPost(tbPost);// 将岗职信息set进对象tbPost中
				}
				
				List<TbJob> jobs = praiseCriticism.findJobName(tbEmployee
						.getTbJob().getJobid());// 执行findJobName方法，根据岗位编号获取岗位信息
				if(jobs!=null){
				tbEmployee.setTbJob(jobs.get(0));// 将岗位信息set进对象tbJob中
				}
				emploeesInfo.add(tbEmployee);// 设置对TbEmployee的策略
			}
			request.put("employeeInfos", emploeesInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("success");
		return "success";

	}

	/**
	 * 员工信息修改页面点击选择员工时跳进该action
	 * 
	 * @return
	 */
	@Action(value = "praiseCriticism.employee.employeePraiseCriticismSearch.modify.skipEmployeeSelectUpdate", results = {// action的名称为skipEmployeeSelectSingle
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/selectEmployeeUpdate.jsp"),// 返回值为success时跳转的页面路径
			@Result(name = "error", location = "/WEB-INF/content/page/selectSingleEmployee.jsp") })
	// 返回值为error时跳转的页面路径
	public String skipSelectUpdate() {
		System.out.println("ccz");

		ActionContext actionContext = ActionContext.getContext();// 创建ActionContext的对象并调用getContext()方法
		Map<String, Object> request = (Map) actionContext.get("request");// 获取出request对象
		try {

			System.out.println("create skipSelectEmployeeUpdate");

			// 执行findAllEmployeeInfor方法，查询所有员工信息
			List<TbEmployee> employeeResults = praiseCriticism
					.findAllEmployeeInfor();

			// 新建一个TbEmployee类型的空的list，名称为emploeesInfo
			List<TbEmployee> emploeesInfo = new ArrayList<TbEmployee>();

			for (TbEmployee tbEmployee : employeeResults) {// 遍历
				List<COrganizationNj> cOrganizationNjInfor = praiseCriticism
						.findCOrganizationNjInfor(tbEmployee
								.getOrganizationNj().getOrgid());// 执行findCOrganizationNjInfor，根据营业厅编号获取营业厅区域关系表中的信息
				for (COrganizationNj cOrganizationNj : cOrganizationNjInfor) {// 遍历
					List<TbArea> areaInfor = praiseCriticism
							.findAreaDesc(cOrganizationNj.getTbArea()
									.getAreaid());// 执行findAreaDesc方法，根据区域编号获取区域名称
					if(areaInfor!=null){
					String areadesc = areaInfor.get(0).getAreadesc();

					OrganizationNj organizationNj = tbEmployee
							.getOrganizationNj();

					Integer orgid = organizationNj.getOrgid();

					List<OrganizationNj> organizationNjResults = praiseCriticism
							.findOrganizationNjInfor(orgid);// 执行findOrganizationNjInfor方法，根据营业厅编号查询同步营业厅信息
					organizationNjResults.get(0).setAreadesc(areadesc);
					tbEmployee.setOrganizationNj(organizationNjResults.get(0));// 将同步营业厅信息set进对象organizationNj中
					}
				}
				List<TbPost> posts = praiseCriticism.findPostName(tbEmployee
						.getTbPost().getPostid());// 执行findPostName方法，根据岗职编号获取岗职信息
				if(posts!=null){
				TbPost tbPost = posts.get(0);
				tbEmployee.setTbPost(tbPost);// 将岗职信息set进对象tbPost中
				}
				List<TbJob> jobs = praiseCriticism.findJobName(tbEmployee
						.getTbJob().getJobid());// 执行findJobName方法，根据岗位编号获取岗位信息
				if(jobs!=null){
				tbEmployee.setTbJob(jobs.get(0));// 将岗位信息set进对象tbJob中
				}
				emploeesInfo.add(tbEmployee);// 设置对TbEmployee的策略
			}
			request.put("employeeInfos", emploeesInfo);
			request.put("praisecriticismid",
					tbEmployeepraisecriticism.getPraisecriticismid());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("success");
		return "success";

	}

	/**
	 * 选定员工信息前的单选框后点击确认时跳转至该action，执行查询数据。
	 * 
	 * @return
	 */
	@Action(value = "praiseCriticism.employee.employeePraiseCriticismSingle.selectEmployeeSkipSingle", results = {// action的名称为selectEmployeeSkipSingle
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/employeePraiseCriticismSingle.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/userinfo/Demo.jsp") })
	public String selectEmployeeSkipSingle() {
		ActionContext actionContext = ActionContext.getContext(); // 创建ActionContext的对象并调用getContext()方法
		Map<String, Object> request = (Map) actionContext.get("request"); // 获取出request对象
		String employeeId = ServletActionContext.getRequest().getParameter(
				"selectEmployee"); // 通过getParameter方法获取页面上name为selectEmployee的标签的value值
		System.out.println(employeeId); // 打印从前一个页面传过来的员工编号employeeId

		// get HttpServletRequest
		try {
			System.out.println("create skipSelectSingle");
			List<TbEmployee> employeeInfor = praiseCriticism
					.findEmployeeInfor(employeeId); // 调用findEmployeeInfor()方法
			List<TbEmployee> emploeesInfo = new ArrayList<TbEmployee>(); // 创建一个空的集合emploeesInfo
			for (TbEmployee tbEmployee : employeeInfor) { // 遍历ss
				List<COrganizationNj> cOrganizationNjInfor = praiseCriticism
						.findCOrganizationNjInfor(tbEmployee
								.getOrganizationNj().getOrgid());// 执行findCOrganizationNjInfor，根据营业厅编号获取营业厅区域关系表中的信息
				for (COrganizationNj cOrganizationNj : cOrganizationNjInfor) {// 遍历
					System.out.println(cOrganizationNj.getTbArea().getAreaid());// 打印区域的编号
					List<TbArea> areaInfor = praiseCriticism
							.findAreaDesc(cOrganizationNj.getTbArea()
									.getAreaid());// 执行findAreaDesc方法，根据区域编号获取区域名称
					String areadesc = areaInfor.get(0).getAreadesc();
					System.out.println(areadesc);// 打印区域名称
					request.put("areadesc", areadesc);// 将区域名称使用put方法存放
				}
				List<OrganizationNj> organizationNjResults = praiseCriticism
						.findOrganizationNjInfor(tbEmployee.getOrganizationNj()
								.getOrgid());// 执行findOrganizationNjInfor方法，根据营业厅编号查询同步营业厅信息
				tbEmployee.setOrganizationNj(organizationNjResults.get(0));// 将同步营业厅信息set进对象organizationNj中
				List<TbPost> posts = praiseCriticism.findPostName(tbEmployee
						.getTbPost().getPostid()); // 调用findPostName()方法
				TbPost tbPost = posts.get(0); // 获取岗职集合中的第一个也是唯一一个值
				tbEmployee.setTbPost(tbPost); // 将获取的值设置到tbEmployee中
				List<TbJob> jobs = praiseCriticism.findJobName(tbEmployee
						.getTbJob().getJobid()); // 调用findJobName()方法
				tbEmployee.setTbJob(jobs.get(0)); // 获取岗位集合中的第一个也是唯一一个值，并将获取的值设置到tbEmployee中
				emploeesInfo.add(tbEmployee); // 将tbEmployee对象添加到emploeesInfo中
				// 设置对TbEmployee的策略
			}
			request.put("employeeInfos", emploeesInfo); // 将emploeesInfo用put方法存放
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "success";
	}

	/**
	 * 员工奖惩信息修改选择员工完成后跳进该action
	 * 
	 * @return
	 */
	@Action(value = "praiseCriticism.employee.employeePraiseCriticismSearch.modify.selectEmployeeSkipUpdate", results = {// action的名称为selectEmployeeSkipSingle
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/employeePraiseCriticismUpdate.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/userinfo/Demo.jsp") })
	public String selectEmployeeSkipUpdate() {
		ActionContext actionContext = ActionContext.getContext(); // 创建ActionContext的对象并调用getContext()方法
		Map<String, Object> request = (Map) actionContext.get("request"); // 获取出request对象
		String employeeId = ServletActionContext.getRequest().getParameter(
				"selectEmployee"); // 通过getParameter方法获取页面上name为selectEmployee的标签的value值
		System.out.println(employeeId); // 打印从前一个页面传过来的员工编号employeeId

		// get HttpServletRequest
		try {
			System.out.println("create skipSelectSingle");
			List<TbEmployee> employeeInfor = praiseCriticism
					.findEmployeeInfor(employeeId); // 调用findEmployeeInfor()方法
			List<TbEmployee> emploeesInfo = new ArrayList<TbEmployee>(); // 创建一个空的集合emploeesInfo
			for (TbEmployee tbEmployee : employeeInfor) { // 遍历ss
				List<COrganizationNj> cOrganizationNjInfor = praiseCriticism
						.findCOrganizationNjInfor(tbEmployee
								.getOrganizationNj().getOrgid());// 执行findCOrganizationNjInfor，根据营业厅编号获取营业厅区域关系表中的信息
				for (COrganizationNj cOrganizationNj : cOrganizationNjInfor) {// 遍历
					System.out.println(cOrganizationNj.getTbArea().getAreaid());// 打印区域的编号
					List<TbArea> areaInfor = praiseCriticism
							.findAreaDesc(cOrganizationNj.getTbArea()
									.getAreaid());// 执行findAreaDesc方法，根据区域编号获取区域名称
					String areadesc = areaInfor.get(0).getAreadesc();
					System.out.println(areadesc);// 打印区域名称
					request.put("areadesc", areadesc);// 将区域名称使用put方法存放
				}
				List<OrganizationNj> organizationNjResults = praiseCriticism
						.findOrganizationNjInfor(tbEmployee.getOrganizationNj()
								.getOrgid());// 执行findOrganizationNjInfor方法，根据营业厅编号查询同步营业厅信息
				tbEmployee.setOrganizationNj(organizationNjResults.get(0));// 将同步营业厅信息set进对象organizationNj中
				List<TbPost> posts = praiseCriticism.findPostName(tbEmployee
						.getTbPost().getPostid()); // 调用findPostName()方法
				TbPost tbPost = posts.get(0); // 获取岗职集合中的第一个也是唯一一个值
				tbEmployee.setTbPost(tbPost); // 将获取的值设置到tbEmployee中
				List<TbJob> jobs = praiseCriticism.findJobName(tbEmployee
						.getTbJob().getJobid()); // 调用findJobName()方法
				tbEmployee.setTbJob(jobs.get(0)); // 获取岗位集合中的第一个也是唯一一个值，并将获取的值设置到tbEmployee中
				emploeesInfo.add(tbEmployee); // 将tbEmployee对象添加到emploeesInfo中
				// 设置对TbEmployee的策略
			}
			request.put("employeeInfos", emploeesInfo); // 将emploeesInfo用put方法存放
			request.put("praisecriticismid",
					tbEmployeepraisecriticism.getPraisecriticismid());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "success";
	}

	/**
	 * 员工奖惩信息查询页面点击修改时跳进该action，执行跳转页面的功能。
	 * 
	 * @return
	 */
	@Action(value = "praiseCriticism.employee.employeePraiseCriticismSearch.modify.SkipUpdateEmployeeInfor", results = {// action的名称为selectEmployeeSkipSingle
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/employeePraiseCriticismUpdate.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/userinfo/Demo.jsp") })
	public String skipUpdateEmployeeInfor() {

		ActionContext actionContext = ActionContext.getContext(); // 创建ActionContext的对象并调用getContext()方法
		Map<String, Object> request = (Map) actionContext.get("request"); // 获取出request对象
		String praisecriticismid = tbEmployeepraisecriticism
				.getPraisecriticismid();
		request.put("praisecriticismid", praisecriticismid);
		return "success";
	}

	/**
	 * 在员工奖惩信息更新页面点击submit跳进该action，执行数据的更新。
	 * 
	 * @return
	 */
	@Action(value = "praiseCriticism.employee.employeePraiseCriticismSearch.modify.updateEmployeeInfor", results = {// action的名称为selectEmployeeSkipSingle
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/employeePraiseCriticismUpdate.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/userinfo/Demo.jsp") })
	public String updateEmployeeInfor() {

		try {
			String type = tbEmployeepraisecriticism.getPraisecriticismtype();
			String praisecriticismtype = "000" + type;
			tbEmployeepraisecriticism
					.setPraisecriticismtype(praisecriticismtype);
			String level = tbEmployeepraisecriticism.getPraisecriticismlevel();
			String praisecriticismlevel = "000" + level;
			tbEmployeepraisecriticism
					.setPraisecriticismlevel(praisecriticismlevel);
			System.out.println(tbEmployeepraisecriticism.getTbEmployee()
					.getEmployeeid());

			praiseCriticism.update(tbEmployeepraisecriticism);
			ServletActionContext
			.getResponse().sendRedirect("praiseCriticism.employee.employeePraiseCriticismSearch.do");

			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}

	}

	/**
	 * 在员工奖惩信息更新页面点击return跳进该action，执行返回。
	 * 
	 * @return
	 */
	@Action(value = "praiseCriticism.employee.employeePraiseCriticismSearch.modify.returnPages", results = {// action的名称为selectEmployeeSkipSingle
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/employeePraiseCriticismUpdate.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/userinfo/Demo.jsp") })
	public String returnPages() {

		try {
			ServletActionContext
			.getResponse().sendRedirect("praiseCriticism.employee.employeePraiseCriticismSearch.do");

			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return "error";

		}
	}

	/**
	 * 员工奖惩信息查询页面点击删除时跳进该action，执行数据库完全删除数据。
	 * 
	 * @return
	 */
	@Action(value = "praiseCriticism.employee.employeePraiseCriticismSearch.delete.deleteEmployeeInfor", results = {// action的名称为selectEmployeeSkipSingle
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism.employeePraiseCriticismSearch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/userinfo/Demo.jsp") })
	public String deleteEmployeeInfor() {

		try {

			List<TbEmployeepraisecriticism> employeepraisecriticismInfor = praiseCriticism
					.findEmployeepraisecriticismInfor(tbEmployeepraisecriticism
							.getPraisecriticismid());

			praiseCriticism.delete(employeepraisecriticismInfor.get(0));
			ServletActionContext
					.getResponse().sendRedirect("praiseCriticism.employee.employeePraiseCriticismSearch.do");
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

	/**
	 * 员工奖惩信息查询页面的初始化，执行数据的查询并整合。
	 */
	@Action(value = "praiseCriticism.employee.employeePraiseCriticismSearch", results = {// action的名称为selectEmployeeSkipSingle
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/employeePraiseCriticismSearch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/userinfo/Demo.jsp") })
	public String initPage() {
		// 实例化map

		try {
			List<TbEmployeepraisecriticism> employeepraisecriticismInfor = praiseCriticism
					.findAllEmployeepraisecriticismInfor();
			List<TbEmployeepraisecriticism> employeepraisecriticismsInfor = new ArrayList<TbEmployeepraisecriticism>();
			for (TbEmployeepraisecriticism tbEmployeepraisecriticism : employeepraisecriticismInfor) {
				String a = tbEmployeepraisecriticism.getPraisecriticismtype();
				List<TbMaster> type = praiseCriticism
						.findEmployeePraiseCriticismType(a);
				String employeeType = type.get(0).getValue();
				tbEmployeepraisecriticism.setType(employeeType);
				String b=tbEmployeepraisecriticism.getPraisecriticismlevel();
				List<TbMaster> level = praiseCriticism
						.findEmployeePraiseCriticismLevel(a,
								tbEmployeepraisecriticism
										.getPraisecriticismlevel());
				String employeeLevel = level.get(0).getValue();
				tbEmployeepraisecriticism.setLevel(employeeLevel);
				String score=null;
				if(a.equals("0001"))
					{score="+"+Integer.parseInt(b)*0.5;}
				else
					if(a.equals("0002"))
						{score="-"+Integer.parseInt(b)*0.5;}
				tbEmployeepraisecriticism.setScore(score);
				
				List<OrganizationNj> organizationNjResults = praiseCriticism
						.findOrganizationNjInfor(tbEmployeepraisecriticism
								.getOrganizationNj().getOrgid());// 执行findOrganizationNjInfor方法，根据营业厅编号查询同步营业厅信息
				tbEmployeepraisecriticism
						.setOrganizationNj(organizationNjResults.get(0));// 将同步营业厅信息set进对象organizationNj中

				List<TbEmployee> tbEmployeeResults = praiseCriticism
						.findEmployeeInfor(tbEmployeepraisecriticism
								.getTbEmployee().getEmployeeid());
				tbEmployeepraisecriticism.setTbEmployee(tbEmployeeResults
						.get(0));
				employeepraisecriticismsInfor.add(tbEmployeepraisecriticism);
			}	
			map.put("employeepraisecriticismsInfor",
					employeepraisecriticismsInfor);
			toCache();
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}

		return "success";
	}
	
	@Action(value = "praiseCriticism.employee.employeePraiseCriticismBatch", results = {// action的名称为selectEmployeeSkipSingle
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/employeePraiseCriticismBatch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/userinfo/Demo.jsp") })
	public String batch() {
	
		return "success";
	}
	@Action(value = "praiseCriticism.employee.employeePraiseCriticismSingle", results = {// action的名称为selectEmployeeSkipSingle
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/employeePraiseCriticismSingle.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/userinfo/Demo.jsp") })
	public String single() {
	
		return "success";
	}

}
