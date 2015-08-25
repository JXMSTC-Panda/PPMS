package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbInnovation;
import ppms.domain.TbOperationtraining;

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
@Repository
public class TbOperationtrainingDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory
			.getLog(TbOperationtrainingDAO.class);
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

	public boolean update(TbOperationtraining tbOperationtraining) {
		
		Session openSession = null;
		try {
			openSession= this.getSessionFactory().openSession();
			
			openSession.beginTransaction();
			
			TbOperationtraining load = (TbOperationtraining) openSession.load(TbOperationtraining.class,tbOperationtraining.getTrainingid());
			
			load.setTrainingcontent(tbOperationtraining.getTrainingcontent());
			load.setTraininglevel(tbOperationtraining.getTraininglevel());
			load.setTrainingdate(tbOperationtraining.getTrainingdate());
			load.setTrainingscore(tbOperationtraining.getTrainingscore());
			openSession.update(load);
			
			openSession.getTransaction().commit();
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			openSession.getTransaction().rollback();
			return false;
		}finally{
			openSession.close();
		}
		
	}
}