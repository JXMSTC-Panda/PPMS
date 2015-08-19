package ppms.dao;

import java.util.List;

import ppms.domain.TbOperationcheck;

public interface OperationMistakeDao {

	/**
	 * 查询业务差错检查成绩
	 * @return
	 */
	public List<TbOperationcheck> findOperationcheckInfor();
}
