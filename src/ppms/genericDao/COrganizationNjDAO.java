package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.COrganizationNj;

/**
 * A data access object (DAO) providing persistence and search support for
 * COrganizationNj entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.COrganizationNj
 * @author MyEclipse Persistence Tools
 */
@Repository
public class COrganizationNjDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(COrganizationNjDAO.class);
	// property constants
	public static final String ORG_NAME = "orgName";
	public static final String ID_DESC = "idDesc";
	public static final String COUNTY_DESC = "countyDesc";
	public static final String COUNTY_LX = "countyLx";
	public static final String ID_DESC2 = "idDesc2";
	public static final String IS_SQ = "isSq";
	public static final String IS_SJMC = "isSjmc";
	public static final String IS_XYD = "isXyd";
	public static final String XS_ID = "xsId";
	public static final String DY_ID = "dyId";
	public static final String HZLX_ID = "hzlxId";
	public static final String QDLX_ID = "qdlxId";
	public static final String FSXZ_ID = "fsxzId";
	public static final String ZDXS_ID = "zdxsId";
	public static final String DZSX_ID = "dzsxId";
	public static final String CHANNEL_ID1 = "channelId1";
	public static final String DY = "dy";
	public static final String QDLX = "qdlx";

	public void save(COrganizationNj transientInstance) {
		log.debug("saving COrganizationNj instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(COrganizationNj persistentInstance) {
		log.debug("deleting COrganizationNj instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public COrganizationNj findById(java.math.BigDecimal id) {
		log.debug("getting COrganizationNj instance with id: " + id);
		try {
			COrganizationNj instance = (COrganizationNj) getSession().get(
					"ppms.domain.COrganizationNj", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(COrganizationNj instance) {
		log.debug("finding COrganizationNj instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.COrganizationNj")
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
		log.debug("finding COrganizationNj instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from COrganizationNj as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByOrgName(Object orgName) {
		return findByProperty(ORG_NAME, orgName);
	}

	public List findByIdDesc(Object idDesc) {
		return findByProperty(ID_DESC, idDesc);
	}

	public List findByCountyDesc(Object countyDesc) {
		return findByProperty(COUNTY_DESC, countyDesc);
	}

	public List findByCountyLx(Object countyLx) {
		return findByProperty(COUNTY_LX, countyLx);
	}

	public List findByIdDesc2(Object idDesc2) {
		return findByProperty(ID_DESC2, idDesc2);
	}

	public List findByIsSq(Object isSq) {
		return findByProperty(IS_SQ, isSq);
	}

	public List findByIsSjmc(Object isSjmc) {
		return findByProperty(IS_SJMC, isSjmc);
	}

	public List findByIsXyd(Object isXyd) {
		return findByProperty(IS_XYD, isXyd);
	}

	public List findByXsId(Object xsId) {
		return findByProperty(XS_ID, xsId);
	}

	public List findByDyId(Object dyId) {
		return findByProperty(DY_ID, dyId);
	}

	public List findByHzlxId(Object hzlxId) {
		return findByProperty(HZLX_ID, hzlxId);
	}

	public List findByQdlxId(Object qdlxId) {
		return findByProperty(QDLX_ID, qdlxId);
	}

	public List findByFsxzId(Object fsxzId) {
		return findByProperty(FSXZ_ID, fsxzId);
	}

	public List findByZdxsId(Object zdxsId) {
		return findByProperty(ZDXS_ID, zdxsId);
	}

	public List findByDzsxId(Object dzsxId) {
		return findByProperty(DZSX_ID, dzsxId);
	}

	public List findByChannelId1(Object channelId1) {
		return findByProperty(CHANNEL_ID1, channelId1);
	}

	public List findByDy(Object dy) {
		return findByProperty(DY, dy);
	}

	public List findByQdlx(Object qdlx) {
		return findByProperty(QDLX, qdlx);
	}

	public List findAll() {
		log.debug("finding all COrganizationNj instances");
		try {
			String queryString = "from COrganizationNj";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public COrganizationNj merge(COrganizationNj detachedInstance) {
		log.debug("merging COrganizationNj instance");
		try {
			COrganizationNj result = (COrganizationNj) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(COrganizationNj instance) {
		log.debug("attaching dirty COrganizationNj instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(COrganizationNj instance) {
		log.debug("attaching clean COrganizationNj instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}