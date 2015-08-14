package ppms.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ppms.action.interfaces.InitPage;
import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.domain.TbStage;
import ppms.serviceimpl.GrowthFileServiceImp;

import com.opensymphony.xwork2.ActionSupport;

public class GrowthFileAction extends ActionSupport implements InitPage{
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
	private GrowthFileServiceImp serviceImp;

	public GrowthFileServiceImp getServiceImp() {
		return serviceImp;
	}

	public void setServiceImp(GrowthFileServiceImp serviceImp) {
		this.serviceImp = serviceImp;
	}

	@Override
	public Map<String, List<T>> initPage(ServletContext servletContext,
			String url) {
		//实例化map
		Map map=new HashMap<>();
		//给个环境
		GrowthFileServiceImp service = WebApplicationContextUtils
		.getWebApplicationContext(servletContext)
		.getBean(GrowthFileServiceImp.class);
		/**
		 * 定义一个switch函数，通过url（路径）初始化对应页面
		 */
		switch (url) {
		case "userInfo.personnelGrowthFileSearch":
			List<TbEmployee> tbEmployees=service.getTbEmployee();
			//创建一个空的list，名字为tbEmployee
			List<Object> tbEmployeeNew=new ArrayList<Object>();
			
			//遍历，导入数据

			for(TbEmployee tbEmployee: tbEmployees){
				OrganizationNj organizationNj = tbEmployee.getOrganizationNj();
				Integer orgid = organizationNj.getOrgid();
				List<OrganizationNj> organizationNjName=service.getOrganizationNjs(orgid);
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
			map.put("employee", tbEmployeeNew);
			break;

		default:
			break;
		}
		return map;
	}
           
}
