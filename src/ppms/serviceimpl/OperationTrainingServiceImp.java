package ppms.serviceimpl;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.domain.TbOperationtraining;
import ppms.genericDao.TbOperationtrainingDAO;
import ppms.service.OperationTrainingService;

@Service
public class OperationTrainingServiceImp  implements OperationTrainingService{

	@Autowired
	private TbOperationtrainingDAO dao;
	@Override
	public boolean delete(String id) {
		
		return dao.delete(new TbOperationtraining(), id);
	}
	@Override
	public TbOperationtraining getEntity(String id) {
		
		List<TbOperationtraining> list = dao.getEntitiestNotLazy(new TbOperationtraining(), new String []{"organizationNj","tbEmployee"}, Restrictions.eq("trainingid", id));
		TbOperationtraining operationtraining;
		if(list.size()>0){
			operationtraining=list.get(0);
			operationtraining.setOrganizationNj(operationtraining.getOrganizationNj().toComplete(dao));
			return operationtraining;
		}
		return null;
	}
	@Override
	public boolean update(TbOperationtraining tbOperationtraining) {
		return dao.update(tbOperationtraining);
	}

}
