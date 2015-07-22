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
 * TbChangeOrgHistory entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbChangeOrgHistory
 * @author MyEclipse Persistence Tools
 */
public class TbChangeOrgHistoryDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbChangeOrgHistoryDAO.class);
	// property constants
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";

	public void save(TbChangeOrgHistory transientInstance) {
		log.debug("saving TbChangeOrgHistory instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbChangeOrgHistory persistentInstance) {
		log.debug("deleting TbChangeOrgHistory instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbChangeOrgHistory findById(java.lang.String id) {
		log.debug("getting TbChangeOrgHistory instance with id: " + id);
		try {
			TbChangeOrgHistory instance = (TbChangeOrgHistory) getSession()
					.get("ppms.domain.TbChangeOrgHistory", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbChangeOrgHistory instance) {
		log.debug("finding TbChangeOrgHistory instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbChangeOrgHistory")
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
		log.debug("finding TbChangeOrgHistory instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbChangeOrgHistory as model where model."
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
		log.debug("finding all TbChangeOrgHistory instances");
		try {
			String queryString = "from TbChangeOrgHistory";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbChangeOrgHistory merge(TbChangeOrgHistory detachedInstance) {
		log.debug("merging TbChangeOrgHistory instance");
		try {
			TbChangeOrgHistory result = (TbChangeOrgHistory) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbChangeOrgHistory instance) {
		log.debug("attaching dirty TbChangeOrgHistory instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbChangeOrgHistory instance) {
		log.debug("attaching clean TbChangeOrgHistory instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}