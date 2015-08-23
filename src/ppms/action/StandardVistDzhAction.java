package ppms.action;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.poi.ss.formula.functions.T;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.hibernate.dialect.Oracle10gDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ppms.action.interfaces.BaseInit;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbAreaorgrelation;
import ppms.domain.TbStandardcheck;
import ppms.domain.TbSubarea;
import ppms.domain.TbSubareaorgrelation;
import ppms.serviceimpl.StandardCheckServiceImp;

import com.opensymphony.xwork2.ActionContext;

public class StandardVistDzhAction extends BaseInit {

	private TbStandardcheck tbStandardcheck;

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	//
	@Autowired
	private StandardCheckServiceImp service;

	// get
	public TbStandardcheck getTbStandardcheck() {
		return tbStandardcheck;
	}

	// set
	public void setTbStandardcheck(TbStandardcheck tbStandardcheck) {
		this.tbStandardcheck = tbStandardcheck;
	}

	/*
	 * //功能：跳转到单条录入界面
	 * 
	 * @Action(value ="show",results = {
	 * 
	 * @Result(name = "success", location =
	 * "/WEB-INF/content/page/selectSingleBusinessHall.jsp"),
	 * 
	 * @Result(name = "faild", location="/WEB-INF/content/error.jsp")}) public
	 * String show(){ System.out.println("ssss"); return "success"; }
	 */
	/*
	 * //功能：在页面取值
	 * 
	 * @Action(value ="selectStandardSingle",results = {
	 * 
	 * @Result(name = "S", location =
	 * "/WEB-INF/content/page/standardSearch.jsp"),
	 * 
	 * @Result(name = "error", location =
	 * "/WEB-INF/content/page/userinfo/Demo.jsp")}) public String
	 * selectStandardSingle(){ System.out.println("success"); return "S"; }
	 */

