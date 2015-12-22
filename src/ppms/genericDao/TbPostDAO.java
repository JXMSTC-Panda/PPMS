package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbPost;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbPost entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see ppms.domain.TbPost
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbPostDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbPostDAO.class);
	// property constants
	public static final String POSTNAME = "postname";
	public static final String POSTCOMMENT = "postcomment";
	public static final String SEQ = "seq";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbPost transientInstance) {
		log.debug("saving TbPost instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbPost persistentInstance) {
		log.debug("deleting TbPost instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbPost findById(java.lang.String id) {
		log.debug("getting TbPost instance with id: " + id);
		try {
			TbPost instance = (TbPost) getHibernateTemplate().get("ppms.domain.TbPost",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}


	public TbPost merge(TbPost detachedInstance) {
		log.debug("merging TbPost instance");
		try {
			TbPost result = (TbPost) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbPost instance) {
		log.debug("attaching dirty TbPost instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbPost instance) {
		log.debug("attaching clean TbPost instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}