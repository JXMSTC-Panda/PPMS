package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbBecomeemployeeexam;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbBecomeemployeeexam entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbBecomeemployeeexam
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbBecomeemployeeexamDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory
			.getLog(TbBecomeemployeeexamDAO.class);
	// property constants
	public static final String EXAMSCORE = "examscore";
	public static final String CHINESEPRINTCOUNT = "chineseprintcount";
	public static final String NUMBERPRINTCOUNT = "numberprintcount";
	public static final String REMARK = "remark";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbBecomeemployeeexam transientInstance) {
		log.debug("saving TbBecomeemployeeexam instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbBecomeemployeeexam persistentInstance) {
		log.debug("deleting TbBecomeemployeeexam instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbBecomeemployeeexam findById(java.lang.String id) {
		log.debug("getting TbBecomeemployeeexam instance with id: " + id);
		try {
			TbBecomeemployeeexam instance = (TbBecomeemployeeexam) getSession()
					.get("ppms.domain.TbBecomeemployeeexam", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbBecomeemployeeexam instance) {
		log.debug("finding TbBecomeemployeeexam instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbBecomeemployeeexam")
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
		log.debug("finding TbBecomeemployeeexam instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbBecomeemployeeexam as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByExamscore(Object examscore) {
		return findByProperty(EXAMSCORE, examscore);
	}

	public List findByChineseprintcount(Object chineseprintcount) {
		return findByProperty(CHINESEPRINTCOUNT, chineseprintcount);
	}

	public List findByNumberprintcount(Object numberprintcount) {
		return findByProperty(NUMBERPRINTCOUNT, numberprintcount);
	}

	public List findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbBecomeemployeeexam instances");
		try {
			String queryString = "from TbBecomeemployeeexam";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbBecomeemployeeexam merge(TbBecomeemployeeexam detachedInstance) {
		log.debug("merging TbBecomeemployeeexam instance");
		try {
			TbBecomeemployeeexam result = (TbBecomeemployeeexam) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbBecomeemployeeexam instance) {
		log.debug("attaching dirty TbBecomeemployeeexam instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbBecomeemployeeexam instance) {
		log.debug("attaching clean TbBecomeemployeeexam instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}