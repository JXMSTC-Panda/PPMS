package ppms.service;

import ppms.domain.TbOperationtraining;

public interface OperationTrainingService {

	/**
	 * 根据主键删除记录
	 * @param id
	 * @return
	 */
	public boolean delete(String id);
	
	public TbOperationtraining getEntity(String id);
	
	/**
	 * 更新记录
	 * @param tbOperationtraining
	 * @return
	 */
	public boolean update(TbOperationtraining tbOperationtraining);
}
