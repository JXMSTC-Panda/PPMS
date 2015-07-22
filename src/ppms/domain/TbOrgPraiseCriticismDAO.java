package ppms.domain;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbOrgPraiseCriticism entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbOrgPraiseCriticism
 * @author MyEclipse Persistence Tools
 */
public class TbOrgPraiseCriticismDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbOrgPraiseCriticismDAO.class);
	// property constants
	public static final String PRAISE_CRITICISM_TYPE = "praiseCriticismType";
	public static final String CAUSE = "cause";
	public static final String PRAISE_CRITICISM_LEVEL = "praiseCriticismLevel";
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";

	public void save(TbOrgPraiseCriticism transientInstance) {
		log.debug("saving TbOrgPraiseCriticism instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbOrgPraiseCriticism persistentInstance) {
		log.debug("deleting TbOrgPraiseCriticism instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbOrgPraiseCriticism findById(java.lang.String id) {
		log.debug("getting TbOrgPraiseCriticism instance with id: " + id);
		try {
			TbOrgPraiseCriticism instance = (TbOrgPraiseCriticism) getSession()
					.get("ppms.domain.TbOrgPraiseCriticism", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbOrgPraiseCriticism instance) {
		log.debug("finding TbOrgPraiseCriticism instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbOrgPraiseCriticism")
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
		log.debug("finding TbOrgPraiseCriticism instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbOrgPraiseCriticism as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPraiseCriticismType(Object praiseCriticismType) {
		return findByProperty(PRAISE_CRITICISM_TYPE, praiseCriticismType);
	}

	public List findByCause(Object cause) {
		return findByProperty(CAUSE, cause);
	}

	public List findByPraiseCriticismLevel(Object praiseCriticismLevel) {
		return findByProperty(PRAISE_CRITICISM_LEVEL, praiseCriticismLevel);
	}

	public List findByCreatedBy(Object createdBy) {
		return findByProperty(CREATED_BY, createdBy);
	}

	public List findByModifiedBy(Object modifiedBy) {
		return findByProperty(MODIFIED_BY, modifiedBy);
	}

	public List findAll() {
		log.debug("finding all TbOrgPraiseCriticism instances");
		try {
			String queryString = "from TbOrgPraiseCriticism";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbOrgPraiseCriticism merge(TbOrgPraiseCriticism detachedInstance) {
		log.debug("merging TbOrgPraiseCriticism instance");
		try {
			TbOrgPraiseCriticism result = (TbOrgPraiseCriticism) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbOrgPraiseCriticism instance) {
		log.debug("attaching dirty TbOrgPraiseCriticism instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbOrgPraiseCriticism instance) {
		log.debug("attaching clean TbOrgPraiseCriticism instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}