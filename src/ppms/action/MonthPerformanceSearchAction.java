
/**  
* @文件名: MonthPerformanceSearchAction.java 
* @包名 ppms.action 
* @描述: TODO 
* @修改人：
* @修改时间：2015-8-11 上午10:52:53 
* @修改内容：

* @version V1.0  
*/ 
package ppms.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;


import org.apache.poi.ss.formula.functions.T;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ppms.action.interfaces.InitPage;
import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;

import ppms.domain.TbPerformance;

import ppms.serviceimpl.MonthPerformanceServicelmp;




import com.opensymphony.xwork2.ActionSupport;

/**   
 *    
 * 项目名称：PPMS   
 * 类名称：MonthPerformanceSearchAction   
 * 类描述：   
 * 创建人：SuperPcf 
 * 创建时间：2015-8-11 上午10:52:53   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-11 上午10:52:53   
 * 修改备注：   
 * @version    
 *    
 */
public class MonthPerformanceSearchAction extends ActionSupport implements InitPage{
	
	
	/** 
	
	* @字段：tbPerformance : 绩效表实体类
	
	*/ 
	public TbPerformance tbPerformance;
	
	/**
	 * @return the tbPerformance
	 */
	public TbPerformance getTbPerformance() {
		return tbPerformance;
	}

	/**
	 * @param tbPerformance the tbPerformance to set
	 */
	public void setTbPerformance(TbPerformance tbPerformance) {
		this.tbPerformance = tbPerformance;
	}
	
	/** 
	
	* @字段：service : 绩效表 service
	
	*/ 
	@Autowired
	public MonthPerformanceServicelmp service;
	protected HttpServletRequest request;
	

	/**
	 * @return the request
	 */
	public HttpServletRequest getRequest() {
		return request;
	}

	/**
	 * @param request the request to set
	 */
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	/**
	 * 点击菜单页面“月度绩效查询”数据删除
	 * 
	 * @return                                             
	 * @throws IOException 
	 */
	@Action(value = "performance.month.monthPerformanceSearch_Del", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/performance/monthPerformanceSearch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String monthPerformanceSearch_Del() throws IOException {

		System.out.println("-------------ok!");
		
		try {
			
			//String  performanceid =(String) request.getSession().getAttribute("performanceid");
			String performanceid= request.getParameter("performanceid");
			System.out.println("-------------->>>"+performanceid);
			service.deletePerformance(performanceid);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
			return "success";
		
	}

	/* (non-Javadoc)
	 * @see ppms.action.interfaces.InitPage#initPage(javax.servlet.ServletContext, java.lang.String)
	 */
	@Override
	public Map<String, List<T>> initPage(ServletContext servletContext,String url) {
		// 实例化map
		Map map = new HashMap<>();

		MonthPerformanceServicelmp service = WebApplicationContextUtils
				.getWebApplicationContext(servletContext).getBean(
						MonthPerformanceServicelmp.class);
		// 获取所有营业厅
		switch (url) {
		
		case "performance.monthPerformanceSearch":
			
			List<TbPerformance> tbPerformances=service.getPerformances();
			//创建一个空的月度绩效表
			List<Object> tbPerformancesList=new ArrayList<Object>();
			
			//测试
			int i=0;
			
			try {
				for(TbPerformance tbPerformance:tbPerformances){
					//测试
					i++;
					
					if(tbPerformance.getTbEmployee()!=null){
						
						List<TbEmployee> tbEmployees=service.getEmployees(tbPerformance.getTbEmployee().getEmployeeid());
						

						tbPerformance.setTbEmployee(tbEmployees.get(0));
						System.out.println("getTbEmployee------->>>"+i);
					}
					else {
						tbPerformance.setTbEmployee(null);
					}
					if(tbPerformance.getOrganizationNj()!=null){
							
							List<OrganizationNj> organizationNjs=service.getOrganizationNjs(tbPerformance.getOrganizationNj().getOrgid());
							tbPerformance.setOrganizationNj(organizationNjs.get(0));
							System.out.println("getOrganizationNj------->>>"+i);
					
					}
					else{
						tbPerformance.setOrganizationNj(null);
					}
							
						
							
						
					tbPerformancesList.add(tbPerformance);
					System.out.println("tbPerformance------->>>"+i);
					
						
				}
					
					
			
				
				map.put("performances", tbPerformancesList);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		default:
			break;
		}	
		return map;
	}

}
