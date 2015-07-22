package ppms.domain;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbSystemSettings entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbSystemSettings
 * @author MyEclipse Persistence Tools
 */
public class TbSystemSettingsDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbSystemSettingsDAO.class);
	// property constants
	public static final String MASTER_TYPE1 = "masterType1";
	public static final String KEY1 = "key1";
	public static final String MASTER_TYPE2 = "masterType2";
	public static final String KEY2 = "key2";
	public static final String VALUE = "value";
	public static final String VALUE_TYPE = "valueType";
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";

	public void save(TbSystemSettings transientInstance) {
		log.debug("saving TbSystemSettings instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbSystemSettings persistentInstance) {
		log.debug("deleting TbSystemSettings instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbSystemSettings findById(java.lang.String id) {
		log.debug("getting TbSystemSettings instance with id: " + id);
		try {
			TbSystemSettings instance = (TbSystemSettings) getSession().get(
					"ppms.domain.TbSystemSettings", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbSystemSettings instance) {
		log.debug("finding TbSystemSettings instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbSystemSettings")
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
		log.debug("finding TbSystemSettings instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbSystemSettings as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByMasterType1(Object masterType1) {
		return findByProperty(MASTER_TYPE1, masterType1);
	}

	public List findByKey1(Object key1) {
		return findByProperty(KEY1, key1);
	}

	public List findByMasterType2(Object masterType2) {
		return findByProperty(MASTER_TYPE2, masterType2);
	}

	public List findByKey2(Object key2) {
		return findByProperty(KEY2, key2);
	}

	public List findByValue(Object value) {
		return findByProperty(VALUE, value);
	}

	public List findByValueType(Object valueType) {
		return findByProperty(VALUE_TYPE, valueType);
	}

	public List findByCreatedBy(Object createdBy) {
		return findByProperty(CREATED_BY, createdBy);
	}

	public List findByModifiedBy(Object modifiedBy) {
		return findByProperty(MODIFIED_BY, modifiedBy);
	}

	public List findAll() {
		log.debug("finding all TbSystemSettings instances");
		try {
			String queryString = "from TbSystemSettings";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbSystemSettings merge(TbSystemSettings detachedInstance) {
		log.debug("merging TbSystemSettings instance");
		try {
			TbSystemSettings result = (TbSystemSettings) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbSystemSettings instance) {
		log.debug("attaching dirty TbSystemSettings instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbSystemSettings instance) {
		log.debug("attaching clean TbSystemSettings instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}