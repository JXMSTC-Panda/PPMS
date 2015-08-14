package ppms.action;

import java.awt.geom.Area;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.jboss.weld.bean.NewBean;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbAreaorgrelation;
import ppms.domain.TbStandardcheck;
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
	public StandardVistDzhAction(){
		System.out.println("adasdas");
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

	@Action(value = "skipStandardCheckSingle", results={
			@Result(name="success",location="/WEB-INF/content/page/selectSingleBusinessHall.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp")})
//跳转并且显示数据库的数据
	public String skipStandardCheckSingle(){
		ActionContext actionContext = ActionContext.getContext(); // 创建ActionContext的对象并调用getContext()方法
		Map<String,Object> request = (Map) actionContext.get("request");// 获取出request对象
		try {
			System.out.println("进入skip");
			//查询标准化表的信息
			List<TbStandardcheck> tbStandardchecksResult = service.findStandardCheckInfo();
			
			for(TbStandardcheck tbStandardcheck : tbStandardchecksResult ){
				//System.out.println(tbStandardcheck.getCheckscore()+":"+tbStandardcheck.getCheckdate());打印值，测试
				/**
				 * 营业厅编码和名称
				 * */
				//OrganizationNj organizationNj = new OrganizationNj();为什么不行？？
				OrganizationNj organizationNj = tbStandardcheck.getOrganizationNj();  //取区域关系对象
				Integer orgId = organizationNj.getOrgid();
				List<OrganizationNj> organizationNjResult = service.findOrganizationNjInfor(orgId);//通过营业厅编号来查询营业厅信息
				tbStandardcheck.setOrganizationNj(organizationNjResult.get(0));//将封装好的营业厅信息对象赋给organizationNj,get(0)为取第一条数据
				List<TbAreaorgrelation> tbAreaorgrelationResults = service.findAreaorgrelation(orgId);
				tbAreaorgrelationResults.get(0).getTbArea().getAreaid();
				//List<Area> areaResults = service.find
				
				System.out.println(organizationNj.getOrg_Name()+""+organizationNj.getOrgid()+"");
				
				/***
				 * 
				 *区域编码和名称 
				 * */
				
				
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return "success";
	}
	
	
}











