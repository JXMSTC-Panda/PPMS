package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbMaster;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbMaster entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see ppms.domain.TbMaster
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbMasterDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbMasterDAO.class);
	// property constants
	public static final String TYPE = "type";
	public static final String KEY = "key";
	public static final String VALUE = "value";
	public static final String SEQ = "seq";

	public void save(TbMaster transientInstance) {
		log.debug("saving TbMaster instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbMaster persistentInstance) {
		log.debug("deleting TbMaster instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbMaster findById(java.lang.String id) {
		log.debug("getting TbMaster instance with id: " + id);
		try {
			TbMaster instance = (TbMaster) getHibernateTemplate().get(
					"ppms.domain.TbMaster", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}


	public TbMaster merge(TbMaster detachedInstance) {
		log.debug("merging TbMaster instance");
		try {
			TbMaster result = (TbMaster) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbMaster instance) {
		log.debug("attaching dirty TbMaster instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbMaster instance) {
		log.debug("attaching clean TbMaster instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public List<Object> findByType(String string) {
		String sql="from TbMaster where type="+string;
		return getHibernateTemplate().find(sql);
	}
}