package ppms.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.action.interfaces.BaseInit;
import ppms.domain.TbChangejobhistory;
import ppms.serviceimpl.IndividualGrowthFileServiceImp;
/**   
 *    
 * 项目名称：PPMS   
 * 类名称：IndividualGrowthFileAction   
 * 类描述：   
 * 创建人：SuperYWJ
 * 创建时间：2015-8-20 上午8:51:51   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-21 下午5:51:51   
 * 修改备注：   
 * @version    
 *    
 */
public class IndividualGrowthFileAction  extends BaseInit{
	
	/**
	 * 声明tbChangejobhistory对象
	 */
	private TbChangejobhistory tbChangejobhistory;
	
	/**
	 * 对象的get,set方法
	 * @return
	 */
	public TbChangejobhistory getTbChangejobhistory() {
		return tbChangejobhistory;
	}

	public void setTbChangejobhistory(TbChangejobhistory tbChangejobhistory) {
		this.tbChangejobhistory = tbChangejobhistory;
	}
	/**
	 * 声明request对象
	 */
	protected HttpServletRequest request;

	public IndividualGrowthFileAction() {

		request = ServletActionContext.getRequest();

	}
	
	/**
	 * 声明service对象
	 */
	@Autowired
	private IndividualGrowthFileServiceImp service;

	public IndividualGrowthFileServiceImp getService() {
		return service;
	}

	public void setService(IndividualGrowthFileServiceImp service) {
		this.service = service;
	}

	/**
	 * 实现individualGrowthFileSearch页面的初始化
	 * @return
	 */
	@Action(value = "userInfo.growthFile.individualGrowthFileSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/individualGrowthFileSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String result() {
		try {
			/**
			 * 通过get方法取到前台传来的Employeeid,通过id查到对应表中数据，封装
			 */
			List<TbChangejobhistory> tbChangejobhistories = service
					.getTbChangejobhistories(tbChangejobhistory.getTbEmployee()
							.getEmployeeid());
			/**
			 * 判断，如果tbChangejobhistories.size() > 0，即如果表中有对应id的对应数据，执行put
			 */
			if (tbChangejobhistories.size() > 0) {
				map.put("tbChangejobs", tbChangejobhistories);
				toCache();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "success";
	}
}
