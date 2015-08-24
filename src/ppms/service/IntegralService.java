package ppms.service;

import java.util.List;

import ppms.domain.TbPoint;

public interface IntegralService {

	/**
	 * 获取所有合作厅的信息
	 * @return
	 */
	public List<TbPoint> getAllPoints(String pointType);
}
