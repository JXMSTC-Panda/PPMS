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

import ppms.action.interfaces.InitPage;
import ppms.domain.COrganizationNj;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.domain.TbOperationcheck;
import ppms.domain.TbOrgpraisecriticism;
import ppms.domain.TbPost;
import ppms.domain.TbSubarea;
import ppms.domain.TbSubareaorgrelation;
import ppms.serviceimpl.OperationMistakeServiceImp;
import ppms.serviceimpl.PraiseCriticismServiceImp;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class OperationMistakeAction extends ActionSupport implements InitPage{
	
	private TbOperationcheck tbOperationcheck;// 创建员工奖惩信息的对象tbOperationcheck

	
	public TbOperationcheck getTbOperationcheck() {
		return tbOperationcheck;
	}


	public void setTbOperationcheck(TbOperationcheck tbOperationcheck) {
		this.tbOperationcheck = tbOperationcheck;
	}

	@Autowired
	private PraiseCriticismServiceImp praiseCriticism;// 创建Service的对象praiseCriticism

	private OperationMistakeServiceImp operationMistake;

	public OperationMistakeAction() {

		System.out.println("create OperationMistakeAction");
	}


	/**
	 * 业务差错信息单条录入点击submit时跳进该action，执行单条信息录入。
	 * @return
	 */
	@Action(value = "standardVisit.operationMistake.operationMistakeSingle.operationMistakeSingleStart", results = {// action的名称为operationMistakeSingleStart
			@Result(name = "success", location = "/WEB-INF/content/page/userinfo/Demo.jsp"),// 返回值为success时跳转的页面路径
			@Result(name = "error", location = "/WEB-INF/content/page/userinfo/Demo.jsp") })
	// 返回值为error时跳转的页面路径
	public String operationMistakeSingleStart() {
		System.out.println("save infor");
		try {
			praiseCriticism.save(tbOperationcheck);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}	
	}

	/**
	 * 业务差错信息单条录入点击选择员工跳进该ation，执行查询数据并整合。
	 * @return
	 */
	@Action(value = "standardVisit.operationMistake.operationMistakeSingle.skipEmployeeSelectSingle", results = {// action的名称为skipEmployeeSelectSingle
			@Result(name = "success", location = "/WEB-INF/content/page/standardVisit/operationSelectEmployee.jsp"),// 返回值为success时跳转的页面路径
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
					String areadesc = areaInfor.get(0).getAreadesc();

					OrganizationNj organizationNj = tbEmployee
							.getOrganizationNj();

					Integer orgid = organizationNj.getOrgid();

					List<OrganizationNj> organizationNjResults = praiseCriticism
							.findOrganizationNjInfor(orgid);// 执行findOrganizationNjInfor方法，根据营业厅编号查询同步营业厅信息
					organizationNjResults.get(0).setAreadesc(areadesc);
					tbEmployee.setOrganizationNj(organizationNjResults.get(0));// 将同步营业厅信息set进对象organizationNj中
				}
				List<TbPost> posts = praiseCriticism.findPostName(tbEmployee
						.getTbPost().getPostid());// 执行findPostName方法，根据岗职编号获取岗职信息
				TbPost tbPost = posts.get(0);
				tbEmployee.setTbPost(tbPost);// 将岗职信息set进对象tbPost中
				List<TbJob> jobs = praiseCriticism.findJobName(tbEmployee
						.getTbJob().getJobid());// 执行findJobName方法，根据岗位编号获取岗位信息
				tbEmployee.setTbJob(jobs.get(0));// 将岗位信息set进对象tbJob中
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
	 * 业务差错信息单条录入选择员工完成后跳进该action。
	 * @return
	 */
	@Action(value = "standardVisit.operationMistake.operationMistakeSingle.selectEmployeeSkipSingle", results = {// action的名称为selectEmployeeSkipSingle
			@Result(name = "success", location = "/WEB-INF/content/page/standardVisit/operationMistakeSingle.jsp"),
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

			for (TbEmployee tbEmployee : employeeInfor) { // 遍历
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
	 * 业务差错信息管理查询页面选定后点击删除跳进该action，执行数据库完全删除数据。
	 * @return
	 */
	@Action(value = "standardVisit.operationMistake.operationMistakeSearch.operationMistakeInforDelete", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/businessHallPraiseCriticismSingle.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/selectSingleBusinessHall.jsp") })
	public String orgPCInforDelete() {
		try {
			praiseCriticism.delete(tbOperationcheck);
			ServletActionContext
					.getRequest()
					.getRequestDispatcher(
							"/resource/standardVisit.operationMistake.operationMistakeSearch")
					.forward(ServletActionContext.getRequest(),
							ServletActionContext.getResponse());

			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
	/**
	 * 业务差错信息单条修改页面点击submit按钮跳进该action，执行营业厅奖惩信息单条修改。
	 * @return
	 */
	@Action(value = "standardVisit.operationMistake.operationMistakeSearch.operationMistakeInforUpdate", results = {
			@Result(name = "operationMistakeInforUpdate", location = "/WEB-INF/content/page/praiseCriticism/businessHallPraiseCriticismSingle.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/selectSingleBusinessHall.jsp") })
	public String orgPCInforUpdate() {
		try {
			praiseCriticism.update(tbOperationcheck);
			ServletActionContext
			.getRequest()
			.getRequestDispatcher(
					"/resource/standardVisit.operationMistake.operationMistakeSearch")
			.forward(ServletActionContext.getRequest(),
					ServletActionContext.getResponse());
			
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
	/**
	 * 业务差错信息单条修改页面点击选择员工跳进该action。
	 * @return
	 */
	@Action(value = "standardVisit.operationMistake.operationMistakeSearch.operationMistakeUpdateSkip", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/standardVisit/operationSelectEUpdate.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/selectSingleBusinessHall.jsp") })
	public String orgPCInforUpdateSkip() {
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
					String areadesc = areaInfor.get(0).getAreadesc();

					OrganizationNj organizationNj = tbEmployee
							.getOrganizationNj();

					Integer orgid = organizationNj.getOrgid();

					List<OrganizationNj> organizationNjResults = praiseCriticism
							.findOrganizationNjInfor(orgid);// 执行findOrganizationNjInfor方法，根据营业厅编号查询同步营业厅信息
					organizationNjResults.get(0).setAreadesc(areadesc);
					tbEmployee.setOrganizationNj(organizationNjResults.get(0));// 将同步营业厅信息set进对象organizationNj中
				}
				List<TbPost> posts = praiseCriticism.findPostName(tbEmployee
						.getTbPost().getPostid());// 执行findPostName方法，根据岗职编号获取岗职信息
				TbPost tbPost = posts.get(0);
				tbEmployee.setTbPost(tbPost);// 将岗职信息set进对象tbPost中
				List<TbJob> jobs = praiseCriticism.findJobName(tbEmployee
						.getTbJob().getJobid());// 执行findJobName方法，根据岗位编号获取岗位信息
				tbEmployee.setTbJob(jobs.get(0));// 将岗位信息set进对象tbJob中
				emploeesInfo.add(tbEmployee);// 设置对TbEmployee的策略
			}
			String operationcheckid=tbOperationcheck.getOperationcheckid();
			request.put("operationcheckid", operationcheckid);
			request.put("employeeInfos", emploeesInfo);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	/**
	 * 业务差错信息单条修改选择员工完成后，跳进该action。
	 * @return
	 */
	@Action(value = "standardVisit.operationMistake.operationMistakeSearch.SkipOperationMistakeUpdate", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/standardVisit/operationMistakeUpdate.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/selectSingleBusinessHall.jsp") })
	public String SkipOperationMistakeUpdate() {
	
		ActionContext actionContext = ActionContext.getContext();// 创建ActionContext的对象并调用getContext()方法
		Map<String, Object> request = (Map) actionContext.get("request");// 获取出request对象
		String employeeId = ServletActionContext.getRequest().getParameter(
				"selectEmployee"); // 通过getParameter方法获取页面上name为selectEmployee的标签的value值
		System.out.println(employeeId); // 打印从前一个页面传过来的员工编号employeeId

		// get HttpServletRequest
		try {
			System.out.println("create skipSelectSingle");
			List<TbEmployee> employeeInfor = praiseCriticism
					.findEmployeeInfor(employeeId); // 调用findEmployeeInfor()方法
			List<TbEmployee> emploeesInfo = new ArrayList<TbEmployee>(); // 创建一个空的集合emploeesInfo

			for (TbEmployee tbEmployee : employeeInfor) { // 遍历
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
			String operationcheckid=tbOperationcheck.getOperationcheckid();
			request.put("operationcheckid", operationcheckid);
			request.put("employeeInfos", emploeesInfo); // 将emploeesInfo用put方法存放
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	/**
	 * 业务差错信息管理查询点击修改跳入该action，执行页面跳转。
	 * @return
	 */
	@Action(value = "standardVisit.operationMistake.operationMistakeSearch.skip", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/standardVisit/operationMistakeUpdate.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/selectSingleBusinessHall.jsp") })
	public String skip() {
	
		ActionContext actionContext = ActionContext.getContext(); // 创建ActionContext的对象并调用getContext()方法
		Map<String, Object> request = (Map) actionContext.get("request"); // 获取出request对象
		String operationcheckid=tbOperationcheck.getOperationcheckid();
		request.put("operationcheckid", operationcheckid);
		return "success";
	}
	/**
	 * 业务差错信息单条修改点击return跳进该action，执行页面跳转。
	 * @return
	 */
	@Action(value = "standardVisit.operationMistake.operationMistakeSearch.returnPages", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/businessHallPraiseCriticismSingle.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/selectSingleBusinessHall.jsp") })
	public String returnPages() {
	
		try {
			ServletActionContext
			.getRequest()
			.getRequestDispatcher(
					"/resource/standardVisit.operationMistake.operationMistakeSearch")
			.forward(ServletActionContext.getRequest(),
					ServletActionContext.getResponse());
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		
	}
	/**
	 * 业务差错信息查询管理页面的初始化。
	 */
	public Map<String, List<T>> initPage(ServletContext servletContext,String url) {
		// 实例化map
		Map map = new HashMap();

		OperationMistakeServiceImp service = WebApplicationContextUtils
				.getWebApplicationContext(servletContext).getBean(
						OperationMistakeServiceImp.class);

		PraiseCriticismServiceImp serviceP = WebApplicationContextUtils
				.getWebApplicationContext(servletContext).getBean(
						PraiseCriticismServiceImp.class);
		url= "standardVisit.operationMistakeSearch";
			List<TbOperationcheck> operationcheckInfor=service.findOperationcheckInfor();
			List<TbOperationcheck> operationchecksInfor=new ArrayList<TbOperationcheck>();
			for (TbOperationcheck tbOperationcheck : operationcheckInfor) {
			
				List<TbEmployee> employeeInfor=serviceP.findEmployeeInfor(tbOperationcheck.getTbEmployee().getEmployeeid());
				tbOperationcheck.setTbEmployee(employeeInfor.get(0));
				
				List<OrganizationNj> organizationNjInfor=serviceP.findOrganizationNjInfor(tbOperationcheck.getOrganizationNj().getOrgid());
				for (OrganizationNj organizationNj : organizationNjInfor) {
					
				
				List<COrganizationNj> cOrganizationNjInfor = serviceP
						.findCOrganizationNjInfor(organizationNj.getOrgid());// 执行findCOrganizationNjInfor，根据营业厅编号获取营业厅区域关系表中的信息
				for (COrganizationNj cOrganizationNj : cOrganizationNjInfor) {// 遍历
					System.out.println(cOrganizationNj.getTbArea().getAreaid());// 打印区域的编号
					List<TbArea> areaInfor = serviceP
							.findAreaDesc(cOrganizationNj.getTbArea()
									.getAreaid());// 执行findAreaDesc方法，根据区域编号获取区域名称
					String areadesc = areaInfor.get(0).getAreadesc();
					organizationNj.setAreadesc(areadesc);
					System.out.println(areadesc);// 打印区域名称
					}
				tbOperationcheck.setOrganizationNj(organizationNj);
				}
			  operationchecksInfor.add(tbOperationcheck);
			}
			
			map.put("operationchecksInfor",operationchecksInfor);
			
		return map;
	}
}
