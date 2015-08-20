package ppms.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.poi.ss.formula.functions.T;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ppms.action.interfaces.BaseInit;
import ppms.domain.COrganizationNj;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbMaster;
import ppms.domain.TbOrgpraisecriticism;
import ppms.domain.TbSubarea;
import ppms.domain.TbSubareaorgrelation;
import ppms.serviceimpl.PraiseCriticismServiceImp;

import com.opensymphony.xwork2.ActionContext;

public class BusinessHallPraiseCriticismAction extends BaseInit {

	@Autowired
	private PraiseCriticismServiceImp praiseCriticism;
	private TbOrgpraisecriticism tbOrgpraisecriticism;

	public TbOrgpraisecriticism getTbOrgpraisecriticism() {
		return tbOrgpraisecriticism;
	}

	public void setTbOrgpraisecriticism(
			TbOrgpraisecriticism tbOrgpraisecriticism) {
		this.tbOrgpraisecriticism = tbOrgpraisecriticism;
	}

	/**
	 * 营业厅单条录入点击submit按钮时跳进该action，执行插入操作。
	 * @return
	 */
	@Action(value = "businessHallPraiseCriticismSingleStart", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/businessHallPraiseCriticismSingleResult.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/userinfo/Demo.jsp") })
	public String businessHallPraiseCriticismSingleStart() {
		
		String type=tbOrgpraisecriticism.getPraisecriticismtype();
		String praisecriticismtype="000"+type;
		tbOrgpraisecriticism.setPraisecriticismtype(praisecriticismtype);
		String level=tbOrgpraisecriticism.getPraisecriticismlevel();
		String praisecriticismlevel="000"+level;
		tbOrgpraisecriticism.setPraisecriticismlevel(praisecriticismlevel);
		praiseCriticism.businessHallInforSave(tbOrgpraisecriticism);
		System.out.println("businessHallPraiseCriticismSingleStart");
		return "success";
	}

	/**
	 * 营业厅奖惩信息单条录入页面点击选择营业厅时跳进该action，执行查询营业厅信息并整合。
	 * @return
	 */
	@Action(value = "praiseCriticism.businessHall.businessHallPraiseCriticismSingle.skipBusinessHallSelectSingle", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/selectBusinessHallSingle.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/selectSingleBusinessHall.jsp") })
	public String skipSelectSingl() {
		ActionContext actionContext = ActionContext.getContext();// 创建ActionContext的对象并调用getContext()方法
		Map<String, Object> request = (Map) actionContext.get("request");// 获取出request对象
		System.out.println("create skipSelectSingle");
		List<OrganizationNj> organizationNjInfor = praiseCriticism
				.findAllOrganizationNjInfor();
		for (OrganizationNj organizationNj : organizationNjInfor) {
			List<COrganizationNj> cOrganizationNjInfor = praiseCriticism
					.findCOrganizationNjInfor(organizationNj.getOrgid());// 执行findCOrganizationNjInfor，根据营业厅编号获取营业厅区域关系表中的信息
			for (COrganizationNj cOrganizationNj : cOrganizationNjInfor) {// 遍历
				System.out.print(organizationNj.getOrgid());
				System.out.print(":" + cOrganizationNj.getTbArea().getAreaid());// 打印区域的编号
				List<TbArea> areaInfor = praiseCriticism
						.findAreaDesc(cOrganizationNj.getTbArea().getAreaid());// 执行findAreaDesc方法，根据区域编号获取区域名称
				String areadesc = areaInfor.get(0).getAreadesc();
				request.put("areadesc", areadesc);
				System.out.print(":" + areadesc);// 打印区域名称
			}

			List<TbSubareaorgrelation> subareaorgrelationInfor = praiseCriticism
					.findSubareaorgrelationInfor(organizationNj.getOrgid());
			for (TbSubareaorgrelation tbSubareaorgrelation : subareaorgrelationInfor) {
				System.out.print(tbSubareaorgrelation.getTbSubarea()
						.getSubareaid());
				List<TbSubarea> subareaInfor = praiseCriticism
						.findSubareaInfor(tbSubareaorgrelation.getTbSubarea()
								.getSubareaid());
				String subareaDesc = subareaInfor.get(0).getSubareadesc();
				request.put("subareaDesc", subareaDesc);
				System.out.println(":" + subareaDesc);
			}
		}
		request.put("organizationNjInfor", organizationNjInfor);
		return "success";
	}

	/**
	 * 营业厅奖惩信息单条录入选择营业厅信息完成后跳进该action，执行查询数据并整合。
	 * @return
	 */
	@Action(value = "praiseCriticism.businessHall.businessHallPraiseCriticismSingle", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/businessHallPraiseCriticismSingle.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/selectSingleBusinessHall.jsp") })
	public String selectSinglSkip() {
		ActionContext actionContext = ActionContext.getContext();// 创建ActionContext的对象并调用getContext()方法
		Map<String, Object> request = (Map) actionContext.get("request");// 获取出request对象
		String org_id = ServletActionContext.getRequest().getParameter(
				"selectBusinessHall"); // 通过getParameter方法获取页面上name为selectEmployee的标签的value值
		int orgid=Integer.parseInt(org_id);
		List<OrganizationNj> organizationNjInfor = praiseCriticism.findOrganizationNjInfor(orgid);
				
		List<COrganizationNj> cOrganizationNjInfor = praiseCriticism
				.findCOrganizationNjInfor(orgid);// 执行findCOrganizationNjInfor，根据营业厅编号获取营业厅区域关系表中的信息
		for (COrganizationNj cOrganizationNj : cOrganizationNjInfor) {// 遍历
			System.out.print(":" + cOrganizationNj.getTbArea().getAreaid());// 打印区域的编号
			List<TbArea> areaInfor = praiseCriticism
					.findAreaDesc(cOrganizationNj.getTbArea().getAreaid());// 执行findAreaDesc方法，根据区域编号获取区域名称
			String areadesc = areaInfor.get(0).getAreadesc();
			request.put("areadesc", areadesc);
			System.out.print(":" + areadesc);// 打印区域名称
		}
		List<TbSubareaorgrelation> subareaorgrelationInfor = praiseCriticism
				.findSubareaorgrelationInfor(orgid);
		for (TbSubareaorgrelation tbSubareaorgrelation : subareaorgrelationInfor) {
			System.out.print(tbSubareaorgrelation.getTbSubarea()
					.getSubareaid());
			List<TbSubarea> subareaInfor = praiseCriticism
					.findSubareaInfor(tbSubareaorgrelation.getTbSubarea()
							.getSubareaid());
			String subareaDesc = subareaInfor.get(0).getSubareadesc();
			request.put("subareaDesc", subareaDesc);
			System.out.println(":" + subareaDesc);
		}
		request.put("organizationNjInfor", organizationNjInfor);
		return "success";
	}
	/**
	 * 营业厅奖惩信息管理查询页面选定后点击删除跳进该action，执行数据库完全删除数据。
	 * @return
	 */
	@Action(value = "praiseCriticism.businessHall.businessHallPraiseCriticismSearch.orgPCInforDelete", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/businessHallPraiseCriticismSingle.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/selectSingleBusinessHall.jsp") })
	public String orgPCInforDelete() {
		try {

			List<TbOrgpraisecriticism> orgpraisecriticismInfor = praiseCriticism.findOrgpraisecriticismInfor(tbOrgpraisecriticism.getPraisecriticismid());
			

			praiseCriticism.delete(orgpraisecriticismInfor.get(0));
			ServletActionContext
					.getRequest()
					.getRequestDispatcher(
							"/praiseCriticism.businessHall.businessHallPraiseCriticismSearch")
					.forward(ServletActionContext.getRequest(),
							ServletActionContext.getResponse());

			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
	/**
	 * 营业厅奖惩信息单条修改页面点击submit按钮跳进该action，执行营业厅奖惩信息单条修改。
	 * @return
	 */
	@Action(value = "praiseCriticism.businessHall.businessHallPraiseCriticismSearch.orgPCInforUpdate", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/businessHallPraiseCriticismSingle.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/selectSingleBusinessHall.jsp") })
	public String orgPCInforUpdate() {
		try {
			String type=tbOrgpraisecriticism.getPraisecriticismtype();
			String praisecriticismtype="000"+type;
			tbOrgpraisecriticism.setPraisecriticismtype(praisecriticismtype);
			String level=tbOrgpraisecriticism.getPraisecriticismlevel();
			String praisecriticismlevel="000"+level;
			tbOrgpraisecriticism.setPraisecriticismlevel(praisecriticismlevel);
			
			praiseCriticism.update(tbOrgpraisecriticism);
			ServletActionContext
			.getRequest()
			.getRequestDispatcher(
					"/praiseCriticism.businessHall.businessHallPraiseCriticismSearch")
			.forward(ServletActionContext.getRequest(),
					ServletActionContext.getResponse());
			
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
	/**
	 * 营业厅奖惩信息单条修改页面点击选择营业厅跳进该action。
	 * @return
	 */
	@Action(value = "praiseCriticism.businessHall.businessHallPraiseCriticismSearch.orgPCInforUpdateSkip", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/selectBusinessHallUpdate.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/selectSingleBusinessHall.jsp") })
	public String orgPCInforUpdateSkip() {
		ActionContext actionContext = ActionContext.getContext();// 创建ActionContext的对象并调用getContext()方法
		Map<String, Object> request = (Map) actionContext.get("request");// 获取出request对象
		System.out.println("create skipSelectSingle");
		List<OrganizationNj> organizationNjInfor = praiseCriticism
				.findAllOrganizationNjInfor();
		for (OrganizationNj organizationNj : organizationNjInfor) {
			List<COrganizationNj> cOrganizationNjInfor = praiseCriticism
					.findCOrganizationNjInfor(organizationNj.getOrgid());// 执行findCOrganizationNjInfor，根据营业厅编号获取营业厅区域关系表中的信息
			for (COrganizationNj cOrganizationNj : cOrganizationNjInfor) {// 遍历
				System.out.print(organizationNj.getOrgid());
				System.out.print(":" + cOrganizationNj.getTbArea().getAreaid());// 打印区域的编号
				List<TbArea> areaInfor = praiseCriticism
						.findAreaDesc(cOrganizationNj.getTbArea().getAreaid());// 执行findAreaDesc方法，根据区域编号获取区域名称
				String areadesc = areaInfor.get(0).getAreadesc();
				request.put("areadesc", areadesc);
				System.out.print(":" + areadesc);// 打印区域名称
			}

			List<TbSubareaorgrelation> subareaorgrelationInfor = praiseCriticism
					.findSubareaorgrelationInfor(organizationNj.getOrgid());
			for (TbSubareaorgrelation tbSubareaorgrelation : subareaorgrelationInfor) {
				System.out.print(tbSubareaorgrelation.getTbSubarea()
						.getSubareaid());
				List<TbSubarea> subareaInfor = praiseCriticism
						.findSubareaInfor(tbSubareaorgrelation.getTbSubarea()
								.getSubareaid());
				String subareaDesc = subareaInfor.get(0).getSubareadesc();
				request.put("subareaDesc", subareaDesc);
				String praisecriticismid=tbOrgpraisecriticism.getPraisecriticismid();
				request.put("praisecriticismid", praisecriticismid);
				System.out.println(":" + subareaDesc);
			}
		}
		request.put("organizationNjInfor", organizationNjInfor);
		return "success";
	}
	/**
	 * 营业厅奖惩信息单条修改选择营业厅完成后，跳进该action。
	 * @return
	 */
	@Action(value = "praiseCriticism.businessHall.businessHallPraiseCriticismSearch.SkipBusinessHallUpdate", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/businessHallPraiseCriticismUpdate.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/selectSingleBusinessHall.jsp") })
	public String SkipBusinessHallUpdate() {
	
		ActionContext actionContext = ActionContext.getContext();// 创建ActionContext的对象并调用getContext()方法
		Map<String, Object> request = (Map) actionContext.get("request");// 获取出request对象
		String org_id = ServletActionContext.getRequest().getParameter(
				"selectBusinessHall"); // 通过getParameter方法获取页面上name为selectEmployee的标签的value值
		int orgid=Integer.parseInt(org_id);
		List<OrganizationNj> organizationNjInfor = praiseCriticism.findOrganizationNjInfor(orgid);
				
		List<COrganizationNj> cOrganizationNjInfor = praiseCriticism
				.findCOrganizationNjInfor(orgid);// 执行findCOrganizationNjInfor，根据营业厅编号获取营业厅区域关系表中的信息
		for (COrganizationNj cOrganizationNj : cOrganizationNjInfor) {// 遍历
			System.out.print(":" + cOrganizationNj.getTbArea().getAreaid());// 打印区域的编号
			List<TbArea> areaInfor = praiseCriticism
					.findAreaDesc(cOrganizationNj.getTbArea().getAreaid());// 执行findAreaDesc方法，根据区域编号获取区域名称
			String areadesc = areaInfor.get(0).getAreadesc();
			request.put("areadesc", areadesc);
			System.out.print(":" + areadesc);// 打印区域名称
		}
		List<TbSubareaorgrelation> subareaorgrelationInfor = praiseCriticism
				.findSubareaorgrelationInfor(orgid);
		for (TbSubareaorgrelation tbSubareaorgrelation : subareaorgrelationInfor) {
			System.out.print(tbSubareaorgrelation.getTbSubarea()
					.getSubareaid());
			List<TbSubarea> subareaInfor = praiseCriticism
					.findSubareaInfor(tbSubareaorgrelation.getTbSubarea()
							.getSubareaid());
			String subareaDesc = subareaInfor.get(0).getSubareadesc();
			request.put("subareaDesc", subareaDesc);
			String praisecriticismid=tbOrgpraisecriticism.getPraisecriticismid();
			request.put("praisecriticismid", praisecriticismid);
			System.out.println(":" + subareaDesc);
		}
		request.put("organizationNjInfor", organizationNjInfor);
		return "success";
	}
	/**
	 * 营业厅奖惩信息管理查询点击修改跳入该action，执行页面跳转。
	 * @return
	 */
	@Action(value = "praiseCriticism.businessHall.businessHallPraiseCriticismSearch.skip", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/businessHallPraiseCriticismUpdate.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/selectSingleBusinessHall.jsp") })
	public String skip() {
	
		ActionContext actionContext = ActionContext.getContext(); // 创建ActionContext的对象并调用getContext()方法
		Map<String, Object> request = (Map) actionContext.get("request"); // 获取出request对象
		String praisecriticismid=tbOrgpraisecriticism.getPraisecriticismid();
		request.put("praisecriticismid", praisecriticismid);
		return "success";
	}
	/**
	 * 营业厅奖惩信息单条修改点击return跳进该action，执行页面跳转。
	 * @return
	 */
	@Action(value = "praiseCriticism.businessHall.businessHallPraiseCriticismSearch.returnPages", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/businessHallPraiseCriticismSingle.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/selectSingleBusinessHall.jsp") })
	public String returnPages() {
	
		try {
			ServletActionContext
			.getRequest()
			.getRequestDispatcher(
					"/praiseCriticism.businessHall.businessHallPraiseCriticismSearch")
			.forward(ServletActionContext.getRequest(),
					ServletActionContext.getResponse());
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		
	}
	/**
	 * 营业厅奖惩信息管理查询页面的初始化。
	 */
	@Action(value = "praiseCriticism.businessHall.businessHallPraiseCriticismSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/businessHallPraiseCriticismSearch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/selectSingleBusinessHall.jsp") })
	public String initPage(){

		try {
			List<TbOrgpraisecriticism> orgpraisecriticismInfor=praiseCriticism.findAllOrgpraisecriticismInfor();
			List<TbOrgpraisecriticism> orgpraisecriticismsInfor=new ArrayList<TbOrgpraisecriticism>();
			
			
			for (TbOrgpraisecriticism tbOrgpraisecriticism : orgpraisecriticismInfor) {
				/*
				String a=tbOrgpraisecriticism.getPraisecriticismtype();
				
				List<TbMaster> type=praiseCriticism.findOrgPraiseCriticismType(a);
				
				String orgType= type.get(0).getValue();
				
				tbOrgpraisecriticism.setPraisecriticismtype(orgType);
				String b=tbOrgpraisecriticism.getPraisecriticismlevel();
				
				List<TbMaster> level=praiseCriticism.findOrgPraiseCriticismLevel(a, b);
				
				String orgLevel=level.get(0).getValue();
				
				tbOrgpraisecriticism.setPraisecriticismlevel(orgLevel);*/
				
				
				
				List<OrganizationNj> organizationNjInfor=praiseCriticism.findOrganizationNjInfor(tbOrgpraisecriticism.getOrganizationNj().getOrgid());
				
				tbOrgpraisecriticism.setOrganizationNj(organizationNjInfor.get(0));
				orgpraisecriticismsInfor.add(tbOrgpraisecriticism);
			}
			System.out.println();
			map.put("orgpraisecriticismsInfor",orgpraisecriticismsInfor);	
			toCache();
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "success";
	}
}
