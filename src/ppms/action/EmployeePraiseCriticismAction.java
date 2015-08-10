package ppms.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;
import ppms.domain.TbEmployeepraisecriticism;
import ppms.domain.TbJob;
import ppms.domain.TbPost;
import ppms.serviceimpl.PraiseCriticismServiceImp;

import com.opensymphony.xwork2.ActionSupport;


public class EmployeePraiseCriticismAction extends ActionSupport{
	
	
	private TbEmployeepraisecriticism tbEmployeepraisecriticism;
	
	@Autowired
	private PraiseCriticismServiceImp praiseCriticism;
	
	public TbEmployeepraisecriticism getTbEmployeepraisecriticism() {
		return tbEmployeepraisecriticism;
	}


	public EmployeePraiseCriticismAction(){
		
		System.out.println("create EmployeePraiseCriticismAction");
	}
	public void setTbEmployeepraisecriticism(
			TbEmployeepraisecriticism tbEmployeepraisecriticism) {
		this.tbEmployeepraisecriticism = tbEmployeepraisecriticism;
	}


	@Action(value="employeePraiseCriticismSingleStart",results={
			@Result(name="success",location="/WEB-INF/content/page/userinfo/Demo.jsp"),
			@Result(name="error",location="/WEB-INF/content/page/userinfo/Demo.jsp")})
	public String employeePraiseCriticismSingleStart(){
		int key=Integer.parseInt(tbEmployeepraisecriticism.getPraisecriticismtype());
		List<TbEmployeepraisecriticism> find=praiseCriticism.findLevel(key);
		System.out.println(find);
		return null;
	}
	
	@Action(value="skipEmployeeSelectSingle",results={
			@Result(name="success",location="/WEB-INF/content/page/selectSingleEmployee.jsp"),
		    @Result(name="error",location="/WEB-INF/content/page/selectSingleEmployee.jsp")})
	
	public String skipSelectSingl(){
		System.out.println("create skipSelectSingle");
		List<TbEmployee> employeeResults=praiseCriticism.findAllEmployeeInfor();
		for(TbEmployee tbEmployee:employeeResults){			
				System.out.print(tbEmployee.getEmployeeid()+":"+tbEmployee.getEmployeename()+":"+tbEmployee.getIdnumber());
				List<OrganizationNj> organizationNjResults=praiseCriticism.findOrganizationNjInfor(tbEmployee.getOrganizationNj().getOrgid());
				for(OrganizationNj organizationNj:organizationNjResults){
					System.out.print(":"+organizationNj.getOrgid()+":"+organizationNj.getOrgName());
				}
				System.out.print(":"+tbEmployee.getBirthday()+":");
				if(tbEmployee.getSex())
					{System.out.print("女");}
				else
					{System.out.print("男");}
				List<TbPost> postName=praiseCriticism.findPostName(tbEmployee.getTbPost().getPostid());
				System.out.print(":"+postName.get(0));
				List<TbJob> jobName=praiseCriticism.findJobName(tbEmployee.getTbJob().getJobid());
				System.out.println(":"+jobName.get(0));
				}						
		return "success";
	}
}
