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
 * TbChangejobhistory entities. Transaction control of the save(), update() and
=======
 * TbChangeJobHistory entities. Transaction control of the save(), update() and
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
<<<<<<< HEAD
 * @see ppms.domain.TbChangejobhistory
 * @author MyEclipse Persistence Tools
 */
public class TbChangejobhistoryDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbChangejobhistoryDAO.class);
	// property constants
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbChangejobhistory transientInstance) {
		log.debug("saving TbChangejobhistory instance");
=======
 * @see ppms.domain.TbChangeJobHistory
 * @author MyEclipse Persistence Tools
 */
public class TbChangeJobHistoryDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbChangeJobHistoryDAO.class);
	// property constants
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";

	public void save(TbChangeJobHistory transientInstance) {
		log.debug("saving TbChangeJobHistory instance");
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
	public void delete(TbChangejobhistory persistentInstance) {
		log.debug("deleting TbChangejobhistory instance");
=======
	public void delete(TbChangeJobHistory persistentInstance) {
		log.debug("deleting TbChangeJobHistory instance");
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
	public TbChangejobhistory findById(java.lang.String id) {
		log.debug("getting TbChangejobhistory instance with id: " + id);
		try {
			TbChangejobhistory instance = (TbChangejobhistory) getSession()
					.get("ppms.domain.TbChangejobhistory", id);
=======
	public TbChangeJobHistory findById(java.lang.String id) {
		log.debug("getting TbChangeJobHistory instance with id: " + id);
		try {
			TbChangeJobHistory instance = (TbChangeJobHistory) getSession()
					.get("ppms.domain.TbChangeJobHistory", id);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public List findByExample(TbChangejobhistory instance) {
		log.debug("finding TbChangejobhistory instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbChangejobhistory")
=======
	public List findByExample(TbChangeJobHistory instance) {
		log.debug("finding TbChangeJobHistory instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbChangeJobHistory")
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
		log.debug("finding TbChangejobhistory instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbChangejobhistory as model where model."
=======
		log.debug("finding TbChangeJobHistory instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbChangeJobHistory as model where model."
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
		log.debug("finding all TbChangejobhistory instances");
		try {
			String queryString = "from TbChangejobhistory";
=======
	public List findByCreatedBy(Object createdBy) {
		return findByProperty(CREATED_BY, createdBy);
	}

	public List findByModifiedBy(Object modifiedBy) {
		return findByProperty(MODIFIED_BY, modifiedBy);
	}

	public List findAll() {
		log.debug("finding all TbChangeJobHistory instances");
		try {
			String queryString = "from TbChangeJobHistory";
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public TbChangejobhistory merge(TbChangejobhistory detachedInstance) {
		log.debug("merging TbChangejobhistory instance");
		try {
			TbChangejobhistory result = (TbChangejobhistory) getSession()
=======
	public TbChangeJobHistory merge(TbChangeJobHistory detachedInstance) {
		log.debug("merging TbChangeJobHistory instance");
		try {
			TbChangeJobHistory result = (TbChangeJobHistory) getSession()
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
	public void attachDirty(TbChangejobhistory instance) {
		log.debug("attaching dirty TbChangejobhistory instance");
=======
	public void attachDirty(TbChangeJobHistory instance) {
		log.debug("attaching dirty TbChangeJobHistory instance");
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
	public void attachClean(TbChangejobhistory instance) {
		log.debug("attaching clean TbChangejobhistory instance");
=======
	public void attachClean(TbChangeJobHistory instance) {
		log.debug("attaching clean TbChangeJobHistory instance");
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