
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
		
		
		return (List<TbPerformance>) getHibernateTemplate();
		//return cri.list();
	}

}
