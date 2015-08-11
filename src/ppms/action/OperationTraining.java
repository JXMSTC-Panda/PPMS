package ppms.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import ppms.domain.TbOperationtraining;

public class OperationTraining {
	private TbOperationtraining tbOperationtraining;
	
	
	public TbOperationtraining getTbOperationtraining() {
		return tbOperationtraining;
	}


	public void setTbOperationtraining(TbOperationtraining tbOperationtraining) {
		this.tbOperationtraining = tbOperationtraining;
	}


	@Action(value ="employeeTrainExam.null.operationTrainSingle.operationTrainAdd", results = {  
	        @Result(name = "success", location = "/WEB-INF/content/page/authority/operationTrainSingleResult.jsp"),  
	        @Result(name = "faild", location="/WEB-INF/content/error.jsp")})
	public String roleSingleResult(){
		return "success";
	}
}
