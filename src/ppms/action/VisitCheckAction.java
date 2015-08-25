package ppms.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.action.interfaces.BaseInit;
import ppms.domain.TbVisitcheck;
import ppms.serviceimpl.VisitcheckServiceImp;

public class VisitCheckAction extends BaseInit {

	private TbVisitcheck visitcheck;
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Autowired
	private VisitcheckServiceImp service;

	public TbVisitcheck getVisitcheck() {
		return visitcheck;
	}

	public void setVisitcheck(TbVisitcheck visitcheck) {
		this.visitcheck = visitcheck;
	}

	@Action(value = "standardVisit.visit.visitSingle", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/standardVisit/visitSingle.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/error.jsp") })
	public String firstIn() {

		return "success";
	}

	@Action(value = "standardVisit.visit.visitSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/standardVisit/visitSearch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/error.jsp") })
	public String search() {

		try {

			List<TbVisitcheck> visitchecks = service.getAll();
			if (visitchecks != null) {
				map.put("visitchecks", visitchecks);
				toCache();
				return "success";
			}
			ServletActionContext.getRequest().setAttribute("errorInfo", "没有数据");
			return "error";
		} catch (Exception e) {
			ServletActionContext.getRequest().setAttribute("errorInfo", "服务器异常，请重试进入查询");
			e.printStackTrace();
			return "error";
		}

	}

	@Action(value = "standardVisit.visit.visitSingle.add", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/standardVisit/visitBatch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/error.jsp") })
	public String add() {
		try {
			if (visitcheck != null) {
				
				if(ServletActionContext.getRequest().getSession().getAttribute("organizationNj")!=null){
					ServletActionContext.getRequest().getSession().removeAttribute("organizationNj");
				}
				double avg = (visitcheck.getFirstscore()
						+ visitcheck.getSecondscore() + visitcheck
						.getConsistencyscore()) / 3;
				visitcheck.setAveragescore(avg);
				service.save(visitcheck);
				ServletActionContext.getResponse().sendRedirect(
						"standardVisit.visit.visitSearch.do");
				return null;
			}
		} catch (Exception e) {
			ServletActionContext.getRequest().setAttribute("errorInfo", "服务器异常，请重试添加");
			e.printStackTrace();
			return "error";
		}
		return "success";
	}

	@Action(value = "standardVisit.visit.visitBatch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/standardVisit/visitBatch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/error.jsp") })
	public String batche() {

		return "success";
	}

	public String delete(){
		
		try {
			if(id!=null){
				if(service.delete(id)){
					
				}
			}
			ServletActionContext.getRequest().setAttribute("errorInfo", "服务器异常，提交数据失败，删除失败");
			return "error";
		} catch (Exception e) {
			e.printStackTrace();
			ServletActionContext.getRequest().setAttribute("errorInfo", "服务器异常，删除失败");
			return "error";
		}
	}
}
