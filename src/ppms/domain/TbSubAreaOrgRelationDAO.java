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
 * TbSubareaorgrelation entities. Transaction control of the save(), update()
=======
 * TbSubAreaOrgRelation entities. Transaction control of the save(), update()
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
<<<<<<< HEAD
 * @see ppms.domain.TbSubareaorgrelation
 * @author MyEclipse Persistence Tools
 */
public class TbSubareaorgrelationDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbSubareaorgrelationDAO.class);
	// property constants
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbSubareaorgrelation transientInstance) {
		log.debug("saving TbSubareaorgrelation instance");
=======
 * @see ppms.domain.TbSubAreaOrgRelation
 * @author MyEclipse Persistence Tools
 */
public class TbSubAreaOrgRelationDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbSubAreaOrgRelationDAO.class);
	// property constants
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";

	public void save(TbSubAreaOrgRelation transientInstance) {
		log.debug("saving TbSubAreaOrgRelation instance");
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
	public void delete(TbSubareaorgrelation persistentInstance) {
		log.debug("deleting TbSubareaorgrelation instance");
=======
	public void delete(TbSubAreaOrgRelation persistentInstance) {
		log.debug("deleting TbSubAreaOrgRelation instance");
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
	public TbSubareaorgrelation findById(java.lang.Integer id) {
		log.debug("getting TbSubareaorgrelation instance with id: " + id);
		try {
			TbSubareaorgrelation instance = (TbSubareaorgrelation) getSession()
					.get("ppms.domain.TbSubareaorgrelation", id);
=======
	public TbSubAreaOrgRelation findById(java.lang.Integer id) {
		log.debug("getting TbSubAreaOrgRelation instance with id: " + id);
		try {
			TbSubAreaOrgRelation instance = (TbSubAreaOrgRelation) getSession()
					.get("ppms.domain.TbSubAreaOrgRelation", id);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public List findByExample(TbSubareaorgrelation instance) {
		log.debug("finding TbSubareaorgrelation instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbSubareaorgrelation")
=======
	public List findByExample(TbSubAreaOrgRelation instance) {
		log.debug("finding TbSubAreaOrgRelation instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbSubAreaOrgRelation")
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
		log.debug("finding TbSubareaorgrelation instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbSubareaorgrelation as model where model."
=======
		log.debug("finding TbSubAreaOrgRelation instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbSubAreaOrgRelation as model where model."
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
		log.debug("finding all TbSubareaorgrelation instances");
		try {
			String queryString = "from TbSubareaorgrelation";
=======
	public List findByCreatedBy(Object createdBy) {
		return findByProperty(CREATED_BY, createdBy);
	}

	public List findByModifiedBy(Object modifiedBy) {
		return findByProperty(MODIFIED_BY, modifiedBy);
	}

	public List findAll() {
		log.debug("finding all TbSubAreaOrgRelation instances");
		try {
			String queryString = "from TbSubAreaOrgRelation";
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public TbSubareaorgrelation merge(TbSubareaorgrelation detachedInstance) {
		log.debug("merging TbSubareaorgrelation instance");
		try {
			TbSubareaorgrelation result = (TbSubareaorgrelation) getSession()
=======
	public TbSubAreaOrgRelation merge(TbSubAreaOrgRelation detachedInstance) {
		log.debug("merging TbSubAreaOrgRelation instance");
		try {
			TbSubAreaOrgRelation result = (TbSubAreaOrgRelation) getSession()
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
	public void attachDirty(TbSubareaorgrelation instance) {
		log.debug("attaching dirty TbSubareaorgrelation instance");
=======
	public void attachDirty(TbSubAreaOrgRelation instance) {
		log.debug("attaching dirty TbSubAreaOrgRelation instance");
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
	public void attachClean(TbSubareaorgrelation instance) {
		log.debug("attaching clean TbSubareaorgrelation instance");
=======
	public void attachClean(TbSubAreaOrgRelation instance) {
		log.debug("attaching clean TbSubAreaOrgRelation instance");
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