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
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbStandardcheck persistentInstance) {
		log.debug("deleting TbStandardcheck instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbStandardcheck findById(java.lang.String id) {
		log.debug("getting TbStandardcheck instance with id: " + id);
		try {
			TbStandardcheck instance = (TbStandardcheck) getHibernateTemplate().get(
					"ppms.domain.TbStandardcheck", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}


	public TbStandardcheck merge(TbStandardcheck detachedInstance) {
		log.debug("merging TbStandardcheck instance");
		try {
			TbStandardcheck result = (TbStandardcheck) getHibernateTemplate().merge(
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
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbStandardcheck instance) {
		log.debug("attaching clean TbStandardcheck instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}