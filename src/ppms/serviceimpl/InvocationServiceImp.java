package ppms.serviceimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.impl.CriteriaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

import ppms.daoimpl.BaseDaoImp;
import ppms.daoimpl.InvocationDaoImp;
import ppms.domain.OrganizationNj;
import ppms.domain.TbInnovation;
import ppms.genericDao.OrganizationNjDAO;
import ppms.genericDao.TbInnovationDAO;
import ppms.service.InvocationService;

@Service
public class InvocationServiceImp implements InvocationService {

	public InvocationServiceImp() {

		System.out.println("create");
	}

	@Autowired
	private TbInnovationDAO dao;
	@Autowired
	private OrganizationNjDAO orgDao;
	@Autowired
	@Qualifier("baseDaoImp")
	private BaseDaoImp baseDao;

	@Override
	public List<Object> getOrganizations() {

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

	@Override
	public List<Object> findAllInnovations() {

		// String hsql="from TbInnovation fetch all properties";
		// return dao.findbyHsql(hsql);

		return baseDao.getEntitiestNotLazy(new TbInnovation(), new String[] {
				"organizationNj", "tbEmployee" });
	}

}
