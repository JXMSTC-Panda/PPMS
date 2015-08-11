
/**  
* @文件名: PerformanceDao.java 
* @包名 ppms.dao 
* @描述: TODO 
* @修改人：
* @修改时间：2015-8-7 下午5:01:51 
* @修改内容：

* @version V1.0  
*/ 
package ppms.dao;

import java.util.*;

import ppms.domain.TbPerformance;

/**   
 *    
 * 项目名称：PPMS   
 * 类名称：PerformanceDao   
 * 类描述：   
 * 创建人：SuperPcf
 * 创建时间：2015-8-7 下午5:01:51   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-7 下午5:01:51   
 * 修改备注：   
 * @version    
 *    
 */
public interface PerformanceDao {

	/** 
	
	* @方法名: getpPerformances 
	
	* @描述: 查找遍历绩效表
	
	* @param @return    设定文件
	
	* @return List<TbPerformance>    返回类型
	
	* @throws 
	
	*/ 
	public List<TbPerformance>  getpPerformances();
}
