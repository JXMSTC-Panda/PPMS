package ppms.domain;

<<<<<<< HEAD
import java.util.List;

=======
import java.util.Date;
import java.util.List;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * OperatorNj entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see ppms.domain.OperatorNj
 * @author MyEclipse Persistence Tools
 */
public class OperatorNjDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(OperatorNjDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String SEX = "sex";
	public static final String ADDR = "addr";
	public static final String TELEPHONE = "telephone";
	public static final String OFFICE = "office";
<<<<<<< HEAD
	public static final String STATUSID = "statusid";
	public static final String MAXLOGINTIMES = "maxlogintimes";
	public static final String CURRLOGINTIMES = "currlogintimes";
	public static final String EMPNO = "empno";
=======
	public static final String STATUS_ID = "statusId";
	public static final String MAX_LOGIN_TIMES = "maxLoginTimes";
	public static final String CURR_LOGIN_TIMES = "currLoginTimes";
	public static final String EMP_NO = "empNo";
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	public static final String TYPE = "type";
	public static final String MOBILE = "mobile";

	public void save(OperatorNj transientInstance) {
		log.debug("saving OperatorNj instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(OperatorNj persistentInstance) {
		log.debug("deleting OperatorNj instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public OperatorNj findById(java.lang.Integer id) {
		log.debug("getting OperatorNj instance with id: " + id);
		try {
			OperatorNj instance = (OperatorNj) getSession().get(
					"ppms.domain.OperatorNj", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(OperatorNj instance) {
		log.debug("finding OperatorNj instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.OperatorNj")
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
		log.debug("finding OperatorNj instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from OperatorNj as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	public List findByAddr(Object addr) {
		return findByProperty(ADDR, addr);
	}

	public List findByTelephone(Object telephone) {
		return findByProperty(TELEPHONE, telephone);
	}

	public List findByOffice(Object office) {
		return findByProperty(OFFICE, office);
	}

<<<<<<< HEAD
	public List findByStatusid(Object statusid) {
		return findByProperty(STATUSID, statusid);
	}

	public List findByMaxlogintimes(Object maxlogintimes) {
		return findByProperty(MAXLOGINTIMES, maxlogintimes);
	}

	public List findByCurrlogintimes(Object currlogintimes) {
		return findByProperty(CURRLOGINTIMES, currlogintimes);
	}

	public List findByEmpno(Object empno) {
		return findByProperty(EMPNO, empno);
=======
	public List findByStatusId(Object statusId) {
		return findByProperty(STATUS_ID, statusId);
	}

	public List findByMaxLoginTimes(Object maxLoginTimes) {
		return findByProperty(MAX_LOGIN_TIMES, maxLoginTimes);
	}

	public List findByCurrLoginTimes(Object currLoginTimes) {
		return findByProperty(CURR_LOGIN_TIMES, currLoginTimes);
	}

	public List findByEmpNo(Object empNo) {
		return findByProperty(EMP_NO, empNo);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByMobile(Object mobile) {
		return findByProperty(MOBILE, mobile);
	}

	public List findAll() {
		log.debug("finding all OperatorNj instances");
		try {
			String queryString = "from OperatorNj";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public OperatorNj merge(OperatorNj detachedInstance) {
		log.debug("merging OperatorNj instance");
		try {
			OperatorNj result = (OperatorNj) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(OperatorNj instance) {
		log.debug("attaching dirty OperatorNj instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(OperatorNj instance) {
		log.debug("attaching clean OperatorNj instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}