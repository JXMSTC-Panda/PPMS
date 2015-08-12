package ppms.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import ppms.domain.TbOperationtraining;

public class OperationTrainingAction extends ActionSupport {
	
	private TbOperationtraining tbOperationtraining;
	
	
	public TbOperationtraining getTbOperationtraining() {
		return tbOperationtraining;
	}


	public void setTbOperationtraining(TbOperationtraining tbOperationtraining) {
		this.tbOperationtraining = tbOperationtraining;
	}


	@Action(value="employeeTrainExam.null.operationTrainSingle.operationTrainAdd", results = {  
	        @Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/operationTrainSingleResult.jsp"),  
	        @Result(name = "faild", location="/WEB-INF/content/error.jsp")})
	public String operationTrainingSingleResult(){
		
		return "success";
	}
}
