package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbMonthperformanceopen;

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
@Repository
public class TbMonthperformanceopenDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory
			.getLog(TbMonthperformanceopenDAO.class);
	// property constants
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbMonthperformanceopen transientInstance) {
		log.debug("saving TbMonthperformanceopen instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbMonthperformanceopen persistentInstance) {
		log.debug("deleting TbMonthperformanceopen instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbMonthperformanceopen findById(java.lang.String id) {
		log.debug("getting TbMonthperformanceopen instance with id: " + id);
		try {
			TbMonthperformanceopen instance = (TbMonthperformanceopen) getHibernateTemplate()
					.get("ppms.domain.TbMonthperformanceopen", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}


	public TbMonthperformanceopen merge(TbMonthperformanceopen detachedInstance) {
		log.debug("merging TbMonthperformanceopen instance");
		try {
			TbMonthperformanceopen result = (TbMonthperformanceopen) getHibernateTemplate()
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
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbMonthperformanceopen instance) {
		log.debug("attaching clean TbMonthperformanceopen instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}