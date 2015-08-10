package ppms.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.poi.ss.formula.functions.T;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;

import ppms.action.interfaces.InitPage;
import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;
import ppms.serviceimpl.InvocationServiceImp;

public class MainAction extends ActionSupport implements InitPage{
	
	@Action(value = "authority.null.roleSingle.login", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/authority/roleSingle.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String login() {
		return "success";
	}

	@Override
	public Map<String, List<T>> initPage(ServletContext context) {

		// 实例化map
		Map map = new HashMap<String, List<TbEmployee>>();

		InvocationServiceImp service = WebApplicationContextUtils
				.getWebApplicationContext(context).getBean(
						InvocationServiceImp.class);
		// 获取所有营业厅
		/*List<TbEmployee> tbEmployee = service.get

		map.put("orgs", organizations);*/
		return map;
	}
}
