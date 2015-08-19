package ppms.daoimpl;

import java.awt.geom.Area;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ppms.dao.StandardCheckDao;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbAreaorgrelation;
import ppms.domain.TbStandardcheck;
import ppms.domain.TbSubarea;
import ppms.domain.TbSubareaorgrelation;

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
	/**
	 * 通过AreaID查询Area表
	 * @return:List
	 * */
	public List<TbArea> findArea(BigDecimal areId) {
		List result = null;
		try {
			String hql = "from TbArea where areaid = "+areId;
			result = getHibernateTemplate().find(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	/**
	 * 在tb_SubAreaOrgRelation表中通过orgId查询SubAreaId
	 * */
	public List<TbSubareaorgrelation> findSubAreaId(Integer orgId) {
		List result = null;
		try {
			String hql = "from TbSubareaorgrelation where organizationNj = "+orgId;
			result = getHibernateTemplate().find(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	/**
	 * 通过片区Id查片区名
	 * 
	 * */
	public List<TbSubarea> findSubAreaDesc(BigDecimal subareaid) {
		List result = null;
		try {
			String hql = "from TbSubarea where subareaid = "+subareaid;
			result = getHibernateTemplate().find(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	/**
	 *按照id升序获取营业厅表
	 * */
	public List<OrganizationNj> findOrganizationNjInfor() {
		List result = null;
		try {
			String hql = "from OrganizationNj order by orgid asc" ;
			result = getHibernateTemplate().find(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	/**根据orgId来查询营业厅表中对应的行数据*/
	public List<OrganizationNj> findOrganizationId(Integer orgId) {
		List result = null;
		try {
			String hql = "from OrganizationNj where orgid = "+orgId ;
			result = getHibernateTemplate().find(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
