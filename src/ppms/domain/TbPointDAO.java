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
 * TbPoint entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see ppms.domain.TbPoint
 * @author MyEclipse Persistence Tools
 */
public class TbPointDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(TbPointDAO.class);
	// property constants
	public static final String ORG_ID = "orgId";
	public static final String ORG_TYPE = "orgType";
	public static final String EMPLOYEE_POINT = "employeePoint";
	public static final String EMPLOYEE_PERFORMANCE = "employeePerformance";
	public static final String ORG_PERFORMANCE = "orgPerformance";
	public static final String REGULATE_POINT = "regulatePoint";
	public static final String RANK_SEQ = "rankSeq";
	public static final String ENCOURAGEMENT_MONEY = "encouragementMoney";
	public static final String TAX = "tax";
	public static final String NET_INCOME = "netIncome";
	public static final String ORG_LEVEL = "orgLevel";
	public static final String BREACH_DEDUCT_POINT = "breachDeductPoint";
	public static final String LAST_POINT = "lastPoint";
	public static final String DEDUCT_TAX = "deductTax";
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";

	public void save(TbPoint transientInstance) {
		log.debug("saving TbPoint instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbPoint persistentInstance) {
		log.debug("deleting TbPoint instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbPoint findById(java.lang.String id) {
		log.debug("getting TbPoint instance with id: " + id);
		try {
			TbPoint instance = (TbPoint) getSession().get(
					"ppms.domain.TbPoint", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbPoint instance) {
		log.debug("finding TbPoint instance by example");
		try {
			List results = getSession().createCriteria("ppms.domain.TbPoint")
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
		log.debug("finding TbPoint instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TbPoint as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByOrgId(Object orgId) {
		return findByProperty(ORG_ID, orgId);
	}

	public List findByOrgType(Object orgType) {
		return findByProperty(ORG_TYPE, orgType);
	}

	public List findByEmployeePoint(Object employeePoint) {
		return findByProperty(EMPLOYEE_POINT, employeePoint);
	}

	public List findByEmployeePerformance(Object employeePerformance) {
		return findByProperty(EMPLOYEE_PERFORMANCE, employeePerformance);
	}

	public List findByOrgPerformance(Object orgPerformance) {
		return findByProperty(ORG_PERFORMANCE, orgPerformance);
	}

	public List findByRegulatePoint(Object regulatePoint) {
		return findByProperty(REGULATE_POINT, regulatePoint);
	}

	public List findByRankSeq(Object rankSeq) {
		return findByProperty(RANK_SEQ, rankSeq);
	}

	public List findByEncouragementMoney(Object encouragementMoney) {
		return findByProperty(ENCOURAGEMENT_MONEY, encouragementMoney);
	}

	public List findByTax(Object tax) {
		return findByProperty(TAX, tax);
	}

	public List findByNetIncome(Object netIncome) {
		return findByProperty(NET_INCOME, netIncome);
	}

	public List findByOrgLevel(Object orgLevel) {
		return findByProperty(ORG_LEVEL, orgLevel);
	}

	public List findByBreachDeductPoint(Object breachDeductPoint) {
		return findByProperty(BREACH_DEDUCT_POINT, breachDeductPoint);
	}

	public List findByLastPoint(Object lastPoint) {
		return findByProperty(LAST_POINT, lastPoint);
	}

	public List findByDeductTax(Object deductTax) {
		return findByProperty(DEDUCT_TAX, deductTax);
	}

	public List findByCreatedBy(Object createdBy) {
		return findByProperty(CREATED_BY, createdBy);
	}

	public List findByModifiedBy(Object modifiedBy) {
		return findByProperty(MODIFIED_BY, modifiedBy);
	}

	public List findAll() {
		log.debug("finding all TbPoint instances");
		try {
			String queryString = "from TbPoint";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbPoint merge(TbPoint detachedInstance) {
		log.debug("merging TbPoint instance");
		try {
			TbPoint result = (TbPoint) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbPoint instance) {
		log.debug("attaching dirty TbPoint instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbPoint instance) {
		log.debug("attaching clean TbPoint instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}