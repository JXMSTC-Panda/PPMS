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
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbFreshemployeeexam persistentInstance) {
		log.debug("deleting TbFreshemployeeexam instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbFreshemployeeexam findById(java.lang.String id) {
		log.debug("getting TbFreshemployeeexam instance with id: " + id);
		try {
			TbFreshemployeeexam instance = (TbFreshemployeeexam) getSession()
					.get("ppms.domain.TbFreshemployeeexam", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbFreshemployeeexam instance) {
		log.debug("finding TbFreshemployeeexam instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbFreshemployeeexam")
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
		log.debug("finding TbFreshemployeeexam instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbFreshemployeeexam as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByExamstage(Object examstage) {
		return findByProperty(EXAMSTAGE, examstage);
	}

	public List findByWeek(Object week) {
		return findByProperty(WEEK, week);
	}

	public List findByExamscore(Object examscore) {
		return findByProperty(EXAMSCORE, examscore);
	}

	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbFreshemployeeexam instances");
		try {
			String queryString = "from TbFreshemployeeexam";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbFreshemployeeexam merge(TbFreshemployeeexam detachedInstance) {
		log.debug("merging TbFreshemployeeexam instance");
		try {
			TbFreshemployeeexam result = (TbFreshemployeeexam) getSession()
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
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbFreshemployeeexam instance) {
		log.debug("attaching clean TbFreshemployeeexam instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}