package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbChangeorghistory;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbChangeorghistory entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbChangeorghistory
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbChangeorghistoryDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory
			.getLog(TbChangeorghistoryDAO.class);
	// property constants
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbChangeorghistory transientInstance) {
		log.debug("saving TbChangeorghistory instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbChangeorghistory persistentInstance) {
		log.debug("deleting TbChangeorghistory instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbChangeorghistory findById(java.lang.String id) {
		log.debug("getting TbChangeorghistory instance with id: " + id);
		try {
			TbChangeorghistory instance = (TbChangeorghistory) getSession()
					.get("ppms.domain.TbChangeorghistory", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbChangeorghistory instance) {
		log.debug("finding TbChangeorghistory instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbChangeorghistory")
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
		log.debug("finding TbChangeorghistory instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbChangeorghistory as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbChangeorghistory instances");
		try {
			String queryString = "from TbChangeorghistory";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbChangeorghistory merge(TbChangeorghistory detachedInstance) {
		log.debug("merging TbChangeorghistory instance");
		try {
			TbChangeorghistory result = (TbChangeorghistory) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbChangeorghistory instance) {
		log.debug("attaching dirty TbChangeorghistory instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbChangeorghistory instance) {
		log.debug("attaching clean TbChangeorghistory instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}