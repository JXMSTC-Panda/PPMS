package ppms.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import ppms.dao.InvocationDao;
import ppms.domain.OrganizationNj;

@Repository
public class InvocationDaoImp extends BaseDaoImp implements InvocationDao{

	@Override
	public List<OrganizationNj> getOrganizations() {
		
		return getHibernateTemplate().findByExample(new OrganizationNj());
	}
}
