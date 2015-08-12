package ppms.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.domain.COrganizationNj;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbEmployeepraisecriticism;
import ppms.domain.TbOrgpraisecriticism;
import ppms.domain.TbSubarea;
import ppms.domain.TbSubareaorgrelation;
import ppms.serviceimpl.PraiseCriticismServiceImp;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BusinessHallPraiseCriticismAction extends ActionSupport {

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

	@Action(value = "businessHallPraiseCriticismSingleStart", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/praiseCriticism/businessHallPraiseCriticismSingleResult.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/page/userinfo/Demo.jsp") })
	public String businessHallPraiseCriticismSingleStart() {
		praiseCriticism.businessHallInforSave(tbOrgpraisecriticism);

		List<TbOrgpraisecriticism> orgpraisecriticismInfor = praiseCriticism.findOrgpraisecriticismInfor();// 执行findEmployeepraisecriticismInfor方法，查询员工奖惩信息表中的所有数据
		for (TbOrgpraisecriticism tbOrgpraisecriticism : orgpraisecriticismInfor) {// 遍历
			System.out.println(tbOrgpraisecriticism
					.getPraisecriticismdate()// 添加营业厅奖惩信息时间
					+ ":"
					+ tbOrgpraisecriticism.getCause()// 营业厅奖惩原因
					+ ":"
					+ tbOrgpraisecriticism.getPraisecriticismtype()// 营业厅奖惩类型
					+ ":"
					+ tbOrgpraisecriticism.getPraisecriticismlevel());// 营业厅奖惩级别
		}// 打印出查询出的对象的部分字段
		System.out.println("businessHallPraiseCriticismSingleStart");
		return "success";
	}

	@Action(value = "skipBusinessHallSelectSingle", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/selectSingleBusinessHall.jsp"),
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

	@Action(value = "businessHallSelectSkipSingle", results = {
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
}
