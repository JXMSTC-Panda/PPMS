package ppms.action;

import java.io.IOException;
import java.util.HashMap;
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
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;

import ppms.action.interfaces.InitPage;
import ppms.daoimpl.BaseDaoImp;
import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;
import ppms.serviceimpl.InvocationServiceImp;


public class MainAction extends ActionSupport{
	
	@Action(value = "authority.null.roleSingle.login")
	public void login() {
		System.out.print("Success");
	}

	@Override
	public Map<String, List<T>> initPage(ServletContext context,String url) {
		// 实例化map
		Map map = new HashMap<String, List<TbEmployee>>();

		InvocationServiceImp service = WebApplicationContextUtils
				.getWebApplicationContext(context).getBean(
						InvocationServiceImp.class);
		// 获取所有营业厅
		List<TbEmployee> tbEmployee = service.get

		map.put("orgs", organizations);
		return map;
	}
}
