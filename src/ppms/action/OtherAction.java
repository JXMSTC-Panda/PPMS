package ppms.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

public class OtherAction extends ActionSupport{

	@Action(value = "other.null.batchImportTempletList", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/other/batchImportTempletList.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String downLoadPage(){
		
		return "success";
	}
	
	@Action(value = "other.null.otherSystemSetting", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/other/otherSystemSetting.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String systemSetting(){
		
		return "success";
	}
}
