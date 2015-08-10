package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbSubarea;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbSubarea entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see ppms.domain.TbSubarea
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbSubareaDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbSubareaDAO.class);
	// property constants
	public static final String SUBAREADESC = "subareadesc";
	public static final String STATUS = "status";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbSubarea transientInstance) {
		log.debug("saving TbSubarea instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbSubarea persistentInstance) {
		log.debug("deleting TbSubarea instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbSubarea findById(java.math.BigDecimal id) {
		log.debug("getting TbSubarea instance with id: " + id);
		try {
			TbSubarea instance = (TbSubarea) getSession().get(
					"ppms.domain.TbSubarea", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbSubarea instance) {
		log.debug("finding TbSubarea instance by example");
		try {
			List results = getSession().createCriteria("ppms.domain.TbSubarea")
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
		log.debug("finding TbSubarea instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TbSubarea as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySubareadesc(Object subareadesc) {
		return findByProperty(SUBAREADESC, subareadesc);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbSubarea instances");
		try {
			String queryString = "from TbSubarea";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbSubarea merge(TbSubarea detachedInstance) {
		log.debug("merging TbSubarea instance");
		try {
			TbSubarea result = (TbSubarea) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbSubarea instance) {
		log.debug("attaching dirty TbSubarea instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbSubarea instance) {
		log.debug("attaching clean TbSubarea instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}