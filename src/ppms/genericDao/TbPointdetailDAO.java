package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbPointdetail;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbPointdetail entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbPointdetail
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbPointdetailDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbPointdetailDAO.class);
	// property constants
	public static final String OPERATIONNAME = "operationname";
	public static final String OPERATIONSCORE = "operationscore";
	public static final String SEQ = "seq";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbPointdetail transientInstance) {
		log.debug("saving TbPointdetail instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbPointdetail persistentInstance) {
		log.debug("deleting TbPointdetail instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbPointdetail findById(java.lang.String id) {
		log.debug("getting TbPointdetail instance with id: " + id);
		try {
			TbPointdetail instance = (TbPointdetail) getHibernateTemplate().get(
					"ppms.domain.TbPointdetail", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}


	public TbPointdetail merge(TbPointdetail detachedInstance) {
		log.debug("merging TbPointdetail instance");
		try {
			TbPointdetail result = (TbPointdetail) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbPointdetail instance) {
		log.debug("attaching dirty TbPointdetail instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbPointdetail instance) {
		log.debug("attaching clean TbPointdetail instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}