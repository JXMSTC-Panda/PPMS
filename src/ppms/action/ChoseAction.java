package ppms.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ppms.daoimpl.BaseDaoImp;
import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;

import com.opensymphony.xwork2.ActionSupport;

public class ChoseAction extends ActionSupport {

	private String backUrl;
	private String orgId;
	private String need;

	private String employeeid;

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public String getNeed() {
		return need;
	}

	public void setNeed(String need) {
		this.need = need;
	}

	private String selectedId;

	public String getSelectedId() {
		return selectedId;
	}

	public void setSelectedId(String selectedId) {
		this.selectedId = selectedId;
	}

	public String getBackUrl() {
		return backUrl;
	}

	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	@Autowired
	@Qualifier("baseDaoImp")
	private BaseDaoImp dao;

	@Action(value = "chooseOrg", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/OrgChoose.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String firstIn() {

		try {
			List<OrganizationNj> orgs = new ArrayList<OrganizationNj>();
			List<OrganizationNj> entitiestNotLazy = dao.getEntitiestNotLazy(
					new OrganizationNj(),
					new String[] { "tbAreaorgrelations" }, null);

			for (OrganizationNj organizationNj : entitiestNotLazy) {

				orgs.add(organizationNj.toComplete(dao));
			}
			ServletActionContext.getRequest().setAttribute("backUrl", backUrl);
			ServletActionContext.getRequest().getSession()
					.setAttribute("organizationNjs", orgs);
			dao=null;
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

	@Action(value = "orgback", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/OrgChoose.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String orgback() {

		try {
			if (selectedId != null) {

				List<OrganizationNj> list = (List<OrganizationNj>) ServletActionContext
						.getRequest().getSession()
						.getAttribute("organizationNjs");
				OrganizationNj organizationNj = null;
				for (int i = 0; i < list.size(); i++) {
					if(list.get(i).getOrgid().toString().equals(selectedId)){
						organizationNj=list.get(i);
						break;
					}
				}
				if (list != null && list.size() > 0) {

					if (backUrl != null
							&& (backUrl
									.equals("innovation.null.innovationSingle.do")
									|| backUrl
											.equals("employeeTrainExam.monthExam.monthExamSingle.do")
									|| backUrl
											.equals("employeeTrainExam.operationTrain.operationTrainSingle.do")
									|| backUrl
											.equals("employeeTrainExam.promoteTrain.promoteTrainSingle.do")
									|| backUrl
											.equals("performance.month.monthPerformanceSingle.do")
									|| backUrl
											.equals("performance.year.yearPerformanceSingle.do")
									|| backUrl
											.equals("employeeTrainExam.freshEmployeeExam.becomeEmployeeSingle.do") || backUrl
										.equals("employeeTrainExam.freshEmployeeExam.freshEmployeeExamSingle.do"))) {
						List<TbEmployee> employees = dao.findByHSQL("from TbEmployee where orgid="+selectedId, new TbEmployee());
						if (employees.size() > 0) {
							ServletActionContext.getRequest().getSession()
									.setAttribute("employees", employees);
						}
					}

					ServletActionContext.getRequest().getSession()
							.setAttribute("organizationNj", organizationNj.toComplete(dao));
					String[] split = backUrl.split("[.]");
					backUrl = "/WEB-INF/content/page/" + split[0] + "/"
							+ split[2] + ".jsp";
					ServletActionContext
							.getRequest()
							.getRequestDispatcher(backUrl)
							.forward(ServletActionContext.getRequest(),
									ServletActionContext.getResponse());
					dao=null;
					return null;
				}
			}
			return "error";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}

	}

	@Action(value = "getEmployee", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/OrgChoose.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String getEmployee() {

		List<TbEmployee> attribute = (List<TbEmployee>) ServletActionContext
				.getRequest().getSession().getAttribute("employees");

		try {
			if (attribute != null) {

				for (TbEmployee tbEmployee : attribute) {

					if (tbEmployee.getEmployeeid().equals(employeeid)) {

						ServletActionContext.getRequest().getSession()
								.setAttribute("employee", tbEmployee);
						ServletActionContext.getRequest().getSession()
								.setAttribute("mark", "have");
						String[] split = backUrl.split("[.]");
						backUrl = "/WEB-INF/content/page/" + split[0] + "/"
								+ split[2] + ".jsp";
						ServletActionContext
								.getRequest()
								.getRequestDispatcher(backUrl)
								.forward(ServletActionContext.getRequest(),
										ServletActionContext.getResponse());
						;
						return null;
					}
				}
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}

	}
}
