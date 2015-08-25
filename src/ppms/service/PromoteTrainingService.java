package ppms.service;

import ppms.domain.TbPromotiontraining;

public interface PromoteTrainingService {

	/**
	 * 根据ID删除
	 * @param id
	 * @return
	 */
	public boolean delete(String id);
	
	/**
	 * 根据ID查找对象
	 * @param id
	 * @return
	 */
	public TbPromotiontraining getEntity(String id);
	
	/**
	 * 更新修改记录
	 * @param tbPromotiontraining
	 * @return
	 */
	public boolean update(TbPromotiontraining tbPromotiontraining);
}
