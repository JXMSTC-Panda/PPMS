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
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbMonitorcheck persistentInstance) {
		log.debug("deleting TbMonitorcheck instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbMonitorcheck findById(java.lang.String id) {
		log.debug("getting TbMonitorcheck instance with id: " + id);
		try {
			TbMonitorcheck instance = (TbMonitorcheck) getHibernateTemplate().get(
					"ppms.domain.TbMonitorcheck", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}


	public TbMonitorcheck merge(TbMonitorcheck detachedInstance) {
		log.debug("merging TbMonitorcheck instance");
		try {
			TbMonitorcheck result = (TbMonitorcheck) getHibernateTemplate().merge(
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
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbMonitorcheck instance) {
		log.debug("attaching clean TbMonitorcheck instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}