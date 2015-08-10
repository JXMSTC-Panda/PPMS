package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbStandardcheck;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbStandardcheck entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbStandardcheck
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbStandardcheckDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbStandardcheckDAO.class);
	// property constants
	public static final String CHECKSCORE = "checkscore";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbStandardcheck transientInstance) {
		log.debug("saving TbStandardcheck instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbStandardcheck persistentInstance) {
		log.debug("deleting TbStandardcheck instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbStandardcheck findById(java.lang.String id) {
		log.debug("getting TbStandardcheck instance with id: " + id);
		try {
			TbStandardcheck instance = (TbStandardcheck) getSession().get(
					"ppms.domain.TbStandardcheck", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbStandardcheck instance) {
		log.debug("finding TbStandardcheck instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbStandardcheck")
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
		log.debug("finding TbStandardcheck instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbStandardcheck as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCheckscore(Object checkscore) {
		return findByProperty(CHECKSCORE, checkscore);
	}

	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbStandardcheck instances");
		try {
			String queryString = "from TbStandardcheck";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbStandardcheck merge(TbStandardcheck detachedInstance) {
		log.debug("merging TbStandardcheck instance");
		try {
			TbStandardcheck result = (TbStandardcheck) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbStandardcheck instance) {
		log.debug("attaching dirty TbStandardcheck instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbStandardcheck instance) {
		log.debug("attaching clean TbStandardcheck instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}