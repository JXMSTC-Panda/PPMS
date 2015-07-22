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
 * TbOperationTraining entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbOperationTraining
 * @author MyEclipse Persistence Tools
 */
public class TbOperationTrainingDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbOperationTrainingDAO.class);
	// property constants
	public static final String TRAINING_LEVEL = "trainingLevel";
	public static final String TRAINING_CONTENT = "trainingContent";
	public static final String TRAINING_SCORE = "trainingScore";
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";

	public void save(TbOperationTraining transientInstance) {
		log.debug("saving TbOperationTraining instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbOperationTraining persistentInstance) {
		log.debug("deleting TbOperationTraining instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbOperationTraining findById(java.lang.String id) {
		log.debug("getting TbOperationTraining instance with id: " + id);
		try {
			TbOperationTraining instance = (TbOperationTraining) getSession()
					.get("ppms.domain.TbOperationTraining", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbOperationTraining instance) {
		log.debug("finding TbOperationTraining instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbOperationTraining")
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
		log.debug("finding TbOperationTraining instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbOperationTraining as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTrainingLevel(Object trainingLevel) {
		return findByProperty(TRAINING_LEVEL, trainingLevel);
	}

	public List findByTrainingContent(Object trainingContent) {
		return findByProperty(TRAINING_CONTENT, trainingContent);
	}

	public List findByTrainingScore(Object trainingScore) {
		return findByProperty(TRAINING_SCORE, trainingScore);
	}

	public List findByCreatedBy(Object createdBy) {
		return findByProperty(CREATED_BY, createdBy);
	}

	public List findByModifiedBy(Object modifiedBy) {
		return findByProperty(MODIFIED_BY, modifiedBy);
	}

	public List findAll() {
		log.debug("finding all TbOperationTraining instances");
		try {
			String queryString = "from TbOperationTraining";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbOperationTraining merge(TbOperationTraining detachedInstance) {
		log.debug("merging TbOperationTraining instance");
		try {
			TbOperationTraining result = (TbOperationTraining) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbOperationTraining instance) {
		log.debug("attaching dirty TbOperationTraining instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbOperationTraining instance) {
		log.debug("attaching clean TbOperationTraining instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}