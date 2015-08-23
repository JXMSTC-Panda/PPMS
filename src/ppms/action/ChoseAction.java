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

import com.opensymphony.xwork2.ActionSupport;

public class ChoseAction extends ActionSupport {

	private String backUrl;
	private String orgId;

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
					new OrganizationNj(),new String []{"tbAreaorgrelations"}, null);

			for (OrganizationNj organizationNj : entitiestNotLazy) {

				orgs.add(organizationNj.toComplete(dao));
			}
			ServletActionContext.getRequest().setAttribute("backUrl", backUrl);
			ServletActionContext.getRequest().setAttribute("orgs", orgs);
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

				List<OrganizationNj> list = dao.getEntitiestNotLazy(
						new OrganizationNj(),new String []{"tbAreaorgrelations"},
						Restrictions.eq("orgid", Integer.valueOf(selectedId)));

				if (list.size() > 0) {
					OrganizationNj organizationNj = list.get(0).toComplete(dao);
					ServletActionContext.getRequest().getSession()
							.setAttribute("organizationNj", organizationNj);
					ServletActionContext.getResponse().sendRedirect(backUrl);
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
