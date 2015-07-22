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
 * TbOperationCheck entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
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
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbOperationCheck persistentInstance) {
		log.debug("deleting TbOperationCheck instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbOperationCheck findById(java.lang.String id) {
		log.debug("getting TbOperationCheck instance with id: " + id);
		try {
			TbOperationCheck instance = (TbOperationCheck) getSession().get(
					"ppms.domain.TbOperationCheck", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbOperationCheck instance) {
		log.debug("finding TbOperationCheck instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbOperationCheck")
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
		log.debug("finding TbOperationCheck instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbOperationCheck as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

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
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbOperationCheck merge(TbOperationCheck detachedInstance) {
		log.debug("merging TbOperationCheck instance");
		try {
			TbOperationCheck result = (TbOperationCheck) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbOperationCheck instance) {
		log.debug("attaching dirty TbOperationCheck instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbOperationCheck instance) {
		log.debug("attaching clean TbOperationCheck instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}