package ppms.serviceimpl;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.domain.TbMonthexam;
import ppms.genericDao.TbMonthexamDAO;
import ppms.service.monthExamService;

@Service
public class monthExamServiceImp implements monthExamService{

	@Autowired
	private TbMonthexamDAO dao;
	@Override
	public boolean delete(String id) {
		return dao.delete(new TbMonthexam(), id);
	}
	@Override
	public TbMonthexam getEntityById(String id) {
		
		List<TbMonthexam> list = dao.getEntitiestNotLazy(new TbMonthexam(), new String []{"organizationNj","tbEmployee"}, Restrictions.eq("examid", id));
		if(list.size()>0){
			TbMonthexam tbMonthexam = list.get(0);
			tbMonthexam.setOrganizationNj(tbMonthexam.getOrganizationNj().toComplete(dao));
			return tbMonthexam;
		}
		return null;
	}
	@Override
	public boolean update(TbMonthexam tbMonthexam) {
		
		return dao.update(tbMonthexam);
		
	}
	
	
}
