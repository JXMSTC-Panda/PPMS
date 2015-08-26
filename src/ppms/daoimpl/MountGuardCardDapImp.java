package ppms.daoimpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.classic.Session;
import org.springframework.stereotype.Repository;

import ppms.dao.MountGuardCardDao;
import ppms.domain.COrganizationNj;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbEmployee;
import ppms.domain.TbInnovation;
import ppms.domain.TbMaster;
import ppms.domain.TbMountguardexam;

@Repository
public class MountGuardCardDapImp extends BaseDaoImp implements
		MountGuardCardDao {

	
	public boolean update(TbMountguardexam mountguardexam){
		
		Session openSession = null;
		try {
			openSession= this.getSessionFactory().openSession();
			
			openSession.beginTransaction();
			
			TbMountguardexam load = (TbMountguardexam) openSession.load(TbMountguardexam.class,mountguardexam.getExamid());
			
			load.setExamdate(mountguardexam.getExamdate());
			load.setExamexpire(mountguardexam.getExamexpire());
			load.setExamscore(mountguardexam.getExamscore());
			load.setExamtype(mountguardexam.getExamtype());
			
			openSession.update(load);
			
			openSession.getTransaction().commit();
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			openSession.getTransaction().rollback();
			return false;
		}finally{
			openSession.close();
		}
		
	}
	/**
	 * 
	 * 
	 * @Title: getTbEmployee
	 * 
	 * @Description: 取员工信息集合
	 * 
	 * @param: null
	 * 
	 * @return: List
	 * 
	 * @auther: CappuccinoH
	 * 
	 * @date: 2015-8-11 下午7:42:33
	 */
	@Override
	public List<TbEmployee> getTbEmployee() {
		// TODO Auto-generated method stub
		List<TbEmployee> teList = null;
		try {
			String HQL = "from TbEmployee";
			TbEmployee te = new TbEmployee();
			teList = findByHSQL(HQL, te);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return teList;
	}

	/**
	 * 
	 * 
	 * @Title: getCOrganizationNj
	 * 
	 * @Description: 取营业厅地域关系集合
	 * 
	 * @param: null
	 * 
	 * @auther: CappuccinoH
	 * 
	 * @date: 2015-8-11 下午7:44:19
	 */
	@Override
	public List<COrganizationNj> getCOrganizationNj() {
		// TODO Auto-generated method stub
		List<COrganizationNj> conList = null;
		try {
			String HQL = "from COrganizationNj";
			COrganizationNj con = new COrganizationNj();
			conList = findByHSQL(HQL, con);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conList;
	}

	/**
	 * 
	 * @Title: getTbEmployeeByName
	 * 
	 * @Description: 按名字查询员工信息表
	 * 
	 * @param: @param TbEmployeeName
	 * @param: List<TbEmployee>
	 * 
	 * @auther: CappuccinoH
	 * 
	 * @date: 2015-8-13 下午2:48:36
	 */
	@Override
	public List<TbEmployee> getTbEmployeeByName(String TbEmployeeName) {
		List<TbEmployee> teList = null;
		try {
			String HQL = "from TbEmployee where employeename = '"
					+ TbEmployeeName + "'";
			TbEmployee te = new TbEmployee();
			teList = findByHSQL(HQL, te);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return teList;
	}

	/**
	 * 
	 * @Title: getTbAreaByAreaId
	 * 
	 * @Description: 按地域id查询相应的地域名称
	 * 
	 * @param: @param TbAreaId
	 * 
	 * 
	 * @return: List<TbArea>
	 * 
	 * @auther: CappuccinoH
	 * 
	 * @date: 2015-8-13 下午4:15:35
	 */
	@Override
	public List<TbArea> getTbAreaByAreaId(BigDecimal TbAreaId) {
		List<TbArea> taList = null;
		try {
			String HQL = "from TbArea where areaid = '" + TbAreaId + "'";
			TbArea ta = new TbArea();
			taList = findByHSQL(HQL, ta);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return taList;
	}

	/**
	 * @Title: getTbEmployeeByOrgId
	 * @Description: 按营业厅对象查找相应的营业员集合
	 * @param: @param organizationNj
	 * @return: List<TbEmployee>
	 * @auther: CappuccinoH
	 * @date: 2015-8-13 下午4:47:17
	 */
	@Override
	public List<TbEmployee> getTbEmployeeByOrgId(Integer OrgId) {
		List<TbEmployee> taList = null;
		try {
			String HQL = "from TbEmployee where organizationNj = '" + OrgId
					+ "'";
			TbEmployee te = new TbEmployee();
			taList = findByHSQL(HQL, te);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return taList;
	}

	/**
	 * @Title: getOrganizationNjByOrgId
	 * @Description: 按营业厅编号查询营业厅集合
	 * @param: @param OrgId
	 * @return: List<OrganizationNj>
	 * @auther: CappuccinoH
	 * @date: 2015-8-13 下午7:18:47
	 */
	@Override
	public List<OrganizationNj> getOrganizationNjByOrgId(Integer OrgId) {
		List<OrganizationNj> onList = null;
		try {
			String HQL = "from OrganizationNj where orgid = '" + OrgId + "'";
			OrganizationNj on = new OrganizationNj();
			onList = findByHSQL(HQL, on);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return onList;
	}

	/**
	 * @Title: getTbEmployeeByTbEmployeeId
	 * @Description: 按营业员号查询营业员集合
	 * @param: @param TbEmployeeId
	 * @return: List<TbEmployee>
	 * @auther: CappuccinoH
	 * @date: 2015-8-17 上午10:03:09
	 */
	@Override
	public List<TbEmployee> getTbEmployeeByTbEmployeeId(String TbEmployeeId) {
		List<TbEmployee> teList = null;
		try {
			String HQL = "from TbEmployee where employeeid = '" + TbEmployeeId
					+ "'";
			TbEmployee te = new TbEmployee();
			teList = findByHSQL(HQL, te);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return teList;
	}

	/**
	 * @Title: getTbMountguardexam
	 * @Description: 查询TbMountguardexam合作厅上岗考证数据集
	 * @param: 无
	 * @return: List<TbMountguardexam>
	 * @auther: CappuccinoH
	 * @date: 2015-8-18 上午10:32:59
	 */
	@Override
	public List<TbMountguardexam> getTbMountguardexam() {
		List<TbMountguardexam> tmList = null;
		try {
			String HQL = "from TbMountguardexam";
			TbMountguardexam te = new TbMountguardexam();
			tmList = findByHSQL(HQL, te);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return tmList;
	}

	/**
	 * @Title: getCOrganizationNjByOrgId
	 * @Description: 按营业厅id查询区域营业厅集合
	 * @param: @param orgid
	 * @return: List<COrganizationNj>
	 * @auther: CappuccinoH
	 * @date: 2015-8-18 上午10:55:39
	 */
	@Override
	public List<COrganizationNj> getCOrganizationNjByOrgId(Integer orgid) {
		List<COrganizationNj> conList = null;
		try {
			String HQL = "from COrganizationNj where orgid = '" + orgid + "'";
			COrganizationNj con = new COrganizationNj();
			conList = findByHSQL(HQL, con);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conList;
	}

	/**
	 * @Title: getTbMasterByExamtype
	 * @Description: 按考核类型查询字典表
	 * @param: @param examtype
	 * @param: @return
	 * @return: List<TbMaster>
	 * @auther: CappuccinoH
	 * @date: 2015-8-24 上午5:44:41
	 */
	public List<TbMaster> getTbMasterByExamtype(String examtype) {
		List<TbMaster> tmList = null;
		List<TbMaster> TbMasterList = new ArrayList<>();
		try {
			String HQL = "from TbMaster where type = 'MountGuardType'";
			TbMaster tm = new TbMaster();
			tmList = findByHSQL(HQL, tm);

			// System.out.println(tmList.get(0).getType());
			// System.out.println(tmList.get(1).getType());
			// System.out.println(examtype);

			for (TbMaster tmlist : tmList) {
				if (tmlist.getKey().equals(examtype)) {
					TbMasterList.add(tmlist);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return TbMasterList;
	}

}
