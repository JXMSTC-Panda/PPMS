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
import ppms.domain.TbOperationtraining;
import ppms.domain.TbPost;
import ppms.domain.TbPromotiontraining;
import ppms.serviceimpl.OperationTrainingServiceImp;
import ppms.serviceimpl.PraiseCriticismServiceImp;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class OperationTrainingAction extends BaseInit {

	private TbOperationtraining tbOperationtraining;
	private String id;

	@Autowired
	private PraiseCriticismServiceImp service;

	@Autowired
	private OperationTrainingServiceImp operService;
	private TbArea tbArea;

	public TbArea getTbArea() {
		return tbArea;
	}

	public void setTbArea(TbArea tbArea) {
		this.tbArea = tbArea;
	}

	public TbOperationtraining getTbOperationtraining() {
		return tbOperationtraining;
	}

	public void setTbOperationtraining(TbOperationtraining tbOperationtraining) {
		this.tbOperationtraining = tbOperationtraining;
	}

	@Action(value = "employeeTrainExam.operationTrain.operationTrainSingle.add", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/operationTrainSingleResult.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/error.jsp") })
	public String operationTrainingSingleResult() {

		try {
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
			service.save(tbOperationtraining);
			System.out.println("33333");
			ServletActionContext.getResponse().sendRedirect(
					"employeeTrainExam.operationTrain.operationTrainSearch.do");

			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}

	}

	@Action(value = "employeeTrainExam.operationTrain.operationTrainSingle.skipOperationTrainingSingle", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/operationTrainSingle.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/error.jsp") })
	public String skipOperationTrainingSingle() {

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

	@Autowired
	@Qualifier("baseDaoImp")
	private BaseDaoImp daoImp;

	@Action(value = "employeeTrainExam.operationTrain.operationTrainSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/operationTrainSearch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/error.jsp") })
	public String first() {
		int i = 0;
		System.out.println("dasd");
		operationTrainSearch("employeeTrainExam.null.operationTrainSearch");
		toCache();
		return "success";
	}

	public void operationTrainSearch(String url) {
		try {
			switch (url) {
			case "employeeTrainExam.null.operationTrainSearch":

				List<TbOperationtraining> tbOperationtrainings = daoImp
						.getEntitiestNotLazy(
								new TbOperationtraining(),
								new String[] { "organizationNj", "tbEmployee", },
								null);
				map.put("TbOperationtraining", tbOperationtrainings);
				break;

			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Action(value = "employeeTrainExam.operationTrain.operationTrainSingle", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/operationTrainSingle.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/error.jsp") })
	public String firstIn() {

		return "success";
	}

	@Action(value = "employeeTrainExam.operationTrain.operationTrainBatch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/operationTrainBatch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/error.jsp") })
	public String batch() {

		return "success";
	}

	@Action(value = "employeeTrainExam.operationTrain.operationTrainSearch.delete", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/operationTrainSingle.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/error.jsp") })
	public String delete() {

		try {
			if (operService.delete(id)) {
				ServletActionContext
						.getResponse()
						.sendRedirect(
								"employeeTrainExam.operationTrain.operationTrainSearch.do");
				return null;
			}
			ServletActionContext.getRequest().setAttribute("errorInfo", "删除失败");
			return "error";
		} catch (Exception e) {
			e.printStackTrace();
			ServletActionContext.getRequest().setAttribute("errorInfo", "服务器异常，删除失败");
			return "error";
		}

	}

	public final String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
	}

	@Action(value = "employeeTrainExam.operationTrain.operationTrainSearch.modify", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/operationTrainUpdate.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/error.jsp") })
	public String modify() {

		try {
			if (id != null) {
				TbOperationtraining operationtraining = operService
						.getEntity(id);
				ServletActionContext.getRequest().setAttribute(
						"operationtraining", operationtraining);
				return "success";
			}
			return "error";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
	
	@Action(value = "employeeTrainExam.operationTrain.operationTrainSearch.update", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/operationTrainUpdate.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/error.jsp") })
	public String update() {

		try {
			
			if(tbOperationtraining!=null){
				
				if(operService.update(tbOperationtraining)){
					ServletActionContext.getResponse().sendRedirect("employeeTrainExam.operationTrain.operationTrainSearch.do");
					return null;
				}
			}
			return "error";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
}
