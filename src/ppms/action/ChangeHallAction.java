package ppms.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.poi.ss.formula.functions.T;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ppms.action.interfaces.BaseInit;
import ppms.action.interfaces.InitPage;
import ppms.domain.OrganizationNj;
import ppms.domain.TbChangeorghistory;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.domain.TbPost;
import ppms.domain.TbRole;
import ppms.domain.TbSubareaorgrelation;
import ppms.serviceimpl.ChangeHallServiceImp;
import ppms.serviceimpl.userBaseInfoServiceImp;

import com.opensymphony.xwork2.ActionSupport;
/**   
 *    
 * 项目名称：PPMS   
 * 类名称：ChangeHallAction   
 * 类描述：   
 * 创建人：SuperYWJ
 * 创建时间：2015-8-19 下午3:51:51   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-19 下午8:51:51   
 * 修改备注：   
 * @version    
 *    
 */
public class ChangeHallAction extends BaseInit{
	/**
	 * 创建对象tbChangeorghistory
	 */
	private TbChangeorghistory tbChangeorghistory;
	/**
	 * 生成get,set方法
	 * @return
	 */
	public TbChangeorghistory getTbChangeorghistory() {
		return tbChangeorghistory;
	}

	public void setTbChangeorghistory(TbChangeorghistory tbChangeorghistory) {
		this.tbChangeorghistory = tbChangeorghistory;
	}
	
	/**
	 * 声明tbSubareaorgrelation
	 */
	private TbSubareaorgrelation tbSubareaorgrelation;
		
	
	public TbSubareaorgrelation getTbSubareaorgrelation() {
		return tbSubareaorgrelation;
	}

	public void setTbSubareaorgrelation(TbSubareaorgrelation tbSubareaorgrelation) {
		this.tbSubareaorgrelation = tbSubareaorgrelation;
	}
	
	/**
	 * 声明service对象
	 */
	@Autowired
	private ChangeHallServiceImp changeHallServiceImp;
		
	
	public ChangeHallServiceImp getChangeHallServiceImp() {
		return changeHallServiceImp;
	}

	public void setChangeHallServiceImp(ChangeHallServiceImp changeHallServiceImp) {
		this.changeHallServiceImp = changeHallServiceImp;
	}
	/**
	 * 通过url，实现页面初始化
	 * @return
	 */
	@Action(value = "userInfo.changeHall.changeHallSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/changeHallSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	/**
	 * 取到userInfo.changeHallSearch，调用initpage()方法，实现页面初始化
	 * @return
	 */
	public String firstIn(){
		
		initPage("userInfo.changeHallSearch");
		toCache();
		return "success";
	}
	@Action(value = "userInfo.changeHall.businessHallSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/businessHallSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	/**
	 * 取到userInfo.businessHallSearch，调用initpage()方法，实现页面初始化
	 * @return
	 */
	public String search(){
		
		initPage("userInfo.businessHallSearch");
		toCache();
		return "success";
	}
	/**
	 * 通过url实现对应页面初始化
	 * @param url
	 */
	public void initPage(String url){
		try {
			switch (url) {
			case "userInfo.changeHallSearch":
				List<TbChangeorghistory> tbChangeorghistories=changeHallServiceImp.getTbChangeorghistories();
				map.put("tbChangeOrg", tbChangeorghistories);
				break;
			case "userInfo.businessHallSearch":
				List<TbSubareaorgrelation> tbSubareaorgrelations=changeHallServiceImp.getTbSubareaorgrelations();
				map.put("tbSub", tbSubareaorgrelations);
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
