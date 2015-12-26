package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbPoint;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbPoint entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see ppms.domain.TbPoint
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbPointDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbPointDAO.class);
	// property constants
	public static final String ORGID = "orgid";
	public static final String ORGTYPE = "orgtype";
	public static final String EMPLOYEEPOINT = "employeepoint";
	public static final String EMPLOYEEPERFORMANCE = "employeeperformance";
	public static final String ORGPERFORMANCE = "orgperformance";
	public static final String REGULATEPOINT = "regulatepoint";
	public static final String RANKSEQ = "rankseq";
	public static final String ENCOURAGEMENTMONEY = "encouragementmoney";
	public static final String TAX = "tax";
	public static final String NETINCOME = "netincome";
	public static final String ORGLEVEL = "orglevel";
	public static final String BREACHDEDUCTPOINT = "breachdeductpoint";
	public static final String LASTPOINT = "lastpoint";
	public static final String DEDUCTTAX = "deducttax";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbPoint transientInstance) {
		log.debug("saving TbPoint instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbPoint persistentInstance) {
		log.debug("deleting TbPoint instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbPoint findById(java.lang.String id) {
		log.debug("getting TbPoint instance with id: " + id);
		try {
			TbPoint instance = (TbPoint) getHibernateTemplate().get(
					"ppms.domain.TbPoint", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}


	public TbPoint merge(TbPoint detachedInstance) {
		log.debug("merging TbPoint instance");
		try {
			TbPoint result = (TbPoint) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbPoint instance) {
		log.debug("attaching dirty TbPoint instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbPoint instance) {
		log.debug("attaching clean TbPoint instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}