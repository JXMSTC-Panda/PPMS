package ppms.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.action.interfaces.BaseInit;
import ppms.domain.TbPoint;
import ppms.serviceimpl.IntegralServiceImp;

import com.opensymphony.xwork2.ActionSupport;

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
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String search() {

		try {
			List<TbPoint> points = service.getAllPoints("01");
			System.out.println("ss");

			if (points.size() > 0) {
				map.put("points", points);
				toCache();
			}
			
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
}
