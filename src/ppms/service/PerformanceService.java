
/**  
* @文件名: PerformanceService.java 
* @包名 ppms.service 
* @描述: TODO 
* @修改人：
* @修改时间：2015-8-7 下午4:14:29 
* @修改内容：

* @version V1.0  
*/ 
package ppms.service;

import ppms.domain.*;

import java.util.*;

/**   
 *    
 * 项目名称：PPMS   
 * 类名称：PerformanceService   
 * 类描述：   
 * 创建人：SuperPcf
 * 创建时间：2015-8-7 下午4:14:29   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-7 下午4:14:29   
 * 修改备注：   
 * @version    
 *    
 */
public interface PerformanceService {
	
	
	/** 
	
	* @方法名: getTbPerformance 
	
	* @描述: 月度绩效Service
	
	* @param @return    设定文件
	
	* @return List<TbPerformance>    返回类型
	
	* @throws 
	
	*/ 

	public List<TbPerformance>  getPerformances();
	
	/** 
	
	* @方法名: getOrganizationNjs 
	
	* @描述: 在绩效表中查找营业厅表 service
	
	* @param @return    设定文件
	
	* @return List<OrganizationNj>    返回类型
	
	* @throws 
	
	*/ 
	public List<OrganizationNj> getOrganizationNjs(Integer orgid);
	

	
	/** 
	
	* @方法名: addPerformance 
	
	* @描述: 添加Performance绩效记录，成功返回true否则返回false
	
	* @param @param tbPerformance
	* @param @return    设定文件
	
	* @return boolean    返回类型
	
	* @throws 
	
	*/ 
	public boolean addPerformance(TbPerformance performance);

	/** 
	
	* @方法名: getEmployees 
	
	* @描述: TODO(这里用一句话描述这个方法的作用) 
	
	* @param @param employeeid
	* @param @return    设定文件
	
	* @return List<TbEmployee>    返回类型
	
	* @throws 
	
	*/ 
	List<TbEmployee> getEmployees(String employeeid);

	/** 
	
	* @方法名: deletePerformance 
	
	* @描述: TODO(这里用一句话描述这个方法的作用) 
	
	* @param @param performance    设定文件
	
	* @return void    返回类型
	
	* @throws 
	
	*/ 
	void deletePerformance(String performanceid);

	/** 
	
	* @方法名: deletePerformance 
	
	* @描述: TODO(这里用一句话描述这个方法的作用) 
	
	* @param @param persistentInstance    设定文件
	
	* @return void    返回类型
	
	* @throws 
	
	*/ 
	void deletePerformance(TbPerformance persistentInstance);

	/** 
	
	* @方法名: delete 
	
	* @描述: TODO(这里用一句话描述这个方法的作用) 
	
	* @param @param object    设定文件
	
	* @return void    返回类型
	
	* @throws 
	
	*/ 
	void delete(Object object);
}
