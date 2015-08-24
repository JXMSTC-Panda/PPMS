package ppms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.domain.TbVisitcheck;
import ppms.genericDao.TbVisitcheckDAO;
import ppms.service.VisitcheckService;

@Service
public class VisitcheckServiceImp implements VisitcheckService {

	@Autowired
	private TbVisitcheckDAO dao;
	@Override
	public boolean save(TbVisitcheck visitcheck) {
		
		try {
			
			dao.save(visitcheck);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public List<TbVisitcheck> getAll() {
		
		try {
			
			List<TbVisitcheck> list = dao.getEntitiestNotLazy(new TbVisitcheck(), new String[]{"organizationNj"}, null);
			
			if(list.size()>0){
				return list;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
