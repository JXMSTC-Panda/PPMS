
package ppms.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ppms.action.interfaces.BaseInit;
import ppms.daoimpl.BaseDaoImp;
import ppms.domain.TbArea;
import ppms.domain.TbBecomeemployeeexam;
import ppms.domain.TbFreshemployeeexam;
import ppms.serviceimpl.BecomeemployeeexamServiceImp;
import ppms.serviceimpl.FreshemployeeexamServiceImp;

/**   
 *    
 * 项目名称：PPMS   
 * 类名称：FreshEmployeeExamAction   
 * 类描述：   新员工考核
 * 创建人：SuperPcf 
 * 创建时间：2015-8-21 上午10:17:52   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-21 上午10:17:52   
 * 修改备注：   
 * @version    
 *    
 */
/**
 * @author super-pcf
 * 
 */
public class EmployeeExamAction extends BaseInit {

	String examstage;

	public String getExamstage() {
		return examstage;
	}

	public void setExamstage(String examstage) {
		this.examstage = examstage;
	}

	/**
	 * 
	 * @字段：tbFreshemployeeexam :新员工考核成绩表
	 */

	private TbFreshemployeeexam tbFreshemployeeexam;

	/**
	 * 转正成绩表
	 */
	private TbBecomeemployeeexam tbBecomeemployeeexam;

	private HttpServletRequest request;

	// 构造函数
	public EmployeeExamAction() {
		request = ServletActionContext.getRequest();
	}

	public TbBecomeemployeeexam getTbBecomeemployeeexam() {
		return tbBecomeemployeeexam;
	}

	public void setTbBecomeemployeeexam(
			TbBecomeemployeeexam tbBecomeemployeeexam) {
		this.tbBecomeemployeeexam = tbBecomeemployeeexam;
	}

	@Autowired
	private FreshemployeeexamServiceImp freshService;
	@Autowired
	private BecomeemployeeexamServiceImp becomeService;

	/**
	 * 
	 * @字段：tbArea :区域表实体类
	 */
	private TbArea tbArea;

	// private

	public TbArea getTbArea() {
		return tbArea;
	}

	public void setTbArea(TbArea tbArea) {
		this.tbArea = tbArea;
	}

	/**
	 * @return the tbFreshemployeeexam
	 */
	public TbFreshemployeeexam getTbFreshemployeeexam() {
		return tbFreshemployeeexam;
	}

	/**
	 * @param tbFreshemployeeexam
	 *            the tbFreshemployeeexam to set
	 */
	public void setTbFreshemployeeexam(TbFreshemployeeexam tbFreshemployeeexam) {
		this.tbFreshemployeeexam = tbFreshemployeeexam;
	}

	/**
	 * 声明，调用API
	 */
	@Autowired
	@Qualifier("baseDaoImp")
	private BaseDaoImp dao;

