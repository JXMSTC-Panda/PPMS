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
 * TbVisitcheck entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbVisitcheck
 * @author MyEclipse Persistence Tools
 */
public class TbVisitcheckDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbVisitcheckDAO.class);
	// property constants
	public static final String FIRSTSCORE = "firstscore";
	public static final String SECONDSCORE = "secondscore";
	public static final String CONSISTENCYSCORE = "consistencyscore";
	public static final String AVERAGESCORE = "averagescore";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbVisitcheck transientInstance) {
		log.debug("saving TbVisitcheck instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbVisitcheck persistentInstance) {
		log.debug("deleting TbVisitcheck instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbVisitcheck findById(java.lang.String id) {
		log.debug("getting TbVisitcheck instance with id: " + id);
		try {
			TbVisitcheck instance = (TbVisitcheck) getSession().get(
					"ppms.domain.TbVisitcheck", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbVisitcheck instance) {
		log.debug("finding TbVisitcheck instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbVisitcheck")
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
		log.debug("finding TbVisitcheck instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbVisitcheck as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFirstscore(Object firstscore) {
		return findByProperty(FIRSTSCORE, firstscore);
	}

	public List findBySecondscore(Object secondscore) {
		return findByProperty(SECONDSCORE, secondscore);
	}

	public List findByConsistencyscore(Object consistencyscore) {
		return findByProperty(CONSISTENCYSCORE, consistencyscore);
	}

	public List findByAveragescore(Object averagescore) {
		return findByProperty(AVERAGESCORE, averagescore);
	}

	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbVisitcheck instances");
		try {
			String queryString = "from TbVisitcheck";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbVisitcheck merge(TbVisitcheck detachedInstance) {
		log.debug("merging TbVisitcheck instance");
		try {
			TbVisitcheck result = (TbVisitcheck) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbVisitcheck instance) {
		log.debug("attaching dirty TbVisitcheck instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbVisitcheck instance) {
		log.debug("attaching clean TbVisitcheck instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}