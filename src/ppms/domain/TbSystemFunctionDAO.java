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
 * TbSystemfunction entities. Transaction control of the save(), update() and
=======
 * TbSystemFunction entities. Transaction control of the save(), update() and
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
<<<<<<< HEAD
 * @see ppms.domain.TbSystemfunction
 * @author MyEclipse Persistence Tools
 */
public class TbSystemfunctionDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbSystemfunctionDAO.class);
	// property constants
	public static final String FUNCTIONNAME = "functionname";
	public static final String FUNCTIONTYPE = "functiontype";
	public static final String FUNCTIONURL = "functionurl";
	public static final String PARENTFUNCTIONID = "parentfunctionid";
	public static final String SCOPE = "scope";
	public static final String SEQ = "seq";

	public void save(TbSystemfunction transientInstance) {
		log.debug("saving TbSystemfunction instance");
=======
 * @see ppms.domain.TbSystemFunction
 * @author MyEclipse Persistence Tools
 */
public class TbSystemFunctionDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbSystemFunctionDAO.class);
	// property constants
	public static final String FUNCTION_NAME = "functionName";
	public static final String FUNCTION_TYPE = "functionType";
	public static final String FUNCTION_URL = "functionUrl";
	public static final String PARENT_FUNCTION_ID = "parentFunctionId";
	public static final String SCOPE = "scope";
	public static final String SEQ = "seq";

	public void save(TbSystemFunction transientInstance) {
		log.debug("saving TbSystemFunction instance");
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
	public void delete(TbSystemfunction persistentInstance) {
		log.debug("deleting TbSystemfunction instance");
=======
	public void delete(TbSystemFunction persistentInstance) {
		log.debug("deleting TbSystemFunction instance");
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
	public TbSystemfunction findById(java.lang.String id) {
		log.debug("getting TbSystemfunction instance with id: " + id);
		try {
			TbSystemfunction instance = (TbSystemfunction) getSession().get(
					"ppms.domain.TbSystemfunction", id);
=======
	public TbSystemFunction findById(java.lang.String id) {
		log.debug("getting TbSystemFunction instance with id: " + id);
		try {
			TbSystemFunction instance = (TbSystemFunction) getSession().get(
					"ppms.domain.TbSystemFunction", id);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public List findByExample(TbSystemfunction instance) {
		log.debug("finding TbSystemfunction instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbSystemfunction")
=======
	public List findByExample(TbSystemFunction instance) {
		log.debug("finding TbSystemFunction instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbSystemFunction")
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
		log.debug("finding TbSystemfunction instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbSystemfunction as model where model."
=======
		log.debug("finding TbSystemFunction instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbSystemFunction as model where model."
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
	public List findByFunctionname(Object functionname) {
		return findByProperty(FUNCTIONNAME, functionname);
	}

	public List findByFunctiontype(Object functiontype) {
		return findByProperty(FUNCTIONTYPE, functiontype);
	}

	public List findByFunctionurl(Object functionurl) {
		return findByProperty(FUNCTIONURL, functionurl);
	}

	public List findByParentfunctionid(Object parentfunctionid) {
		return findByProperty(PARENTFUNCTIONID, parentfunctionid);
=======
	public List findByFunctionName(Object functionName) {
		return findByProperty(FUNCTION_NAME, functionName);
	}

	public List findByFunctionType(Object functionType) {
		return findByProperty(FUNCTION_TYPE, functionType);
	}

	public List findByFunctionUrl(Object functionUrl) {
		return findByProperty(FUNCTION_URL, functionUrl);
	}

	public List findByParentFunctionId(Object parentFunctionId) {
		return findByProperty(PARENT_FUNCTION_ID, parentFunctionId);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public List findByScope(Object scope) {
		return findByProperty(SCOPE, scope);
	}

	public List findBySeq(Object seq) {
		return findByProperty(SEQ, seq);
	}

	public List findAll() {
<<<<<<< HEAD
		log.debug("finding all TbSystemfunction instances");
		try {
			String queryString = "from TbSystemfunction";
=======
		log.debug("finding all TbSystemFunction instances");
		try {
			String queryString = "from TbSystemFunction";
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public TbSystemfunction merge(TbSystemfunction detachedInstance) {
		log.debug("merging TbSystemfunction instance");
		try {
			TbSystemfunction result = (TbSystemfunction) getSession().merge(
=======
	public TbSystemFunction merge(TbSystemFunction detachedInstance) {
		log.debug("merging TbSystemFunction instance");
		try {
			TbSystemFunction result = (TbSystemFunction) getSession().merge(
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
	public void attachDirty(TbSystemfunction instance) {
		log.debug("attaching dirty TbSystemfunction instance");
=======
	public void attachDirty(TbSystemFunction instance) {
		log.debug("attaching dirty TbSystemFunction instance");
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
	public void attachClean(TbSystemfunction instance) {
		log.debug("attaching clean TbSystemfunction instance");
=======
	public void attachClean(TbSystemFunction instance) {
		log.debug("attaching clean TbSystemFunction instance");
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