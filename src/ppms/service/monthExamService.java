package ppms.service;

import ppms.domain.TbMonthexam;

public interface monthExamService {

	/**
	 * 根据主键删除
	 * @param id
	 * @return
	 */
	public boolean delete(String id);
	
	/**
	 * 根据主键查找
	 * @return
	 */
	public TbMonthexam getEntityById(String id);
	
	/**
	 * 更新对象
	 * @param tbMonthexam
	 * @return
	 */
	public boolean update(TbMonthexam tbMonthexam);
}
