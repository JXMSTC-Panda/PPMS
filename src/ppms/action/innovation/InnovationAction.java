package ppms.action.innovation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.formula.functions.T;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.action.interfaces.InitPage;
import ppms.domain.OrganizationNj;
import ppms.domain.TbInnovation;
import ppms.serviceimpl.InvocationServiceImp;

import com.opensymphony.xwork2.ActionSupport;

public class InnovationAction extends ActionSupport implements InitPage{

	private TbInnovation innovation;
	
	public void setInnovation(TbInnovation innovation) {
		this.innovation = innovation;
	}
	public TbInnovation getInnovation() {
		return innovation;
	}

	@Autowired
	private InvocationServiceImp service;

	/**
	 * 处理创新管理单条录入
	 * @return
	 */
	@Action(value ="/singleUpload", results = {  
	        @Result(name = "success", location = "/WEB-INF/content/page/innovation/innovationSingleResult.jsp"),  
	        @Result(name = "error", location="/WEB-INF/content/error.jsp")})
	public String singleUpload(){
		
		if(service.addInnovation(innovation)){
			return "success";
		}else{
			return "error";	
		}
		
	}
	@Override
	public Map<String, List<T>> initPage() {

		//实例化map
		Map map=new HashMap<String, List<OrganizationNj>>();
		
		
		//获取所有营业厅
		List<OrganizationNj> organizations = service.getOrganizations();
		
		map.put("orgs", organizations);
		return map;
	}
	
	
}
