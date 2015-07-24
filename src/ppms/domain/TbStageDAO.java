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
 * TbStage entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see ppms.domain.TbStage
 * @author MyEclipse Persistence Tools
 */
public class TbStageDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(TbStageDAO.class);
	// property constants
<<<<<<< HEAD
	public static final String STAGENAME = "stagename";
	public static final String STAGECOMMENT = "stagecomment";
	public static final String SEQ = "seq";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";
=======
	public static final String STAGE_NAME = "stageName";
	public static final String STAGE_COMMENT = "stageComment";
	public static final String SEQ = "seq";
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_BY = "modifiedBy";
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	public void save(TbStage transientInstance) {
		log.debug("saving TbStage instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbStage persistentInstance) {
		log.debug("deleting TbStage instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbStage findById(java.lang.String id) {
		log.debug("getting TbStage instance with id: " + id);
		try {
			TbStage instance = (TbStage) getSession().get(
					"ppms.domain.TbStage", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbStage instance) {
		log.debug("finding TbStage instance by example");
		try {
			List results = getSession().createCriteria("ppms.domain.TbStage")
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
		log.debug("finding TbStage instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TbStage as model where model."
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
	public List findByStagename(Object stagename) {
		return findByProperty(STAGENAME, stagename);
	}

	public List findByStagecomment(Object stagecomment) {
		return findByProperty(STAGECOMMENT, stagecomment);
=======
	public List findByStageName(Object stageName) {
		return findByProperty(STAGE_NAME, stageName);
	}

	public List findByStageComment(Object stageComment) {
		return findByProperty(STAGE_COMMENT, stageComment);
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
		log.debug("finding all TbStage instances");
		try {
			String queryString = "from TbStage";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbStage merge(TbStage detachedInstance) {
		log.debug("merging TbStage instance");
		try {
			TbStage result = (TbStage) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbStage instance) {
		log.debug("attaching dirty TbStage instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbStage instance) {
		log.debug("attaching clean TbStage instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}