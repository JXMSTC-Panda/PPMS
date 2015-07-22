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
 * TbBecomeEmployeeExam entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.TbBecomeEmployeeExam
 * @author MyEclipse Persistence Tools
 */
public class TbBecomeEmployeeExamDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbBecomeEmployeeExamDAO.class);
	// property constants
	public static final String EXAM_SCORE = "examScore";
	public static final String CHINESE_PRINT_COUNT = "chinesePrintCount";
	public static final String NUMBER_PRINT_COUNT = "numberPrintCount";
	public static final String REMARK = "remark";
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";

	public void save(TbBecomeEmployeeExam transientInstance) {
		log.debug("saving TbBecomeEmployeeExam instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbBecomeEmployeeExam persistentInstance) {
		log.debug("deleting TbBecomeEmployeeExam instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbBecomeEmployeeExam findById(java.lang.String id) {
		log.debug("getting TbBecomeEmployeeExam instance with id: " + id);
		try {
			TbBecomeEmployeeExam instance = (TbBecomeEmployeeExam) getSession()
					.get("ppms.domain.TbBecomeEmployeeExam", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbBecomeEmployeeExam instance) {
		log.debug("finding TbBecomeEmployeeExam instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbBecomeEmployeeExam")
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
		log.debug("finding TbBecomeEmployeeExam instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbBecomeEmployeeExam as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByExamScore(Object examScore) {
		return findByProperty(EXAM_SCORE, examScore);
	}

	public List findByChinesePrintCount(Object chinesePrintCount) {
		return findByProperty(CHINESE_PRINT_COUNT, chinesePrintCount);
	}

	public List findByNumberPrintCount(Object numberPrintCount) {
		return findByProperty(NUMBER_PRINT_COUNT, numberPrintCount);
	}

	public List findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

	public List findByCreatedBy(Object createdBy) {
		return findByProperty(CREATED_BY, createdBy);
	}

	public List findByModifiedBy(Object modifiedBy) {
		return findByProperty(MODIFIED_BY, modifiedBy);
	}

	public List findAll() {
		log.debug("finding all TbBecomeEmployeeExam instances");
		try {
			String queryString = "from TbBecomeEmployeeExam";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbBecomeEmployeeExam merge(TbBecomeEmployeeExam detachedInstance) {
		log.debug("merging TbBecomeEmployeeExam instance");
		try {
			TbBecomeEmployeeExam result = (TbBecomeEmployeeExam) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbBecomeEmployeeExam instance) {
		log.debug("attaching dirty TbBecomeEmployeeExam instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbBecomeEmployeeExam instance) {
		log.debug("attaching clean TbBecomeEmployeeExam instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}