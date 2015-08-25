package ppms.daoimpl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import ppms.dao.HallKeeperDao;
import ppms.domain.COrganizationNj;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbEmployee;
import ppms.domain.TbMaster;
import ppms.domain.TbPerformance;
import ppms.domain.TbPost;
import ppms.domain.TbPromotiontraining;
import ppms.domain.TbVisitcheck;

@Repository
public class HallKeeperDaoImp extends BaseDaoImp implements HallKeeperDao {
	
	/**
	* @Title: getTbMaster
	* @Description: 查询进阶类型为value的系统字典表
	* @param: @param value
	* @return:    List<TbMaster>
	* @auther: CappuccinoH
	* @date: 2015-8-19 下午2:45:35
	*/
	@Override
	public List<TbMaster> getTbMaster(String value) {
		List<TbMaster> tmList = null;
		try {
			String HQL = "from TbMaster where value = '"
					+ value + "'";
			TbMaster tm = new TbMaster();
			tmList = findByHSQL(HQL, tm);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return tmList;
	}

	/**
	* @Title: getTbPromotiontraining
	* @Description: 获取进阶id为进阶店长的集合表
	* @param: 无    
	* @return:   List<TbPromotiontraining> 
	* @auther: CappuccinoH
	* @date: 2015-8-19 下午2:35:40
	*/
	@Override
	public List<TbPromotiontraining> getTbPromotiontraining(
			String promotioncontent) {
		List<TbPromotiontraining> tptList = null;
		try {
			String HQL = "from TbPromotiontraining where promotioncontent = '"
					+ promotioncontent + "'";
			TbPromotiontraining tpt = new TbPromotiontraining();
			tptList = findByHSQL(HQL, tpt);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return tptList;
	}

	/**
	* @Title: getTbEmployee
	* @Description: 按employeeid查询员工信息表
	* @param: @param employeeid    
	* @return:    List<TbEmployee>
	* @auther: CappuccinoH
	* @date: 2015-8-19 下午2:50:49
	*/
	@Override
	public List<TbEmployee> getTbEmployee(String employeeid) {
		List<TbEmployee> teList = null;
		try {
			String HQL = "from TbEmployee where employeeid = '"
					+ employeeid + "'";
			TbEmployee tpt = new TbEmployee();
			teList = findByHSQL(HQL, tpt);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return teList;
	}

	/**
	* @Title: getCOrganizationNj
	* @Description: 按区域营业厅关系查询区域关系集合
	* @param: @param orgid
	* @return:    List<COrganizationNj>
	* @auther: CappuccinoH
	* @date: 2015-8-19 下午2:58:52
	*/
	@Override
	public List<COrganizationNj> getCOrganizationNj(Integer orgid) {
		List<COrganizationNj> conList = null;
		try {
			String HQL = "from COrganizationNj where orgid = '"
					+ orgid + "'";
			COrganizationNj con = new COrganizationNj();
			conList = findByHSQL(HQL, con);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conList;
	}

	/**
	* @Title: getOrganizationNj
	* @Description: 按地域id查询地域的集合
	* @param: @param areaid
	* @return:   List<TbArea> 
	* @auther: CappuccinoH
	* @date: 2015-8-19 下午3:01:40
	*/
	@Override
	public List<TbArea> getOrganizationNj(BigDecimal areaid) {
		List<TbArea> taList = null;
		try {
			String HQL = "from TbArea where areaid = '"
					+ areaid + "'";
			TbArea ta = new TbArea();
			taList = findByHSQL(HQL, ta);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return taList;
	}

	/**
	* @Title: getOrganizationNj
	* @Description: 按营业厅id查询营业厅集合
	* @param: @param orgid
	* @param: @return    
	* @return:    
	* @auther: CappuccinoH
	* @date: 2015-8-19 下午3:04:11
	*/
	@Override
	public List<OrganizationNj> getOrganizationNj(Integer orgid) {
		List<OrganizationNj> onList = null;
		try {
			String HQL = "from OrganizationNj where orgid = '"
					+ orgid + "'";
			OrganizationNj on = new OrganizationNj();
			onList = findByHSQL(HQL, on);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return onList;
	}

	/**
	* @Title: getTbVisitcheck
	* @Description: 按营业厅id查询暗访表集合
	* @param: @param orgid
	* @param: @return    
	* @return:    
	* @auther: CappuccinoH
	* @date: 2015-8-19 下午3:12:19
	*/
	@Override
	public List<TbVisitcheck> getTbVisitcheck(Integer orgid) {
		List<TbVisitcheck> tvcList = null;
		try {
			String HQL = "from TbVisitcheck where orgid = '"
					+ orgid + "'";
			TbVisitcheck tvc = new TbVisitcheck();
			tvcList = findByHSQL(HQL, tvc);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return tvcList;
	}

	/**
	* @Title: getTbPerformance
	* @Description: 按员工id查询年度绩效
	* @param: @param employeeid
	* @param: @param performancetype
	* @return:    List<TbPerformance>
	* @auther: CappuccinoH
	* @date: 2015-8-19 下午3:23:25
	*/
	@Override
	public List<TbPerformance> getTbPerformance(String employeeid) {
		List<TbPerformance> tvcList = null;
		try {
			String HQL = "from TbPerformance where employeeid = '"
					+ employeeid + "'";
			TbPerformance tvc = new TbPerformance();
			tvcList = findByHSQL(HQL, tvc);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return tvcList;
	}
	
	/**
	* @Title: getTbPost
	* @Description: 按岗职id查询岗职表
	* @param: @param postid   
	* @return:    List<TbPost>
	* @auther: CappuccinoH
	* @date: 2015-8-20 上午11:04:33
	*/
	@Override
	public List<TbPost> getTbPost(String postid){
		List<TbPost> tpList = null;
		try {
			String HQL = "from TbPost where postid = '"
					+ postid + "'";
			TbPost tp = new TbPost();
			tpList = findByHSQL(HQL, tp);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return tpList;
	}

}
