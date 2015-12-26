package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbMountguardexam;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbMountguardexam entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbMountguardexam
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbMountguardexamDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbMountguardexamDAO.class);
	// property constants
	public static final String EXAMTYPE = "examtype";
	public static final String EXAMEXPIRE = "examexpire";
	public static final String EXAMSCORE = "examscore";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbMountguardexam transientInstance) {
		log.debug("saving TbMountguardexam instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbMountguardexam persistentInstance) {
		log.debug("deleting TbMountguardexam instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbMountguardexam findById(java.lang.String id) {
		log.debug("getting TbMountguardexam instance with id: " + id);
		try {
			TbMountguardexam instance = (TbMountguardexam) getHibernateTemplate().get(
					"ppms.domain.TbMountguardexam", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}


	public TbMountguardexam merge(TbMountguardexam detachedInstance) {
		log.debug("merging TbMountguardexam instance");
		try {
			TbMountguardexam result = (TbMountguardexam) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbMountguardexam instance) {
		log.debug("attaching dirty TbMountguardexam instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbMountguardexam instance) {
		log.debug("attaching clean TbMountguardexam instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}