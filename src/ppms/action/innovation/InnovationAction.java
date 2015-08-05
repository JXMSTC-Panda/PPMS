package ppms.action.innovation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.formula.functions.T;
import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import ppms.action.interfaces.InitPage;
import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;
import ppms.domain.TbInnovation;
import ppms.serviceimpl.InvocationServiceImp;

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
	@Action("/singleUpload")
	public String singleUpload(){
		
		if(service.addInnovation(innovation)){
			
		}
		return null;
	}

	public InvocationServiceImp getService() {
		return service;
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
