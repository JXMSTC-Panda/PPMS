package ppms.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.transaction.Transactional;

import org.apache.poi.ss.formula.functions.T;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ppms.action.interfaces.BaseInit;
import ppms.action.interfaces.InitPage;
import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;
import ppms.domain.TbInnovation;
import ppms.domain.TbMaster;
import ppms.genericDao.TbMasterDAO;
import ppms.serviceimpl.InvocationServiceImp;

import com.opensymphony.xwork2.ActionSupport;

public class InnovationAction extends BaseInit {

	private TbInnovation innovation;

	public void setInnovation(TbInnovation innovation) {
		this.innovation = innovation;
	}

	public TbInnovation getInnovation() {
		return innovation;
	}

	@Autowired
	private InvocationServiceImp service;

	@Autowired
	private TbMasterDAO masterDAO;

	@Action(value = "performance.innovation.innovationSingle", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/innovation/innovationSingle.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String firstIn() {

		List<OrganizationNj> organizationNjs = getOrganizationNjs();
		if (organizationNjs != null && organizationNjs.size() > 0) {
			map.put("orgs", organizationNjs);
		}
		return "success";
	}

	/**
	 * 处理创新管理单条录入
	 * 
	 * @return
	 */
	@Action(value = "performance.innovation.innovationSingle.singleUpload", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/innovation/innovationSingleResult.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String singleUpload() {

		if (service.addInnovation(innovation)) {
			return "success";
		} else {
			return "error";
		}

	}

	@Action(value = "performance.innovation.innovationSingle.innovationSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/innovation/innovationSearch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String searchPage() {

		List<TbInnovation> innovations = getInnovations();
		List<Object> masters = masterDAO.findByType("InnovationLevel");
		if (innovations != null && innovations.size() > 0) {
			map.put("innovations", innovations);
			map.put("masters", masters);
		}
		toCache();
		return "success";
	}

	/**
	 * 获取所有营业厅的信息
	 * 
	 * @param context
	 * @return
	 */
	private List<OrganizationNj> getOrganizationNjs() {
		return service.getOrganizations();
	}

	/**
	 * 获取所有的创新提案
	 * 
	 * @param context
	 * @return
	 */
	private List<TbInnovation> getInnovations() {

		return service.findAllInnovations();
	}

}
