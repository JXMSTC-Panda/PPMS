
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
 * 创建人：庞超凡 
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
	public List<TbPerformance> getTbPerformances();
	
}
