package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbArea;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbArea entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see ppms.domain.TbArea
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbAreaDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbAreaDAO.class);
	// property constants
	public static final String AREADESC = "areadesc";
	public static final String STATUS = "status";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbArea transientInstance) {
		log.debug("saving TbArea instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbArea persistentInstance) {
		log.debug("deleting TbArea instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbArea findById(java.math.BigDecimal id) {
		log.debug("getting TbArea instance with id: " + id);
		try {
			TbArea instance = (TbArea) getHibernateTemplate().get("ppms.domain.TbArea",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public TbArea merge(TbArea detachedInstance) {
		log.debug("merging TbArea instance");
		try {
			TbArea result = (TbArea) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbArea instance) {
		log.debug("attaching dirty TbArea instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbArea instance) {
		log.debug("attaching clean TbArea instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}