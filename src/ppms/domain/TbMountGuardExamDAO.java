package ppms.domain;

import java.math.BigDecimal;
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
 * TbMountguardexam entities. Transaction control of the save(), update() and
=======
 * TbMountGuardExam entities. Transaction control of the save(), update() and
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
<<<<<<< HEAD
 * @see ppms.domain.TbMountguardexam
 * @author MyEclipse Persistence Tools
 */
public class TbMountguardexamDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbMountguardexamDAO.class);
	// property constants
	public static final String EXAMTYPE = "examtype";
	public static final String EXAMEXPIRE = "examexpire";
	public static final String EXAMSCORE = "examscore";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbMountguardexam transientInstance) {
		log.debug("saving TbMountguardexam instance");
=======
 * @see ppms.domain.TbMountGuardExam
 * @author MyEclipse Persistence Tools
 */
public class TbMountGuardExamDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbMountGuardExamDAO.class);
	// property constants
	public static final String EXAM_TYPE = "examType";
	public static final String EXAM_EXPIRE = "examExpire";
	public static final String EXAM_SCORE = "examScore";
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";

	public void save(TbMountGuardExam transientInstance) {
		log.debug("saving TbMountGuardExam instance");
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
	public void delete(TbMountguardexam persistentInstance) {
		log.debug("deleting TbMountguardexam instance");
=======
	public void delete(TbMountGuardExam persistentInstance) {
		log.debug("deleting TbMountGuardExam instance");
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
	public TbMountguardexam findById(java.lang.String id) {
		log.debug("getting TbMountguardexam instance with id: " + id);
		try {
			TbMountguardexam instance = (TbMountguardexam) getSession().get(
					"ppms.domain.TbMountguardexam", id);
=======
	public TbMountGuardExam findById(java.lang.String id) {
		log.debug("getting TbMountGuardExam instance with id: " + id);
		try {
			TbMountGuardExam instance = (TbMountGuardExam) getSession().get(
					"ppms.domain.TbMountGuardExam", id);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public List findByExample(TbMountguardexam instance) {
		log.debug("finding TbMountguardexam instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbMountguardexam")
=======
	public List findByExample(TbMountGuardExam instance) {
		log.debug("finding TbMountGuardExam instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbMountGuardExam")
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
		log.debug("finding TbMountguardexam instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbMountguardexam as model where model."
=======
		log.debug("finding TbMountGuardExam instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TbMountGuardExam as model where model."
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
	public List findByExamtype(Object examtype) {
		return findByProperty(EXAMTYPE, examtype);
	}

	public List findByExamexpire(Object examexpire) {
		return findByProperty(EXAMEXPIRE, examexpire);
	}

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
		log.debug("finding all TbMountguardexam instances");
		try {
			String queryString = "from TbMountguardexam";
=======
	public List findByExamType(Object examType) {
		return findByProperty(EXAM_TYPE, examType);
	}

	public List findByExamExpire(Object examExpire) {
		return findByProperty(EXAM_EXPIRE, examExpire);
	}

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
		log.debug("finding all TbMountGuardExam instances");
		try {
			String queryString = "from TbMountGuardExam";
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

<<<<<<< HEAD
	public TbMountguardexam merge(TbMountguardexam detachedInstance) {
		log.debug("merging TbMountguardexam instance");
		try {
			TbMountguardexam result = (TbMountguardexam) getSession().merge(
=======
	public TbMountGuardExam merge(TbMountGuardExam detachedInstance) {
		log.debug("merging TbMountGuardExam instance");
		try {
			TbMountGuardExam result = (TbMountGuardExam) getSession().merge(
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
	public void attachDirty(TbMountguardexam instance) {
		log.debug("attaching dirty TbMountguardexam instance");
=======
	public void attachDirty(TbMountGuardExam instance) {
		log.debug("attaching dirty TbMountGuardExam instance");
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
	public void attachClean(TbMountguardexam instance) {
		log.debug("attaching clean TbMountguardexam instance");
=======
	public void attachClean(TbMountGuardExam instance) {
		log.debug("attaching clean TbMountGuardExam instance");
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