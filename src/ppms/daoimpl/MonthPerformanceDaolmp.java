
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

import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.sun.org.apache.bcel.internal.generic.NEW;

import ppms.domain.*;
import ppms.dao.PerformanceDao;
import ppms.domain.TbPerformance;

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
	
		Session session = getSession();
		
		Criteria cri = session.createCriteria(TbPerformance.class);
		//条件查询当performancetype为false是为月度绩效
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

	/** 
	
	* @方法名: deletePerformance 
	
	* @描述: 删除月度绩效表 
	
	* @param @return    设定文件
	
	* @return boolean    返回类型
	
	* @throws 
	
	*/ 
	@Override
	public void  deletePerformance(String  performanceid){
		
		
		getHibernateTemplate().delete(performanceid);
	}
		
}

	
		
	



