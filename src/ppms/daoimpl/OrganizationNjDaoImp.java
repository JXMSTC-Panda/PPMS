/**  
* @文件名: OrganizationNjDaoImp.java 
* @包名: ppms.daoimpl
* @描述: TODO 
* @修改人：
* @修改时间：2015-8-13 下午4:54:09 
* @修改内容：

* @version V1.0  
*/ 
package ppms.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sun.org.apache.bcel.internal.generic.NEW;

import ppms.dao.OrganizationNjDao;
import ppms.domain.OrganizationNj;

/**   
 *    
 * 项目名称：PPMS   
 * 类名称：OrganizationNjDaoImp   
 * 类描述：   
 * 创建人：SuperPcf
 * 创建时间：2015-8-13 下午4:54:09   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-13 下午4:54:09   
 * 修改备注：   
 * @version    
 *    
 */
@Repository
public class OrganizationNjDaoImp  extends BaseDaoImp implements OrganizationNjDao {

	
	/* 
	 * 
	 */
	@Override
	public List<OrganizationNj> getOrganizationNjs() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(new OrganizationNj());
	}

	
}
