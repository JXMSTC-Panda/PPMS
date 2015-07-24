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
 * A data access object (DAO) providing persistence and search support for
<<<<<<< HEAD
 * TbSubarea entities. Transaction control of the save(), update() and delete()
=======
 * TbSubArea entities. Transaction control of the save(), update() and delete()
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
<<<<<<< HEAD
 * @see ppms.domain.TbSubarea
 * @author MyEclipse Persistence Tools
 */
public class TbSubareaDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbSubareaDAO.class);
	// property constants
	public static final String SUBAREADESC = "subareadesc";
	public static final String STATUS = "status";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbSubarea transientInstance) {
		log.debug("saving TbSubarea instance");
=======
 * @see ppms.domain.TbSubArea
 * @author MyEclipse Persistence Tools
 */
public class TbSubAreaDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbSubAreaDAO.class);
	// property constants
	public static final String SUB_AREA_DESC = "subAreaDesc";
	public static final String STATUS = "status";
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";

	public void save(TbSubArea transientInstance) {
		log.debug("saving TbSubArea instance");
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
	public void delete(TbSubarea persistentInstance) {
		log.debug("deleting TbSubarea instance");
=======
	public void delete(TbSubArea persistentInstance) {
		log.debug("deleting TbSubArea instance");
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
	public TbSubarea findById(java.math.BigDecimal id) {
		log.debug("getting TbSubarea instance with id: " + id);
		try {
			TbSubarea instance = (TbSubarea) getSession().get(
					"ppms.domain.TbSubarea", id);
=======
	public TbSubArea findById(java.math.BigDecimal id) {
		log.debug("getting TbSubArea instance with id: " + id);
		try {
			TbSubArea instance = (TbSubArea) getSession().get(
					"ppms.domain.TbSubArea", id);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public List findByExample(TbSubarea instance) {
		log.debug("finding TbSubarea instance by example");
		try {
			List results = getSession().createCriteria("ppms.domain.TbSubarea")
=======
	public List findByExample(TbSubArea instance) {
		log.debug("finding TbSubArea instance by example");
		try {
			List results = getSession().createCriteria("ppms.domain.TbSubArea")
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
		log.debug("finding TbSubarea instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TbSubarea as model where model."
=======
		log.debug("finding TbSubArea instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TbSubArea as model where model."
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
	public List findBySubareadesc(Object subareadesc) {
		return findByProperty(SUBAREADESC, subareadesc);
=======
	public List findBySubAreaDesc(Object subAreaDesc) {
		return findByProperty(SUB_AREA_DESC, subAreaDesc);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

<<<<<<< HEAD
	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbSubarea instances");
		try {
			String queryString = "from TbSubarea";
=======
	public List findByCreatedBy(Object createdBy) {
		return findByProperty(CREATED_BY, createdBy);
	}

	public List findByModifiedBy(Object modifiedBy) {
		return findByProperty(MODIFIED_BY, modifiedBy);
	}

	public List findAll() {
		log.debug("finding all TbSubArea instances");
		try {
			String queryString = "from TbSubArea";
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public TbSubarea merge(TbSubarea detachedInstance) {
		log.debug("merging TbSubarea instance");
		try {
			TbSubarea result = (TbSubarea) getSession().merge(detachedInstance);
=======
	public TbSubArea merge(TbSubArea detachedInstance) {
		log.debug("merging TbSubArea instance");
		try {
			TbSubArea result = (TbSubArea) getSession().merge(detachedInstance);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public void attachDirty(TbSubarea instance) {
		log.debug("attaching dirty TbSubarea instance");
=======
	public void attachDirty(TbSubArea instance) {
		log.debug("attaching dirty TbSubArea instance");
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
	public void attachClean(TbSubarea instance) {
		log.debug("attaching clean TbSubarea instance");
=======
	public void attachClean(TbSubArea instance) {
		log.debug("attaching clean TbSubArea instance");
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