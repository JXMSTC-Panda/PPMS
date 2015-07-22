package ppms.domain;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
public class TbMasterDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbMasterDAO.class);
	// property constants
	public static final String TYPE = "type";
	public static final String KEY = "key";
	public static final String VALUE = "value";
	public static final String SEQ = "seq";

	public void save(TbMaster transientInstance) {
		log.debug("saving TbMaster instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbMaster persistentInstance) {
		log.debug("deleting TbMaster instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbMaster findById(java.lang.String id) {
		log.debug("getting TbMaster instance with id: " + id);
		try {
			TbMaster instance = (TbMaster) getSession().get(
					"ppms.domain.TbMaster", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbMaster instance) {
		log.debug("finding TbMaster instance by example");
		try {
			List results = getSession().createCriteria("ppms.domain.TbMaster")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TbMaster instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TbMaster as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByKey(Object key) {
		return findByProperty(KEY, key);
	}

	public List findByValue(Object value) {
		return findByProperty(VALUE, value);
	}

	public List findBySeq(Object seq) {
		return findByProperty(SEQ, seq);
	}

	public List findAll() {
		log.debug("finding all TbMaster instances");
		try {
			String queryString = "from TbMaster";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbMaster merge(TbMaster detachedInstance) {
		log.debug("merging TbMaster instance");
		try {
			TbMaster result = (TbMaster) getSession().merge(detachedInstance);
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
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbMaster instance) {
		log.debug("attaching clean TbMaster instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}