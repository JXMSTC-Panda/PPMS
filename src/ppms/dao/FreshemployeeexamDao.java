
/**  
* @文件名: FreshemployeeexamDao.java 
* @包名 ppms.dao 
* @描述: TODO 
* @修改人：
* @修改时间：2015-8-21 下午8:56:01 
* @修改内容：

* @version V1.0  
*/ 
package ppms.dao;
import java.util.List;

import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;
import ppms.domain.TbFreshemployeeexam;

/**   
 *    
 * 项目名称：PPMS   
 * 类名称：FreshemployeeexamDao   
 * 类描述：   
 * 创建人：SuperPcf 
 * 创建时间：2015-8-21 下午8:56:01   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-21 下午8:56:01   
 * 修改备注：   
 * @version    
 *    
 */
public interface FreshemployeeexamDao {
	
	public List<TbFreshemployeeexam> getFreshemployeeexam();
	
	public void addFreshemployeeexam(Object object);
	
	List<OrganizationNj> getOrganizations();

	List<TbEmployee> getTbEmployees();

}
