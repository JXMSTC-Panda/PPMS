package ppms.serviceimpl;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.daoimpl.BaseDaoImp;
import ppms.daoimpl.BecomeemployeeexamDaoImp;
import ppms.domain.OrganizationNj;
import ppms.domain.TbBecomeemployeeexam;
import ppms.domain.TbEmployee;
import ppms.service.BecomeemployeeexamService;

@Service
public class BecomeemployeeexamServiceImp  implements BecomeemployeeexamService {
	
	@Autowired
	private BecomeemployeeexamDaoImp dao;

	@Override
	public void addBecomeemployeeexam(Object object) {
		dao.addBecomeemployeeexam(object);
		
	}

	@Override
	public List<TbBecomeemployeeexam> getBecomeemployeeexams() {
		
		return dao.getBecomeemployeeexams();
	}

	@Override
	public List<OrganizationNj> getOrganizationNjs() {
		
		return dao.getOrganizationNjs();
	}

	@Override
	public List<TbEmployee> geTbEmployees() {
		
		return dao.getEmployees();
	}
	
	@Override
	public void deleteBecomeemployeeexam(TbBecomeemployeeexam tb,String id){
		dao.delete(tb, id);
	}
	
	@Override
	public void update(TbBecomeemployeeexam tbBecomeemployeeexam){
		dao.update(tbBecomeemployeeexam);
	}

}
