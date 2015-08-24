package ppms.daoimpl;



import java.util.List;

import org.springframework.stereotype.Repository;

import com.sun.org.apache.bcel.internal.generic.NEW;

import ppms.dao.BecomeemployeeexamDao;
import ppms.domain.OrganizationNj;
import ppms.domain.TbBecomeemployeeexam;
import ppms.domain.TbEmployee;
@Repository
public class BecomeemployeeexamDaoImp extends BaseDaoImp    implements BecomeemployeeexamDao {

	@Override
	public void addBecomeemployeeexam(Object object) {
		getHibernateTemplate().save(object);
		
	}

	@Override
	public List<TbBecomeemployeeexam> getBecomeemployeeexams() {
		
		return getHibernateTemplate().findByExample(new TbBecomeemployeeexam());
	}

	@Override
	public List<OrganizationNj> getOrganizationNjs() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(new OrganizationNj());
		
	}

	@Override
	public List<TbEmployee> getEmployees() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(new TbEmployee());
	}

	
}
