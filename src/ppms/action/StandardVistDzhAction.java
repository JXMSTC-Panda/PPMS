package ppms.action;

import java.awt.geom.Area;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.crypto.Data;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.hibernate.dialect.Oracle10gDialect;
import org.jboss.weld.bean.NewBean;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbAreaorgrelation;
import ppms.domain.TbStandardcheck;
import ppms.domain.TbSubarea;
import ppms.domain.TbSubareaorgrelation;
import ppms.serviceimpl.StandardCheckServiceImp;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;



public class  StandardVistDzhAction  extends ActionSupport{

	private TbStandardcheck tbStandardcheck;
	private TbArea tbArea;
	
	//
	@Autowired
	private StandardCheckServiceImp service;
	

	//get
	public TbArea getTbArea() {
		return tbArea;
	}
	//set
	public void setTbArea(TbArea tbArea) {
		this.tbArea = tbArea;
	}
	//get
	public TbStandardcheck getTbStandardcheck() {
		return tbStandardcheck;
	}
	//set
	public void setTbStandardcheck(TbStandardcheck tbStandardcheck) {
		this.tbStandardcheck = tbStandardcheck;
	}

	
	//功能：跳转到单条录入界面
	@Action(value ="show",results = {  
		    @Result(name = "success", location = "/WEB-INF/content/page/selectSingleBusinessHall.jsp"),  
	        @Result(name = "faild", location="/WEB-INF/content/error.jsp")})
	public String  show(){
		System.out.println("ssss");
		return "success";
	}
	
	//功能：在页面取值
	@Action(value ="selectStandardSingle",results = {
		@Result(name = "S", location = "/WEB-INF/content/page/standardSearch.jsp"),
		@Result(name = "error", location = "/WEB-INF/content/page/userinfo/Demo.jsp")})
	public String selectStandardSingle(){
		System.out.println("success");
		return "S";
	}
	
	//处理、信息录入
	@Action(value="insert",results={
			@Result(name="success",location="/WEB-INF/content/page/standardSingle.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp")})
			public String insert(){
				//加
				try{
					service.addStandardInfo(tbStandardcheck);
				}catch(Exception e){
					e.printStackTrace();
				}
	return "success";
	}

	
	/**
	 * 选择营业厅的跳转功能
	 * */
	@Action(value = "skipStandardCheckSingle", results={
			@Result(name="success",location="/WEB-INF/content/page/standardVisit/standardSelectSingle-2.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp")})
//跳转并且显示数据库的数据
	public String skipStandardCheckSingle(){
		ActionContext actionContext = ActionContext.getContext(); // 创建ActionContext的对象并调用getContext()方法
		Map<String,Object> request = (Map) actionContext.get("request");// 获取出request对象
		try {
			//查询营业厅的信息		
			
				List<OrganizationNj> organizationNjResultds = service.findOrganizationInfo();
				List<OrganizationNj> organizationNjList =new ArrayList<OrganizationNj>();
				int i=0;
			for(OrganizationNj organizationNj : organizationNjResultds){
				
				Integer orgId = organizationNjResultds.get(i).getOrgid();//逐渐取值  
				organizationNj.setOrgid(orgId);
				/**
				 * 区域的名称
				 * */
				List<TbAreaorgrelation> tbAreaorgrelationResults = service.findAreaorgrelation(orgId);//通过区域编号来获取区域表信息
				BigDecimal areId =  tbAreaorgrelationResults.get(0).getTbArea().getAreaid();//取区域营业厅关系表的AreaId
				List<TbArea> areaResults = service.findAreaId(areId);//通过AreaId来获取Area表的信息
				TbArea tbArea = areaResults.get(0);
				organizationNj.setAreadesc(tbArea.getAreadesc());
				
				/**
				 * 片区名称
				 * */
				List<TbSubareaorgrelation> tbSubareaorgrelationResults = service.findSubAreaId(orgId);
				BigDecimal subareaid = tbSubareaorgrelationResults.get(0).getTbSubarea().getSubareaid();
				List<TbSubarea> subAreaResults = service.findSubareaDesc(subareaid);
				TbSubarea tbSubarea = subAreaResults.get(0);
				organizationNj.setSubareadesc(tbSubarea.getSubareadesc());
				organizationNjList.add(organizationNj);
				i++;
			}
				
				request.put("organizationNj",organizationNjList);
				return "success";
		}
		catch (Exception e) {
			e.printStackTrace();
			return "faild";
		}
		
	}
	
	/**
	 * 嵌入数据
	 * */
	@Action(value = "standardVisit.standard.standardSingle", results={
			@Result(name="success",location="/WEB-INF/content/page/standardVisit/standardSingle.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp")})
	public String selectSingleOrgSkip(){
		ActionContext actionContext = ActionContext.getContext(); // 创建ActionContext的对象并调用getContext()方法
		Map<String, Object> request = (Map) actionContext.get("request"); // 获取出request对象
		try {
			Integer orgId = Integer.valueOf(ServletActionContext.getRequest().getParameter("selectBusinessHall")); // 通过getParameter方法获取页面上name为selectBusinessHall的标签的value值
			List<OrganizationNj> organizationNjResultds = service.findOrganizationId(orgId);
			List<OrganizationNj> organizationNjs = new ArrayList<OrganizationNj>();
			OrganizationNj organizationNj = organizationNjResultds.get(0);
			//System.out.println(orgId2);
			//
			/**
			 * 区域的名称
			 * */
			List<TbAreaorgrelation> tbAreaorgrelationResults = service.findAreaorgrelation(orgId);//通过区域编号来获取区域表信息
			BigDecimal areId =  tbAreaorgrelationResults.get(0).getTbArea().getAreaid();//取区域营业厅关系表的AreaId
			List<TbArea> areaResults = service.findAreaId(areId);//通过AreaId来获取Area表的信息
			TbArea tbArea = areaResults.get(0);
			String areadesc = tbArea.getAreadesc();
			organizationNj.setAreadesc(areadesc);
			organizationNjs.add(organizationNj);
			request.put("organizationNj",organizationNjs);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "faild";
		}
		
	}	
	
	
	/**
	 * 功能：点击提交后，叫数据插入到
	 * 
	 * 
	 * */
	@Action(value = "standardVisit.standard.standardSingle.Insert", results={
			@Result(name="success",location="/WEB-INF/content/page/standardVisit/sucess.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp")})
	public String StandardInsert(){
		
		Integer orgId  = Integer.valueOf(ServletActionContext.getRequest().getParameter("tbStandardcheck.organizationNj.orgid"));
		Date checkdate = Date.valueOf(ServletActionContext.getRequest().getParameter("tbStandardcheck.organizationNj.checkdate"));
		Double checkscore = Double.valueOf(ServletActionContext.getRequest().getParameter("tbStandardcheck.organizationNj.checkscore"));
		System.out.println("orgId ="+orgId+"checkdate = "+checkdate+"checkscore = "+ checkscore);
		return "";
	}
}











