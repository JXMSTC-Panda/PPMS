
/**  
* @文件名: PerformanceServicelmp.java 
* @包名 ppms.serviceimpl 
* @描述: TODO 
* @修改人：
* @修改时间：2015-8-7 下午4:57:24 
* @修改内容：

* @version V1.0  
*/ 
package ppms.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import ppms.domain.TbPerformance;
import ppms.daoimpl.PerformanceDaolmp;
import ppms.service.PerformanceService;

/**   
 *    
 * 项目名称：PPMS   
 * 类名称：PerformanceServicelmp   
 * 类描述：   
 * 创建人：庞超凡 
 * 创建时间：2015-8-7 下午4:57:24   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-10 上午8:05:25   
  * 修改备注：   
* @version    
*    
*/ 
@Service
public class PerformanceServicelmp implements PerformanceService {

	/** 
	
	* @字段：dao : 绩效表Dao 
	
	*/ 
	private PerformanceDaolmp dao;
	
	
	/**
	 * 
	 */
	public PerformanceServicelmp() {
		super();
		System.out.println("create PerformanceServicelmp");
		
	}

	
	
	/* 
     *
	 * 
	 */
	@Override
	public List<TbPerformance> getTbPerformances() {
		// TODO Auto-generated method stub
		return dao.getpPerformances();
	}

	
	
}
