package ppms.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.action.interfaces.BaseInit;
import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.domain.TbStage;
import ppms.serviceimpl.GrowthFileServiceImp;
/**   
 *    
 * 项目名称：PPMS   
 * 类名称：userBaseInfoAction   
 * 类描述：   
 * 创建人：SuperYWJ
 * 创建时间：2015-8-17 下午3:51:51   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-17 下午8:51:51   
 * 修改备注：   
 * @version    
 *    
 */
public class GrowthFileAction extends BaseInit{
	/**
	 * 创建tbEmployee对象
	 */
	private TbEmployee tbEmployee;
		
	public TbEmployee getTbEmployee() {
		return tbEmployee;
	}

	public void setTbEmployee(TbEmployee tbEmployee) {
		this.tbEmployee = tbEmployee;
	}
	/**
	 * 创建对应service层对象
	 */
	@Autowired
	private GrowthFileServiceImp service;
		
	public GrowthFileServiceImp getService() {
		return service;
	}

	public void setService(GrowthFileServiceImp service) {
		this.service = service;
	}
	/**
	 * 通过url实现对应页的初始化
	 * @return
	 */
	@Action(value = "userInfo.growthFile.personnelGrowthFileSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/personnelGrowthFileSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	/***
	 * 对应页面的url
	 * @return
	 */
	public String search(){
		
		initPage("userInfo.personnelGrowthFileSearch");
		toCache();
		return "success";
	}
	/**
	 * 取到url,实现初始化
	 * @param url
	 */
	private void  initPage(String url) {
		try {
			switch (url) {
			case "userInfo.personnelGrowthFileSearch":
				List<TbEmployee> tbEmployees=service.getTbEmployee();
				//创建一个空的list，名字为tbEmployee
				List<Object> tbEmployeeNew=new ArrayList<Object>();				
				/**
				 * 遍历，查到数据，封装，set到表中对应对象，add到空list中
				 */
				for(TbEmployee tbEmployee: tbEmployees){
					//判空
					if(tbEmployee.getOrganizationNj()!=null){
					List<OrganizationNj> organizationNjName=service.getOrganizationNjs(tbEmployee.getOrganizationNj().getOrgid());
					tbEmployee.setOrganizationNj(organizationNjName.get(0));
					//判空
					if(tbEmployee.getTbJob()!=null){
						List<TbJob> jobsName=service.getTbJobs(tbEmployee.getTbJob().getJobid());
						//判空
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
