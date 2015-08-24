package ppms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.domain.TbMonitorcheck;
import ppms.genericDao.TbMonitorcheckDAO;
import ppms.service.MonitorcheckService;

@Service
public class MonitorcheckServiceImp implements MonitorcheckService {

	@Autowired
	private TbMonitorcheckDAO dao;
	@Override
	public boolean save(TbMonitorcheck monitorcheck) {
		
		try {
			dao.save(monitorcheck);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public List<TbMonitorcheck> getAll() {
		
		try {
			
			List<TbMonitorcheck> list = dao.getEntitiestNotLazy(new TbMonitorcheck(), new String []{"organizationNj"}, null);
			
			if(list.size()>0){
				return list;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
