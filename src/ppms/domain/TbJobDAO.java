package ppms.domain;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for TbJob
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see ppms.domain.TbJob
 * @author MyEclipse Persistence Tools
 */
public class TbJobDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(TbJobDAO.class);
	// property constants
	public static final String JOBNAME = "jobname";
	public static final String JOBCOMMENT = "jobcomment";
	public static final String JOBTYPE = "jobtype";
	public static final String SEQ = "seq";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbJob transientInstance) {
		log.debug("saving TbJob instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbJob persistentInstance) {
		log.debug("deleting TbJob instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbJob findById(java.lang.String id) {
		log.debug("getting TbJob instance with id: " + id);
		try {
			TbJob instance = (TbJob) getSession().get("ppms.domain.TbJob", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbJob instance) {
		log.debug("finding TbJob instance by example");
		try {
			List results = getSession().createCriteria("ppms.domain.TbJob")
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
		log.debug("finding TbJob instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TbJob as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByJobname(Object jobname) {
		return findByProperty(JOBNAME, jobname);
	}

	public List findByJobcomment(Object jobcomment) {
		return findByProperty(JOBCOMMENT, jobcomment);
	}

	public List findByJobtype(Object jobtype) {
		return findByProperty(JOBTYPE, jobtype);
	}

	public List findBySeq(Object seq) {
		return findByProperty(SEQ, seq);
	}

	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbJob instances");
		try {
			String queryString = "from TbJob";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbJob merge(TbJob detachedInstance) {
		log.debug("merging TbJob instance");
		try {
			TbJob result = (TbJob) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbJob instance) {
		log.debug("attaching dirty TbJob instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbJob instance) {
		log.debug("attaching clean TbJob instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}