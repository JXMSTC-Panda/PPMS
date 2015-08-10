package ppms.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import ppms.domain.TbEmployee;
import ppms.domain.TbOrgpraisecriticism;

import com.opensymphony.xwork2.ActionSupport;


public class BusinessHallPraiseCriticismAction extends ActionSupport{

	private TbOrgpraisecriticism tbOrgpraisecriticism;
	
	
	public TbOrgpraisecriticism getTbOrgpraisecriticism() {
		return tbOrgpraisecriticism;
	}


	public void setTbOrgpraisecriticism(TbOrgpraisecriticism tbOrgpraisecriticism) {
		this.tbOrgpraisecriticism = tbOrgpraisecriticism;
	}

	@Action(value="businessHallPraiseCriticismSingleStart",results={
			@Result(name="success",location="/WEB-INF/content/page/userinfo/Demo.jsp"),
			@Result(name="error",location="/WEB-INF/content/page/userinfo/Demo.jsp")})
	public String login(){
		System.out.println("business");
		return "success";
	}
	@Action(value="skipBusinessHallSelectSingle",results={
			@Result(name="success",location="/WEB-INF/content/page/selectSingleBusinessHall.jsp"),
		    @Result(name="error",location="/WEB-INF/content/page/selectSingleBusinessHall.jsp")})
	
	public String skipSelectSingl(){
		System.out.println("create skipSelectSingle");
		
		return "success";
	}
}
