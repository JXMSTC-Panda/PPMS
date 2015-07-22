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
 * TbMonthperformanceopen entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbMonthperformanceopen
 * @author MyEclipse Persistence Tools
 */
public class TbMonthperformanceopenDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbMonthperformanceopenDAO.class);
	// property constants
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbMonthperformanceopen transientInstance) {
		log.debug("saving TbMonthperformanceopen instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbMonthperformanceopen persistentInstance) {
		log.debug("deleting TbMonthperformanceopen instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbMonthperformanceopen findById(java.lang.String id) {
		log.debug("getting TbMonthperformanceopen instance with id: " + id);
		try {
			TbMonthperformanceopen instance = (TbMonthperformanceopen) getSession()
					.get("ppms.domain.TbMonthperformanceopen", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbMonthperformanceopen instance) {
		log.debug("finding TbMonthperformanceopen instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbMonthperformanceopen")
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
		log.debug("finding TbMonthperformanceopen instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbMonthperformanceopen as model where model."
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
		log.debug("finding all TbMonthperformanceopen instances");
		try {
			String queryString = "from TbMonthperformanceopen";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbMonthperformanceopen merge(TbMonthperformanceopen detachedInstance) {
		log.debug("merging TbMonthperformanceopen instance");
		try {
			TbMonthperformanceopen result = (TbMonthperformanceopen) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbMonthperformanceopen instance) {
		log.debug("attaching dirty TbMonthperformanceopen instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbMonthperformanceopen instance) {
		log.debug("attaching clean TbMonthperformanceopen instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}