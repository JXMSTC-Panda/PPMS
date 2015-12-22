package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.OrganizationNj;

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
@Repository
public class OrganizationNjDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(OrganizationNjDAO.class);
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
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(OrganizationNj persistentInstance) {
		log.debug("deleting OrganizationNj instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public OrganizationNj findById(java.lang.Integer id) {
		log.debug("getting OrganizationNj instance with id: " + id);
		try {
			OrganizationNj instance = (OrganizationNj) getHibernateTemplate().get(
					"ppms.domain.OrganizationNj", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public OrganizationNj merge(OrganizationNj detachedInstance) {
		log.debug("merging OrganizationNj instance");
		try {
			OrganizationNj result = (OrganizationNj) getHibernateTemplate().merge(
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
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(OrganizationNj instance) {
		log.debug("attaching clean OrganizationNj instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}