	/**
	 * page:standardSingle.jsp 功能：将页面的字段插入掉StandardCheck表中
	 * */
	@Action(value = "insert", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/standardSingle.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String insert() {
		// 加
		try {
			service.addStandardInfo(tbStandardcheck);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}

	/**
	 * page:standardSelectSingle-2 功能：通过check按钮 ，取到相应的行信息，并将其封装。
	 * */
	@Action(value = "skipStandardCheckSingle", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/standardVisit/standardSelectSingle-2.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	// 跳转并且显示数据库的数据
	public String skipStandardCheckSingle() {
		ActionContext actionContext = ActionContext.getContext(); // 创建ActionContext的对象并调用getContext()方法
		Map<String, Object> request = (Map) actionContext.get("request");// 获取出request对象
		try {
			// 查询营业厅的信息

			List<OrganizationNj> organizationNjResultds = service
					.findOrganizationInfo();
			List<OrganizationNj> organizationNjList = new ArrayList<OrganizationNj>();
			int i = 0;
			for (OrganizationNj organizationNj : organizationNjResultds) {

				Integer orgId = organizationNjResultds.get(i).getOrgid();// 逐渐取值
				organizationNj.setOrgid(orgId);
				/**
				 * 区域的名称
				 * */
				List<TbAreaorgrelation> tbAreaorgrelationResults = service
						.findAreaorgrelation(orgId);// 通过区域编号来获取区域表信息
				BigDecimal areId = tbAreaorgrelationResults.get(0).getTbArea()
						.getAreaid();// 取区域营业厅关系表的AreaId
				List<TbArea> areaResults = service.findAreaId(areId);// 通过AreaId来获取Area表的信息
				TbArea tbArea = areaResults.get(0);
				organizationNj.setAreadesc(tbArea.getAreadesc());

				/**
				 * 片区名称
				 * */
				List<TbSubareaorgrelation> tbSubareaorgrelationResults = service
						.findSubAreaId(orgId);
				BigDecimal subareaid = tbSubareaorgrelationResults.get(0)
						.getTbSubarea().getSubareaid();
				List<TbSubarea> subAreaResults = service
						.findSubareaDesc(subareaid);
				TbSubarea tbSubarea = subAreaResults.get(0);
				organizationNj.setSubareadesc(tbSubarea.getSubareadesc());
				organizationNjList.add(organizationNj);
				i++;
			}

			request.put("organizationNj", organizationNjList);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "faild";
		}

	}

	/**
	 * page:standardSingle.jsp
	 * 功能：将standardSelectSingle-2中封装的值传到standardSingle页面相应的输入框中。
	 * */
	@Action(value = "standardVisit.standard.standardSingle.Skip", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/standardVisit/standardSingle.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String selectSingleOrgSkip() {
		ActionContext actionContext = ActionContext.getContext(); // 创建ActionContext的对象并调用getContext()方法
		Map<String, Object> request = (Map) actionContext.get("request"); // 获取出request对象
		try {
			Integer orgId = Integer.valueOf(ServletActionContext.getRequest()
					.getParameter("selectBusinessHall")); // 通过getParameter方法获取页面上name为selectBusinessHall的标签的value值
			List<OrganizationNj> organizationNjResultds = service
					.findOrganizationId(orgId);
			List<OrganizationNj> organizationNjs = new ArrayList<OrganizationNj>();
			OrganizationNj organizationNj = organizationNjResultds.get(0);
			// System.out.println(orgId2);
			//
			/**
			 * 区域的名称
			 * */
			List<TbAreaorgrelation> tbAreaorgrelationResults = service
					.findAreaorgrelation(orgId);// 通过区域编号来获取区域表信息
			BigDecimal areId = tbAreaorgrelationResults.get(0).getTbArea()
					.getAreaid();// 取区域营业厅关系表的AreaId
			List<TbArea> areaResults = service.findAreaId(areId);// 通过AreaId来获取Area表的信息
			TbArea tbArea = areaResults.get(0);
			String areadesc = tbArea.getAreadesc();
			organizationNj.setAreadesc(areadesc);
			organizationNjs.add(organizationNj);
			request.put("organizationNj", organizationNjs);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "faild";
		}

	}

	/**
	 * 功能：点击提交后，数据插入到标准化表中
	 * */
	@Action(value = "standardVisit.standard.standardSingle.Insert", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/standardVisit/sucess.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String StandardInsert() {
		// 插入

		try {
			service.save(tbStandardcheck);
			ServletActionContext.getResponse().sendRedirect(
					"standardVisit.standard.standardSearch.do");
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

	/**
	 * 
	 * 初始化标准化页面
	 */

	@Action(value = "standardVisit.standard.standardSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/standardVisit/standardSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String initPage() {
		// List<TbStandardcheck> tbStandardcheckList =
		// service.findStandardCheckInfo();
		// List<TbStandardcheck> tbStandardchecks = new
		// ArrayList<TbStandardcheck>();
		// int i = 0;
		try {
			// for(TbStandardcheck tbStandardcheck : tbStandardcheckList){
			// Double checkscore =
			// tbStandardcheckList.get(i).getCheckscore();//分数
			// Date checkdate = tbStandardcheckList.get(i).getCheckdate();//日期
			// Integer orgid =
			// tbStandardcheckList.get(i).getOrganizationNj().getOrgid();//营业Id
			// List<OrganizationNj> organizationNjList =
			// service.findOrganizationId(orgid);
			// OrganizationNj organizationNj = organizationNjList.get(0);
			// tbStandardcheck.setOrg_Name(organizationNj.getOrg_Name());//set营业厅名称
			// tbStandardcheck.setCheckdate(checkdate);
			// tbStandardcheck.setCheckscore(checkscore);
			// tbStandardcheck.setOrganizationNj(organizationNj);
			//
			// //System.out.println(checkscore+""+checkdate+" "+orgid+""+orgName);
			// tbStandardchecks.add(tbStandardcheck);
			// i++;
			// }
			// map.put("TbStandardcheck", tbStandardchecks);
			// toCache();

			List<TbStandardcheck> all = service.getAll(null);
			if (all != null) {
				map.put("TbStandardcheck", all);
				toCache();
			} else {
				return "error";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "success";

	}

	/**
	 * 
	 * 功能：修改标准化分数
	 * */
	@Action(value = "standardVisit.standard.standardSearch.modify", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/standardVisit/standardSingle.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String modify() {
		List<TbStandardcheck> all;
		try {

			if (id != null) {
				all = service.getAll(id);
			} else {
				return "error";
			}
			if (all.size() > 0) {
				
				map.put("tbStandardcheck",all.get(0));
				toCache();
				return "success";
			} else {
				return "error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		} finally {

		}

	}

	@Action(value ="standardVisit.standard.standardSingle.update", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/standardVisit/standardSingle.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String update() {

		if(tbStandardcheck!=null){
			
			if(service.update(tbStandardcheck)){
				
				try {
					ServletActionContext.getResponse().sendRedirect("standardVisit.standard.standardSearch.do");
					return null;
				} catch (IOException e) {
					e.printStackTrace();
					return "error";
				}
			}
		}
		return "error";
	}

	/**
	 * 
	 * 
	 * 加的action
	 * 
	 * */
	@Action(value = "standardVisit.standard.standardSingle", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/standardVisit/standardSingle.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String firstIn() {

		return "success";
	}

	@Action(value = "standardVisit.standard.standardBatch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/standardVisit/standardBatch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String firstIn1() {

		return "success";
	}
}
