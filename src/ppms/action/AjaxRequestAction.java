package ppms.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ppms.daoimpl.BaseDaoImp;
import ppms.domain.TbEmployee;
import ppms.gason.adapter.TargetStrategy;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionSupport;

public class AjaxRequestAction extends ActionSupport {

	private HttpServletResponse response;
	private HttpServletRequest request;

	@Autowired
	@Qualifier("baseDaoImp")
	private BaseDaoImp dao;

	public AjaxRequestAction() {
		response = ServletActionContext.getResponse();
		request = ServletActionContext.getRequest();
	}

	@Action("/getEmployees")
	public String getEmployees() {

		try {
			String orgid = request.getParameter("orgid");

			if (orgid.equals("") || orgid == null) {
				return null;
			}
			List<TbEmployee> employees = dao.findByHSQL(
					"from TbEmployee where orgid=" + orgid, new TbEmployee());

			TargetStrategy ts = new TargetStrategy(TbEmployee.class);  
			//表示仅转换TbEmployee中的employeename和employeeid属性  
			ts.setFields(new String[] {"employeename", "employeeid"});  
			ts.setReverse(true);  
			Gson gson = new GsonBuilder().setExclusionStrategies(ts).create();  

			Map<String, List<TbEmployee>> map = new HashMap<String, List<TbEmployee>>();
			map.put("employees", employees);
			String json = gson.toJson(map);
			response.getWriter().write(json);
			System.out.println(json);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
