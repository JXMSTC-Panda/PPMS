package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbStage;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbStage entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see ppms.domain.TbStage
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbStageDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbStageDAO.class);
	// property constants
	public static final String STAGENAME = "stagename";
	public static final String STAGECOMMENT = "stagecomment";
	public static final String SEQ = "seq";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbStage transientInstance) {
		log.debug("saving TbStage instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbStage persistentInstance) {
		log.debug("deleting TbStage instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbStage findById(java.lang.String id) {
		log.debug("getting TbStage instance with id: " + id);
		try {
			TbStage instance = (TbStage) getHibernateTemplate().get(
					"ppms.domain.TbStage", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}


	public TbStage merge(TbStage detachedInstance) {
		log.debug("merging TbStage instance");
		try {
			TbStage result = (TbStage) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbStage instance) {
		log.debug("attaching dirty TbStage instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbStage instance) {
		log.debug("attaching clean TbStage instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}