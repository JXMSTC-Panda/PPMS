package ppms.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.action.interfaces.BaseInit;
import ppms.domain.TbChangejobhistory;
import ppms.serviceimpl.IndividualGrowthFileServiceImp;

public class IndividualGrowthFileAction  extends BaseInit{

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
			List<TbChangejobhistory> tbChangejobhistories = service
					.getTbChangejobhistories(tbChangejobhistory.getTbEmployee()
							.getEmployeeid());

			if (tbChangejobhistories.size() > 0) {
				map.put("tbChangejobs", tbChangejobhistories);
				toCache();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "success";
	}
}
