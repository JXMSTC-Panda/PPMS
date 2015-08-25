package ppms.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
import ppms.domain.MountGuardCard;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbEmployee;
import ppms.domain.TbMaster;
import ppms.domain.TbMountguardexam;
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
	
	private TbMountguardexam tbMountguardexam;
	

	public TbMountguardexam getTbMountguardexam() {
		return tbMountguardexam;
	}

	public void setTbMountguardexam(TbMountguardexam tbMountguardexam) {
		this.tbMountguardexam = tbMountguardexam;
	}

	// 自动装载MountGuardCardServiceImp service实现层
	@Autowired
	private MountGuardCardServiceImp mountguardcardserviceimp;

	public MountGuardCardServiceImp getMountguardcardserviceimp() {
		return mountguardcardserviceimp;
	}

	public void setMountguardcardserviceimp(
			MountGuardCardServiceImp mountguardcardserviceimp) {
		this.mountguardcardserviceimp = mountguardcardserviceimp;
	}

	// 0配置action
	@Action(value = "userInfo.mountGuardCard.mountGuardCardSingle.mgcs")
	/**
	 * 
	
	 * @Title: mgcs
	
	 * @Description: 取页面数据存入数据库跳转至查询页面
	
	 * @param:     
	
	 * @return:    
	
	 * @auther: CappuccinoH
	
	 * @date: 2015-8-11 下午8:48:04
	 */
	public String mgcs() throws IOException {
		
		mountguardcardserviceimp.addTbMountguardexam(tbMountguardexam);
		
		// // 测试是否进入mgcs函数
		// System.out.println("enter mgcs()");
		// //
		// System.out.println("***********************************");
		// //获取工号
		// String EmployeeCode = request.getParameter("EmployeeCode");
		// //获取考核时间
		// String TrainTime = request.getParameter("TrainTime");
		// //获取考核内容
		// String SelectedDetail = request.getParameter("SelectedDetail");
		//
		// //获取考核有效时间
		// String VaildTime = request.getParameter("VaildTime");
		// //获取考核分数
		// String ExamGrade = request.getParameter("ExamGrade");
		//
		// //根据工号查询营业员id,营业厅id
		// String EmployeeId = null;
		// Integer orgid = null;
		// List<TbEmployee> teList = mountguardcardserviceimp.getTbEmployee();
		// for(TbEmployee te:teList){
		// System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		// System.out.println(te.getEmployeecode());
		// System.out.println(EmployeeCode);
		// if(te.getEmployeecode().equals(EmployeeCode)){
		// System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		// EmployeeId = te.getEmployeeid();
		// orgid = te.getOrganizationNj().getOrgid();
		// }
		// }
		//
		// //字符串类型时间转换成date类型
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// Date date = null;
		// try {
		// date = sdf.parse(TrainTime);
		// // System.out.println(date);
		// } catch (ParseException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		
		// System.out.println("EmployeeCode:"+EmployeeCode);
		// System.out.println("TrainTime:"+TrainTime);
		// System.out.println("SelectedDetail:"+SelectedDetail);
		// System.out.println("VaildTime:"+VaildTime);
		// System.out.println("ExamGrade:"+ExamGrade);
		
		//System.out.println("***********************************");
		
		ServletActionContext.getResponse().sendRedirect("userInfo.mountGuardCard.mountGuardCardSearch");
		
		return null;

	}
	
	
	//页面信息删除
	@Action(value = "userInfo.mountGuardCard.mountGuardCardSingle.delete")
	public void delete() throws IOException{
		System.out.println("enter delete function");
		//获取身份证号
		String idnumber = request.getParameter("id");
		//根据员工身份证号查询所有员工表集合
		List<TbEmployee> tbEmployeeList = mountguardcardserviceimp.getTbEmployee();
		//取员工id
		String employeeId = null;
		for(TbEmployee te:tbEmployeeList){
			if(te.getIdnumber().equals(idnumber)){
				employeeId = te.getEmployeeid();
			}
		}
		//创建对象
		TbMountguardexam tbMountguardexam = new TbMountguardexam();
		//遍历数据集查找符合删除的对象，进行删除操作
		List<TbMountguardexam> tmList = mountguardcardserviceimp.getTbMountguardexam();
		for(TbMountguardexam tm:tmList){
			if(tm.getTbEmployee().getEmployeeid().equals(employeeId)){
				mountguardcardserviceimp.deleteTbMountguardexam(tm);
			}
		}
		
		ServletActionContext.getResponse().sendRedirect("userInfo.mountGuardCard.mountGuardCardSearch");
		
	}
	
	
	//页面信息修改
		@Action(value = "userInfo.mountGuardCard.mountGuardCardUpdate.update", results = {
				@Result(name = "success", location = "/WEB-INF/content/page/userInfo/mountGuardCardUpdate.jsp"),
				@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
		public void update() throws IOException{
			System.out.println("enter update function");
			
//			Map map = new HashMap<String, MountGuardCard>();
			
			//获取身份证号
			String idnumber = request.getParameter("id");
			System.out.println(idnumber);
			
			
			String areadesc = request.getParameter("areadesc");
			System.out.println(areadesc);
			String employeecode = request.getParameter("employeecode");
			System.out.println(employeecode);
			String employeename = request.getParameter("employeename");
			System.out.println(employeename);
			Integer orgid = Integer.parseInt(request.getParameter("orgid"));
			System.out.println(orgid);
			
			String org_Name = request.getParameter("org_Name");
			System.out.println(org_Name);
			String value = request.getParameter("value");
			System.out.println(value);
			String examdate = request.getParameter("examdate");
			System.out.println(examdate);
			String ee = request.getParameter("examexpire");
			Double examexpire = Double.valueOf(ee);
			System.out.println(examexpire);
			double es = Integer.parseInt(request.getParameter("examscore"));
			Double examscore = Double.valueOf(es);
			System.out.println(examscore);
			
			
			
//			MountGuardCard mountGuardCard = new MountGuardCard(areadesc, employeecode, employeename, idnumber, org_Name, value, examdate, examexpire, examscore, orgid);
			
//			List<MountGuardCard> mgcList = new ArrayList<MountGuardCard>();
//			mgcList.add(mountGuardCard);
			
//			map.put("mountGuardCard", mountGuardCard);
//			ServletActionContext.getResponse().sendRedirect("userInfo.mountGuardCard.mountGuardCardUpdate");
			
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

				case "userInfo.mountGuardCardSearch":
					
					System.out.println("进入了case1！！！");
					
					//查询所有的合作厅上岗证查询表
					List<TbMountguardexam> tbMountguardexam = serviceEmp.getTbMountguardexam();
					
					List<MountGuardCard> mgcList = new ArrayList<MountGuardCard>();
					
					for(TbMountguardexam mge:tbMountguardexam){
						//获取当前对象的营业员id
						String employeeid = mge.getTbEmployee().getEmployeeid();
						
						//获取相关上岗证中需求的数据
						//考试类别
						String examtype = mge.getExamtype();
						//根据考试类别查询考试名称
						List<TbMaster> tbMasterByExamtype = serviceEmp.getTbMasterByExamtype(examtype);
						//考试的名称
						String value = tbMasterByExamtype.get(0).getValue();
						
						
						//考试时间
						Date examdate = mge.getExamdate();
						//截取字符串
						String[] split = examdate.toString().split(" ");
						String dateStr = split[0];
						//有效时间
						Double examexpire = mge.getExamexpire();
						//成绩
						Double examscore = mge.getExamscore();
						
						//按员工id获取员工表集合
						List<TbEmployee> tbEmployeeByTbEmployeeId = serviceEmp.getTbEmployeeByTbEmployeeId(employeeid);
						//员工工号
						String employeecode = tbEmployeeByTbEmployeeId.get(0).getEmployeecode();
						//员工姓名
						String employeename = tbEmployeeByTbEmployeeId.get(0).getEmployeename();
						//员工身份证号
						String idnumber = tbEmployeeByTbEmployeeId.get(0).getIdnumber();
						
						//orgid
						Integer orgid = tbEmployeeByTbEmployeeId.get(0).getOrganizationNj().getOrgid();
						//按orgid查询营业厅表集合
						List<OrganizationNj> organizationNjByOrgId = serviceEmp.getOrganizationNjByOrgId(orgid);
						
						//取营业厅名称
						String org_Name = organizationNjByOrgId.get(0).getOrg_Name();
						//取营业厅区域关系表
						List<COrganizationNj> cOrganizationNjByOrgId = serviceEmp.getCOrganizationNjByOrgId(orgid);
						//根据关系表查出areaid
						BigDecimal areaid = cOrganizationNjByOrgId.get(0).getTbArea().getAreaid();
					
						//根据areaid查区域名称
						List<TbArea> tbAreaByAreaId = serviceEmp.getTbAreaByAreaId(areaid);
						//区域名称
						String areadesc = tbAreaByAreaId.get(0).getAreadesc();
						
						System.out.println("=======================");
						
						System.out.println("areadesc:"+areadesc);
						System.out.println("employeecode:"+employeecode);
						System.out.println("employeename:"+employeename);
						System.out.println("idnumber:"+idnumber);
						System.out.println("orgid:"+orgid);
						
						System.out.println("org_Name:"+org_Name);
						System.out.println("value:"+value);
						System.out.println("examdate:"+dateStr);
						System.out.println("examexpire:"+examexpire);
						System.out.println("examscore:"+examscore);
						
						System.out.println("=======================");
						
						//封装对象
						MountGuardCard mountGuardCard = new MountGuardCard(areadesc, employeecode, employeename, idnumber, org_Name, value, dateStr, examexpire, examscore, orgid);
						mgcList.add(mountGuardCard);
						
					}
					map.put("mgcList", mgcList);
					
					
					//获取合作厅上岗考证表
					/*List<TbMountguardexam> tbMountguardexam = serviceEmp.getTbMountguardexam();
					map.put("tbMountguardexam", tbMountguardexam);
					
					//取需要查询的相关主键
					Integer orgid=null;
					String employeeid=null;
					for(TbMountguardexam tm:tbMountguardexam){
						orgid = tm.getOrganizationNj().getOrgid();
						employeeid = tm.getTbEmployee().getEmployeeid();
					}
					
					//查询营业员表
					List<TbEmployee> tbEmployeeByTbEmployeeId = serviceEmp.getTbEmployeeByTbEmployeeId(employeeid);
					map.put("tbEmployeeByTbEmployeeId", tbEmployeeByTbEmployeeId);
					
					//查询营业厅表
					List<OrganizationNj> organizationNjByOrgId = serviceEmp.getOrganizationNjByOrgId(orgid);
					map.put("organizationNjByOrgId", organizationNjByOrgId);
					
					
					//按营业厅id查询区域id
					List<COrganizationNj> cOrganizationNjByOrgId = serviceEmp.getCOrganizationNjByOrgId(orgid);
					BigDecimal areaid = cOrganizationNjByOrgId.get(0).getTbArea().getAreaid();
					
					//更具区域id查询区域名称
					List<TbArea> tbAreaByAreaId = serviceEmp.getTbAreaByAreaId(areaid);
					map.put("tbAreaByAreaId", tbAreaByAreaId);*/
					
					
					
					System.out.println("进入了case2！！！");
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
		Integer OrgId = Integer.parseInt(request.getParameter("tbMountguardexam.organizationNj.orgid"));
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
		String EmployeeNameSelect = request.getParameter("tbMountguardexam.tbEmployee.employeeid");
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
