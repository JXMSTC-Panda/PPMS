package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbRolefunction;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbRolefunction entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbRolefunction
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbRolefunctionDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbRolefunctionDAO.class);
	// property constants
	public static final String EMPLOYEESEARCHSCOPE = "employeesearchscope";
	public static final String ORGSEARCHSCOPE = "orgsearchscope";

	public void save(TbRolefunction transientInstance) {
		log.debug("saving TbRolefunction instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbRolefunction persistentInstance) {
		log.debug("deleting TbRolefunction instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbRolefunction findById(ppms.domain.TbRolefunctionId id) {
		log.debug("getting TbRolefunction instance with id: " + id);
		try {
			TbRolefunction instance = (TbRolefunction) getSession().get(
					"ppms.domain.TbRolefunction", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbRolefunction instance) {
		log.debug("finding TbRolefunction instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbRolefunction")
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
		log.debug("finding TbRolefunction instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbRolefunction as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByEmployeesearchscope(Object employeesearchscope) {
		return findByProperty(EMPLOYEESEARCHSCOPE, employeesearchscope);
	}

	public List findByOrgsearchscope(Object orgsearchscope) {
		return findByProperty(ORGSEARCHSCOPE, orgsearchscope);
	}

	public List findAll() {
		log.debug("finding all TbRolefunction instances");
		try {
			String queryString = "from TbRolefunction";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbRolefunction merge(TbRolefunction detachedInstance) {
		log.debug("merging TbRolefunction instance");
		try {
			TbRolefunction result = (TbRolefunction) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbRolefunction instance) {
		log.debug("attaching dirty TbRolefunction instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbRolefunction instance) {
		log.debug("attaching clean TbRolefunction instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}