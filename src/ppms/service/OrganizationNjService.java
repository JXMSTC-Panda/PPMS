/**  
* @文件名: OrganizationNjService.java 
* @包名: ppms.service
* @描述: TODO 
* @修改人：
* @修改时间：2015-8-13 下午4:47:52 
* @修改内容：

* @version V1.0  
*/ 
package ppms.service;

import java.util.List;

import ppms.domain.OrganizationNj;

/**   
 *    
 * 项目名称：PPMS   
 * 类名称：OrganizationNjService   
 * 类描述：   
 * 创建人：SuperPcf
 * 创建时间：2015-8-13 下午4:47:52   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-13 下午4:47:52   
 * 修改备注：   
 * @version    
 *    
 */
public interface OrganizationNjService {
	
	public List<OrganizationNj> getOrganizationNjs();

}
