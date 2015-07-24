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
 * TbBecomeemployeeexam entities. Transaction control of the save(), update()
=======
 * TbBecomeEmployeeExam entities. Transaction control of the save(), update()
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
<<<<<<< HEAD
 * @see ppms.domain.TbBecomeemployeeexam
 * @author MyEclipse Persistence Tools
 */
public class TbBecomeemployeeexamDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbBecomeemployeeexamDAO.class);
	// property constants
	public static final String EXAMSCORE = "examscore";
	public static final String CHINESEPRINTCOUNT = "chineseprintcount";
	public static final String NUMBERPRINTCOUNT = "numberprintcount";
	public static final String REMARK = "remark";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbBecomeemployeeexam transientInstance) {
		log.debug("saving TbBecomeemployeeexam instance");
=======
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
	public void delete(TbBecomeemployeeexam persistentInstance) {
		log.debug("deleting TbBecomeemployeeexam instance");
=======
	public void delete(TbBecomeEmployeeExam persistentInstance) {
		log.debug("deleting TbBecomeEmployeeExam instance");
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
	public TbBecomeemployeeexam findById(java.lang.String id) {
		log.debug("getting TbBecomeemployeeexam instance with id: " + id);
		try {
			TbBecomeemployeeexam instance = (TbBecomeemployeeexam) getSession()
					.get("ppms.domain.TbBecomeemployeeexam", id);
=======
	public TbBecomeEmployeeExam findById(java.lang.String id) {
		log.debug("getting TbBecomeEmployeeExam instance with id: " + id);
		try {
			TbBecomeEmployeeExam instance = (TbBecomeEmployeeExam) getSession()
					.get("ppms.domain.TbBecomeEmployeeExam", id);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public List findByExample(TbBecomeemployeeexam instance) {
		log.debug("finding TbBecomeemployeeexam instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbBecomeemployeeexam")
=======
	public List findByExample(TbBecomeEmployeeExam instance) {
		log.debug("finding TbBecomeEmployeeExam instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbBecomeEmployeeExam")
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
		log.debug("finding TbBecomeemployeeexam instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbBecomeemployeeexam as model where model."
=======
		log.debug("finding TbBecomeEmployeeExam instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbBecomeEmployeeExam as model where model."
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
	public List findByExamscore(Object examscore) {
		return findByProperty(EXAMSCORE, examscore);
	}

	public List findByChineseprintcount(Object chineseprintcount) {
		return findByProperty(CHINESEPRINTCOUNT, chineseprintcount);
	}

	public List findByNumberprintcount(Object numberprintcount) {
		return findByProperty(NUMBERPRINTCOUNT, numberprintcount);
=======
	public List findByExamScore(Object examScore) {
		return findByProperty(EXAM_SCORE, examScore);
	}

	public List findByChinesePrintCount(Object chinesePrintCount) {
		return findByProperty(CHINESE_PRINT_COUNT, chinesePrintCount);
	}

	public List findByNumberPrintCount(Object numberPrintCount) {
		return findByProperty(NUMBER_PRINT_COUNT, numberPrintCount);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public List findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

<<<<<<< HEAD
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
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public TbBecomeemployeeexam merge(TbBecomeemployeeexam detachedInstance) {
		log.debug("merging TbBecomeemployeeexam instance");
		try {
			TbBecomeemployeeexam result = (TbBecomeemployeeexam) getSession()
=======
	public TbBecomeEmployeeExam merge(TbBecomeEmployeeExam detachedInstance) {
		log.debug("merging TbBecomeEmployeeExam instance");
		try {
			TbBecomeEmployeeExam result = (TbBecomeEmployeeExam) getSession()
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
	public void attachDirty(TbBecomeemployeeexam instance) {
		log.debug("attaching dirty TbBecomeemployeeexam instance");
=======
	public void attachDirty(TbBecomeEmployeeExam instance) {
		log.debug("attaching dirty TbBecomeEmployeeExam instance");
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
	public void attachClean(TbBecomeemployeeexam instance) {
		log.debug("attaching clean TbBecomeemployeeexam instance");
=======
	public void attachClean(TbBecomeEmployeeExam instance) {
		log.debug("attaching clean TbBecomeEmployeeExam instance");
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