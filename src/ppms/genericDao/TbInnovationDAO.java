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

/**
 * A data access object (DAO) providing persistence and search support for
 * TbInnovation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbInnovation
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbInnovationDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbInnovationDAO.class);
	// property constants
	public static final String INNOVATIONCONTENT = "innovationcontent";
	public static final String ASSESSRESULT = "assessresult";
	public static final String ASSESSLEVEL = "assesslevel";
	public static final String ENCOURAGEMENT = "encouragement";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	
	
	public boolean update(TbInnovation innovation){
		Session openSession = null;
		try {
			openSession= this.getSessionFactory().openSession();
			
			openSession.beginTransaction();
			
			TbInnovation load = (TbInnovation) openSession.load(TbInnovation.class,innovation.getInnovationid());
			
			load.setAssessdate(innovation.getAssessdate());
			load.setAssesslevel(innovation.getAssesslevel());
			load.setEncouragement(innovation.getEncouragement());
			load.setInnovationcontent(innovation.getInnovationcontent());
			load.setAssessresult(innovation.getAssessresult());
			
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
	public List<TbInnovation> findbyHsql(String hsql){
		
		log.debug("Hsql:"+hsql);
		return getHibernateTemplate().find(hsql);
	}
	public void save(TbInnovation transientInstance) {
		log.debug("saving TbInnovation instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbInnovation persistentInstance) {
		log.debug("deleting TbInnovation instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbInnovation findById(java.lang.String id) {
		log.debug("getting TbInnovation instance with id: " + id);
		try {
			TbInnovation instance = (TbInnovation) getSession().get(
					"ppms.domain.TbInnovation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbInnovation instance) {
		log.debug("finding TbInnovation instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbInnovation")
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
		log.debug("finding TbInnovation instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbInnovation as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByInnovationcontent(Object innovationcontent) {
		return findByProperty(INNOVATIONCONTENT, innovationcontent);
	}

	public List findByAssessresult(Object assessresult) {
		return findByProperty(ASSESSRESULT, assessresult);
	}

	public List findByAssesslevel(Object assesslevel) {
		return findByProperty(ASSESSLEVEL, assesslevel);
	}

	public List findByEncouragement(Object encouragement) {
		return findByProperty(ENCOURAGEMENT, encouragement);
	}

	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbInnovation instances");
		try {
			String queryString = "from TbInnovation";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbInnovation merge(TbInnovation detachedInstance) {
		log.debug("merging TbInnovation instance");
		try {
			TbInnovation result = (TbInnovation) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbInnovation instance) {
		log.debug("attaching dirty TbInnovation instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbInnovation instance) {
		log.debug("attaching clean TbInnovation instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}