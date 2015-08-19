package ppms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.daoimpl.OperationMistakeDaoImp;
import ppms.domain.TbOperationcheck;
import ppms.service.OperationMistakeService;
@Service
public class OperationMistakeServiceImp implements OperationMistakeService{

	@Autowired
	private OperationMistakeDaoImp dao;
	/**
	 * 查询业务差错检查成绩
	 * @return
	 */
	@Override
	public List<TbOperationcheck> findOperationcheckInfor(){
		return dao.findOperationcheckInfor();
	}
}
