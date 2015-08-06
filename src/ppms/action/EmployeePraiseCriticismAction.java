package ppms.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.domain.TbEmployeepraisecriticism;
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
	
	@Action(value="skipSelectSingle",results={
			@Result(name="success",location="/WEB-INF/content/page/selectSingleEmployee.jsp"),
		    @Result(name="error",location="/WEB-INF/content/page/selectSingleEmployee.jsp")})
	
	public String skipSelectSingl(){
		System.out.println("create skipSelectSingle");
		return "success";
	}
}
