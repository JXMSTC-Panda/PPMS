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
 * TbRole entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see ppms.domain.TbRole
 * @author MyEclipse Persistence Tools
 */
public class TbRoleDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(TbRoleDAO.class);
	// property constants
<<<<<<< HEAD
	public static final String ROLENAME = "rolename";
	public static final String ADMINISTRATORFLAG = "administratorflag";
	public static final String SEQ = "seq";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";
=======
	public static final String ROLE_NAME = "roleName";
	public static final String ADMINISTRATOR_FLAG = "administratorFlag";
	public static final String SEQ = "seq";
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	public void save(TbRole transientInstance) {
		log.debug("saving TbRole instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbRole persistentInstance) {
		log.debug("deleting TbRole instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbRole findById(java.lang.String id) {
		log.debug("getting TbRole instance with id: " + id);
		try {
			TbRole instance = (TbRole) getSession().get("ppms.domain.TbRole",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbRole instance) {
		log.debug("finding TbRole instance by example");
		try {
			List results = getSession().createCriteria("ppms.domain.TbRole")
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
		log.debug("finding TbRole instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TbRole as model where model."
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
	public List findByRolename(Object rolename) {
		return findByProperty(ROLENAME, rolename);
	}

	public List findByAdministratorflag(Object administratorflag) {
		return findByProperty(ADMINISTRATORFLAG, administratorflag);
=======
	public List findByRoleName(Object roleName) {
		return findByProperty(ROLE_NAME, roleName);
	}

	public List findByAdministratorFlag(Object administratorFlag) {
		return findByProperty(ADMINISTRATOR_FLAG, administratorFlag);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public List findBySeq(Object seq) {
		return findByProperty(SEQ, seq);
	}

<<<<<<< HEAD
	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
=======
	public List findByCreatedBy(Object createdBy) {
		return findByProperty(CREATED_BY, createdBy);
	}

	public List findByModifiedBy(Object modifiedBy) {
		return findByProperty(MODIFIED_BY, modifiedBy);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public List findAll() {
		log.debug("finding all TbRole instances");
		try {
			String queryString = "from TbRole";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbRole merge(TbRole detachedInstance) {
		log.debug("merging TbRole instance");
		try {
			TbRole result = (TbRole) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbRole instance) {
		log.debug("attaching dirty TbRole instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbRole instance) {
		log.debug("attaching clean TbRole instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}