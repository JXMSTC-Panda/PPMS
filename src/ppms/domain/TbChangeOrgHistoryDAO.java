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
 * TbChangeorghistory entities. Transaction control of the save(), update() and
=======
 * TbChangeOrgHistory entities. Transaction control of the save(), update() and
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
<<<<<<< HEAD
 * @see ppms.domain.TbChangeorghistory
 * @author MyEclipse Persistence Tools
 */
public class TbChangeorghistoryDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbChangeorghistoryDAO.class);
	// property constants
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbChangeorghistory transientInstance) {
		log.debug("saving TbChangeorghistory instance");
=======
 * @see ppms.domain.TbChangeOrgHistory
 * @author MyEclipse Persistence Tools
 */
public class TbChangeOrgHistoryDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbChangeOrgHistoryDAO.class);
	// property constants
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";

	public void save(TbChangeOrgHistory transientInstance) {
		log.debug("saving TbChangeOrgHistory instance");
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
	public void delete(TbChangeorghistory persistentInstance) {
		log.debug("deleting TbChangeorghistory instance");
=======
	public void delete(TbChangeOrgHistory persistentInstance) {
		log.debug("deleting TbChangeOrgHistory instance");
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
	public TbChangeorghistory findById(java.lang.String id) {
		log.debug("getting TbChangeorghistory instance with id: " + id);
		try {
			TbChangeorghistory instance = (TbChangeorghistory) getSession()
					.get("ppms.domain.TbChangeorghistory", id);
=======
	public TbChangeOrgHistory findById(java.lang.String id) {
		log.debug("getting TbChangeOrgHistory instance with id: " + id);
		try {
			TbChangeOrgHistory instance = (TbChangeOrgHistory) getSession()
					.get("ppms.domain.TbChangeOrgHistory", id);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public List findByExample(TbChangeorghistory instance) {
		log.debug("finding TbChangeorghistory instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbChangeorghistory")
=======
	public List findByExample(TbChangeOrgHistory instance) {
		log.debug("finding TbChangeOrgHistory instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbChangeOrgHistory")
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
		log.debug("finding TbChangeorghistory instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbChangeorghistory as model where model."
=======
		log.debug("finding TbChangeOrgHistory instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbChangeOrgHistory as model where model."
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
	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbChangeorghistory instances");
		try {
			String queryString = "from TbChangeorghistory";
=======
	public List findByCreatedBy(Object createdBy) {
		return findByProperty(CREATED_BY, createdBy);
	}

	public List findByModifiedBy(Object modifiedBy) {
		return findByProperty(MODIFIED_BY, modifiedBy);
	}

	public List findAll() {
		log.debug("finding all TbChangeOrgHistory instances");
		try {
			String queryString = "from TbChangeOrgHistory";
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public TbChangeorghistory merge(TbChangeorghistory detachedInstance) {
		log.debug("merging TbChangeorghistory instance");
		try {
			TbChangeorghistory result = (TbChangeorghistory) getSession()
=======
	public TbChangeOrgHistory merge(TbChangeOrgHistory detachedInstance) {
		log.debug("merging TbChangeOrgHistory instance");
		try {
			TbChangeOrgHistory result = (TbChangeOrgHistory) getSession()
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
	public void attachDirty(TbChangeorghistory instance) {
		log.debug("attaching dirty TbChangeorghistory instance");
=======
	public void attachDirty(TbChangeOrgHistory instance) {
		log.debug("attaching dirty TbChangeOrgHistory instance");
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
	public void attachClean(TbChangeorghistory instance) {
		log.debug("attaching clean TbChangeorghistory instance");
=======
	public void attachClean(TbChangeOrgHistory instance) {
		log.debug("attaching clean TbChangeOrgHistory instance");
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