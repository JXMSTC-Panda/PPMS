package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbOrgpraisecriticism;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbOrgpraisecriticism entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbOrgpraisecriticism
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbOrgpraisecriticismDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory
			.getLog(TbOrgpraisecriticismDAO.class);
	// property constants
	public static final String PRAISECRITICISMTYPE = "praisecriticismtype";
	public static final String CAUSE = "cause";
	public static final String PRAISECRITICISMLEVEL = "praisecriticismlevel";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbOrgpraisecriticism transientInstance) {
		log.debug("saving TbOrgpraisecriticism instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbOrgpraisecriticism persistentInstance) {
		log.debug("deleting TbOrgpraisecriticism instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbOrgpraisecriticism findById(java.lang.String id) {
		log.debug("getting TbOrgpraisecriticism instance with id: " + id);
		try {
			TbOrgpraisecriticism instance = (TbOrgpraisecriticism) getHibernateTemplate()
					.get("ppms.domain.TbOrgpraisecriticism", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}


	public TbOrgpraisecriticism merge(TbOrgpraisecriticism detachedInstance) {
		log.debug("merging TbOrgpraisecriticism instance");
		try {
			TbOrgpraisecriticism result = (TbOrgpraisecriticism) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbOrgpraisecriticism instance) {
		log.debug("attaching dirty TbOrgpraisecriticism instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbOrgpraisecriticism instance) {
		log.debug("attaching clean TbOrgpraisecriticism instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}