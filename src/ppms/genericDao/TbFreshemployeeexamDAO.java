package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbFreshemployeeexam;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbFreshemployeeexam entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbFreshemployeeexam
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbFreshemployeeexamDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory
			.getLog(TbFreshemployeeexamDAO.class);
	// property constants
	public static final String EXAMSTAGE = "examstage";
	public static final String WEEK = "week";
	public static final String EXAMSCORE = "examscore";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbFreshemployeeexam transientInstance) {
		log.debug("saving TbFreshemployeeexam instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbFreshemployeeexam persistentInstance) {
		log.debug("deleting TbFreshemployeeexam instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbFreshemployeeexam findById(java.lang.String id) {
		log.debug("getting TbFreshemployeeexam instance with id: " + id);
		try {
			TbFreshemployeeexam instance = (TbFreshemployeeexam) getHibernateTemplate()
					.get("ppms.domain.TbFreshemployeeexam", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}


	public TbFreshemployeeexam merge(TbFreshemployeeexam detachedInstance) {
		log.debug("merging TbFreshemployeeexam instance");
		try {
			TbFreshemployeeexam result = (TbFreshemployeeexam) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbFreshemployeeexam instance) {
		log.debug("attaching dirty TbFreshemployeeexam instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbFreshemployeeexam instance) {
		log.debug("attaching clean TbFreshemployeeexam instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}