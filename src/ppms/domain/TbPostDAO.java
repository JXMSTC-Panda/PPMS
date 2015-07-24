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
 * TbPost entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see ppms.domain.TbPost
 * @author MyEclipse Persistence Tools
 */
public class TbPostDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(TbPostDAO.class);
	// property constants
<<<<<<< HEAD
	public static final String POSTNAME = "postname";
	public static final String POSTCOMMENT = "postcomment";
	public static final String SEQ = "seq";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";
=======
	public static final String POST_NAME = "postName";
	public static final String POST_COMMENT = "postComment";
	public static final String SEQ = "seq";
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	public void save(TbPost transientInstance) {
		log.debug("saving TbPost instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbPost persistentInstance) {
		log.debug("deleting TbPost instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbPost findById(java.lang.String id) {
		log.debug("getting TbPost instance with id: " + id);
		try {
			TbPost instance = (TbPost) getSession().get("ppms.domain.TbPost",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbPost instance) {
		log.debug("finding TbPost instance by example");
		try {
			List results = getSession().createCriteria("ppms.domain.TbPost")
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
		log.debug("finding TbPost instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TbPost as model where model."
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
	public List findByPostname(Object postname) {
		return findByProperty(POSTNAME, postname);
	}

	public List findByPostcomment(Object postcomment) {
		return findByProperty(POSTCOMMENT, postcomment);
=======
	public List findByPostName(Object postName) {
		return findByProperty(POST_NAME, postName);
	}

	public List findByPostComment(Object postComment) {
		return findByProperty(POST_COMMENT, postComment);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public List findBySeq(Object seq) {
		return findByProperty(SEQ, seq);
	}

<<<<<<< HEAD
	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
=======
	public List findByCreatedBy(Object createdBy) {
		return findByProperty(CREATED_BY, createdBy);
	}

	public List findByModifiedBy(Object modifiedBy) {
		return findByProperty(MODIFIED_BY, modifiedBy);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public List findAll() {
		log.debug("finding all TbPost instances");
		try {
			String queryString = "from TbPost";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbPost merge(TbPost detachedInstance) {
		log.debug("merging TbPost instance");
		try {
			TbPost result = (TbPost) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbPost instance) {
		log.debug("attaching dirty TbPost instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbPost instance) {
		log.debug("attaching clean TbPost instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}