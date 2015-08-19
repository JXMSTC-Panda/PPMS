package ppms.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.formula.functions.T;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ppms.action.interfaces.InitPage;
import ppms.domain.COrganizationNj;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbEmployee;
import ppms.serviceimpl.InvocationServiceImp;
import ppms.serviceimpl.MountGuardCardServiceImp;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class MountGuardCardAction extends ActionSupport implements InitPage {

	protected HttpServletResponse response;
	protected HttpServletRequest request;

	// private String ajaxState;

	// 测试是否进入该函数
	public MountGuardCardAction() {
		super();
		response = ServletActionContext.getResponse();
		request = ServletActionContext.getRequest();
		// ajaxState = "0";
		System.out.println("调用MountGuardCardAction构造");
	}

	// 构造TbEmployee对象
	private TbEmployee tbemployee;

	public TbEmployee getTbemployee() {
		return tbemployee;
	}

	public void setTbemployee(TbEmployee tbemployee) {
		this.tbemployee = tbemployee;
	}

	// 自动装载MountGuardCardServiceImp service实现层
	@Autowired
	private MountGuardCardServiceImp mountguardcardserviceimp;

	// 0配置action
	@Action(value = "userInfo.mountGuardCard.mountGuardCardSingle.mgcs", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/mountGuardCardSearch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	/**
	 * 
	
	 * @Title: mgcs
	
	 * @Description: 取页面数据存入数据库跳转至查询页面
	
	 * @param:     
	
	 * @return:    
	
	 * @auther: CappuccinoH
	
	 * @date: 2015-8-11 下午8:48:04
	 */
	public String mgcs() {
		// 测试是否进入mgcs函数
		System.out.println("enter mgcs()");
		//

		return "success";

	}

	@Override
	public Map<String, List<T>> initPage(ServletContext servletContext,
			String url) {
		System.out.println("调用了map方法！！！！！！！！！！！！！！！！！！！！！！！！！！！");
		// 实例化map
				Map map = new HashMap<String, List<OrganizationNj>>();

				InvocationServiceImp serviceOrg = WebApplicationContextUtils
						.getWebApplicationContext(servletContext).getBean(
								InvocationServiceImp.class);
				
				MountGuardCardServiceImp serviceEmp = WebApplicationContextUtils
						.getWebApplicationContext(servletContext).getBean(
								MountGuardCardServiceImp.class);

				// 根据不同请求的url实现不同页面的页面初始化
				switch (url) {
				case "userInfo.mountGuardCardSingle":
					// 获取所有营业厅
					List<OrganizationNj> organizations = serviceOrg.getOrganizations();
					map.put("orgs", organizations);
					
					List<TbEmployee> employees = serviceEmp.getTbEmployee();
					map.put("employees", employees);
					break;

				default:
					break;
				}
				return map;
	}

	@Action(value = "userInfo.mountGuardCard.mountGuardCardSingle.ajaxSearchOrg")
	public void ajaxSearchOrg() throws IOException {
		// 获取输出流
		PrintWriter out = response.getWriter();

		// 创建StringBuilder缓冲流
		StringBuilder jsonTest = new StringBuilder();

		// jsonTest拼接
		jsonTest.append("{");

		// 接收OrgName的传值OrgId
		Integer OrgId = Integer.parseInt(request.getParameter("OrgName"));
		System.out.println("OrgId:" + OrgId);

		// 查询所有区域-营业厅关系表
		List<COrganizationNj> cOrganizationNj = mountguardcardserviceimp
				.getCOrganizationNj();
		// 声明字符串地域名称
		String areadesc = null;
		// 遍历查询出的所有区域营业厅信息
		for (COrganizationNj con : cOrganizationNj) {
			// 取营业厅编号
			Integer orgid2 = con.getOrganizationNj().getOrgid();
			// 筛选出营业厅编号与要查询营业厅编号相同的数据
			if (orgid2.equals(OrgId)) {
				// 取出符合要求的地域编号
				BigDecimal areaid = con.getTbArea().getAreaid();
				// 取出符合要求的地域编号数据集
				List<TbArea> tbAreaByAreaId = mountguardcardserviceimp
						.getTbAreaByAreaId(areaid);
				// 从数据集中取出地域的名称
				areadesc = tbAreaByAreaId.get(0).getAreadesc();

				// jsonTest拼接
				jsonTest.append("\"AreaName\":\"");
				jsonTest.append(areadesc);
				jsonTest.append("\",");
			}
		}

		// 查询员工表数据集
		List<TbEmployee> tbEmployeeByOrgId = mountguardcardserviceimp
				.getTbEmployeeByOrgId(OrgId);
		//追加stringbuilder
		jsonTest.append("\"Employees\":[");
		// 声明员工id
		String id = null;
		// 声明员工name
		String name = null;
		//声明控制长度length
		int length = 0;
		// 遍历员工表数据集
		for (TbEmployee te : tbEmployeeByOrgId) {
			//自加运算
			length++;
			//追加id json数据
			jsonTest.append("{\"id\":\"");
			id = te.getEmployeecode();
			jsonTest.append(id);
			jsonTest.append("\",");
			//追加name json数据
			jsonTest.append("\"name\":\"");
			name = te.getEmployeename();
			jsonTest.append(name);
			if(length==tbEmployeeByOrgId.size()){
				jsonTest.append("\"}");
			}else{
				jsonTest.append("\"},");
			}
			System.out.println(id + "---" + name);
		}
		//追加stringbuilder
		jsonTest.append("]");
		
		
		
		
		
		// List<COrganizationNj> cOrganizationNj =
		// mountguardcardserviceimp.getCOrganizationNj();
		// for(COrganizationNj con:cOrganizationNj){
		// System.out.println("营业厅id:" + con.getOrganizationNj().getOrgid());
		// System.out.println("区域id:" + con.getTbArea().getAreaid());
		// }

		// Integer OrgId = 1;
		// List<OrganizationNj> organizationNjByOrgId =
		// mountguardcardserviceimp.getOrganizationNjByOrgId(OrgId);
		// String org_Name = organizationNjByOrgId.get(0).getOrg_Name();
		// System.out.println(org_Name);
		//
		// Integer OrgId2 = 2;
		// List<OrganizationNj> organizationNjByOrgId2 =
		// mountguardcardserviceimp.getOrganizationNjByOrgId(OrgId2);
		// String org_Name2 = organizationNjByOrgId2.get(0).getOrg_Name();
		// System.out.println(org_Name2);

		// // 查询本地营业厅、区域关系表
		// List<COrganizationNj> cOrganizationNj = mountguardcardserviceimp
		// .getCOrganizationNj();
		//
		// BigDecimal areaid = null;
		// List<TbArea> tbAreaByAreaId = null;
		//
		// Integer orgid = null;
		// List<TbEmployee> tbEmployeeByOrgId = null;
		// for (COrganizationNj con : cOrganizationNj) {
		// System.out.println("-----------------------------------------");
		// // 营业厅名称
		// System.out.println("营业厅名称:" + con.getOrganizationNj().getOrgid());
		// // 区域名称
		// System.out.println("区域名称:" + con.getTbArea().getAreaid());
		//
		// areaid = con.getTbArea().getAreaid();
		//
		// tbAreaByAreaId = mountguardcardserviceimp.getTbAreaByAreaId(areaid);
		//
		// for (TbArea ta : tbAreaByAreaId) {
		// System.out.println("***" + ta.getAreadesc() + "***");
		// }
		// System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//
		// orgid = con.getOrganizationNj().getOrgid();
		// tbEmployeeByOrgId =
		// mountguardcardserviceimp.getTbEmployeeByOrgId(orgid);
		// for (TbEmployee te : tbEmployeeByOrgId) {
		// System.out.println("***" + te.getEmployeename() + "***");
		// }
		// }
		//
		// // 查询员工表
		// List<TbEmployee> tbEmployeeList = mountguardcardserviceimp
		// .getTbEmployee();
		// for (TbEmployee te : tbEmployeeList) {
		// // employeeid
		// System.out.println("姓名:" + te.getEmployeeid());
		// // 姓名employeeid
		// System.out.println("姓名:" + te.getEmployeename());
		// // 工号
		// System.out.println("工号:" + te.getEmployeecode());
		// // 身份证号
		// System.out.println("身份证号:" + te.getIdnumber());
		//
		// System.out.println("===========================");
		// }
		//
		// // 按姓名查询员工表
		// List<TbEmployee> tbEmployeeByName = mountguardcardserviceimp
		// .getTbEmployeeByName("黑罗");
		// for (TbEmployee tebn : tbEmployeeByName) {
		// // 姓名
		// System.out.println("tebn姓名:" + tebn.getEmployeename());
		// // 工号
		// System.out.println("tebn工号:" + tebn.getEmployeecode());
		// // 身份证号
		// System.out.println("tebn身份证号:" + tebn.getIdnumber());
		//
		// System.out.println("===========================");
		// }

		jsonTest.append("}");
		System.out.println("jsonTest:" + jsonTest);

		//String json = "{\"AreaName\":\"" + areadesc + "\"}";
		//System.out.println(json);

		//StringBuilder转换String类型
		String json = new String(jsonTest);
		out.write(json);
		out.flush();
		// 释放资源
		out.close();
	}

	@Action(value = "userInfo.mountGuardCard.mountGuardCardSingle.ajaxSearchEmployee")
	public void ajaxSearchEmplyee() throws IOException {
		// 获取输出流
		PrintWriter out = response.getWriter();

		// 申明字符缓冲流
		StringBuilder jsonTest = new StringBuilder();
			
		// 接收OrgName的传值
		String EmployeeNameSelect = request.getParameter("EmployeeNameSelect");
		System.out.println("EmployeeNameSelect:" + EmployeeNameSelect);

		// jsonTest拼接
		jsonTest.append("{");

		//按TbEmployeeId查询员工集合
		List<TbEmployee> tbEmployeeByTbEmployeeId = mountguardcardserviceimp.getTbEmployeeByTbEmployeeId(EmployeeNameSelect);
		for(TbEmployee te:tbEmployeeByTbEmployeeId){
			//取员工表需要的信息
			jsonTest.append("\"employeeid\":\"");
			String employeeid = te.getEmployeeid();
			jsonTest.append(employeeid+"\",");
			
			jsonTest.append("\"employeename\":\"");
			String employeename = te.getEmployeename();
			jsonTest.append(employeename+"\",");
			
			jsonTest.append("\"employeecode\":\"");
			String employeecode = te.getEmployeecode();
			jsonTest.append(employeecode+"\",");
			
			jsonTest.append("\"idnumber\":\"");
			String idnumber = te.getIdnumber();
			jsonTest.append(idnumber+"\"");
		}

		//String json = "{\"EmployeeNameSelect\":\"" + EmployeeNameSelect + "\"}";
		//System.out.println(json);

		jsonTest.append("}");
		
		String json = new String(jsonTest);
		
		System.out.println(json);
		
		out.write(json);
		out.flush();
		// 释放资源
		out.close();
	}
}
