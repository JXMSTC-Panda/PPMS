
/**  
* @文件名: MonthperformanceopenServiceImp.java 
* @包名 ppms.serviceimpl 
* @描述: TODO 
* @修改人：
* @修改时间：2015-8-14 上午9:48:22 
* @修改内容：

* @version V1.0  
*/ 
package ppms.serviceimpl;



import org.springframework.stereotype.Service;

import ppms.domain.TbMonthperformanceopen;
import ppms.genericDao.TbMonthperformanceopenDAO;
import ppms.service.MonthperformanceopenService;

/**   
 *    
 * 项目名称：PPMS   
 * 类名称：MonthperformanceopenServiceImp   
 * 类描述：   
 * 创建人：SuperPcf 
 * 创建时间：2015-8-14 上午9:48:22   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-14 上午9:48:22   
 * 修改备注：   
 * @version    
 *    
 */
@Service
public class MonthperformanceopenServiceImp implements
		MonthperformanceopenService {

	private TbMonthperformanceopenDAO dao;
	/* (non-Javadoc)
	 * @see ppms.service.MonthperformanceopenService#addMonthperformanceopen()
	 */
	@Override
	public boolean addMonthperformanceopen(TbMonthperformanceopen monthPerformanceopen) {
		
		if(dao.saveObject(monthPerformanceopen)){
			return true;
		}
		return false;
	}
	/* (non-Javadoc)
	 * @see ppms.service.MonthperformanceopenService#addMonthperformanceopen()
	 */
	/* (non-Javadoc)
	 * @see ppms.service.MonthperformanceopenService#addMonthperformanceopen()
	 */
	
	

}
