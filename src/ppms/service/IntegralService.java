package ppms.service;

import java.util.List;

import ppms.domain.TbPoint;

public interface IntegralService {

	/**
	 * 获取所有合作厅的信息
	 * @return
	 */
	public List<TbPoint> getAllPoints(String pointType);
	
	/**
	 * 根据id删除积分记录
	 * @param id
	 * @return
	 */
	public boolean delete(String id);
}
