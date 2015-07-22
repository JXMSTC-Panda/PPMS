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
 * TbPointdetail entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbPointdetail
 * @author MyEclipse Persistence Tools
 */
public class TbPointdetailDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbPointdetailDAO.class);
	// property constants
	public static final String OPERATIONNAME = "operationname";
	public static final String OPERATIONSCORE = "operationscore";
	public static final String SEQ = "seq";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbPointdetail transientInstance) {
		log.debug("saving TbPointdetail instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbPointdetail persistentInstance) {
		log.debug("deleting TbPointdetail instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbPointdetail findById(java.lang.String id) {
		log.debug("getting TbPointdetail instance with id: " + id);
		try {
			TbPointdetail instance = (TbPointdetail) getSession().get(
					"ppms.domain.TbPointdetail", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbPointdetail instance) {
		log.debug("finding TbPointdetail instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbPointdetail")
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
		log.debug("finding TbPointdetail instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbPointdetail as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByOperationname(Object operationname) {
		return findByProperty(OPERATIONNAME, operationname);
	}

	public List findByOperationscore(Object operationscore) {
		return findByProperty(OPERATIONSCORE, operationscore);
	}

	public List findBySeq(Object seq) {
		return findByProperty(SEQ, seq);
	}

	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbPointdetail instances");
		try {
			String queryString = "from TbPointdetail";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbPointdetail merge(TbPointdetail detachedInstance) {
		log.debug("merging TbPointdetail instance");
		try {
			TbPointdetail result = (TbPointdetail) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbPointdetail instance) {
		log.debug("attaching dirty TbPointdetail instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbPointdetail instance) {
		log.debug("attaching clean TbPointdetail instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}