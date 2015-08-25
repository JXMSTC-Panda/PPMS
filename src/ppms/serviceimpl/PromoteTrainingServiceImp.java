package ppms.serviceimpl;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.domain.TbPromotiontraining;
import ppms.genericDao.TbPromotiontrainingDAO;
import ppms.service.PromoteTrainingService;

@Service
public class PromoteTrainingServiceImp implements PromoteTrainingService {

	@Autowired
	private TbPromotiontrainingDAO dao;
	@Override
	public boolean delete(String id) {
		return dao.delete(new TbPromotiontraining(), id);
	}
	@Override
	public TbPromotiontraining getEntity(String id) {
		
		List<TbPromotiontraining> list = dao.getEntitiestNotLazy(new TbPromotiontraining(), new String[]{"organizationNj","tbEmployee"}, Restrictions.eq("promotiontrainingid", id));
		
		if(list.size()>0){
			
			TbPromotiontraining promotiontraining=list.get(0);
			
			promotiontraining.setOrganizationNj(promotiontraining.getOrganizationNj().toComplete(dao));
			
			return promotiontraining;
		}
		return null;
	}
	@Override
	public boolean update(TbPromotiontraining tbPromotiontraining) {
		return dao.update(tbPromotiontraining);
	}

}
