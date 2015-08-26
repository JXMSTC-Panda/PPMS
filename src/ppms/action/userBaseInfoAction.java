package ppms.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ppms.action.interfaces.BaseInit;
import ppms.daoimpl.BaseDaoImp;
import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.domain.TbPost;
import ppms.domain.TbRole;
import ppms.serviceimpl.userBaseInfoServiceImp;

/**   
 *    
 * 项目名称：PPMS   
 * 类名称：userBaseInfoAction   
 * 类描述：   
 * 创建人：SuperYWJ
 * 创建时间：2015-8-13 下午3:51:51   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-14 下午8:51:51   
 * 修改备注：   
 * @version    
 *    
 */

public class userBaseInfoAction extends BaseInit{
	/**
	 * 构建对象
	 */
	private TbEmployee tbEmployee;
	

	public TbEmployee getTbEmployee() {
		return tbEmployee;
	}

	public void setTbEmployee(TbEmployee tbEmployee) {
		this.tbEmployee = tbEmployee;
	}
	
	/**
	 *声明request 
	 */
	protected HttpServletRequest request;

	public userBaseInfoAction() {

		request = ServletActionContext.getRequest();

	}
	@Autowired
	private userBaseInfoServiceImp service;
	
	/**
	 * 声明，调用API
	 */
	@Autowired
	@Qualifier("baseDaoImp")
	private BaseDaoImp dao;

	public userBaseInfoServiceImp getService() {
		return service;
	}

	public void setService(userBaseInfoServiceImp service) {
		this.service = service;
	}

	/**
	 * 人员基本信息录入
	 * @return
	 */
	@Action(value = "userInfo.userBase.userBaseInfoSingle.Single", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/userBaseInfoSingleResult.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String Single() {
		try {
		service.adduserBaseInfo(tbEmployee);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
	/**
	 * 批量录入
	 * @return
	 */
	@Action(value = "userInfo.userBase.userBaseInfoBatch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/userBaseInfoBatch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String userBaseInfoBatchUpdateImport() {
		
		return "success";
	}
	/**
	 * 批量修改
	 * @return
	 */
	@Action(value = "userInfo.userBase.userBaseInfoBatchUpdateBySelectField", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/userBaseInfoBatchUpdateBySelectField.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String userBaseInfoBatchUpdateBySelectField() {
		
		return "success";
	} 
	
	/**
	 * 转至录入页面
	 * @return
	 */
	@Action(value = "userInfo.userBase.userBaseInfoSingle.resultBackSingle", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/userBaseInfoSingle.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String resultBack() {		
		return "success";
	}

//	/**
//	 * 转至查询页面
//	 * @return
//	 */
//	@Action(value = "userInfo.userBase.userBaseInfoSearch.resultBackSearch", results = {
//			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/userBaseInfoSearch.jsp"),
//			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
//	public String resultBackSearch() {
//		return "success";
//	}
	
	/**
	 * 详细查询人员信息
	 * @return
	 */
	@Action(value = "userInfo.userBase.userBaseInfoSearch.detail", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/userBaseInfoDetail.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String detail() {
		String employeeid=request.getParameter("id");
		//调用API，查询对象所有数据，放到employees中
		List<TbEmployee> employees=dao.getEntitiestNotLazy(new TbEmployee(), new String[]{"organizationNj","tbJob","tbRole","tbPost"},Restrictions.eq("employeeid", employeeid));
		request.setAttribute("tbEmpl", employees);
		return "success";
	}
	
	/**
	 * 修改人员信息
	 * @return
	 */
	@Action(value = "userInfo.userBase.userBaseInfoSearch.modifyInitPage", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/userBaseInfoUpdate.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String updateInitPage() {
		String employeeid=request.getParameter("id");
		//调用API，查询对象所有数据，放到employees中
		List<TbEmployee> employees=dao.getEntitiestNotLazy(new TbEmployee(), new String[]{"organizationNj","tbJob","tbRole","tbPost"},Restrictions.eq("employeeid", employeeid));
		request.setAttribute("tbEmpl", employees);
		return "success";
	}
	@Action(value = "userInfo.userBase.userBaseInfoSearch.modify", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/userBaseInfoSingleResult.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String update() {
		try {
			
			System.out.println("sdas");
			service.update(tbEmployee);	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	/**
	 * 删除人员信息
	 * @return
	 */
	@Action(value = "userInfo.userBase.userBaseInfoSearch.delete", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/userBaseInfoSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String delete() { 
		try {
			String employeeid=request.getParameter("id");   //前台取到对应id,用一个string接受
			service.delete(employeeid);
			/**
			 * service取到数据，封装
			 *//*
			List<TbEmployee> employees=service.getTbEmployee();
			*//**
			 * 遍历，开始判断，如果id与表中employeeid相同，调用service层的delete方法删除信息
			 *//*
			for(TbEmployee tbEmployee:employees){				
				if(tbEmployee.getEmployeeid().equals(employeeid)){
					service.delete(tbEmployee);
				}	
			}*/
			/**
			 * 结束之后，转自查询页面（含初始化）
			 */
			ServletActionContext.getResponse().sendRedirect("userInfo.userBase.userBaseInfoSearch.do");
		} catch (Exception e) {
			e.printStackTrace();
			return "faild";
		}
						
		return null;	
	   }			
		 		
	
	
	/**
	 * 实现人员信息查询页面初始化
	 * @return
	 */
	@Action(value = "userInfo.userBase.userBaseInfoSingle", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/userBaseInfoSingle.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	/**
	 * 通过url，初始化页面
	 * @return
	 */
	public  String firstIn(){
		
		initPage("userInfo.userBaseInfoSingle");
		toCache();
		return "success";
		
	}
	
	@Action(value = "userInfo.userBase.userBaseInfoSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/userBaseInfoSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String search(){
		
		initPage("userInfo.userBaseInfoSearch");
		toCache();
		return "success";
	}
	private void  initPage(String url) {
		  
		try {
			// 获取所有营业厅
			switch (url) {
			case "userInfo.userBaseInfoSingle":
				/**
				 * 调用service层方法，取到数据，封装对象
				 */
				List<OrganizationNj> organizations = service.getOrganizations();
				List<TbPost> tbPosts = service.getTbPosts();			
				List<TbJob> tbJobs =service.getTbJobs();
				List<TbEmployee> tbEmployees =service.getTbEmployee();
				List<TbRole> tbRoles =service.getTbRoles();
				/**
				 * 调用map函数，将对象put到前台
				 */
				map.put("roles", tbRoles);
				map.put("orgs", organizations);
				map.put("posts", tbPosts);
				map.put("jobs", tbJobs);
				map.put("employees", tbEmployees);
				break;
			case "userInfo.userBaseInfoSearch":
				/**
				 * 调用API，查到tbEmployee中所有对应对象，封装，put到前台
				 */
				List<TbEmployee> employees=dao.getEntitiestNotLazy(new TbEmployee(), new String[]{"organizationNj","tbJob","tbRole","tbPost"},null);
				map.put("employees", employees);
			default:
				break;
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
