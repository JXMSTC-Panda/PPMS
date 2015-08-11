package ppms.service;

import java.util.List;

import ppms.domain.TbEmployee;
import ppms.domain.TbEmployeepraisecriticism;

public interface PraiseCriticismService {
	
	/*
	 *动态下拉框，根据奖惩类型，动态变化奖惩级别
	 **/
	public List<TbEmployeepraisecriticism> findLevel(int  key);
	
	/*
	 * 获取数据可中所有的员工信息
	 * */
	public List<TbEmployee> findAllEmployeeInfor();
}
