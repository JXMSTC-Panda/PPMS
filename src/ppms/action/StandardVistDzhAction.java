package ppms.action;

import java.awt.geom.Area;
import java.math.BigDecimal;
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

	@Action(value = "skipStandardCheckSingle", results={
			@Result(name="success",location="/WEB-INF/content/page/selectSingleBusinessHall.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp")})
//跳转并且显示数据库的数据
	public String skipStandardCheckSingle(){
		ActionContext actionContext = ActionContext.getContext(); // 创建ActionContext的对象并调用getContext()方法
		Map<String,Object> request = (Map) actionContext.get("request");// 获取出request对象
		try {
			System.out.println("进入skip");
			//查询营业厅的信息		
				List<OrganizationNj> organizationNjResultds = service.findOrganizationInfo();
				Integer orgId = organizationNjResultds.get(0).getOrgid();
				/*//OrganizationNj organizationNj = new OrganizationNj();为什么不行？？
				OrganizationNj organizationNj = tbStandardcheck.getOrganizationNj();  //取区域关系对象
				Integer orgId = organizationNj.getOrgid();
				List<OrganizationNj> organizationNjResult = service.findOrganizationNjInfor(orgId);//通过营业厅编号来查询营业厅信息
				tbStandardcheck.setOrganizationNj(organizationNjResult.get(0));//将封装好的营业厅信息对象赋给organizationNj,get(0)为取第一条数据
				*/
				/**
				 * 区域的名称
				 * */
				List<TbAreaorgrelation> tbAreaorgrelationResults = service.findAreaorgrelation(orgId);//通过区域编号来获取区域表信息
				BigDecimal areId =  tbAreaorgrelationResults.get(0).getTbArea().getAreaid();//取区域营业厅关系表的AreaId
				List<TbArea> areaResults = service.findAreaId(areId);//通过AreaId来获取Area表的信息
				//String areaDesc = areaResults.get(0).getAreadesc();//返回相应Id的名称
				/**
				 * 片区名称
				 * */
				List<TbSubareaorgrelation> tbSubareaorgrelationResults = service.findSubAreaId(orgId);
				BigDecimal subareaid = tbSubareaorgrelationResults.get(0).getTbSubarea().getSubareaid();
				List<TbSubarea> subAreaResults = service.findSubareaDesc(subareaid);
				subAreaResults.size();
				//String subAreaDesc = subAreaResults.get(0).getSubareadesc();
				//System.out.println(organizationNj.getOrg_Name()+""+organizationNj.getOrgid()+""+areaDesc+""+subAreaDesc);
				request.put("organizationNj", organizationNjResultds);
				request.put("areaResults", areaResults);
				request.put("subAreaResults", subAreaResults);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	
}











