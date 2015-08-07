package ppms.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.daoimpl.BaseDaoImp;
import ppms.domain.TbEmployee;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.opensymphony.xwork2.ActionSupport;

public class AjaxRequesrAction extends ActionSupport{
	
	private HttpServletResponse response;
	private HttpServletRequest request;

	@Autowired
	private BaseDaoImp dao;
	public AjaxRequesrAction(){
		response = ServletActionContext.getResponse();
		request=ServletActionContext.getRequest();
	}
	@Action("/getEmployees")
	public String getEmployees(){
		
		
		System.out.println("ajax");
		
		try {
			String orgid=request.getParameter("orgid");
			
			if(orgid.equals("")||orgid==null){
				return null;
			}
			List<TbEmployee> employees = dao.findByHSQL("from TbEmployee where orgid="+orgid, new TbEmployee());
			
			Gson gson=new Gson();
			
			Map<String,List<TbEmployee>> map=new HashMap<String,List<TbEmployee>>();
			map.put("employee", employees);
			String json = gson.toJson(map);
			System.out.println(json);
			
			response.getWriter().write(json);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
