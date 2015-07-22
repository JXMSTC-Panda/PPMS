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
 * TbVisitCheck entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbVisitCheck
 * @author MyEclipse Persistence Tools
 */
public class TbVisitCheckDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbVisitCheckDAO.class);
	// property constants
	public static final String FIRST_SCORE = "firstScore";
	public static final String SECOND_SCORE = "secondScore";
	public static final String CONSISTENCY_SCORE = "consistencyScore";
	public static final String AVERAGE_SCORE = "averageScore";
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";

	public void save(TbVisitCheck transientInstance) {
		log.debug("saving TbVisitCheck instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbVisitCheck persistentInstance) {
		log.debug("deleting TbVisitCheck instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbVisitCheck findById(java.lang.String id) {
		log.debug("getting TbVisitCheck instance with id: " + id);
		try {
			TbVisitCheck instance = (TbVisitCheck) getSession().get(
					"ppms.domain.TbVisitCheck", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbVisitCheck instance) {
		log.debug("finding TbVisitCheck instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbVisitCheck")
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
		log.debug("finding TbVisitCheck instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbVisitCheck as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFirstScore(Object firstScore) {
		return findByProperty(FIRST_SCORE, firstScore);
	}

	public List findBySecondScore(Object secondScore) {
		return findByProperty(SECOND_SCORE, secondScore);
	}

	public List findByConsistencyScore(Object consistencyScore) {
		return findByProperty(CONSISTENCY_SCORE, consistencyScore);
	}

	public List findByAverageScore(Object averageScore) {
		return findByProperty(AVERAGE_SCORE, averageScore);
	}

	public List findByCreatedBy(Object createdBy) {
		return findByProperty(CREATED_BY, createdBy);
	}

	public List findByModifiedBy(Object modifiedBy) {
		return findByProperty(MODIFIED_BY, modifiedBy);
	}

	public List findAll() {
		log.debug("finding all TbVisitCheck instances");
		try {
			String queryString = "from TbVisitCheck";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbVisitCheck merge(TbVisitCheck detachedInstance) {
		log.debug("merging TbVisitCheck instance");
		try {
			TbVisitCheck result = (TbVisitCheck) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbVisitCheck instance) {
		log.debug("attaching dirty TbVisitCheck instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbVisitCheck instance) {
		log.debug("attaching clean TbVisitCheck instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}