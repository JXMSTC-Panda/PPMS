package ppms.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.action.interfaces.BaseInit;
import ppms.daoimpl.BaseDaoImp;
import ppms.domain.TbMonitorcheck;
import ppms.serviceimpl.MonitorcheckServiceImp;

public class MonitorAction extends BaseInit{
	
	
	private TbMonitorcheck monitorcheck;
	
	@Autowired
	private MonitorcheckServiceImp service;

	public TbMonitorcheck getMonitorcheck() {
		return monitorcheck;
	}

	public void setMonitorcheck(TbMonitorcheck monitorcheck) {
		this.monitorcheck = monitorcheck;
	}

	@Action(value = "standardVisit.monitor.monitorSingle", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/standardVisit/monitorSingle.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String firstIn() {

		return "success";
	}

	@Action(value ="standardVisit.monitor.monitorSingle.add", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/standardVisit/monitorSingle.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String add(){
		
		try {
			
			if(monitorcheck!=null){
				if(service.save(monitorcheck)){
					if(ServletActionContext.getRequest().getSession().getAttribute("organizationNj")!=null){
						ServletActionContext.getRequest().getSession().removeAttribute("organizationNj");
					}
					ServletActionContext.getResponse().sendRedirect("standardVisit.monitor.monitorSearch.do");
					return null;
				}
			}
			return "error";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
	@Action(value ="standardVisit.monitor.monitorSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/standardVisit/monitorSearch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String search(){
		
		try {
			
			List<TbMonitorcheck> all=service.getAll();
			
			if(all!=null){
				map.put("monitorchecks", all);
				toCache();
				return "success";
			}
			return "error";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
}
