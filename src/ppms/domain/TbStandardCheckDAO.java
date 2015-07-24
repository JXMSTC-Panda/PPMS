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
 * TbStandardcheck entities. Transaction control of the save(), update() and
=======
 * TbStandardCheck entities. Transaction control of the save(), update() and
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
<<<<<<< HEAD
 * @see ppms.domain.TbStandardcheck
 * @author MyEclipse Persistence Tools
 */
public class TbStandardcheckDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbStandardcheckDAO.class);
	// property constants
	public static final String CHECKSCORE = "checkscore";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbStandardcheck transientInstance) {
		log.debug("saving TbStandardcheck instance");
=======
 * @see ppms.domain.TbStandardCheck
 * @author MyEclipse Persistence Tools
 */
public class TbStandardCheckDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbStandardCheckDAO.class);
	// property constants
	public static final String CHECK_SCORE = "checkScore";
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";

	public void save(TbStandardCheck transientInstance) {
		log.debug("saving TbStandardCheck instance");
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
	public void delete(TbStandardcheck persistentInstance) {
		log.debug("deleting TbStandardcheck instance");
=======
	public void delete(TbStandardCheck persistentInstance) {
		log.debug("deleting TbStandardCheck instance");
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
	public TbStandardcheck findById(java.lang.String id) {
		log.debug("getting TbStandardcheck instance with id: " + id);
		try {
			TbStandardcheck instance = (TbStandardcheck) getSession().get(
					"ppms.domain.TbStandardcheck", id);
=======
	public TbStandardCheck findById(java.lang.String id) {
		log.debug("getting TbStandardCheck instance with id: " + id);
		try {
			TbStandardCheck instance = (TbStandardCheck) getSession().get(
					"ppms.domain.TbStandardCheck", id);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public List findByExample(TbStandardcheck instance) {
		log.debug("finding TbStandardcheck instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbStandardcheck")
=======
	public List findByExample(TbStandardCheck instance) {
		log.debug("finding TbStandardCheck instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbStandardCheck")
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
		log.debug("finding TbStandardcheck instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbStandardcheck as model where model."
=======
		log.debug("finding TbStandardCheck instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbStandardCheck as model where model."
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
	public List findByCheckscore(Object checkscore) {
		return findByProperty(CHECKSCORE, checkscore);
	}

	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbStandardcheck instances");
		try {
			String queryString = "from TbStandardcheck";
=======
	public List findByCheckScore(Object checkScore) {
		return findByProperty(CHECK_SCORE, checkScore);
	}

	public List findByCreatedBy(Object createdBy) {
		return findByProperty(CREATED_BY, createdBy);
	}

	public List findByModifiedBy(Object modifiedBy) {
		return findByProperty(MODIFIED_BY, modifiedBy);
	}

	public List findAll() {
		log.debug("finding all TbStandardCheck instances");
		try {
			String queryString = "from TbStandardCheck";
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public TbStandardcheck merge(TbStandardcheck detachedInstance) {
		log.debug("merging TbStandardcheck instance");
		try {
			TbStandardcheck result = (TbStandardcheck) getSession().merge(
=======
	public TbStandardCheck merge(TbStandardCheck detachedInstance) {
		log.debug("merging TbStandardCheck instance");
		try {
			TbStandardCheck result = (TbStandardCheck) getSession().merge(
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public void attachDirty(TbStandardcheck instance) {
		log.debug("attaching dirty TbStandardcheck instance");
=======
	public void attachDirty(TbStandardCheck instance) {
		log.debug("attaching dirty TbStandardCheck instance");
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
	public void attachClean(TbStandardcheck instance) {
		log.debug("attaching clean TbStandardcheck instance");
=======
	public void attachClean(TbStandardCheck instance) {
		log.debug("attaching clean TbStandardCheck instance");
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