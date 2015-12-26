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
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(COrganizationNj persistentInstance) {
		log.debug("deleting COrganizationNj instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public COrganizationNj findById(java.math.BigDecimal id) {
		log.debug("getting COrganizationNj instance with id: " + id);
		try {
			COrganizationNj instance = (COrganizationNj) getHibernateTemplate().get(
					"ppms.domain.COrganizationNj", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	
}