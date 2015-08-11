
/**  
* @文件名: PerformanceDaolmp.java 
* @包名 ppms.daoimpl 
* @描述: TODO 
* @修改人：
* @修改时间：2015-8-7 下午5:21:14 
* @修改内容：

* @version V1.0  
*/ 
package ppms.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import ppms.domain.*;
import ppms.dao.PerformanceDao;
import ppms.domain.TbPerformance;

/**   
 *    
 * 项目名称：PPMS   
 * 类名称：PerformanceDaolmp   
 * 类描述：   
 * 创建人：SuperPcf
 * 创建时间：2015-8-7 下午5:21:14   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-7 下午5:21:14   
 * 修改备注：   
 * @version    
 *    
 */
@Repository
public class PerformanceDaolmp extends BaseDaoImp implements PerformanceDao {

	/* (non-Javadoc)
	 * @see ppms.dao.PerformanceDao#getpPerformances()
	 */
	@Override
	public List<TbPerformance> getpPerformances() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(new TbPerformance());
	}

}
