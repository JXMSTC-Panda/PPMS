package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbSubareaorgrelation;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbSubareaorgrelation entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbSubareaorgrelation
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbSubareaorgrelationDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory
			.getLog(TbSubareaorgrelationDAO.class);
	// property constants
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbSubareaorgrelation transientInstance) {
		log.debug("saving TbSubareaorgrelation instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbSubareaorgrelation persistentInstance) {
		log.debug("deleting TbSubareaorgrelation instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbSubareaorgrelation findById(java.lang.Integer id) {
		log.debug("getting TbSubareaorgrelation instance with id: " + id);
		try {
			TbSubareaorgrelation instance = (TbSubareaorgrelation) getSession()
					.get("ppms.domain.TbSubareaorgrelation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbSubareaorgrelation instance) {
		log.debug("finding TbSubareaorgrelation instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbSubareaorgrelation")
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
		log.debug("finding TbSubareaorgrelation instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbSubareaorgrelation as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

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
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbSubareaorgrelation merge(TbSubareaorgrelation detachedInstance) {
		log.debug("merging TbSubareaorgrelation instance");
		try {
			TbSubareaorgrelation result = (TbSubareaorgrelation) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbSubareaorgrelation instance) {
		log.debug("attaching dirty TbSubareaorgrelation instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbSubareaorgrelation instance) {
		log.debug("attaching clean TbSubareaorgrelation instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}