	/**
	 * 
	 * @方法名: freshEmployeeExamSingle
	 * 
	 * @描述: 新员工考核成绩单条录入初始化
	 * 
	 * @param @return    设定文件
	 * 
	 * @return String    返回类型
	 * 
	 * @throws
	 */
	@Action(value = "employeeTrainExam.freshEmployeeExam.freshEmployeeExamSingle", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/freshEmployeeExamSingle.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String freshEmployeeExamSingle() {

		return "success";
	}

	/**
	 * @return删除
	 */
	@Action(value = "employeeTrainExam.freshEmployeeExam.freshEmployeeExamSearch.delete", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/freshEmployeeExamSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String deleteFreshEmployeeExam() {
		String examid = request.getParameter("examid");
		try {
			List<TbFreshemployeeexam> tbFreshemployeeexams = freshService
					.geTbFreshemployeeexams();
			for (TbFreshemployeeexam tb : tbFreshemployeeexams) {
				if (tb.getExamid().equals(examid)) {
					freshService.deleteFreshemployeeexam(tb, examid);

					search();
					return "success";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "faild";
		}

		return "success";
	}

	/**
	 * @return
	 */
	@Action(value = "employeeTrainExam.freshEmployeeExam.becomeEmployeeSearch.delete", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/becomeEmployeeSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String deleteBecomeEmployeeExam() {
		String examid = request.getParameter("examid");
		try {
			List<TbBecomeemployeeexam> tbBecomeemployeeexams = becomeService
					.getBecomeemployeeexams();
			for (TbBecomeemployeeexam tb : tbBecomeemployeeexams) {
				if (tb.getExamid().equals(examid)) {
					becomeService.deleteBecomeemployeeexam(tb, examid);
					becomeEmployeeSearch();
					return "success";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "faild";
		}

		return "success";
	}

	/**
	 * 
	 * @方法名: addfreshEmployeeExamSingle
	 * 
	 * @描述: 新员工考核成绩单条录入 添加功能
	 * 
	 * @param @return    设定文件
	 * 
	 * @return String    返回类型
	 * 
	 * @throws
	 */
	@Action(value = "employeeTrainExam.freshEmployeeExam.freshEmployeeExamSingle.add", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/freshEmployeeExamSingleResult.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String addfreshEmployeeExamSingle() {

		try {

			// 调试用
//			System.out.println("=============>>>>>>" + examstage
//					+ "----------->>>>>" + tbArea);
		tbFreshemployeeexam.setOrganizationNj(null);
			tbFreshemployeeexam.setTbEmployee(null);

			if (examstage.equals("1")) {
				tbFreshemployeeexam.setExamstage("入职期");
			} else {
				tbFreshemployeeexam.setExamstage("实习期");
			}

			freshService.addFreshemployeeexam(tbFreshemployeeexam);

//			// 测试开始
//			List<TbFreshemployeeexam> tbFreshemployeeexams = freshService
//					.geTbFreshemployeeexams();
//			for (TbFreshemployeeexam tb : tbFreshemployeeexams) {
//				System.out.println("=============>>>" + tb.getWeek());
//				System.out.println("------------->>>" + tb.getExamstage());
//				System.out.println("=============>>>" + tb.getExamscore());
//			}

		} catch (Exception e) {
			e.printStackTrace();
			return "faild";
		}

		return "success";
	}

	/**
	 * 
	 * @方法名: addBecomeEmployeeSearch
	 * 
	 * @描述: 转正考核成绩单条录入 添加功能
	 * 
	 * @param @return    设定文件
	 * 
	 * @return String    返回类型
	 * 
	 * @throws
	 */
	@Action(value = "employeeTrainExam.freshEmployeeExam.becomeEmployeeSingle.add", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/becomeEmployeeSingleResult.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String addbecomeEmployeeSingle() {

		try {

			// 调试用
			//System.out.println("=========>>" + tbBecomeemployeeexam);
			tbBecomeemployeeexam.setOrganizationNj(null);
			tbBecomeemployeeexam.setTbEmployee(null);

			//
			becomeService.addBecomeemployeeexam(tbBecomeemployeeexam);

//			// 调试用
//			List<TbBecomeemployeeexam> tbBecomeemployeeexams = becomeService
//					.getBecomeemployeeexams();
//			for (TbBecomeemployeeexam tb : tbBecomeemployeeexams) {
//				System.out.println("==========>>>" + tb.getExamscore());
//				System.out.println("---------->>>" + tb.getChineseprintcount());
//				System.out.println("==========>>>" + tb.getNumberprintcount());
//				System.out.println("---------->>>>" + tb.getRemark());
//
//			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		// service.
		return "success";
	}

	/**
	 * 
	 * @方法名: freshEmployeeExamBatch
	 * 
	 * @描述: menu.jsp菜单页跳转到freshEmployeeExamBatch.jsp 新员工考核成绩查询批量导入
	 * 
	 * @param @return    设定文件
	 * 
	 * @return String    返回类型
	 * 
	 * @throws
	 */
	@Action(value = "employeeTrainExam.freshEmployeeExam.freshEmployeeExamBatch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/freshEmployeeExamBatch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String freshEmployeeExamBatch() {

		// initPage("employeeTrainExam.freshEmployeeExamSearch");
		// toCache();
		return "success";
	}

	/**
	 * 
	 * @方法名: becomeEmployeeBatch
	 * 
	 * @描述: menu.jsp菜单页跳转到becomeEmployeeBatch.jsp 转正考核成绩查询批量导入
	 * 
	 * @param @return    设定文件
	 * 
	 * @return String    返回类型
	 * 
	 * @throws
	 */
	@Action(value = "employeeTrainExam.freshEmployeeExam.becomeEmployeeBatch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/becomeEmployeeBatch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String becomeEmployeeBatch() {

		return "success";

	}

	/**
	 * 
	 * @方法名: search
	 * 
	 * @描述: 初始化：新员工考核成绩查询
	 * 
	 * @param @return    设定文件
	 * 
	 * @return String    返回类型
	 * 
	 * @throws
	 */
	@Action(value = "employeeTrainExam.freshEmployeeExam.freshEmployeeExamSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/freshEmployeeExamSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String search() {

		initPage("employeeTrainExam.freshEmployeeExamSearch");
		toCache();
		return "success";
	}

	/**
	 * 
	 * @方法名: becomeEmployeeSearch
	 * 
	 * @描述: menu.jsp菜单页跳转到 becomeEmployeeSearch.jsp转正考核成绩查询
	 * 
	 * @param @return    设定文件
	 * 
	 * @return String    返回类型
	 * 
	 * @throws
	 */
	@Action(value = "employeeTrainExam.freshEmployeeExam.becomeEmployeeSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/becomeEmployeeSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String becomeEmployeeSearch() {

		initPage("employeeTrainExam.becomeEmployeeSearch");
		toCache();
		return "success";
	}

	/**
	 * 
	 * @方法名: search
	 * 
	 * @描述: 初始化：转正考核成绩单条录入
	 * 
	 * @param @return    设定文件
	 * 
	 * @return String    返回类型
	 * 
	 * @throws
	 */
	@Action(value = "employeeTrainExam.freshEmployeeExam.becomeEmployeeSingle", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/becomeEmployeeSingle.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String becomeEmployeeSingle() {

		// initPage("employeeTrainExam.becomeEmployeeSingle");
		// toCache();
		return "success";
	}

	private void initPage(String url) {
		

		try {
			// 获取所有营业厅
			switch (url) {
			case "employeeTrainExam.freshEmployeeExamSearch":
				List<TbFreshemployeeexam> tbFreshemployeeexams = dao
						.getEntitiestNotLazy(
								new TbFreshemployeeexam(),
								new String[] { "organizationNj", "tbEmployee" },
								null);
				map.put("freshemployeeexams", tbFreshemployeeexams);

				break;
			case "employeeTrainExam.becomeEmployeeSearch":
				List<TbBecomeemployeeexam> tbBecomeemployeeexams = dao
						.getEntitiestNotLazy(
								new TbBecomeemployeeexam(),
								new String[] { "organizationNj", "tbEmployee" },
								null);
				map.put("tbBecomeemployeeexam", tbBecomeemployeeexams);
				break;
			default:
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 实例化map
	}

	/**
	 * 
	 * @方法名: becomeEmployeeToUpdate
	 * 
	 * @描述: 从转正考核成绩查询跳转到修改考核成绩
	 * 
	 * @param @return    设定文件
	 * 
	 * @return String    返回类型
	 * 
	 * @throws
	 */
	@Action(value = "employeeTrainExam.freshEmployeeExam.becomeEmployeeSearch.modify.toUpdate", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/becomeEmployeeUpdate.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String becomeEmployeeToUpdate() {

		String examid = request.getParameter("examid");

		try {
			// 调用API，查询对象所有数据，放到TbBecomeemployeeexam中
			List<TbBecomeemployeeexam> tbBecomeemployeeexams = dao
					.getEntitiestNotLazy(new TbBecomeemployeeexam(),
							new String[] { "organizationNj", "tbEmployee" },
							Restrictions.eq("examid", examid));
			request.setAttribute("tbBecomeemployeeexam", tbBecomeemployeeexams);

		} catch (Exception e) {
			e.printStackTrace();
			return "faild";
		}
		return "success";
	}

	/**
	 * 
	 * @方法名: updateBecomeEmployee
	 * 
	 * @描述: 单条修改转正考核成绩
	 * 
	 * @param @return    设定文件
	 * 
	 * @return String    返回类型
	 * 
	 * @throws
	 */
	@Action(value = "employeeTrainExam.freshEmployeeExam.becomeEmployeeSearch.modify", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/becomeEmployeeSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String updateBecomeEmployee() {
		// TbBecomeemployeeexam

		try {

			// 待修改
			becomeService.update(tbBecomeemployeeexam);
			// 初始化
			becomeEmployeeSearch();
		} catch (Exception e) {

			e.printStackTrace();
			return "faild";

		}
		return "success";
	}

	/**
	 * 
	 * @方法名: freshEmployeeExaToUpdate
	 * 
	 * @描述: 新员工考核成绩查询 跳转到 新员工考核成绩单条修改页面
	 * 
	 * @param @return    设定文件
	 * 
	 * @return String    返回类型
	 * 
	 * @throws
	 */
	@Action(value = "employeeTrainExam.freshEmployeeExam.freshEmployeeSearch.modify.toUpdate", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/freshEmployeeExamUpdate.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String freshEmployeeExaToUpdate() {

		String examid = request.getParameter("examid");
		try {

			// 调用API，查询对象所有数据，放到TbFreshemployeeexam中
			List<TbFreshemployeeexam> tbFreshemployeeexams = dao
					.getEntitiestNotLazy(new TbFreshemployeeexam(),
							new String[] { "organizationNj", "tbEmployee" },
							Restrictions.eq("examid", examid));
			if(tbFreshemployeeexams.get(0).getExamstage().equals("入职期")){
				request.setAttribute("examstage", 1);
			}
			else{
				request.setAttribute("examstage",2);
			}
			
			request.setAttribute("tbFreshemployeeexam", tbFreshemployeeexams);

		} catch (Exception e) {
			e.printStackTrace();
			return "faild";
		}

		return "success";
	}

	@Action(value = "employeeTrainExam.freshEmployeeExam.freshEmployeeSearch.modifya", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/employeeTrainExam/freshEmployeeExamSearch.jsp"),
			@Result(name = "faild", location = "/WEB-INF/content/error.jsp") })
	public String updateFreshEmployee() {
		// TbFreshemployeeexam

		try {
			
			freshService.update(tbFreshemployeeexam);
			search();
		} catch (Exception e) {
			e.printStackTrace();
			return "faild";
		}

		return "success";
	}
	
}
