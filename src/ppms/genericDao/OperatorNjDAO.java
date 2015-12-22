package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.OperatorNj;

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
@Repository
public class OperatorNjDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(OperatorNjDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String SEX = "sex";
	public static final String ADDR = "addr";
	public static final String TELEPHONE = "telephone";
	public static final String OFFICE = "office";
	public static final String STATUSID = "statusid";
	public static final String MAXLOGINTIMES = "maxlogintimes";
	public static final String CURRLOGINTIMES = "currlogintimes";
	public static final String EMPNO = "empno";
	public static final String TYPE = "type";
	public static final String MOBILE = "mobile";

	public void save(OperatorNj transientInstance) {
		log.debug("saving OperatorNj instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(OperatorNj persistentInstance) {
		log.debug("deleting OperatorNj instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public OperatorNj findById(java.lang.Integer id) {
		log.debug("getting OperatorNj instance with id: " + id);
		try {
			OperatorNj instance = (OperatorNj) getHibernateTemplate().get(
					"ppms.domain.OperatorNj", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

}