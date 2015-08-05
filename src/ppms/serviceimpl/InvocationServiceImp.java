package ppms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.daoimpl.InvocationDaoImp;
import ppms.domain.OrganizationNj;
import ppms.domain.TbInnovation;
import ppms.service.InvocationService;

@Service
public class InvocationServiceImp implements InvocationService {

	public InvocationServiceImp(){
		
		System.out.println("create");
	}
	@Autowired
	private InvocationDaoImp dao;
	@Override
	public List<OrganizationNj> getOrganizations() {
		return dao.getOrganizations();
	}
	@Override
	public boolean addInnovation(TbInnovation innovation) {
		
		dao.saveObject(innovation);
		return false;
	}
	
}
