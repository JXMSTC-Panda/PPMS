package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.CUserInfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * CUserInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see ppms.domain.CUserInfo
 * @author MyEclipse Persistence Tools
 */
@Repository
public class CUserInfoDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(CUserInfoDAO.class);
	// property constants
	public static final String OPERNAME = "opername";
	public static final String OPERPASS = "operpass";
	public static final String ROLEID = "roleid";
	public static final String ZWID = "zwid";

	public void save(CUserInfo transientInstance) {
		log.debug("saving CUserInfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CUserInfo persistentInstance) {
		log.debug("deleting CUserInfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CUserInfo findById(java.math.BigDecimal id) {
		log.debug("getting CUserInfo instance with id: " + id);
		try {
			CUserInfo instance = (CUserInfo) getHibernateTemplate().get(
					"ppms.domain.CUserInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}