package ppms.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import ppms.dao.MountGuardCardDao;
import ppms.domain.COrganizationNj;
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

}
