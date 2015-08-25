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
import ppms.domain.TbPromotiontraining;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbPromotiontraining entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbPromotiontraining
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbPromotiontrainingDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory
			.getLog(TbPromotiontrainingDAO.class);
	// property constants
	public static final String PROMOTIONCONTENT = "promotioncontent";
	public static final String PROMOTIONSCORE = "promotionscore";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbPromotiontraining transientInstance) {
		log.debug("saving TbPromotiontraining instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbPromotiontraining persistentInstance) {
		log.debug("deleting TbPromotiontraining instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbPromotiontraining findById(java.lang.String id) {
		log.debug("getting TbPromotiontraining instance with id: " + id);
		try {
			TbPromotiontraining instance = (TbPromotiontraining) getSession()
					.get("ppms.domain.TbPromotiontraining", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbPromotiontraining instance) {
		log.debug("finding TbPromotiontraining instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbPromotiontraining")
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
		log.debug("finding TbPromotiontraining instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbPromotiontraining as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPromotioncontent(Object promotioncontent) {
		return findByProperty(PROMOTIONCONTENT, promotioncontent);
	}

	public List findByPromotionscore(Object promotionscore) {
		return findByProperty(PROMOTIONSCORE, promotionscore);
	}

	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbPromotiontraining instances");
		try {
			String queryString = "from TbPromotiontraining";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbPromotiontraining merge(TbPromotiontraining detachedInstance) {
		log.debug("merging TbPromotiontraining instance");
		try {
			TbPromotiontraining result = (TbPromotiontraining) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbPromotiontraining instance) {
		log.debug("attaching dirty TbPromotiontraining instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbPromotiontraining instance) {
		log.debug("attaching clean TbPromotiontraining instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public boolean update(TbPromotiontraining tbPromotiontraining) {
		Session openSession = null;
		try {
			openSession= this.getSessionFactory().openSession();
			
			openSession.beginTransaction();
			
			TbPromotiontraining load = (TbPromotiontraining) openSession.load(TbPromotiontraining.class,tbPromotiontraining.getPromotiontrainingid());
			
			load.setPromotionscore(tbPromotiontraining.getPromotionscore());
			load.setPromotiontrainingdate(tbPromotiontraining.getPromotiontrainingdate());
			load.setPromotioncontent(tbPromotiontraining.getPromotioncontent());
			
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