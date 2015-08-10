package ppms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.daoimpl.InvocationDaoImp;
import ppms.domain.OrganizationNj;
import ppms.domain.TbInnovation;
import ppms.genericDao.OrganizationNjDAO;
import ppms.genericDao.TbInnovationDAO;
import ppms.service.InvocationService;

@Service
public class InvocationServiceImp implements InvocationService {

	public InvocationServiceImp(){
		
		System.out.println("create");
	}
	@Autowired
	private TbInnovationDAO dao;
	@Autowired
	private OrganizationNjDAO orgDao;
	@Override
	public List<OrganizationNj> getOrganizations() {
		
		return orgDao.findAll();
	}
	@Override
	public boolean addInnovation(TbInnovation innovation) {
		
		try {
			dao.saveObject(innovation);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
}
