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
 * TbAreaOrgRelation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
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
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbAreaOrgRelation persistentInstance) {
		log.debug("deleting TbAreaOrgRelation instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbAreaOrgRelation findById(java.lang.Integer id) {
		log.debug("getting TbAreaOrgRelation instance with id: " + id);
		try {
			TbAreaOrgRelation instance = (TbAreaOrgRelation) getSession().get(
					"ppms.domain.TbAreaOrgRelation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbAreaOrgRelation instance) {
		log.debug("finding TbAreaOrgRelation instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbAreaOrgRelation")
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
		log.debug("finding TbAreaOrgRelation instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbAreaOrgRelation as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

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
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbAreaOrgRelation merge(TbAreaOrgRelation detachedInstance) {
		log.debug("merging TbAreaOrgRelation instance");
		try {
			TbAreaOrgRelation result = (TbAreaOrgRelation) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbAreaOrgRelation instance) {
		log.debug("attaching dirty TbAreaOrgRelation instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbAreaOrgRelation instance) {
		log.debug("attaching clean TbAreaOrgRelation instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}