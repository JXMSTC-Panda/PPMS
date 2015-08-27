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

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.domain.TbMonthperformanceopen;
import ppms.genericDao.TbMonthperformanceopenDAO;
import ppms.service.MonthperformanceopenService;

/**
 *        项目名称：PPMS   类名称：MonthperformanceopenServiceImp   类描述：   创建人：SuperPcf
 * 创建时间：2015-8-14 上午9:48:22   修改人：（修改人的名字） 修改时间：2015-8-14 上午9:48:22   修改备注：  
 * 
 * @version       
 */

@Service
public class MonthperformanceopenServiceImp implements
		MonthperformanceopenService {

	@Autowired
	private TbMonthperformanceopenDAO dao;

	/**
	 * 添加"营业厅月度绩效开通功能表数据"
	 */
	@Override
	public boolean addMonthperformanceopen(
			TbMonthperformanceopen monthPerformanceopen, Date openMonth) {
		TbMonthperformanceopen tb = dao.findById(monthPerformanceopen
				.getOpenid());
		if (tb != null && tb.getOpenmonth().equals(openMonth)) {

			return false;
		} else {
			if (dao.saveObject(monthPerformanceopen)) {
				return true;
			}
		}
		return true;

	}

	/**
	 * 获取所有的"营业厅月度绩效开通功能表数据"
	 */
	@Override
	public List<TbMonthperformanceopen> getMonthperformanceopens() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
