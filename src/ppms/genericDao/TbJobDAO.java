package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbJob;

/**
 * A data access object (DAO) providing persistence and search support for TbJob
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see ppms.domain.TbJob
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbJobDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbJobDAO.class);
	// property constants
	public static final String JOBNAME = "jobname";
	public static final String JOBCOMMENT = "jobcomment";
	public static final String JOBTYPE = "jobtype";
	public static final String SEQ = "seq";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbJob transientInstance) {
		log.debug("saving TbJob instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbJob persistentInstance) {
		log.debug("deleting TbJob instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbJob findById(java.lang.String id) {
		log.debug("getting TbJob instance with id: " + id);
		try {
			TbJob instance = (TbJob) getHibernateTemplate().get("ppms.domain.TbJob", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}


	public TbJob merge(TbJob detachedInstance) {
		log.debug("merging TbJob instance");
		try {
			TbJob result = (TbJob) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbJob instance) {
		log.debug("attaching dirty TbJob instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	public void attachClean(TbJob instance) {
		log.debug("attaching clean TbJob instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}