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
 * TbPerformance entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbPerformance
 * @author MyEclipse Persistence Tools
 */
public class TbPerformanceDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbPerformanceDAO.class);
	// property constants
	public static final String PERFORMANCETYPE = "performancetype";
	public static final String PERFORMANCESCORE = "performancescore";
	public static final String REMARK = "remark";
	public static final String GRADESTANDARDORGFILENAME = "gradestandardorgfilename";
	public static final String GRADESTANDARDFILENAME = "gradestandardfilename";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbPerformance transientInstance) {
		log.debug("saving TbPerformance instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbPerformance persistentInstance) {
		log.debug("deleting TbPerformance instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbPerformance findById(java.lang.String id) {
		log.debug("getting TbPerformance instance with id: " + id);
		try {
			TbPerformance instance = (TbPerformance) getSession().get(
					"ppms.domain.TbPerformance", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbPerformance instance) {
		log.debug("finding TbPerformance instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbPerformance")
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
		log.debug("finding TbPerformance instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbPerformance as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPerformancetype(Object performancetype) {
		return findByProperty(PERFORMANCETYPE, performancetype);
	}

	public List findByPerformancescore(Object performancescore) {
		return findByProperty(PERFORMANCESCORE, performancescore);
	}

	public List findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

	public List findByGradestandardorgfilename(Object gradestandardorgfilename) {
		return findByProperty(GRADESTANDARDORGFILENAME,
				gradestandardorgfilename);
	}

	public List findByGradestandardfilename(Object gradestandardfilename) {
		return findByProperty(GRADESTANDARDFILENAME, gradestandardfilename);
	}

	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbPerformance instances");
		try {
			String queryString = "from TbPerformance";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbPerformance merge(TbPerformance detachedInstance) {
		log.debug("merging TbPerformance instance");
		try {
			TbPerformance result = (TbPerformance) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbPerformance instance) {
		log.debug("attaching dirty TbPerformance instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbPerformance instance) {
		log.debug("attaching clean TbPerformance instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}