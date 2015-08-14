package ppms.daoimpl;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ppms.dao.StandardCheckDao;
import ppms.domain.OrganizationNj;
import ppms.domain.TbAreaorgrelation;
import ppms.domain.TbStandardcheck;

@Repository
public class StandardCheckDaoImp extends BaseDaoImp implements StandardCheckDao {
	
	/**
	 * 获取标准化表信息
	 * @return
	 * */
	public List<TbStandardcheck> findStandardCheckinfo(){
		List results = null;
		try{
			String hql = "from TbStandardcheck";
			results =  getHibernateTemplate().find(hql);
		}catch(Exception e){
			e.printStackTrace();
		}
		return results;
	}
	
	/**
	 * 通过营业厅号来查询营业厅
	 * @return
	 * */
	public List<OrganizationNj> findOrganizationNjInfor(int orgId){
		List result = null;
		try {
			String hql = "from OrganizationNj where orgid = "+orgId;
			result = getHibernateTemplate().find(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	/**
	 * 通过区域编号来查询区域表
	 * @return: List
	 * */
	public List<TbAreaorgrelation> findAreaorgrelation(int orgId){
		List result = null;
		try {
			String hql = "from TbAreaorgrelation where organizationNj = "+orgId;
			result = getHibernateTemplate().find(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
