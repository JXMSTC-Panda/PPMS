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
 * TbMonthexam entities. Transaction control of the save(), update() and
=======
 * TbMonthExam entities. Transaction control of the save(), update() and
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
<<<<<<< HEAD
 * @see ppms.domain.TbMonthexam
 * @author MyEclipse Persistence Tools
 */
public class TbMonthexamDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbMonthexamDAO.class);
	// property constants
	public static final String EXAMSCORE = "examscore";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbMonthexam transientInstance) {
		log.debug("saving TbMonthexam instance");
=======
 * @see ppms.domain.TbMonthExam
 * @author MyEclipse Persistence Tools
 */
public class TbMonthExamDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbMonthExamDAO.class);
	// property constants
	public static final String EXAM_SCORE = "examScore";
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";

	public void save(TbMonthExam transientInstance) {
		log.debug("saving TbMonthExam instance");
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
	public void delete(TbMonthexam persistentInstance) {
		log.debug("deleting TbMonthexam instance");
=======
	public void delete(TbMonthExam persistentInstance) {
		log.debug("deleting TbMonthExam instance");
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
	public TbMonthexam findById(java.lang.String id) {
		log.debug("getting TbMonthexam instance with id: " + id);
		try {
			TbMonthexam instance = (TbMonthexam) getSession().get(
					"ppms.domain.TbMonthexam", id);
=======
	public TbMonthExam findById(java.lang.String id) {
		log.debug("getting TbMonthExam instance with id: " + id);
		try {
			TbMonthExam instance = (TbMonthExam) getSession().get(
					"ppms.domain.TbMonthExam", id);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public List findByExample(TbMonthexam instance) {
		log.debug("finding TbMonthexam instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbMonthexam")
=======
	public List findByExample(TbMonthExam instance) {
		log.debug("finding TbMonthExam instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbMonthExam")
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
		log.debug("finding TbMonthexam instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TbMonthexam as model where model."
=======
		log.debug("finding TbMonthExam instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TbMonthExam as model where model."
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

	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbMonthexam instances");
		try {
			String queryString = "from TbMonthexam";
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
		log.debug("finding all TbMonthExam instances");
		try {
			String queryString = "from TbMonthExam";
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public TbMonthexam merge(TbMonthexam detachedInstance) {
		log.debug("merging TbMonthexam instance");
		try {
			TbMonthexam result = (TbMonthexam) getSession().merge(
=======
	public TbMonthExam merge(TbMonthExam detachedInstance) {
		log.debug("merging TbMonthExam instance");
		try {
			TbMonthExam result = (TbMonthExam) getSession().merge(
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
	public void attachDirty(TbMonthexam instance) {
		log.debug("attaching dirty TbMonthexam instance");
=======
	public void attachDirty(TbMonthExam instance) {
		log.debug("attaching dirty TbMonthExam instance");
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
	public void attachClean(TbMonthexam instance) {
		log.debug("attaching clean TbMonthexam instance");
=======
	public void attachClean(TbMonthExam instance) {
		log.debug("attaching clean TbMonthExam instance");
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