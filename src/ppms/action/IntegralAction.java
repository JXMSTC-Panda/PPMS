package ppms.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 处理积分管理模块请求
 * @author shark
 * @update 2015下午7:11:24
 * @function
 *
 */
public class IntegralAction extends ActionSupport{

	@Action(value = "integral.null.integralBatch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/integral/integralBatch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String downLoad(){
		
		return "suceess";
	}
	
}
