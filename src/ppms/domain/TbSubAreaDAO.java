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
 * TbSubArea entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
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
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbSubArea persistentInstance) {
		log.debug("deleting TbSubArea instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbSubArea findById(java.math.BigDecimal id) {
		log.debug("getting TbSubArea instance with id: " + id);
		try {
			TbSubArea instance = (TbSubArea) getSession().get(
					"ppms.domain.TbSubArea", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbSubArea instance) {
		log.debug("finding TbSubArea instance by example");
		try {
			List results = getSession().createCriteria("ppms.domain.TbSubArea")
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
		log.debug("finding TbSubArea instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TbSubArea as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySubAreaDesc(Object subAreaDesc) {
		return findByProperty(SUB_AREA_DESC, subAreaDesc);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

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
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbSubArea merge(TbSubArea detachedInstance) {
		log.debug("merging TbSubArea instance");
		try {
			TbSubArea result = (TbSubArea) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbSubArea instance) {
		log.debug("attaching dirty TbSubArea instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbSubArea instance) {
		log.debug("attaching clean TbSubArea instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}