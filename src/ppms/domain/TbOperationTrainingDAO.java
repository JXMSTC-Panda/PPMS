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
 * TbOperationtraining entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbOperationtraining
 * @author MyEclipse Persistence Tools
 */
public class TbOperationtrainingDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbOperationtrainingDAO.class);
	// property constants
	public static final String TRAININGLEVEL = "traininglevel";
	public static final String TRAININGCONTENT = "trainingcontent";
	public static final String TRAININGSCORE = "trainingscore";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbOperationtraining transientInstance) {
		log.debug("saving TbOperationtraining instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbOperationtraining persistentInstance) {
		log.debug("deleting TbOperationtraining instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbOperationtraining findById(java.lang.String id) {
		log.debug("getting TbOperationtraining instance with id: " + id);
		try {
			TbOperationtraining instance = (TbOperationtraining) getSession()
					.get("ppms.domain.TbOperationtraining", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbOperationtraining instance) {
		log.debug("finding TbOperationtraining instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbOperationtraining")
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
		log.debug("finding TbOperationtraining instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbOperationtraining as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTraininglevel(Object traininglevel) {
		return findByProperty(TRAININGLEVEL, traininglevel);
	}

	public List findByTrainingcontent(Object trainingcontent) {
		return findByProperty(TRAININGCONTENT, trainingcontent);
	}

	public List findByTrainingscore(Object trainingscore) {
		return findByProperty(TRAININGSCORE, trainingscore);
	}

	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbOperationtraining instances");
		try {
			String queryString = "from TbOperationtraining";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbOperationtraining merge(TbOperationtraining detachedInstance) {
		log.debug("merging TbOperationtraining instance");
		try {
			TbOperationtraining result = (TbOperationtraining) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbOperationtraining instance) {
		log.debug("attaching dirty TbOperationtraining instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbOperationtraining instance) {
		log.debug("attaching clean TbOperationtraining instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}