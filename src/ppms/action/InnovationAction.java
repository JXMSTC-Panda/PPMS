package ppms.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.poi.ss.formula.functions.T;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ppms.action.interfaces.InitPage;
import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;
import ppms.domain.TbInnovation;
import ppms.serviceimpl.InvocationServiceImp;

import com.opensymphony.xwork2.ActionSupport;

public class InnovationAction extends AjaxRequestAction implements InitPage {

	private TbInnovation innovation;

	public void setInnovation(TbInnovation innovation) {
		this.innovation = innovation;
	}

	public TbInnovation getInnovation() {
		return innovation;
	}

	@Autowired
	private InvocationServiceImp service;

	public void setService(InvocationServiceImp service) {
		this.service = service;
	}

	/**
	 * 处理创新管理单条录入
	 * 
	 * @return
	 */
	@Action(value = "/singleUpload", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/innovation/innovationSingleResult.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String singleUpload() {

		if (service.addInnovation(innovation)) {
			return "success";
		} else {
			return "error";
		}

	}

	@Override
	public Map<String, List<T>> initPage(ServletContext context, String url) {

		// 实例化map
		Map map = new HashMap<String, List<Object>>();


		// 根据不同请求的url实现不同页面的页面初始化
		switch (url) {
		case "innovation.innovationSingle":

			// 获取所有营业厅
			List<OrganizationNj> organizationNjs = getOrganizationNjs(context);
			if(organizationNjs!=null&&organizationNjs.size()>0){
				map.put("orgs", organizationNjs);
			}
		
			break;
		case "innovation.innovationSearch":
			// 获取提案信息
			
			List<TbInnovation> innovations = getInnovations(context);
			
			if(innovations!=null&&innovations.size()>0){
				map.put("innovations", innovations);
			}
			break;
		default:
			break;
		}
		return map;
	}

	@Action("/getEmployees")
	@Override
	public String initProcess() {

		String orgid = request.getParameter("orgid");

		System.out.println("sfasfs");
		setHsql("from TbEmployee where orgid=" + orgid);
		setKey("employees");
		setFieldToJson(null, TbEmployee.class);
		excute();
		return null;

		// try {
		// String orgid = request.getParameter("orgid");
		//
		// if (orgid.equals("") || orgid == null) {
		// return null;
		// }
		//
		// //查询数据库
		// List<TbEmployee> employees = dao.findByHSQL(
		// "from TbEmployee where orgid=" + orgid, new TbEmployee());
		//
		// //设置对TbEmployee的策略
		// TargetStrategy ts = new TargetStrategy(TbEmployee.class);
		// //表示仅转换TbEmployee中的employeename和employeeid属性
		// ts.setFields(new String[] {"employeename", "employeeid"});
		// ts.setReverse(true);
		// Gson gson = new GsonBuilder().setExclusionStrategies(ts).create();
		//
		// Map<String, List<TbEmployee>> map = new HashMap<String,
		// List<TbEmployee>>();
		// map.put("employees", employees);
		// String json = gson.toJson(map);
		// response.getWriter().write(json);
		// System.out.println(json);
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
	}
	
	/**
	 * 获取所有营业厅的信息
	 * @param context
	 * @return
	 */
	private List<OrganizationNj> getOrganizationNjs(ServletContext context){
		

		InvocationServiceImp service = WebApplicationContextUtils
				.getWebApplicationContext(context).getBean(
						InvocationServiceImp.class);
		return service.getOrganizations();
	}
	
	private List<TbInnovation> getInnovations(ServletContext context){
		
		InvocationServiceImp service = WebApplicationContextUtils
				.getWebApplicationContext(context).getBean(
						InvocationServiceImp.class);
		
		return service.findAllInnovations();
	}

}
