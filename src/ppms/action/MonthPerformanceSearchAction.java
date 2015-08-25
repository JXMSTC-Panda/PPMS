
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

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ppms.action.interfaces.BaseInit;
import ppms.action.interfaces.InitPage;
import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;

import ppms.domain.TbPerformance;

import ppms.serviceimpl.MonthPerformanceServicelmp;
import ppms.serviceimpl.PraiseCriticismServiceImp;




import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;

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
public class MonthPerformanceSearchAction extends BaseInit{
	
	
	/** 
	
	* @字段：tbPerformance : 绩效表实体类
	
	*/ 
	public TbPerformance tbPerformance;
	
	private HttpServletRequest request;
	
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

	@Autowired
	public PraiseCriticismServiceImp ccz;

	public MonthPerformanceSearchAction(){
		
		request = ServletActionContext.getRequest();
	}
	
	
	
	
	/** 
	
	* @方法名: monthPerformanceSearch 
	
	* @描述: 月度绩查询
	
	* @param @return    设定文件
	
	* @return String    返回类型
	
	* @throws 
	
	*/ 
	@Action(value="performance.month.monthPerformanceSearch",results={
			@Result(name = "success", location = "/WEB-INF/content/page/performance/monthPerformanceSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp")})
	public String monthPerformanceSearch(){

					//Map map = new HashMap<>();
	
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
						toCache();
					}catch (Exception e) {
						e.printStackTrace();
					}
					
		return "success";
	}
	
	/** 
	
	* @方法名: yearPerformanceSearch 
	
	* @描述: 年度绩效查询数据初始化 
	
	* @param @return    设定文件
	
	* @return String    返回类型
	
	* @throws 
	
	*/ 
	@Action(value="performance.year.yearPerformanceSearch",results={
			@Result(name = "success", location = "/WEB-INF/content/page/performance/yearPerformanceSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp")})
	public String yearPerformanceSearch(){

					//Map map = new HashMap<>();
	
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
						toCache();
					}catch (Exception e) {
						e.printStackTrace();
					}
					
		return "success";
	}
	
	

	
	/**
	 * 点击菜单页面“月度绩效查询”数据删除
	 * 
	 * @return                                             
	 * @throws IOException 
	 */
	@Action(value = "performance.month.monthPerformanceSearch.Delete", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/performance/monthPerformanceSearch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String monthPerformanceSearch_Del() throws IOException {

		int i=0;
		System.out.println("-------------ok!");
		
		try {
			
			//String  performanceid =(String) request.getAttribute("performances");
			String performanceid= request.getParameter("performanceid");
			System.out.println("-------------->>>"+performanceid);
			java.util.logging.Logger.getGlobal().info("Logger------>>>"+performanceid);
			
			List<TbPerformance> tbPerformances=service.getPerformances();
			for(TbPerformance tb:tbPerformances){
				if(tb.getPerformanceid().equals(performanceid)){
					service.delete(tb);
					
					//删除之后返回月度绩效查询页面并进行数据初始化
					monthPerformanceSearch();
					return "success";
					
				}
				
			}
			//service.deletePerformance(performanceid);
		
		} catch (Exception e) {
			
			e.printStackTrace();
			return "error";
		}
		
			return "success";
		
	}

	/**
	 * 点击菜单页面“年度绩效查询”数据删除
	 * 
	 * @return                                             
	 * @throws IOException 
	 */
	@Action(value = "performance.year.yearPerformanceSearch.Delete", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/performance/yearPerformanceSearch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String yearPerformanceSearch_Del() throws IOException {

		int i=0;
		System.out.println("-------------ok!");
		
		try {
			
			//String  performanceid =(String) request.getAttribute("performances");
			String performanceid= request.getParameter("performanceid");
			System.out.println("-------------->>>"+performanceid);
			java.util.logging.Logger.getGlobal().info("Logger------>>>"+performanceid);
			
			List<TbPerformance> tbPerformances=service.getPerformances();
			for(TbPerformance tb:tbPerformances){
				if(tb.getPerformanceid().equals(performanceid)){
					service.delete(tb);
					
					////删除之后返回年度绩效查询页面并进行数据初始化
					yearPerformanceSearch();
					return "success";
					
				}
				
			}
			//service.deletePerformance(performanceid);
		
		} catch (Exception e) {
			
			e.printStackTrace();
			return "error";
		}
		
			return "success";
		
	}


}
