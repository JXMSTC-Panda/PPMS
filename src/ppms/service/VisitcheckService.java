package ppms.service;

import java.util.List;

import ppms.domain.TbVisitcheck;

public interface VisitcheckService {

	/**
	 * 添加暗访成绩
	 * @param visitcheck
	 * @return
	 */
	boolean save(TbVisitcheck visitcheck);
	
	/**
	 * 获取所有的暗访成绩记录
	 * @return
	 */
	public List<TbVisitcheck> getAll();
	
	/**
	 * 删除监控成绩
	 * @param id
	 * @return
	 */
	public boolean delete(String id);
}
