package ppms.daoimpl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import ppms.dao.MountGuardCardDao;
import ppms.domain.COrganizationNj;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbEmployee;

@Repository
public class MountGuardCardDapImp extends BaseDaoImp implements
		MountGuardCardDao {

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
			String HQL = "from TbEmployee where organizationNj = '" + OrgId + "'";
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
	* @return:    List<OrganizationNj>
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
	* @return:    List<TbEmployee>
	* @auther: CappuccinoH
	* @date: 2015-8-17 上午10:03:09
	*/
	@Override
	public List<TbEmployee> getTbEmployeeByTbEmployeeId(String TbEmployeeId) {
		List<TbEmployee> teList = null;
		try {
			String HQL = "from TbEmployee where employeeid = '" + TbEmployeeId + "'";
			TbEmployee te = new TbEmployee();
			teList = findByHSQL(HQL, te);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return teList;
	}

}
