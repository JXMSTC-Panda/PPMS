package ppms.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import ppms.domain.TbPromotiontraining;

public class PromoteTraining {
	private TbPromotiontraining tbPronotetiontraining;
	
	public TbPromotiontraining getTbPronotetiontraining() {
		return tbPronotetiontraining;
	}

	public void setTbPronotetiontraining(TbPromotiontraining tbPronotetiontraining) {
		this.tbPronotetiontraining = tbPronotetiontraining;
	}

	@Action(value ="employeeTrainExam.null.promoteTrainSingle.promoteTrainAdd", results = {  
	        @Result(name = "success", location = "/WEB-INF/content/page/authority/promoteTrainSingleResult.jsp"),  
	        @Result(name = "faild", location="/WEB-INF/content/error.jsp")})
	public String roleSingleResult(){
		return "success";
	}
}
