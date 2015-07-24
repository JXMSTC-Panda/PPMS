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
 * TbFreshemployeeexam entities. Transaction control of the save(), update() and
=======
 * TbFreshEmployeeExam entities. Transaction control of the save(), update() and
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
<<<<<<< HEAD
 * @see ppms.domain.TbFreshemployeeexam
 * @author MyEclipse Persistence Tools
 */
public class TbFreshemployeeexamDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbFreshemployeeexamDAO.class);
	// property constants
	public static final String EXAMSTAGE = "examstage";
	public static final String WEEK = "week";
	public static final String EXAMSCORE = "examscore";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbFreshemployeeexam transientInstance) {
		log.debug("saving TbFreshemployeeexam instance");
=======
 * @see ppms.domain.TbFreshEmployeeExam
 * @author MyEclipse Persistence Tools
 */
public class TbFreshEmployeeExamDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbFreshEmployeeExamDAO.class);
	// property constants
	public static final String EXAM_STAGE = "examStage";
	public static final String WEEK = "week";
	public static final String EXAM_SCORE = "examScore";
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";

	public void save(TbFreshEmployeeExam transientInstance) {
		log.debug("saving TbFreshEmployeeExam instance");
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
	public void delete(TbFreshemployeeexam persistentInstance) {
		log.debug("deleting TbFreshemployeeexam instance");
=======
	public void delete(TbFreshEmployeeExam persistentInstance) {
		log.debug("deleting TbFreshEmployeeExam instance");
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
	public TbFreshemployeeexam findById(java.lang.String id) {
		log.debug("getting TbFreshemployeeexam instance with id: " + id);
		try {
			TbFreshemployeeexam instance = (TbFreshemployeeexam) getSession()
					.get("ppms.domain.TbFreshemployeeexam", id);
=======
	public TbFreshEmployeeExam findById(java.lang.String id) {
		log.debug("getting TbFreshEmployeeExam instance with id: " + id);
		try {
			TbFreshEmployeeExam instance = (TbFreshEmployeeExam) getSession()
					.get("ppms.domain.TbFreshEmployeeExam", id);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public List findByExample(TbFreshemployeeexam instance) {
		log.debug("finding TbFreshemployeeexam instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbFreshemployeeexam")
=======
	public List findByExample(TbFreshEmployeeExam instance) {
		log.debug("finding TbFreshEmployeeExam instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbFreshEmployeeExam")
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
		log.debug("finding TbFreshemployeeexam instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbFreshemployeeexam as model where model."
=======
		log.debug("finding TbFreshEmployeeExam instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbFreshEmployeeExam as model where model."
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
	public List findByExamstage(Object examstage) {
		return findByProperty(EXAMSTAGE, examstage);
=======
	public List findByExamStage(Object examStage) {
		return findByProperty(EXAM_STAGE, examStage);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public List findByWeek(Object week) {
		return findByProperty(WEEK, week);
	}

<<<<<<< HEAD
	public List findByExamscore(Object examscore) {
		return findByProperty(EXAMSCORE, examscore);
	}

	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbFreshemployeeexam instances");
		try {
			String queryString = "from TbFreshemployeeexam";
=======
	public List findByExamScore(Object examScore) {
		return findByProperty(EXAM_SCORE, examScore);
	}

	public List findByCreatedBy(Object createdBy) {
		return findByProperty(CREATED_BY, createdBy);
	}

	public List findByModifiedBy(Object modifiedBy) {
		return findByProperty(MODIFIED_BY, modifiedBy);
	}

	public List findAll() {
		log.debug("finding all TbFreshEmployeeExam instances");
		try {
			String queryString = "from TbFreshEmployeeExam";
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public TbFreshemployeeexam merge(TbFreshemployeeexam detachedInstance) {
		log.debug("merging TbFreshemployeeexam instance");
		try {
			TbFreshemployeeexam result = (TbFreshemployeeexam) getSession()
=======
	public TbFreshEmployeeExam merge(TbFreshEmployeeExam detachedInstance) {
		log.debug("merging TbFreshEmployeeExam instance");
		try {
			TbFreshEmployeeExam result = (TbFreshEmployeeExam) getSession()
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
	public void attachDirty(TbFreshemployeeexam instance) {
		log.debug("attaching dirty TbFreshemployeeexam instance");
=======
	public void attachDirty(TbFreshEmployeeExam instance) {
		log.debug("attaching dirty TbFreshEmployeeExam instance");
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
	public void attachClean(TbFreshemployeeexam instance) {
		log.debug("attaching clean TbFreshemployeeexam instance");
=======
	public void attachClean(TbFreshEmployeeExam instance) {
		log.debug("attaching clean TbFreshEmployeeExam instance");
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