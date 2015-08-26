
/**  
* @文件名: MonthPerformanceDaolmp.java 
* @包名 ppms.daoimpl 
* @描述: TODO 
* @修改人：
* @修改时间：2015-8-11 下午2:57:00 
* @修改内容：

* @version V1.0  
*/ 
package ppms.daoimpl;

import java.util.List;

import javax.faces.context.Flash;

import org.hibernate.*;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.sun.org.apache.bcel.internal.generic.NEW;

import ppms.domain.*;
import ppms.dao.PerformanceDao;
import ppms.domain.TbPerformance;
import ppms.genericDao.TbPerformanceDAO;

/**   
 *    
 * 项目名称：PPMS   
 * 类名称：MonthPerformanceDaolmp   
 * 类描述：   
 * 创建人：SuperPcf 
 * 创建时间：2015-8-11 下午2:57:00   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-11 下午2:57:00   
 * 修改备注：   
 * @version    
 *    
 */
@Repository
public class MonthPerformanceDaolmp extends BaseDaoImp implements PerformanceDao {

	
	

	/**
	 * 月度绩效查询所有记录
	 */
	@Override
	public List<TbPerformance> getpPerformances() {
//	
//		Session session = getSession();
//		
//		Criteria cri = session.createCriteria(TbPerformance.class);
//		//条件查询当performancetype为false是为月度绩效
		//cri.add(Restrictions.eq("performancetype", false));
		
		
		return getHibernateTemplate().findByExample(new TbPerformance());
		//return cri.list();
	}

	/* (non-Javadoc)
	 * @see ppms.dao.PerformanceDao#getOrganizationNjs()
	 */
	@Override
	public List<OrganizationNj> getOrganizationNjs() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(new OrganizationNj());
	}

	/**
	 * 根据员工id查询员工
	 */
	@Override
	public List<TbEmployee> getEmployees(String employeeid) {
		List results=null;
		try{
			String hql="from TbEmployee where employeeid='"+employeeid+"'"; 
			results=getHibernateTemplate().find(hql);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		
		return results;  
    }


	@Override
	public void  deletePerformance(Object performance) {
		
		try {
			getHibernateTemplate().delete(performance);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public boolean update(TbPerformance tbPerformance){
		Session openSession = null;
		int i=0;
		try {
			openSession= this.getSessionFactory().openSession();
			
			openSession.beginTransaction();
			
			TbPerformance load = (TbPerformance) openSession.load(TbPerformance.class,tbPerformance.getPerformanceid());
			
			
			load.setPerformanceid(tbPerformance.getPerformanceid());
			load.setOrganizationNj(tbPerformance.getOrganizationNj());
			load.setTbEmployee(tbPerformance.getTbEmployee());
			load.setPerformancetype(tbPerformance.getPerformancetype());
			load.setPerformancedate(tbPerformance.getPerformancedate());
			load.setPerformancescore(tbPerformance.getPerformancescore());
			load.setRemark(tbPerformance.getRemark());
			load.setGradestandardorgfilename(tbPerformance.getGradestandardorgfilename());
			load.setGradestandardfilename(tbPerformance.getGradestandardfilename());
			load.setCreatedby(tbPerformance.getCreatedby());
			load.setCreatedtime(tbPerformance.getCreatedtime());
			load.setModifiedby(tbPerformance.getModifiedby());
			load.setModifiedtime(tbPerformance.getModifiedtime());

			
		
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
	
	
		
}

	
		
	



