package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbVisitcheck;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbVisitcheck entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbVisitcheck
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbVisitcheckDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbVisitcheckDAO.class);
	// property constants
	public static final String FIRSTSCORE = "firstscore";
	public static final String SECONDSCORE = "secondscore";
	public static final String CONSISTENCYSCORE = "consistencyscore";
	public static final String AVERAGESCORE = "averagescore";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbVisitcheck transientInstance) {
		log.debug("saving TbVisitcheck instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbVisitcheck persistentInstance) {
		log.debug("deleting TbVisitcheck instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbVisitcheck findById(java.lang.String id) {
		log.debug("getting TbVisitcheck instance with id: " + id);
		try {
			TbVisitcheck instance = (TbVisitcheck) getHibernateTemplate().get(
					"ppms.domain.TbVisitcheck", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}


	public TbVisitcheck merge(TbVisitcheck detachedInstance) {
		log.debug("merging TbVisitcheck instance");
		try {
			TbVisitcheck result = (TbVisitcheck) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbVisitcheck instance) {
		log.debug("attaching dirty TbVisitcheck instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbVisitcheck instance) {
		log.debug("attaching clean TbVisitcheck instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}