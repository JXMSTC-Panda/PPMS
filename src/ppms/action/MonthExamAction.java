package ppms.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import ppms.domain.TbMonthexam;


public class MonthExamAction extends ActionSupport{
	private TbMonthexam tbMonthexam;
	
	public TbMonthexam getTbMonthexam() {
		return tbMonthexam;
	}

	public void setTbMonthexam(TbMonthexam tbMonthexam) {
		this.tbMonthexam = tbMonthexam;
	}
	@Action(value ="employeeTrainExam.null.MonthExamSingle.MonthExamAdd", results = {  
	        @Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/monthExamSingleResult.jsp"),  
	        @Result(name = "faild", location="/WEB-INF/content/error.jsp")})
	public String MonthExamAdd(){
		return "success";
		}
}
