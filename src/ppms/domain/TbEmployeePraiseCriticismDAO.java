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
<<<<<<< HEAD
 * TbEmployeepraisecriticism entities. Transaction control of the save(),
=======
 * TbEmployeePraiseCriticism entities. Transaction control of the save(),
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
 * update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
<<<<<<< HEAD
 * @see ppms.domain.TbEmployeepraisecriticism
 * @author MyEclipse Persistence Tools
 */
public class TbEmployeepraisecriticismDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbEmployeepraisecriticismDAO.class);
	// property constants
	public static final String PRAISECRITICISMTYPE = "praisecriticismtype";
	public static final String CAUSE = "cause";
	public static final String PRAISECRITICISMLEVEL = "praisecriticismlevel";
	public static final String ORGPRAISECRITICMRELATIONID = "orgpraisecriticmrelationid";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbEmployeepraisecriticism transientInstance) {
		log.debug("saving TbEmployeepraisecriticism instance");
=======
 * @see ppms.domain.TbEmployeePraiseCriticism
 * @author MyEclipse Persistence Tools
 */
public class TbEmployeePraiseCriticismDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbEmployeePraiseCriticismDAO.class);
	// property constants
	public static final String PRAISE_CRITICISM_TYPE = "praiseCriticismType";
	public static final String CAUSE = "cause";
	public static final String PRAISE_CRITICISM_LEVEL = "praiseCriticismLevel";
	public static final String ORG_PRAISE_CRITICM_RELATION_ID = "orgPraiseCriticmRelationId";
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";

	public void save(TbEmployeePraiseCriticism transientInstance) {
		log.debug("saving TbEmployeePraiseCriticism instance");
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public void delete(TbEmployeepraisecriticism persistentInstance) {
		log.debug("deleting TbEmployeepraisecriticism instance");
=======
	public void delete(TbEmployeePraiseCriticism persistentInstance) {
		log.debug("deleting TbEmployeePraiseCriticism instance");
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public TbEmployeepraisecriticism findById(java.lang.String id) {
		log.debug("getting TbEmployeepraisecriticism instance with id: " + id);
		try {
			TbEmployeepraisecriticism instance = (TbEmployeepraisecriticism) getSession()
					.get("ppms.domain.TbEmployeepraisecriticism", id);
=======
	public TbEmployeePraiseCriticism findById(java.lang.String id) {
		log.debug("getting TbEmployeePraiseCriticism instance with id: " + id);
		try {
			TbEmployeePraiseCriticism instance = (TbEmployeePraiseCriticism) getSession()
					.get("ppms.domain.TbEmployeePraiseCriticism", id);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public List findByExample(TbEmployeepraisecriticism instance) {
		log.debug("finding TbEmployeepraisecriticism instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbEmployeepraisecriticism")
=======
	public List findByExample(TbEmployeePraiseCriticism instance) {
		log.debug("finding TbEmployeePraiseCriticism instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbEmployeePraiseCriticism")
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
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
<<<<<<< HEAD
		log.debug("finding TbEmployeepraisecriticism instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbEmployeepraisecriticism as model where model."
=======
		log.debug("finding TbEmployeePraiseCriticism instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbEmployeePraiseCriticism as model where model."
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public List findByPraisecriticismtype(Object praisecriticismtype) {
		return findByProperty(PRAISECRITICISMTYPE, praisecriticismtype);
=======
	public List findByPraiseCriticismType(Object praiseCriticismType) {
		return findByProperty(PRAISE_CRITICISM_TYPE, praiseCriticismType);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public List findByCause(Object cause) {
		return findByProperty(CAUSE, cause);
	}

<<<<<<< HEAD
	public List findByPraisecriticismlevel(Object praisecriticismlevel) {
		return findByProperty(PRAISECRITICISMLEVEL, praisecriticismlevel);
	}

	public List findByOrgpraisecriticmrelationid(
			Object orgpraisecriticmrelationid) {
		return findByProperty(ORGPRAISECRITICMRELATIONID,
				orgpraisecriticmrelationid);
	}

	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbEmployeepraisecriticism instances");
		try {
			String queryString = "from TbEmployeepraisecriticism";
=======
	public List findByPraiseCriticismLevel(Object praiseCriticismLevel) {
		return findByProperty(PRAISE_CRITICISM_LEVEL, praiseCriticismLevel);
	}

	public List findByOrgPraiseCriticmRelationId(
			Object orgPraiseCriticmRelationId) {
		return findByProperty(ORG_PRAISE_CRITICM_RELATION_ID,
				orgPraiseCriticmRelationId);
	}

	public List findByCreatedBy(Object createdBy) {
		return findByProperty(CREATED_BY, createdBy);
	}

	public List findByModifiedBy(Object modifiedBy) {
		return findByProperty(MODIFIED_BY, modifiedBy);
	}

	public List findAll() {
		log.debug("finding all TbEmployeePraiseCriticism instances");
		try {
			String queryString = "from TbEmployeePraiseCriticism";
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public TbEmployeepraisecriticism merge(
			TbEmployeepraisecriticism detachedInstance) {
		log.debug("merging TbEmployeepraisecriticism instance");
		try {
			TbEmployeepraisecriticism result = (TbEmployeepraisecriticism) getSession()
=======
	public TbEmployeePraiseCriticism merge(
			TbEmployeePraiseCriticism detachedInstance) {
		log.debug("merging TbEmployeePraiseCriticism instance");
		try {
			TbEmployeePraiseCriticism result = (TbEmployeePraiseCriticism) getSession()
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public void attachDirty(TbEmployeepraisecriticism instance) {
		log.debug("attaching dirty TbEmployeepraisecriticism instance");
=======
	public void attachDirty(TbEmployeePraiseCriticism instance) {
		log.debug("attaching dirty TbEmployeePraiseCriticism instance");
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public void attachClean(TbEmployeepraisecriticism instance) {
		log.debug("attaching clean TbEmployeepraisecriticism instance");
=======
	public void attachClean(TbEmployeePraiseCriticism instance) {
		log.debug("attaching clean TbEmployeePraiseCriticism instance");
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}