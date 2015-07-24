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
 * TbMonitorcheck entities. Transaction control of the save(), update() and
=======
 * TbMonitorCheck entities. Transaction control of the save(), update() and
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
<<<<<<< HEAD
 * @see ppms.domain.TbMonitorcheck
 * @author MyEclipse Persistence Tools
 */
public class TbMonitorcheckDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbMonitorcheckDAO.class);
	// property constants
	public static final String CHECKTYPE = "checktype";
	public static final String DETAIL = "detail";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbMonitorcheck transientInstance) {
		log.debug("saving TbMonitorcheck instance");
=======
 * @see ppms.domain.TbMonitorCheck
 * @author MyEclipse Persistence Tools
 */
public class TbMonitorCheckDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbMonitorCheckDAO.class);
	// property constants
	public static final String CHECK_TYPE = "checkType";
	public static final String DETAIL = "detail";
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";

	public void save(TbMonitorCheck transientInstance) {
		log.debug("saving TbMonitorCheck instance");
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
	public void delete(TbMonitorcheck persistentInstance) {
		log.debug("deleting TbMonitorcheck instance");
=======
	public void delete(TbMonitorCheck persistentInstance) {
		log.debug("deleting TbMonitorCheck instance");
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
	public TbMonitorcheck findById(java.lang.String id) {
		log.debug("getting TbMonitorcheck instance with id: " + id);
		try {
			TbMonitorcheck instance = (TbMonitorcheck) getSession().get(
					"ppms.domain.TbMonitorcheck", id);
=======
	public TbMonitorCheck findById(java.lang.String id) {
		log.debug("getting TbMonitorCheck instance with id: " + id);
		try {
			TbMonitorCheck instance = (TbMonitorCheck) getSession().get(
					"ppms.domain.TbMonitorCheck", id);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public List findByExample(TbMonitorcheck instance) {
		log.debug("finding TbMonitorcheck instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbMonitorcheck")
=======
	public List findByExample(TbMonitorCheck instance) {
		log.debug("finding TbMonitorCheck instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbMonitorCheck")
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
		log.debug("finding TbMonitorcheck instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbMonitorcheck as model where model."
=======
		log.debug("finding TbMonitorCheck instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbMonitorCheck as model where model."
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
	public List findByChecktype(Object checktype) {
		return findByProperty(CHECKTYPE, checktype);
=======
	public List findByCheckType(Object checkType) {
		return findByProperty(CHECK_TYPE, checkType);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public List findByDetail(Object detail) {
		return findByProperty(DETAIL, detail);
	}

<<<<<<< HEAD
	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbMonitorcheck instances");
		try {
			String queryString = "from TbMonitorcheck";
=======
	public List findByCreatedBy(Object createdBy) {
		return findByProperty(CREATED_BY, createdBy);
	}

	public List findByModifiedBy(Object modifiedBy) {
		return findByProperty(MODIFIED_BY, modifiedBy);
	}

	public List findAll() {
		log.debug("finding all TbMonitorCheck instances");
		try {
			String queryString = "from TbMonitorCheck";
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public TbMonitorcheck merge(TbMonitorcheck detachedInstance) {
		log.debug("merging TbMonitorcheck instance");
		try {
			TbMonitorcheck result = (TbMonitorcheck) getSession().merge(
=======
	public TbMonitorCheck merge(TbMonitorCheck detachedInstance) {
		log.debug("merging TbMonitorCheck instance");
		try {
			TbMonitorCheck result = (TbMonitorCheck) getSession().merge(
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public void attachDirty(TbMonitorcheck instance) {
		log.debug("attaching dirty TbMonitorcheck instance");
=======
	public void attachDirty(TbMonitorCheck instance) {
		log.debug("attaching dirty TbMonitorCheck instance");
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
	public void attachClean(TbMonitorcheck instance) {
		log.debug("attaching clean TbMonitorcheck instance");
=======
	public void attachClean(TbMonitorCheck instance) {
		log.debug("attaching clean TbMonitorCheck instance");
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