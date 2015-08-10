package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbMonitorcheck;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbMonitorcheck entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbMonitorcheck
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbMonitorcheckDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbMonitorcheckDAO.class);
	// property constants
	public static final String CHECKTYPE = "checktype";
	public static final String DETAIL = "detail";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbMonitorcheck transientInstance) {
		log.debug("saving TbMonitorcheck instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbMonitorcheck persistentInstance) {
		log.debug("deleting TbMonitorcheck instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbMonitorcheck findById(java.lang.String id) {
		log.debug("getting TbMonitorcheck instance with id: " + id);
		try {
			TbMonitorcheck instance = (TbMonitorcheck) getSession().get(
					"ppms.domain.TbMonitorcheck", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbMonitorcheck instance) {
		log.debug("finding TbMonitorcheck instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbMonitorcheck")
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
		log.debug("finding TbMonitorcheck instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbMonitorcheck as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByChecktype(Object checktype) {
		return findByProperty(CHECKTYPE, checktype);
	}

	public List findByDetail(Object detail) {
		return findByProperty(DETAIL, detail);
	}

	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbMonitorcheck instances");
		try {
			String queryString = "from TbMonitorcheck";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbMonitorcheck merge(TbMonitorcheck detachedInstance) {
		log.debug("merging TbMonitorcheck instance");
		try {
			TbMonitorcheck result = (TbMonitorcheck) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbMonitorcheck instance) {
		log.debug("attaching dirty TbMonitorcheck instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbMonitorcheck instance) {
		log.debug("attaching clean TbMonitorcheck instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}