package ppms.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ppms.domain.TbEmployeepraisecriticism;


public class EmployeePraiseCriticismAction {
	
	
	private TbEmployeepraisecriticism tbEmployeepraisecriticism;
	
	
	public TbEmployeepraisecriticism getTbEmployeepraisecriticism() {
		return tbEmployeepraisecriticism;
	}


	public void setTbEmployeepraisecriticism(
			TbEmployeepraisecriticism tbEmployeepraisecriticism) {
		this.tbEmployeepraisecriticism = tbEmployeepraisecriticism;
	}


	@Action(value="start",results={
			@Result(name="success",location="/WEB-INF/content/page/userinfo/Demo.jsp"),
			@Result(name="error",location="/WEB-INF/content/page/userinfo/Demo.jsp")})
	public String login(){
		return null;
	}
}
