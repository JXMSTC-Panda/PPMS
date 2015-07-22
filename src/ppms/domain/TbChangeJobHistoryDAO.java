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
 * TbChangeJobHistory entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbChangeJobHistory
 * @author MyEclipse Persistence Tools
 */
public class TbChangeJobHistoryDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbChangeJobHistoryDAO.class);
	// property constants
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";

	public void save(TbChangeJobHistory transientInstance) {
		log.debug("saving TbChangeJobHistory instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbChangeJobHistory persistentInstance) {
		log.debug("deleting TbChangeJobHistory instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbChangeJobHistory findById(java.lang.String id) {
		log.debug("getting TbChangeJobHistory instance with id: " + id);
		try {
			TbChangeJobHistory instance = (TbChangeJobHistory) getSession()
					.get("ppms.domain.TbChangeJobHistory", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbChangeJobHistory instance) {
		log.debug("finding TbChangeJobHistory instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbChangeJobHistory")
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
		log.debug("finding TbChangeJobHistory instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbChangeJobHistory as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCreatedBy(Object createdBy) {
		return findByProperty(CREATED_BY, createdBy);
	}

	public List findByModifiedBy(Object modifiedBy) {
		return findByProperty(MODIFIED_BY, modifiedBy);
	}

	public List findAll() {
		log.debug("finding all TbChangeJobHistory instances");
		try {
			String queryString = "from TbChangeJobHistory";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbChangeJobHistory merge(TbChangeJobHistory detachedInstance) {
		log.debug("merging TbChangeJobHistory instance");
		try {
			TbChangeJobHistory result = (TbChangeJobHistory) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbChangeJobHistory instance) {
		log.debug("attaching dirty TbChangeJobHistory instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbChangeJobHistory instance) {
		log.debug("attaching clean TbChangeJobHistory instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}