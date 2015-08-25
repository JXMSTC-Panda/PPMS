package ppms.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.domain.TbMonthexam;
import ppms.serviceimpl.employeeTrainExamServiceImp;

import com.opensymphony.xwork2.ActionSupport;

public class employeeTrainExamAction extends ActionSupport{
	
	private TbMonthexam tbMonthexam;
	@Autowired
	private employeeTrainExamServiceImp employeeTrainExam;
	public TbMonthexam getTbMonthexam() {
		return tbMonthexam;
	}
	public void setTbMonthexam(TbMonthexam tbMonthexam) {
		this.tbMonthexam = tbMonthexam;
	}
	
}
