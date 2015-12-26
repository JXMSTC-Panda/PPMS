package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbSystemfunction;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbSystemfunction entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.TbSystemfunction
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbSystemfunctionDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbSystemfunctionDAO.class);
	// property constants
	public static final String FUNCTIONNAME = "functionname";
	public static final String FUNCTIONTYPE = "functiontype";
	public static final String FUNCTIONURL = "functionurl";
	public static final String PARENTFUNCTIONID = "parentfunctionid";
	public static final String SCOPE = "scope";
	public static final String SEQ = "seq";

	public void save(TbSystemfunction transientInstance) {
		log.debug("saving TbSystemfunction instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbSystemfunction persistentInstance) {
		log.debug("deleting TbSystemfunction instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbSystemfunction findById(java.lang.String id) {
		log.debug("getting TbSystemfunction instance with id: " + id);
		try {
			TbSystemfunction instance = (TbSystemfunction) getHibernateTemplate().get(
					"ppms.TbSystemfunction", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}


	public TbSystemfunction merge(TbSystemfunction detachedInstance) {
		log.debug("merging TbSystemfunction instance");
		try {
			TbSystemfunction result = (TbSystemfunction) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbSystemfunction instance) {
		log.debug("attaching dirty TbSystemfunction instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbSystemfunction instance) {
		log.debug("attaching clean TbSystemfunction instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}