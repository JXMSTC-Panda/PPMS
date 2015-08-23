package ppms.service;

import java.util.List;

import ppms.domain.TbMonitorcheck;

public interface MonitorcheckService {

	
	/**
	 * 保存监控成绩检查记录
	 * @param monitorcheck
	 * @return
	 */
	boolean save(TbMonitorcheck monitorcheck);
	/**
	 * 获取所有监控成绩记录
	 * @return
	 */
	public List<TbMonitorcheck> getAll();
}
