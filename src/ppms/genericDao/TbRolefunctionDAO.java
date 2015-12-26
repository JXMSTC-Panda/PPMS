package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbRolefunction;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbRolefunction entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.TbRolefunction
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbRolefunctionDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbRolefunctionDAO.class);
	// property constants
	public static final String FUNCTIONIDS = "functionids";
	public static final String EMPLOYEESEARCHSCOPE = "employeesearchscope";
	public static final String ORGSEARCHSCOPE = "orgsearchscope";

	public void save(TbRolefunction transientInstance) {
		log.debug("saving TbRolefunction instance");
		try {
			getHibernateTemplate().save(transientInstance);
			System.out.println("rolefunction save success");
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			re.printStackTrace();
			throw re;
		}
	}

	public void delete(TbRolefunction persistentInstance) {
		log.debug("deleting TbRolefunction instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public void update(TbRolefunction persistentInstance) {
		log.debug("deleting TbRolefunction instance");
		try {
			getHibernateTemplate().update(persistentInstance);
			log.debug("delete successful");
			System.out.println("rolefunction update success");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	public TbRolefunction findById(java.lang.String id) {
		log.debug("getting TbRolefunction instance with id: " + id);
		try {
			TbRolefunction instance = (TbRolefunction) getHibernateTemplate().get(
					"ppms.TbRolefunction", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}


	public TbRolefunction merge(TbRolefunction detachedInstance) {
		log.debug("merging TbRolefunction instance");
		try {
			TbRolefunction result = (TbRolefunction) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbRolefunction instance) {
		log.debug("attaching dirty TbRolefunction instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbRolefunction instance) {
		log.debug("attaching clean TbRolefunction instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}