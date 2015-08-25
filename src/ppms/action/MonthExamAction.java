package ppms.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ppms.action.interfaces.BaseInit;
import ppms.daoimpl.BaseDaoImp;
import ppms.domain.COrganizationNj;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.domain.TbMonthexam;
import ppms.domain.TbPost;
import ppms.serviceimpl.PraiseCriticismServiceImp;
import ppms.serviceimpl.monthExamServiceImp;

import com.opensymphony.xwork2.ActionContext;

public class MonthExamAction extends BaseInit {
	
	
	private TbMonthexam tbMonthexam;
	private TbArea tbArea;
	private String id;
	public final String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
	}

	@Autowired
	private PraiseCriticismServiceImp service;
	@Autowired
	private monthExamServiceImp serviceMoth;

	public TbArea getTbArea() {
		return tbArea;
	}

	public void setTbArea(TbArea tbArea) {
		this.tbArea = tbArea;
	}

	/**
	 * 调用API
	 */
	@Autowired
	@Qualifier("baseDaoImp")
	private BaseDaoImp daoImp;

	public TbMonthexam getTbMonthexam() {
		return tbMonthexam;
	}

	public void setTbMonthexam(TbMonthexam tbMonthexam) {
		this.tbMonthexam = tbMonthexam;
	}

	@Action(value = "employeeTrainExam.monthExam.monthExamSingle.MonthExamAdd", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/monthExamSingleResult.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String MonthExamAdd() {
		try {
			
			service.save(tbMonthexam);
			if (ServletActionContext.getRequest().getSession()
					.getAttribute("organizationNj") != null) {
				ServletActionContext.getRequest().getSession()
						.removeAttribute("organizationNj");
			}
			if (ServletActionContext.getRequest().getSession()
					.getAttribute("employee") != null) {
				ServletActionContext.getRequest().getSession()
						.removeAttribute("employee");
			}
			ServletActionContext.getResponse().sendRedirect("employeeTrainExam.monthExam.monthExamSearch.do");
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		
	}

	

	@Action(value = "employeeTrainExam.monthExam.monthExamSingle.skipMonthExamSingle", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/monthExamSingle.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String skipMonthExamSingle() {

		ActionContext actionContext = ActionContext.getContext(); // 创建ActionContext的对象并调用getContext()方法
		Map<String, Object> request = (Map) actionContext.get("request"); // 获取出request对象
		String employeeId = ServletActionContext.getRequest().getParameter(
				"selectEmployee"); // 通过getParameter方法获取页面上name为selectEmployee的标签的value值
		System.out.println(employeeId); // 打印从前一个页面传过来的员工编号employeeId

		// get HttpServletRequest
		try {
			System.out.println("create skipSelectSingle");
			List<TbEmployee> employeeInfor = service
					.findEmployeeInfor(employeeId); // 调用findEmployeeInfor()方法
			List<TbEmployee> emploeesInfo = new ArrayList<TbEmployee>(); // 创建一个空的集合emploeesInfo
			for (TbEmployee tbEmployee : employeeInfor) { // 遍历ss
				List<COrganizationNj> cOrganizationNjInfor = service
						.findCOrganizationNjInfor(tbEmployee
								.getOrganizationNj().getOrgid());// 执行findCOrganizationNjInfor，根据营业厅编号获取营业厅区域关系表中的信息
				for (COrganizationNj cOrganizationNj : cOrganizationNjInfor) {// 遍历
					System.out.println(cOrganizationNj.getTbArea().getAreaid());// 打印区域的编号
					List<TbArea> areaInfor = service
							.findAreaDesc(cOrganizationNj.getTbArea()
									.getAreaid());// 执行findAreaDesc方法，根据区域编号获取区域名称
					String areadesc = areaInfor.get(0).getAreadesc();
					System.out.println(areadesc);// 打印区域名称
					request.put("areadesc", areadesc);// 将区域名称使用put方法存放
				}
				List<OrganizationNj> organizationNjResults = service
						.findOrganizationNjInfor(tbEmployee.getOrganizationNj()
								.getOrgid());// 执行findOrganizationNjInfor方法，根据营业厅编号查询同步营业厅信息
				tbEmployee.setOrganizationNj(organizationNjResults.get(0));// 将同步营业厅信息set进对象organizationNj中
				List<TbPost> posts = service.findPostName(tbEmployee
						.getTbPost().getPostid()); // 调用findPostName()方法
				TbPost tbPost = posts.get(0); // 获取岗职集合中的第一个也是唯一一个值
				tbEmployee.setTbPost(tbPost); // 将获取的值设置到tbEmployee中
				List<TbJob> jobs = service.findJobName(tbEmployee.getTbJob()
						.getJobid()); // 调用findJobName()方法
				tbEmployee.setTbJob(jobs.get(0)); // 获取岗位集合中的第一个也是唯一一个值，并将获取的值设置到tbEmployee中
				emploeesInfo.add(tbEmployee); // 将tbEmployee对象添加到emploeesInfo中
				// 设置对TbEmployee的策略
			}
			request.put("employeeInfos", emploeesInfo); // 将emploeesInfo用put方法存放
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Action(value = "employeeTrainExam.monthExam.monthExamSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/monthExamSearch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String first() {
		int i = 0;
		MonthExamSearch("employeeTrainExam.null.monthExamSearch");
		toCache();
		return "success";
	}

	public void MonthExamSearch(String url) {
		try {
			switch (url) {
			case "employeeTrainExam.null.monthExamSearch":

				List<TbMonthexam> tbMonthexams = daoImp.getEntitiestNotLazy(
						new TbMonthexam(), new String[] { "organizationNj",
								"tbEmployee" }, null);
				map.put("tbMonthExam", tbMonthexams);
				break;

			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Action(value = "employeeTrainExam.monthExam.monthExamSingle", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/monthExamSingle.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String fisrtIn(){
		
		return "success";
	}
	
	@Action(value = "employeeTrainExam.monthExam.monthExamBatch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/monthExamBatch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String batch(){
		
		return "success";
	}
	
	@Action(value = "employeeTrainExam.monthExam.monthExamSearch.modify", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/monthExamUpdate.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String modify(){
		
		try {
			TbMonthexam monthexam = serviceMoth.getEntityById(id);
			ServletActionContext.getRequest().setAttribute("monthexam", monthexam);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		
		
	}
	
	@Action(value = "employeeTrainExam.monthExam.monthExamSearch.delete", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/monthExamSearch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String delete(){
		
		try {
			if(serviceMoth.delete(id)){
				ServletActionContext.getResponse().sendRedirect("employeeTrainExam.monthExam.monthExamSearch.do");
				return null;
			}
			return "error";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
	@Action(value = "employeeTrainExam.monthExam.monthExamSearch.update", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/monthExamSearch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String update(){
		
		try {
			if(serviceMoth.update(tbMonthexam)){
				ServletActionContext.getResponse().sendRedirect("employeeTrainExam.monthExam.monthExamSearch.do");
				return null;
			}
			return "error";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
}
