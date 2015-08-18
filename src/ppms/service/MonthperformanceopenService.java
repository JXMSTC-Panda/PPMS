
/**  
* @文件名: MonthperformanceopenService.java 
* @包名 ppms.service 
* @描述: TODO 
* @修改人：
* @修改时间：2015-8-14 上午9:46:30 
* @修改内容：

* @version V1.0  
*/ 
package ppms.service;

import java.util.List;

import ppms.domain.TbMonthperformanceopen;

/**   
 *    
 * 项目名称：PPMS   
 * 类名称：MonthperformanceopenService   
 * 类描述：   
 * 创建人：SuperPcf 
 * 创建时间：2015-8-14 上午9:46:30   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-14 上午9:46:30   
 * 修改备注：   
 * @version    
 *    
 */
public interface MonthperformanceopenService {

	

	/** 
	
	* @方法名: addMonthperformanceopen 
	
	* @描述: TODO(这里用一句话描述这个方法的作用) 
	
	* @param @param monthPerformanceopen
	* @param @return    设定文件
	
	* @return boolean    返回类型
	
	* @throws 
	
	*/ 
	public boolean addMonthperformanceopen(TbMonthperformanceopen monthPerformanceopen);
	
	public List<TbMonthperformanceopen> getMonthperformanceopens();
}
