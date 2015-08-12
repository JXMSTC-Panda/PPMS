package ppms.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import ppms.domain.TbArea;
import ppms.domain.TbMonthexam;

import com.opensymphony.xwork2.ActionSupport;


public class MonthExamAction extends ActionSupport{
	private TbMonthexam tbMonthexam;
	private TbArea tbArea;
	
	public TbArea getTbArea() {
		return tbArea;
	}

	public void setTbArea(TbArea tbArea) {
		this.tbArea = tbArea;
	}

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
