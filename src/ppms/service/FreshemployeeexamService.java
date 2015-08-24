
/**  
* @文件名: FreshemployeeexamService.java 
* @包名 ppms.service 
* @描述: TODO 
* @修改人：
* @修改时间：2015-8-21 下午9:01:18 
* @修改内容：

* @version V1.0  
*/ 
package ppms.service;

import java.util.List;

import ppms.domain.TbEmployee;
import ppms.domain.TbFreshemployeeexam;

/**   
 *    
 * 项目名称：PPMS   
 * 类名称：FreshemployeeexamService   
 * 类描述：   
 * 创建人：SuperPcf 
 * 创建时间：2015-8-21 下午9:01:18   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-21 下午9:01:18   
 * 修改备注：   
 * @version    
 *    
 */
public interface FreshemployeeexamService {

	public List<TbFreshemployeeexam> geTbFreshemployeeexams();
	public void addFreshemployeeexam(TbFreshemployeeexam tbFreshemployeeexam);
	/** 
	
	* @方法名: deleteFreshemployeeexam 
	
	* @描述: TODO(这里用一句话描述这个方法的作用) 
	
	* @param     设定文件
	
	* @return void    返回类型
	
	* @throws 
	
	*/ 
	public void deleteFreshemployeeexam(TbFreshemployeeexam tb,String id);
}
