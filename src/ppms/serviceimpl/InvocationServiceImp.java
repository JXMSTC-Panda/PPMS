package ppms.serviceimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
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

	@Override
	public List<TbInnovation> findAllInnovations() {

		// String hsql="from TbInnovation fetch all properties";
		// return dao.findbyHsql(hsql);

		return dao.getEntitiestNotLazy(new TbInnovation(), new String[] {
				"organizationNj", "tbEmployee" }, null);
	}

	@Override
	public boolean delete(String id) {
		return dao.delete(TbInnovation.class, id);
	}

	@Override
	public boolean update(TbInnovation tbInnovation) {

		
		return dao.update(tbInnovation);
	}

	@Override
	public TbInnovation find(String id) {

		List<TbInnovation> list = dao.getEntitiestNotLazy(new TbInnovation(),
				new String[] { "organizationNj", "tbEmployee" },
				Restrictions.eq("innovationid", id));
		TbInnovation tbInnovation;
		if (list.size() > 0) {
			tbInnovation = list.get(0);
			tbInnovation.setOrganizationNj(tbInnovation.getOrganizationNj()
					.toComplete(dao));
			return tbInnovation;
		}
		return null;
	}

}
