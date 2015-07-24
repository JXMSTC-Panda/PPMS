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
 * TbOperationcheck entities. Transaction control of the save(), update() and
=======
 * TbOperationCheck entities. Transaction control of the save(), update() and
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
<<<<<<< HEAD
 * @see ppms.domain.TbOperationcheck
 * @author MyEclipse Persistence Tools
 */
public class TbOperationcheckDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbOperationcheckDAO.class);
	// property constants
	public static final String CUSTOMERMOBILENUMBER = "customermobilenumber";
	public static final String OPERATIONTYPE = "operationtype";
	public static final String PUNISHRESULT = "punishresult";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbOperationcheck transientInstance) {
		log.debug("saving TbOperationcheck instance");
=======
 * @see ppms.domain.TbOperationCheck
 * @author MyEclipse Persistence Tools
 */
public class TbOperationCheckDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbOperationCheckDAO.class);
	// property constants
	public static final String CUSTOMER_MOBILE_NUMBER = "customerMobileNumber";
	public static final String OPERATION_TYPE = "operationType";
	public static final String PUNISH_RESULT = "punishResult";
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";

	public void save(TbOperationCheck transientInstance) {
		log.debug("saving TbOperationCheck instance");
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
	public void delete(TbOperationcheck persistentInstance) {
		log.debug("deleting TbOperationcheck instance");
=======
	public void delete(TbOperationCheck persistentInstance) {
		log.debug("deleting TbOperationCheck instance");
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
	public TbOperationcheck findById(java.lang.String id) {
		log.debug("getting TbOperationcheck instance with id: " + id);
		try {
			TbOperationcheck instance = (TbOperationcheck) getSession().get(
					"ppms.domain.TbOperationcheck", id);
=======
	public TbOperationCheck findById(java.lang.String id) {
		log.debug("getting TbOperationCheck instance with id: " + id);
		try {
			TbOperationCheck instance = (TbOperationCheck) getSession().get(
					"ppms.domain.TbOperationCheck", id);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public List findByExample(TbOperationcheck instance) {
		log.debug("finding TbOperationcheck instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbOperationcheck")
=======
	public List findByExample(TbOperationCheck instance) {
		log.debug("finding TbOperationCheck instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbOperationCheck")
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
		log.debug("finding TbOperationcheck instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbOperationcheck as model where model."
=======
		log.debug("finding TbOperationCheck instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbOperationCheck as model where model."
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
	public List findByCustomermobilenumber(Object customermobilenumber) {
		return findByProperty(CUSTOMERMOBILENUMBER, customermobilenumber);
	}

	public List findByOperationtype(Object operationtype) {
		return findByProperty(OPERATIONTYPE, operationtype);
	}

	public List findByPunishresult(Object punishresult) {
		return findByProperty(PUNISHRESULT, punishresult);
	}

	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbOperationcheck instances");
		try {
			String queryString = "from TbOperationcheck";
=======
	public List findByCustomerMobileNumber(Object customerMobileNumber) {
		return findByProperty(CUSTOMER_MOBILE_NUMBER, customerMobileNumber);
	}

	public List findByOperationType(Object operationType) {
		return findByProperty(OPERATION_TYPE, operationType);
	}

	public List findByPunishResult(Object punishResult) {
		return findByProperty(PUNISH_RESULT, punishResult);
	}

	public List findByCreatedBy(Object createdBy) {
		return findByProperty(CREATED_BY, createdBy);
	}

	public List findByModifiedBy(Object modifiedBy) {
		return findByProperty(MODIFIED_BY, modifiedBy);
	}

	public List findAll() {
		log.debug("finding all TbOperationCheck instances");
		try {
			String queryString = "from TbOperationCheck";
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public TbOperationcheck merge(TbOperationcheck detachedInstance) {
		log.debug("merging TbOperationcheck instance");
		try {
			TbOperationcheck result = (TbOperationcheck) getSession().merge(
=======
	public TbOperationCheck merge(TbOperationCheck detachedInstance) {
		log.debug("merging TbOperationCheck instance");
		try {
			TbOperationCheck result = (TbOperationCheck) getSession().merge(
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
	public void attachDirty(TbOperationcheck instance) {
		log.debug("attaching dirty TbOperationcheck instance");
=======
	public void attachDirty(TbOperationCheck instance) {
		log.debug("attaching dirty TbOperationCheck instance");
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
	public void attachClean(TbOperationcheck instance) {
		log.debug("attaching clean TbOperationcheck instance");
=======
	public void attachClean(TbOperationCheck instance) {
		log.debug("attaching clean TbOperationCheck instance");
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