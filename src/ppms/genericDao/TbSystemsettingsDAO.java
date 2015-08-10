package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbSystemsettings;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbSystemsettings entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbSystemsettings
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbSystemsettingsDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbSystemsettingsDAO.class);
	// property constants
	public static final String MASTERTYPE1 = "mastertype1";
	public static final String KEY1 = "key1";
	public static final String MASTERTYPE2 = "mastertype2";
	public static final String KEY2 = "key2";
	public static final String VALUE = "value";
	public static final String VALUETYPE = "valuetype";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbSystemsettings transientInstance) {
		log.debug("saving TbSystemsettings instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbSystemsettings persistentInstance) {
		log.debug("deleting TbSystemsettings instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbSystemsettings findById(java.lang.String id) {
		log.debug("getting TbSystemsettings instance with id: " + id);
		try {
			TbSystemsettings instance = (TbSystemsettings) getSession().get(
					"ppms.domain.TbSystemsettings", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbSystemsettings instance) {
		log.debug("finding TbSystemsettings instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbSystemsettings")
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
		log.debug("finding TbSystemsettings instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbSystemsettings as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByMastertype1(Object mastertype1) {
		return findByProperty(MASTERTYPE1, mastertype1);
	}

	public List findByKey1(Object key1) {
		return findByProperty(KEY1, key1);
	}

	public List findByMastertype2(Object mastertype2) {
		return findByProperty(MASTERTYPE2, mastertype2);
	}

	public List findByKey2(Object key2) {
		return findByProperty(KEY2, key2);
	}

	public List findByValue(Object value) {
		return findByProperty(VALUE, value);
	}

	public List findByValuetype(Object valuetype) {
		return findByProperty(VALUETYPE, valuetype);
	}

	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbSystemsettings instances");
		try {
			String queryString = "from TbSystemsettings";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbSystemsettings merge(TbSystemsettings detachedInstance) {
		log.debug("merging TbSystemsettings instance");
		try {
			TbSystemsettings result = (TbSystemsettings) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbSystemsettings instance) {
		log.debug("attaching dirty TbSystemsettings instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbSystemsettings instance) {
		log.debug("attaching clean TbSystemsettings instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}