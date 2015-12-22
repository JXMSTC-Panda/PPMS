package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbOperationcheck;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbOperationcheck entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbOperationcheck
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbOperationcheckDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbOperationcheckDAO.class);
	// property constants
	public static final String CUSTOMERMOBILENUMBER = "customermobilenumber";
	public static final String OPERATIONTYPE = "operationtype";
	public static final String PUNISHRESULT = "punishresult";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbOperationcheck transientInstance) {
		log.debug("saving TbOperationcheck instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbOperationcheck persistentInstance) {
		log.debug("deleting TbOperationcheck instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbOperationcheck findById(java.lang.String id) {
		log.debug("getting TbOperationcheck instance with id: " + id);
		try {
			TbOperationcheck instance = (TbOperationcheck) getHibernateTemplate().get(
					"ppms.domain.TbOperationcheck", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}


	public TbOperationcheck merge(TbOperationcheck detachedInstance) {
		log.debug("merging TbOperationcheck instance");
		try {
			TbOperationcheck result = (TbOperationcheck) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbOperationcheck instance) {
		log.debug("attaching dirty TbOperationcheck instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbOperationcheck instance) {
		log.debug("attaching clean TbOperationcheck instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}