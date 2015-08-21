package ppms.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.poi.ss.formula.functions.T;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ppms.action.interfaces.BaseInit;
import ppms.action.interfaces.InitPage;
import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.domain.TbStage;
import ppms.serviceimpl.GrowthFileServiceImp;

import com.opensymphony.xwork2.ActionSupport;

public class GrowthFileAction extends BaseInit{
	/**
	 * 创建人员表对象
	 */
	private TbEmployee tbEmployee;
		
	public TbEmployee getTbEmployee() {
		return tbEmployee;
	}

	public void setTbEmployee(TbEmployee tbEmployee) {
		this.tbEmployee = tbEmployee;
	}
	@Autowired
	private GrowthFileServiceImp service;
		
	public GrowthFileServiceImp getService() {
		return service;
	}

	public void setService(GrowthFileServiceImp service) {
		this.service = service;
	}

	@Action(value = "userInfo.growthFile.personnelGrowthFileSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/personnelGrowthFileSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String search(){
		
		initPage("userInfo.personnelGrowthFileSearch");
		toCache();
		return "success";
	}
	private void  initPage(String url) {
		try {
			switch (url) {
			case "userInfo.personnelGrowthFileSearch":
				List<TbEmployee> tbEmployees=service.getTbEmployee();
				//创建一个空的list，名字为tbEmployee
				List<Object> tbEmployeeNew=new ArrayList<Object>();				
				//遍历，导入数据
				for(TbEmployee tbEmployee: tbEmployees){
					if(tbEmployee.getOrganizationNj()!=null){
					List<OrganizationNj> organizationNjName=service.getOrganizationNjs(tbEmployee.getOrganizationNj().getOrgid());
					tbEmployee.setOrganizationNj(organizationNjName.get(0));
					
					if(tbEmployee.getTbJob()!=null){
						List<TbJob> jobsName=service.getTbJobs(tbEmployee.getTbJob().getJobid());
						
						if(jobsName.get(0).getTbStage()!=null){
						List<TbStage> stagesName=service.getTbStages(jobsName.get(0).getTbStage().getStageid());
						TbJob tbJob = jobsName.get(0);
						tbJob.setTbStage(stagesName.get(0));
					    tbEmployee.setTbJob(tbJob);  
					    tbEmployeeNew.add(tbEmployee);
						}
						}
					}		    
				}			
				map.put("employee", tbEmployeeNew);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
           
}
