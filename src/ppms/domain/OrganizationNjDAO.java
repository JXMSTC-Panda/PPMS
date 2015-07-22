package ppms.domain;

import java.math.BigDecimal;
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
 * OrganizationNj entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ppms.domain.OrganizationNj
 * @author MyEclipse Persistence Tools
 */
public class OrganizationNjDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(OrganizationNjDAO.class);
	// property constants
	public static final String ORG_NAME = "orgName";
	public static final String ADDRESS = "address";
	public static final String SUPERIOR_ID = "superiorId";
	public static final String STATUS = "status";
	public static final String CONTACT_NAME = "contactName";
	public static final String CONTACT_TEL = "contactTel";
	public static final String TYPE = "type";
	public static final String REGION_ID = "regionId";
	public static final String CHANNEL_TYPE = "channelType";

	public void save(OrganizationNj transientInstance) {
		log.debug("saving OrganizationNj instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(OrganizationNj persistentInstance) {
		log.debug("deleting OrganizationNj instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public OrganizationNj findById(java.lang.Integer id) {
		log.debug("getting OrganizationNj instance with id: " + id);
		try {
			OrganizationNj instance = (OrganizationNj) getSession().get(
					"ppms.domain.OrganizationNj", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(OrganizationNj instance) {
		log.debug("finding OrganizationNj instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.OrganizationNj")
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
		log.debug("finding OrganizationNj instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from OrganizationNj as model where model."
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

	public List findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List findBySuperiorId(Object superiorId) {
		return findByProperty(SUPERIOR_ID, superiorId);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findByContactName(Object contactName) {
		return findByProperty(CONTACT_NAME, contactName);
	}

	public List findByContactTel(Object contactTel) {
		return findByProperty(CONTACT_TEL, contactTel);
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByRegionId(Object regionId) {
		return findByProperty(REGION_ID, regionId);
	}

	public List findByChannelType(Object channelType) {
		return findByProperty(CHANNEL_TYPE, channelType);
	}

	public List findAll() {
		log.debug("finding all OrganizationNj instances");
		try {
			String queryString = "from OrganizationNj";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public OrganizationNj merge(OrganizationNj detachedInstance) {
		log.debug("merging OrganizationNj instance");
		try {
			OrganizationNj result = (OrganizationNj) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(OrganizationNj instance) {
		log.debug("attaching dirty OrganizationNj instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(OrganizationNj instance) {
		log.debug("attaching clean OrganizationNj instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}