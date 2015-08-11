package ppms.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;
import ppms.domain.TbEmployeepraisecriticism;
import ppms.domain.TbJob;
import ppms.domain.TbPost;
import ppms.gason.adapter.TargetStrategy;
import ppms.serviceimpl.PraiseCriticismServiceImp;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EmployeePraiseCriticismAction extends ActionSupport {

	private TbEmployeepraisecriticism tbEmployeepraisecriticism;

	@Autowired
	private PraiseCriticismServiceImp praiseCriticism;

	public TbEmployeepraisecriticism getTbEmployeepraisecriticism() {
		return tbEmployeepraisecriticism;
	}

	public EmployeePraiseCriticismAction() {

		System.out.println("create EmployeePraiseCriticismAction");
	}

	public void setTbEmployeepraisecriticism(
			TbEmployeepraisecriticism tbEmployeepraisecriticism) {
		this.tbEmployeepraisecriticism = tbEmployeepraisecriticism;
	}

	@Action(value = "employeePraiseCriticismSingleStart", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userinfo/Demo.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/userinfo/Demo.jsp") })
	public String employeePraiseCriticismSingleStart() {
		int key = Integer.parseInt(tbEmployeepraisecriticism
				.getPraisecriticismtype());
		List<TbEmployeepraisecriticism> find = praiseCriticism.findLevel(key);
		System.out.println(find);
		return null;
	}

	@Action(value = "skipEmployeeSelectSingle", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/selectSingleEmployee.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/selectSingleEmployee.jsp") })
	public String skipSelectSingle() {
		
		int i=2;
		ActionContext actionContext = ActionContext.getContext();

		// get HttpServletRequest
		try {
			Map<String, Object> request = (Map) actionContext.get("request");

			System.out.println("create skipSelectSingle");
			List<TbEmployee> employeeResults = praiseCriticism
					.findAllEmployeeInfor();
			List<TbEmployee> emploeesInfo=new ArrayList<TbEmployee>();
			
			for (TbEmployee tbEmployee : employeeResults) {

				
				List<OrganizationNj> organizationNjResults = praiseCriticism
						.findOrganizationNjInfor(tbEmployee.getOrganizationNj()
								.getOrgid());
				tbEmployee.setOrganizationNj(organizationNjResults.get(0));
				
				List<TbPost> posts = praiseCriticism.findPostName(tbEmployee
						.getTbPost().getPostid());
				TbPost tbPost = posts.get(0);
				tbEmployee.setTbPost(tbPost);
				List<TbJob> jobs = praiseCriticism.findJobName(tbEmployee
						.getTbJob().getJobid());
				tbEmployee.setTbJob(jobs.get(0));
				emploeesInfo.add(tbEmployee);
				//设置对TbEmployee的策略
			}	
			request.put("employeeInfos", emploeesInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return "success";
	}
}
