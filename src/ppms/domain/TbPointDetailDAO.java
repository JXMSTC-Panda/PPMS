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
 * TbPointDetail entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbPointDetail
 * @author MyEclipse Persistence Tools
 */
public class TbPointDetailDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbPointDetailDAO.class);
	// property constants
	public static final String OPERATION_NAME = "operationName";
	public static final String OPERATION_SCORE = "operationScore";
	public static final String SEQ = "seq";
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";

	public void save(TbPointDetail transientInstance) {
		log.debug("saving TbPointDetail instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbPointDetail persistentInstance) {
		log.debug("deleting TbPointDetail instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbPointDetail findById(java.lang.String id) {
		log.debug("getting TbPointDetail instance with id: " + id);
		try {
			TbPointDetail instance = (TbPointDetail) getSession().get(
					"ppms.domain.TbPointDetail", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbPointDetail instance) {
		log.debug("finding TbPointDetail instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbPointDetail")
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
		log.debug("finding TbPointDetail instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbPointDetail as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByOperationName(Object operationName) {
		return findByProperty(OPERATION_NAME, operationName);
	}

	public List findByOperationScore(Object operationScore) {
		return findByProperty(OPERATION_SCORE, operationScore);
	}

	public List findBySeq(Object seq) {
		return findByProperty(SEQ, seq);
	}

	public List findByCreatedBy(Object createdBy) {
		return findByProperty(CREATED_BY, createdBy);
	}

	public List findByModifiedBy(Object modifiedBy) {
		return findByProperty(MODIFIED_BY, modifiedBy);
	}

	public List findAll() {
		log.debug("finding all TbPointDetail instances");
		try {
			String queryString = "from TbPointDetail";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbPointDetail merge(TbPointDetail detachedInstance) {
		log.debug("merging TbPointDetail instance");
		try {
			TbPointDetail result = (TbPointDetail) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbPointDetail instance) {
		log.debug("attaching dirty TbPointDetail instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbPointDetail instance) {
		log.debug("attaching clean TbPointDetail instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}