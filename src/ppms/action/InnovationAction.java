package ppms.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.transaction.Transactional;

import org.apache.poi.ss.formula.functions.T;
import org.apache.struts2.ServletActionContext;
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

/**
 * 处理创新提案模块的请求
 * 
 * @author shark
 * @update 2015下午7:10:18
 * @function
 * 
 */
public class InnovationAction extends BaseInit {

	private TbInnovation innovation;

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	/**
	 * 单条录入页面初始化
	 * 
	 * @return
	 */
	@Action(value = "innovation.null.innovationSingle", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/innovation/innovationSingle.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/error.jsp") })
	public String firstIn() {

		return "success";
	}

	/**
	 * 处理创新管理单条录入
	 * 
	 * @return
	 */
	@Action(value = "innovation.null.innovationSingle.add", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/innovation/innovationSingleResult.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/error.jsp") })
	public String add() {

		try {
			
			innovation.setEncouragement(innovation.getEncouragement()
					.replaceAll(", ", ""));
			if (service.addInnovation(innovation)) {

				if (ServletActionContext.getRequest().getSession()
						.getAttribute("organizationNj") != null) {
					
					innovation.setOrganizationNj((OrganizationNj) ServletActionContext.getRequest().getSession()
							.getAttribute("organizationNj"));
					ServletActionContext.getRequest().getSession()
							.removeAttribute("organizationNj");
				}
				if (ServletActionContext.getRequest().getSession()
						.getAttribute("employees") != null) {
					ServletActionContext.getRequest().getSession()
							.removeAttribute("employees");
				}

				if (ServletActionContext.getRequest().getSession()
						.getAttribute("employee") != null) {
					ServletActionContext.getRequest().getSession()
							.removeAttribute("employee");
				}
				ServletActionContext.getResponse().sendRedirect(
						"innovation.null.innovationSearch.do");
				return null;
			} else {
				return "error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}

	}

	@Action(value = "innovation.null.innovationSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/innovation/innovationSearch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/error.jsp") })
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

	@Action(value = "innovation.null.innovationBatch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/innovation/innovationBatch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/error.jsp") })
	public String batchUpload() {

		return "success";
	}

	@Action(value = "innovation.null.innovationSearch.delete", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/innovation/innovationSearch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/error.jsp") })
	public String delete() {
		try {
			if (id != null) {

				if (service.delete(id)) {
					ServletActionContext.getResponse().sendRedirect(
							"innovation.null.innovationSearch.do");
					return null;
				}
			}
			ServletActionContext.getRequest().setAttribute("errorInfo", "删除失败");
			return "error";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

	@Action(value = "innovation.null.innovationSearch.modify", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/innovation/innovationUpdate.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/error.jsp") })
	public String modify() {
		if (id != null) {

			TbInnovation tbInnovation = service.find(id);
			ServletActionContext.getRequest().setAttribute("tbInnovation",
					tbInnovation);
			return "success";
		}
		ServletActionContext.getRequest().setAttribute("errorInfo", "服务器异常，未获取到要修改的数据");
		return "error";
	}

	@Action(value = "innovation.null.innovationSearch.update", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/innovation/innovationUpdate.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/error.jsp") })
	public String update() {

		try {
			if (innovation != null) {

				innovation.setEncouragement(innovation.getEncouragement()
						.replaceAll(", ", ""));
				service.update(innovation);
				ServletActionContext.getResponse().sendRedirect(
						"innovation.null.innovationSearch.do");
				return null;
			}
			ServletActionContext.getRequest().setAttribute("errorInfo", "暂无没有创新提案");
			return "error";
		} catch (Exception e) {
			e.printStackTrace();
			ServletActionContext.getRequest().setAttribute("errorInfo", "服务器异常");
			return "error";
		}	

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
