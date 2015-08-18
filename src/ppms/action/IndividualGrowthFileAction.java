package ppms.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.domain.TbChangejobhistory;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.serviceimpl.IndividualGrowthFileServiceImp;
import sun.print.resources.serviceui;

public class IndividualGrowthFileAction {
	
	private TbChangejobhistory tbChangejobhistory;

	public TbChangejobhistory getTbChangejobhistory() {
		return tbChangejobhistory;
	}

	public void setTbChangejobhistory(TbChangejobhistory tbChangejobhistory) {
		this.tbChangejobhistory = tbChangejobhistory;
	}
	
    protected HttpServletRequest request;
	
	public IndividualGrowthFileAction() {
		
		request = ServletActionContext.getRequest();
		
	}
	@Autowired
	private IndividualGrowthFileServiceImp service;
	
	
	public IndividualGrowthFileServiceImp getService() {
		return service;
	}

	public void setService(IndividualGrowthFileServiceImp service) {
		this.service = service;
	}

	/**
	 * 
	 * @return
	 */
	@Action(value = "userInfo.growthFile.individualGrowthFileSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/individualGrowthFileSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String result() {
		try {
			List<TbChangejobhistory> tbChangejobhistories =service.getTbChangejobhistories(tbChangejobhistory.getTbEmployee().getEmployeeid());
			request.setAttribute("tbChangejob", tbChangejobhistories);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return "success";
	}
}
