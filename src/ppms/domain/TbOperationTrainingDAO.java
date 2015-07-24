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
 * TbOperationtraining entities. Transaction control of the save(), update() and
=======
 * TbOperationTraining entities. Transaction control of the save(), update() and
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
<<<<<<< HEAD
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
=======
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
	public void delete(TbOperationtraining persistentInstance) {
		log.debug("deleting TbOperationtraining instance");
=======
	public void delete(TbOperationTraining persistentInstance) {
		log.debug("deleting TbOperationTraining instance");
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
	public TbOperationtraining findById(java.lang.String id) {
		log.debug("getting TbOperationtraining instance with id: " + id);
		try {
			TbOperationtraining instance = (TbOperationtraining) getSession()
					.get("ppms.domain.TbOperationtraining", id);
=======
	public TbOperationTraining findById(java.lang.String id) {
		log.debug("getting TbOperationTraining instance with id: " + id);
		try {
			TbOperationTraining instance = (TbOperationTraining) getSession()
					.get("ppms.domain.TbOperationTraining", id);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public List findByExample(TbOperationtraining instance) {
		log.debug("finding TbOperationtraining instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbOperationtraining")
=======
	public List findByExample(TbOperationTraining instance) {
		log.debug("finding TbOperationTraining instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbOperationTraining")
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
		log.debug("finding TbOperationtraining instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbOperationtraining as model where model."
=======
		log.debug("finding TbOperationTraining instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbOperationTraining as model where model."
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
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public TbOperationtraining merge(TbOperationtraining detachedInstance) {
		log.debug("merging TbOperationtraining instance");
		try {
			TbOperationtraining result = (TbOperationtraining) getSession()
=======
	public TbOperationTraining merge(TbOperationTraining detachedInstance) {
		log.debug("merging TbOperationTraining instance");
		try {
			TbOperationTraining result = (TbOperationTraining) getSession()
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
	public void attachDirty(TbOperationtraining instance) {
		log.debug("attaching dirty TbOperationtraining instance");
=======
	public void attachDirty(TbOperationTraining instance) {
		log.debug("attaching dirty TbOperationTraining instance");
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
	public void attachClean(TbOperationtraining instance) {
		log.debug("attaching clean TbOperationtraining instance");
=======
	public void attachClean(TbOperationTraining instance) {
		log.debug("attaching clean TbOperationTraining instance");
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