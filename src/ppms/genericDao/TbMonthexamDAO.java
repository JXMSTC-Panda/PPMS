package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbMonthexam;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbMonthexam entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbMonthexam
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbMonthexamDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbMonthexamDAO.class);
	// property constants
	public static final String EXAMSCORE = "examscore";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	
	
	public boolean update(TbMonthexam monthexam){
		Session session = getSessionFactory().openSession();
		
		try {
			
			session.beginTransaction();
			
			TbMonthexam load = (TbMonthexam) session.load(TbMonthexam.class, monthexam.getExamid());
			
			load.setExamdate(monthexam.getExamdate());
			load.setExamscore(monthexam.getExamscore());
			
			session.update(load);
			
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			return false;
		}finally{
			session.close();
		}
	}
	
	public void save(TbMonthexam transientInstance) {
		log.debug("saving TbMonthexam instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbMonthexam persistentInstance) {
		log.debug("deleting TbMonthexam instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbMonthexam findById(java.lang.String id) {
		log.debug("getting TbMonthexam instance with id: " + id);
		try {
			TbMonthexam instance = (TbMonthexam) getHibernateTemplate().get(
					"ppms.domain.TbMonthexam", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}


	public TbMonthexam merge(TbMonthexam detachedInstance) {
		log.debug("merging TbMonthexam instance");
		try {
			TbMonthexam result = (TbMonthexam) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbMonthexam instance) {
		log.debug("attaching dirty TbMonthexam instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbMonthexam instance) {
		log.debug("attaching clean TbMonthexam instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}