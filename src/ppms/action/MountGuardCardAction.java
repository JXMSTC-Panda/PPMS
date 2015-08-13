package ppms.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.formula.functions.T;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.action.interfaces.InitPage;
import ppms.domain.TbEmployee;
import ppms.serviceimpl.MountGuardCardServiceImp;

import com.opensymphony.xwork2.ActionSupport;

public class MountGuardCardAction extends ActionSupport implements InitPage {

	protected HttpServletResponse response;
	protected HttpServletRequest request;
	private String ajaxState;
	
	// 测试是否进入该函数
	public MountGuardCardAction() {
		super();
		response = ServletActionContext.getResponse();
		request = ServletActionContext.getRequest();
		ajaxState = "0";
		System.out.println("调用MountGuardCardAction构造");
	}

	// 构造TbEmployee对象
	private TbEmployee tbemployee;

	public TbEmployee getTbemployee() {
		return tbemployee;
	}

	public void setTbemployee(TbEmployee tbemployee) {
		this.tbemployee = tbemployee;
	}

	// 自动装载MountGuardCardServiceImp service实现层
	@Autowired
	private MountGuardCardServiceImp mountguardcardserviceimp;

	// 0配置action
	@Action(value = "userInfo.mountGuardCard.mountGuardCardSingle.mgcs", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/mountGuardCardSearch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	/**
	 * 
	
	 * @Title: mgcs
	
	 * @Description: 取页面数据存入数据库跳转至查询页面
	
	 * @param:     
	
	 * @return:    
	
	 * @auther: CappuccinoH
	
	 * @date: 2015-8-11 下午8:48:04
	 */
	public String mgcs() {
		// 测试是否进入mgcs函数
		System.out.println("enter mgcs()");
		//

		return "success";

	}
	
	@Override
	public Map<String, List<T>> initPage(ServletContext servletContext,
			String url) {
		System.out.println("ajaxSearchOrg");
		return null;
	}
	
	
	@Action(value="userInfo.mountGuardCard.mountGuardCardSingle.ajaxSearchOrg")
	public void ajaxSearchOrg() throws IOException{
		String OrgName = request.getParameter("OrgName");
		System.out.println("OrgName:"+OrgName);
		
		PrintWriter out = response.getWriter();
		out.write(OrgName);
		out.flush();
		out.close();
	}

}
