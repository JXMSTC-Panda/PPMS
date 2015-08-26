package ppms.action;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import ppms.action.interfaces.BaseInit;
import ppms.domain.COrganizationNj;
import ppms.domain.HallKeeperData;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbEmployee;
import ppms.domain.TbMaster;
import ppms.domain.TbPerformance;
import ppms.domain.TbPost;
import ppms.domain.TbPromotiontraining;
import ppms.domain.TbVisitcheck;
import ppms.serviceimpl.HallKeeperServiceImp;

public class HallKeeperAction extends BaseInit {

	protected HttpServletResponse response;
	protected HttpServletRequest request;

	// private String ajaxState;

	@Autowired
	protected HallKeeperServiceImp hallkeeperserviceimp;
	private String nowYear;

	// 测试是否进入该函数
	public HallKeeperAction() {
		super();
		response = ServletActionContext.getResponse();
		request = ServletActionContext.getRequest();
		// ajaxState = "0";
		System.out.println("调用HallKeeperAction构造");
	}

	@Action(value = "userInfo.hallKeeperExam.hallKeeperExamSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/hallKeeperExamSearch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String hallKeeperExamSearch() {

		try {
			initPage1("userInfo.hallKeeperExamSearch");
			toCache();
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}

	}

	@Action(value = "userInfo.hallKeeperExam.hallKeeperForwardSearch", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/userInfo/hallKeeperForwardSearch.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String hallKeeperForwardSearch() {

		initPage1("userInfo.hallKeeperForwardSearch");
		toCache();
		return "success";
	}

	public void initPage1(String url) {
		int i=0;
		System.out.println("调用了map方法！！！！！！！！！！！！！！！！！！！！！！！！！！！");
		// 实例化map

		// 根据不同请求的url实现不同页面的页面初始化
		switch (url) {

		case "userInfo.hallKeeperForwardSearch":
			System.out.println("进入case userInfo.hallKeeperForwardSearch 进行加载");

		case "userInfo.hallKeeperExamSearch":
			System.out.println("进入url");

			// 更具进阶内容查询进阶key
			List<TbMaster> tbMaster = hallkeeperserviceimp.getTbMaster("进阶店长");
			String key = tbMaster.get(0).getKey();

			// 根据key查询进阶表的信息
			List<TbPromotiontraining> tbPromotiontraining = hallkeeperserviceimp
					.getTbPromotiontraining(key);

			List<HallKeeperData> datas = new ArrayList<HallKeeperData>();

			for (TbPromotiontraining tpt : tbPromotiontraining) {
				// 取employeeid职员id
				String employeeid = tpt.getTbEmployee().getEmployeeid();
				// 取promotionscore进阶店长分数
				Double promotionscore = tpt.getPromotionscore();

				// 根据进阶表员工id查询员工信息
				List<TbEmployee> tbEmployee = hallkeeperserviceimp
						.getTbEmployee(employeeid);
				// 取employeecode员工工号
				String employeecode = tbEmployee.get(0).getEmployeecode();
				// 取employeename员工姓名
				String employeename = tbEmployee.get(0).getEmployeename();
				// 学历
				String academicdegree = tbEmployee.get(0).getAcademicdegree();
				// 电信业务水平strtelecomlevel
				Integer telecomlevel = tbEmployee.get(0).getTelecomlevel();
				String strtelecomlevel = null;

				if (telecomlevel != null) {
					if (telecomlevel == -1) {
						strtelecomlevel = "空白";
					} else if (telecomlevel == 0) {
						strtelecomlevel = "初级";
					} else if (telecomlevel == 1) {
						strtelecomlevel = "中级";
					} else if (telecomlevel == 2) {
						strtelecomlevel = "高级";
					}
				}
				// 移动业务水平strmobilelevel
				Integer mobilelevel = tbEmployee.get(0).getMobilelevel();
				String strmobilelevel = null;
				if (mobilelevel != null) {
					if (mobilelevel == -1) {
						strmobilelevel = "空白";
					} else if (mobilelevel == 0) {
						strmobilelevel = "初级";
					} else if (mobilelevel == 1) {
						strmobilelevel = "中级";
					} else if (mobilelevel == 2) {
						strmobilelevel = "高级";
					}
				}
				// 区域id
				Integer orgid = tbEmployee.get(0).getOrganizationNj()
						.getOrgid();
				// 在区域营业厅关系表中查询地域id
				List<COrganizationNj> cOrganizationNj = hallkeeperserviceimp
						.getCOrganizationNj(orgid);
				BigDecimal areaid = cOrganizationNj.get(0).getTbArea()
						.getAreaid();
				// 查询区域
				List<TbArea> organizationNj = hallkeeperserviceimp
						.getOrganizationNj(areaid);

				// 地域名称areadesc
				String areadesc = organizationNj.get(0).getAreadesc();

				// 查询营业厅名称org_Name
				List<OrganizationNj> org = hallkeeperserviceimp
						.getOrganizationNj(orgid);
				String org_Name = org.get(0).getOrg_Name();

				// 获取岗职信息
				// 获取岗职名称postname
				String postname = tbEmployee.get(0).getTbPost()!=null?tbEmployee.get(0).getTbPost().getPostname():null;

				// 获取绩效表信息
				List<TbPerformance> tbPerformance = hallkeeperserviceimp
						.getTbPerformance(employeeid);

				// 上一年绩效分数performancescore
				Double performancescore = null;

				// 取当前日期
				Date nowdate = new Date(System.currentTimeMillis());
				// XXXX年的转换通用格式
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
				// 将当前的时间转换成上一年的XXXX年的字符串
				String nowYear = String.valueOf(Integer.parseInt(sdf
						.format(nowdate)) - 1);
				// 增强for查询出上一年的绩效集合
				for (TbPerformance tpf : tbPerformance) {
					if (tpf.getPerformancetype()) {
						java.util.Date date = tpf.getPerformancedate();
						String year = sdf.format(date);
						if (year.equals(nowYear)) {
							// 把上一年绩效分数赋值出去
							performancescore = tpf.getPerformancescore();
						}
					}
				}

				// 暗访查询
				List<TbVisitcheck> tbVisitcheck = hallkeeperserviceimp
						.getTbVisitcheck(orgid);
				// 第一次成绩
				Double firstscore = tbVisitcheck.get(0).getFirstscore();
				// 第二次成绩
				Double secondscore = tbVisitcheck.get(0).getSecondscore();
				// 均分
				Double aver = (firstscore + firstscore) / 2;

				// 封装数据进对象
				HallKeeperData hallKeeperData = new HallKeeperData(
						employeecode, employeename, areadesc, org_Name,
						postname, academicdegree, strtelecomlevel,
						strmobilelevel, performancescore, promotionscore,
						firstscore, secondscore, aver);
				// 数据集添加对象
				datas.add(hallKeeperData);

				System.out.println("employeecode:" + employeecode);
				System.out.println("employeename:" + employeename);
				System.out.println("areadesc:" + areadesc);
				System.out.println("org_Name" + org_Name);
				System.out.println("postname" + postname);

				System.out.println("academicdegree" + academicdegree);
				System.out.println("strtelecomlevel" + strtelecomlevel);
				System.out.println("strmobilelevel" + strmobilelevel);
				System.out.println("performancescore" + performancescore);
				System.out.println("promotionscore" + promotionscore);

				System.out.println("firstscore" + firstscore);
				System.out.println("secondscore" + secondscore);
				System.out.println("aver" + aver);

				System.out.println("===========================");
			}

			map.put("datas", datas);

			/*
			 * //更具区域id查询区域名称 List<TbMaster> tbMaster =
			 * serviceImp.getTbMaster("进阶店长"); map.put("tbMaster", tbMaster);
			 * 
			 * //取master的key值 String promotioncontent =
			 * tbMaster.get(0).getKey();
			 * 
			 * //根据key值查询进阶表信息 List<TbPromotiontraining> tbPromotiontraining =
			 * serviceImp.getTbPromotiontraining(promotioncontent);
			 * map.put("tbPromotiontraining", tbPromotiontraining);
			 * 
			 * 
			 * //根据进阶表查询员工信息 String employeeid =
			 * tbPromotiontraining.get(0).getTbEmployee().getEmployeeid();
			 * List<TbEmployee> tbEmployee =
			 * serviceImp.getTbEmployee(employeeid); map.put("tbEmployee",
			 * tbEmployee);
			 * 
			 * //test List<TbEmployee> testList = null; for(TbPromotiontraining
			 * tpt:tbPromotiontraining){ List<TbEmployee> TbEmployee =
			 * serviceImp.getTbEmployee(tpt.getTbEmployee().getEmployeeid());
			 * testList.add(TbEmployee.get(0)); } map.put("testList", testList);
			 * 
			 * 
			 * 
			 * //根据职员岗职id查询岗职表 String postid =
			 * tbEmployee.get(0).getTbPost().getPostid(); List<TbPost> tbPost =
			 * serviceImp.getTbPost(postid); map.put("tbPost", tbPost);
			 * 
			 * //查询营业厅id Integer orgid =
			 * tbEmployee.get(0).getOrganizationNj().getOrgid();
			 * 
			 * 
			 * //营业厅id查询营业厅表 List<OrganizationNj> organizationNj =
			 * serviceImp.getOrganizationNj(orgid); map.put("organizationNj",
			 * organizationNj);
			 * 
			 * //查询地域id List<COrganizationNj> cOrganizationNj =
			 * serviceImp.getCOrganizationNj(orgid); BigDecimal areaid =
			 * cOrganizationNj.get(0).getTbArea().getAreaid();
			 * 
			 * //根据地域id查询地域集合 List<TbArea> tbArea =
			 * serviceImp.getOrganizationNj(areaid); map.put("tbArea", tbArea);
			 * 
			 * //取上年的绩效
			 * 
			 * //取绩效表集合 List<TbPerformance> tbPerformance =
			 * serviceImp.getTbPerformance(employeeid);
			 * 
			 * //取当前日期 Date nowdate = new Date(System.currentTimeMillis());
			 * //XXXX年的转换通用格式 SimpleDateFormat sdf = new
			 * SimpleDateFormat("yyyy"); //将当前的时间转换成上一年的XXXX年的字符串 String nowYear
			 * = String.valueOf(Integer.parseInt(sdf.format(nowdate))-1);
			 * //增强for查询出上一年的绩效集合 for(TbPerformance tpf:tbPerformance){
			 * if(tpf.getPerformancetype()){ java.util.Date date =
			 * tpf.getPerformancedate(); String year = sdf.format(date);
			 * if(year.equals(nowYear)){ System.out.println(year); //将对象集合put出去
			 * map.put("tpf", tpf);
			 * 
			 * } } }
			 * 
			 * //暗访信息集合查询 List<TbVisitcheck> tbVisitcheck =
			 * serviceImp.getTbVisitcheck(orgid); map.put("tbVisitcheck",
			 * tbVisitcheck.get(0));
			 */

			System.out.println("完成case操作");
			break;

		default:
			break;
		}

	}

}
