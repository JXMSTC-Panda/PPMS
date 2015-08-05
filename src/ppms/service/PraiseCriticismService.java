package ppms.service;

import java.util.List;

import ppms.domain.TbEmployeepraisecriticism;

public interface PraiseCriticismService {
	
	/*
	 *动态下拉框，根据奖惩类型，动态变化奖惩级别
	 **/
	public List<TbEmployeepraisecriticism> findLevel(int  key);
}
