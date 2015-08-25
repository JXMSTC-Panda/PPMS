package ppms.dao;

import java.util.List;

import ppms.domain.OrganizationNj;
import ppms.domain.TbBecomeemployeeexam;
import ppms.domain.TbEmployee;

public interface BecomeemployeeexamDao {

	public void addBecomeemployeeexam(Object object);
	
	public List<TbBecomeemployeeexam> getBecomeemployeeexams();
	
	public List<OrganizationNj> getOrganizationNjs();
	
	public List<TbEmployee> getEmployees();
}
