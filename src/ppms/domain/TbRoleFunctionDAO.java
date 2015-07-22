package ppms.domain;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbRoleFunction entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbRoleFunction
 * @author MyEclipse Persistence Tools
 */
public class TbRoleFunctionDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbRoleFunctionDAO.class);
	// property constants
	public static final String EMPLOYEE_SEARCH_SCOPE = "employeeSearchScope";
	public static final String ORG_SEARCH_SCOPE = "orgSearchScope";

	public void save(TbRoleFunction transientInstance) {
		log.debug("saving TbRoleFunction instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbRoleFunction persistentInstance) {
		log.debug("deleting TbRoleFunction instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbRoleFunction findById(ppms.domain.TbRoleFunctionId id) {
		log.debug("getting TbRoleFunction instance with id: " + id);
		try {
			TbRoleFunction instance = (TbRoleFunction) getSession().get(
					"ppms.domain.TbRoleFunction", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbRoleFunction instance) {
		log.debug("finding TbRoleFunction instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbRoleFunction")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TbRoleFunction instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbRoleFunction as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByEmployeeSearchScope(Object employeeSearchScope) {
		return findByProperty(EMPLOYEE_SEARCH_SCOPE, employeeSearchScope);
	}

	public List findByOrgSearchScope(Object orgSearchScope) {
		return findByProperty(ORG_SEARCH_SCOPE, orgSearchScope);
	}

	public List findAll() {
		log.debug("finding all TbRoleFunction instances");
		try {
			String queryString = "from TbRoleFunction";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbRoleFunction merge(TbRoleFunction detachedInstance) {
		log.debug("merging TbRoleFunction instance");
		try {
			TbRoleFunction result = (TbRoleFunction) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbRoleFunction instance) {
		log.debug("attaching dirty TbRoleFunction instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbRoleFunction instance) {
		log.debug("attaching clean TbRoleFunction instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}