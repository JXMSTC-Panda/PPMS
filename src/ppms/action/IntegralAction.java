package ppms.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.action.interfaces.BaseInit;
import ppms.domain.TbPoint;
import ppms.serviceimpl.IntegralServiceImp;

/**
 * 处理积分管理模块请求
 * 
 * @author shark
 * @update 2015下午7:11:24
 * @function
 * 
 */
public class IntegralAction extends BaseInit {

	private TbPoint point;
	private String id;
	private String type;
	
	

	public final String getType() {
		return type;
	}

	public final void setType(String type) {
		this.type = type;
	}

	public final String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
	}

	@Autowired
	private IntegralServiceImp service;

	public TbPoint getPoint() {
		return point;
	}

	public void setPoint(TbPoint point) {
		this.point = point;
	}

	@Action(value = "integral.null.integralBatch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/integral/integralBatch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String downLoad() {

		return "success";
	}

	@Action(value = "integral.null.integralSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/integral/integralSearch.jsp"),
			@Result(name = "success1", location = "/WEB-INF/content/page/integral/integralSearch2.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String search() {

		try {
			
			
			List<TbPoint> points = service.getAllPoints(type);

			if (points.size() > 0) {
				map.put("points", points);
				toCache();
			}

			if(type!=null&&type.equals("1")){
				return "success1";
			}
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			ServletActionContext.getRequest().setAttribute("errorInfo", "服务器异常");
			return "error";
		}
		
	}

	@Action(value = "integral.null.integralSearch.delete", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/integral/integralBatch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String delete() {

		try {
			if (id != null) {

				if(service.delete(id)){
					ServletActionContext.getResponse().sendRedirect("integral.null.integralSearch.do");
					return null;
				}
			}
			ServletActionContext.getRequest().setAttribute("errorInfo", "删除失败");
			return "error";
		} catch (Exception e) {
			e.printStackTrace();
			ServletActionContext.getRequest().setAttribute("errorInfo", "服务器异常");
			return "error";
		}
	}
}
