package ppms.action;

<<<<<<< HEAD
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ppms.domain.TbEmployeepraisecriticism;


public class EmployeePraiseCriticismAction {
=======
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.domain.TbEmployee;
import ppms.domain.TbEmployeepraisecriticism;
import ppms.serviceimpl.PraiseCriticismServiceImp;

import com.opensymphony.xwork2.ActionSupport;


public class EmployeePraiseCriticismAction extends ActionSupport{
>>>>>>> a98b554a236bb42daae060e3bbaaee10f1fc7dcf
	
	
	private TbEmployeepraisecriticism tbEmployeepraisecriticism;
	
<<<<<<< HEAD
=======
	@Autowired
	private PraiseCriticismServiceImp praiseCriticism;
>>>>>>> a98b554a236bb42daae060e3bbaaee10f1fc7dcf
	
	public TbEmployeepraisecriticism getTbEmployeepraisecriticism() {
		return tbEmployeepraisecriticism;
	}


<<<<<<< HEAD
=======
	public EmployeePraiseCriticismAction(){
		
		System.out.println("create EmployeePraiseCriticismAction");
	}
>>>>>>> a98b554a236bb42daae060e3bbaaee10f1fc7dcf
	public void setTbEmployeepraisecriticism(
			TbEmployeepraisecriticism tbEmployeepraisecriticism) {
		this.tbEmployeepraisecriticism = tbEmployeepraisecriticism;
	}


<<<<<<< HEAD
	@Action(value="start",results={
			@Result(name="success",location="/WEB-INF/content/page/userinfo/Demo.jsp"),
			@Result(name="error",location="/WEB-INF/content/page/userinfo/Demo.jsp")})
	public String login(){
		return null;
	}
=======
	@Action(value="employeePraiseCriticismSingleStart",results={
			@Result(name="success",location="/WEB-INF/content/page/userinfo/Demo.jsp"),
			@Result(name="error",location="/WEB-INF/content/page/userinfo/Demo.jsp")})
	public String employeePraiseCriticismSingleStart(){
		int key=Integer.parseInt(tbEmployeepraisecriticism.getPraisecriticismtype());
		List<TbEmployeepraisecriticism> find=praiseCriticism.findLevel(key);
		System.out.println(find);
		return null;
	}
	
	@Action(value="skipSelectSingle",results={
			@Result(name="success",location="/WEB-INF/content/page/selectSingleEmployee.jsp"),
		    @Result(name="error",location="/WEB-INF/content/page/selectSingleEmployee.jsp")})
	
	public String skipSelectSingl(){
		System.out.println("create skipSelectSingle");
		List<TbEmployee> results=praiseCriticism.getEmployeeInfor();
		
		return "success";
	}
>>>>>>> a98b554a236bb42daae060e3bbaaee10f1fc7dcf
}
