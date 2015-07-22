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
 * TbOrgpraisecriticism entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbOrgpraisecriticism
 * @author MyEclipse Persistence Tools
 */
public class TbOrgpraisecriticismDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbOrgpraisecriticismDAO.class);
	// property constants
	public static final String PRAISECRITICISMTYPE = "praisecriticismtype";
	public static final String CAUSE = "cause";
	public static final String PRAISECRITICISMLEVEL = "praisecriticismlevel";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbOrgpraisecriticism transientInstance) {
		log.debug("saving TbOrgpraisecriticism instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbOrgpraisecriticism persistentInstance) {
		log.debug("deleting TbOrgpraisecriticism instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbOrgpraisecriticism findById(java.lang.String id) {
		log.debug("getting TbOrgpraisecriticism instance with id: " + id);
		try {
			TbOrgpraisecriticism instance = (TbOrgpraisecriticism) getSession()
					.get("ppms.domain.TbOrgpraisecriticism", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbOrgpraisecriticism instance) {
		log.debug("finding TbOrgpraisecriticism instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbOrgpraisecriticism")
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
		log.debug("finding TbOrgpraisecriticism instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbOrgpraisecriticism as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPraisecriticismtype(Object praisecriticismtype) {
		return findByProperty(PRAISECRITICISMTYPE, praisecriticismtype);
	}

	public List findByCause(Object cause) {
		return findByProperty(CAUSE, cause);
	}

	public List findByPraisecriticismlevel(Object praisecriticismlevel) {
		return findByProperty(PRAISECRITICISMLEVEL, praisecriticismlevel);
	}

	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbOrgpraisecriticism instances");
		try {
			String queryString = "from TbOrgpraisecriticism";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbOrgpraisecriticism merge(TbOrgpraisecriticism detachedInstance) {
		log.debug("merging TbOrgpraisecriticism instance");
		try {
			TbOrgpraisecriticism result = (TbOrgpraisecriticism) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbOrgpraisecriticism instance) {
		log.debug("attaching dirty TbOrgpraisecriticism instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbOrgpraisecriticism instance) {
		log.debug("attaching clean TbOrgpraisecriticism instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}