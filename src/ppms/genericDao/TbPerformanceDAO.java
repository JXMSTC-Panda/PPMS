package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbPerformance;

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
@Repository
public class TbPerformanceDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbPerformanceDAO.class);
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
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbPerformance persistentInstance) {
		log.debug("deleting TbPerformance instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbPerformance findById(java.lang.String id) {
		log.debug("getting TbPerformance instance with id: " + id);
		try {
			TbPerformance instance = (TbPerformance) getHibernateTemplate().get(
					"ppms.domain.TbPerformance", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}


	public TbPerformance merge(TbPerformance detachedInstance) {
		log.debug("merging TbPerformance instance");
		try {
			TbPerformance result = (TbPerformance) getHibernateTemplate().merge(
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
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbPerformance instance) {
		log.debug("attaching clean TbPerformance instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}