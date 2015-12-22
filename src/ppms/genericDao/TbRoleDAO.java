package ppms.genericDao;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbRole;;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbRole entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see ppms.domain.TbRole
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbRoleDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbRoleDAO.class);
	// property constants
	public static final String ROLENAME = "rolename";
	public static final String ADMINISTRATORFLAG = "administratorflag";
	public static final String SEQ = "seq";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbRole transientInstance) {
		log.debug("saving TbRole instance");
		try {
			getHibernateTemplate().save(transientInstance);
			System.out.println("role save success");
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbRole persistentInstance) {
		log.debug("deleting TbRole instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	
	public void update(TbRole persistentInstance) {
		log.debug("deleting TbRole instance");
		try {
			getHibernateTemplate().update(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbRole findById(java.lang.String id) {
		log.debug("getting TbRole instance with id: " + id);
		try {
			TbRole instance = (TbRole) getHibernateTemplate().get("ppms.domain.TbRole", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}


	public TbRole merge(TbRole detachedInstance) {
		log.debug("merging TbRole instance");
		try {
			TbRole result = (TbRole) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbRole instance) {
		log.debug("attaching dirty TbRole instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbRole instance) {
		log.debug("attaching clean TbRole instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}