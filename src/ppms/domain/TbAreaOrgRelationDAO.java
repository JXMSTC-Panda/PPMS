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
 * TbAreaorgrelation entities. Transaction control of the save(), update() and
=======
 * TbAreaOrgRelation entities. Transaction control of the save(), update() and
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
<<<<<<< HEAD
 * @see ppms.domain.TbAreaorgrelation
 * @author MyEclipse Persistence Tools
 */
public class TbAreaorgrelationDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbAreaorgrelationDAO.class);
	// property constants
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbAreaorgrelation transientInstance) {
		log.debug("saving TbAreaorgrelation instance");
=======
 * @see ppms.domain.TbAreaOrgRelation
 * @author MyEclipse Persistence Tools
 */
public class TbAreaOrgRelationDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbAreaOrgRelationDAO.class);
	// property constants
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";

	public void save(TbAreaOrgRelation transientInstance) {
		log.debug("saving TbAreaOrgRelation instance");
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
	public void delete(TbAreaorgrelation persistentInstance) {
		log.debug("deleting TbAreaorgrelation instance");
=======
	public void delete(TbAreaOrgRelation persistentInstance) {
		log.debug("deleting TbAreaOrgRelation instance");
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
	public TbAreaorgrelation findById(java.lang.Integer id) {
		log.debug("getting TbAreaorgrelation instance with id: " + id);
		try {
			TbAreaorgrelation instance = (TbAreaorgrelation) getSession().get(
					"ppms.domain.TbAreaorgrelation", id);
=======
	public TbAreaOrgRelation findById(java.lang.Integer id) {
		log.debug("getting TbAreaOrgRelation instance with id: " + id);
		try {
			TbAreaOrgRelation instance = (TbAreaOrgRelation) getSession().get(
					"ppms.domain.TbAreaOrgRelation", id);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public List findByExample(TbAreaorgrelation instance) {
		log.debug("finding TbAreaorgrelation instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbAreaorgrelation")
=======
	public List findByExample(TbAreaOrgRelation instance) {
		log.debug("finding TbAreaOrgRelation instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbAreaOrgRelation")
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
		log.debug("finding TbAreaorgrelation instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbAreaorgrelation as model where model."
=======
		log.debug("finding TbAreaOrgRelation instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbAreaOrgRelation as model where model."
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
		log.debug("finding all TbAreaorgrelation instances");
		try {
			String queryString = "from TbAreaorgrelation";
=======
	public List findByCreatedBy(Object createdBy) {
		return findByProperty(CREATED_BY, createdBy);
	}

	public List findByModifiedBy(Object modifiedBy) {
		return findByProperty(MODIFIED_BY, modifiedBy);
	}

	public List findAll() {
		log.debug("finding all TbAreaOrgRelation instances");
		try {
			String queryString = "from TbAreaOrgRelation";
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public TbAreaorgrelation merge(TbAreaorgrelation detachedInstance) {
		log.debug("merging TbAreaorgrelation instance");
		try {
			TbAreaorgrelation result = (TbAreaorgrelation) getSession().merge(
=======
	public TbAreaOrgRelation merge(TbAreaOrgRelation detachedInstance) {
		log.debug("merging TbAreaOrgRelation instance");
		try {
			TbAreaOrgRelation result = (TbAreaOrgRelation) getSession().merge(
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
	public void attachDirty(TbAreaorgrelation instance) {
		log.debug("attaching dirty TbAreaorgrelation instance");
=======
	public void attachDirty(TbAreaOrgRelation instance) {
		log.debug("attaching dirty TbAreaOrgRelation instance");
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
	public void attachClean(TbAreaorgrelation instance) {
		log.debug("attaching clean TbAreaorgrelation instance");
=======
	public void attachClean(TbAreaOrgRelation instance) {
		log.debug("attaching clean TbAreaOrgRelation instance");
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