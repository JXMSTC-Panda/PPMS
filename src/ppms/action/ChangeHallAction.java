package ppms.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ppms.action.interfaces.InitPage;
import ppms.domain.OrganizationNj;
import ppms.domain.TbChangeorghistory;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.domain.TbPost;
import ppms.domain.TbRole;
import ppms.serviceimpl.ChangeHallServiceImp;
import ppms.serviceimpl.userBaseInfoServiceImp;

import com.opensymphony.xwork2.ActionSupport;

public class ChangeHallAction extends ActionSupport implements InitPage{
	
	@Autowired
	private TbChangeorghistory tbChangeorghistory;

	public TbChangeorghistory getTbChangeorghistory() {
		return tbChangeorghistory;
	}

	public void setTbChangeorghistory(TbChangeorghistory tbChangeorghistory) {
		this.tbChangeorghistory = tbChangeorghistory;
	}
	@Autowired
	private ChangeHallServiceImp changeHallServiceImp;
		
	
	public ChangeHallServiceImp getChangeHallServiceImp() {
		return changeHallServiceImp;
	}

	public void setChangeHallServiceImp(ChangeHallServiceImp changeHallServiceImp) {
		this.changeHallServiceImp = changeHallServiceImp;
	}

	@Override
	public Map<String, List<T>> initPage(ServletContext servletContext,
			String url) {
		Map map = new HashMap<>();

		ChangeHallServiceImp service = WebApplicationContextUtils
				.getWebApplicationContext(servletContext).getBean(
						ChangeHallServiceImp.class);
		// 获取所有营业厅
		switch (url) {
		case "userInfo.changeHallSearch":
			List<TbChangeorghistory> tbChangeorghistories=service.getTbChangeorghistories();
			map.put("tbChangeOrg", tbChangeorghistories);
			break;
		default:
			break;
		}	
		return map;
	}
	
}
