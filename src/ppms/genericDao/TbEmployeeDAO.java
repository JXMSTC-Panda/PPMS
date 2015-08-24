package ppms.genericDao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import ppms.domain.TbEmployee;
import ppms.domain.TbInnovation;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbEmployee entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see ppms.domain.TbEmployee
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TbEmployeeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TbEmployeeDAO.class);
	// property constants
	public static final String EMPLOYEENAME = "employeename";
	public static final String EMPLOYEECODE = "employeecode";
	public static final String IDNUMBER = "idnumber";
	public static final String IDPASSWORD = "idpassword";
	public static final String ORGTYPE = "orgtype";
	public static final String SEX = "sex";
	public static final String BANKNAME = "bankname";
	public static final String BANKNUMBER = "banknumber";
	public static final String STATUS = "status";
	public static final String ACADEMICDEGREE = "academicdegree";
	public static final String ADDRESSAREA = "addressarea";
	public static final String ADDRESS = "address";
	public static final String MOBILENUMBER = "mobilenumber";
	public static final String SHORTMOBILENUMBER = "shortmobilenumber";
	public static final String SCHOOLNAME = "schoolname";
	public static final String SPECIALIZATION = "specialization";
	public static final String TEL = "tel";
	public static final String FRONTBACKFLAG = "frontbackflag";
	public static final String BACKJOBCOMMENT = "backjobcomment";
	public static final String TELECOMLEVEL = "telecomlevel";
	public static final String MOBILELEVEL = "mobilelevel";
	public static final String EMPLOYEETYPE = "employeetype";
	public static final String QUALIFICATION = "qualification";
	public static final String OPERATOREXPIRE = "operatorexpire";
	public static final String OPERATORVALIDFLAG = "operatorvalidflag";
	public static final String AUDITEXPIRE = "auditexpire";
	public static final String AUDITVALIDFLAG = "auditvalidflag";
	public static final String REMARK = "remark";
	public static final String CREATEDBY = "createdby";
	public static final String MODIFIEDBY = "modifiedby";

	public void save(TbEmployee transientInstance) {
		log.debug("saving TbEmployee instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbEmployee persistentInstance) {
		log.debug("deleting TbEmployee instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	public boolean update(TbEmployee tbEmployee){
		Session openSession = null;
		try {
			openSession= this.getSessionFactory().openSession();
			
			openSession.beginTransaction();
			
			TbEmployee load = (TbEmployee) openSession.load(TbEmployee.class,tbEmployee.getEmployeeid());
			
			load.setEmployeename(tbEmployee.getEmployeename());
			load.setEmployeecode(tbEmployee.getEmployeecode());
			load.setSex(tbEmployee.getSex());
			load.setIdnumber(tbEmployee.getIdnumber());
			load.setBirthday(tbEmployee.getBirthday());
			load.setBankname(tbEmployee.getBankname());
			load.setBanknumber(tbEmployee.getBanknumber());
			load.setStatus(tbEmployee.getStatus());
			load.setAddressarea(tbEmployee.getAddressarea());
			load.setAddress(tbEmployee.getAddress());
			load.setMobilenumber(tbEmployee.getMobilenumber());
			load.setShortmobilenumber(tbEmployee.getShortmobilenumber());
			load.setAcademicdegree(tbEmployee.getAcademicdegree());
			load.setSchoolname(tbEmployee.getSchoolname());
			load.setSpecialization(tbEmployee.getSpecialization());
			load.setTel(tbEmployee.getTel());
			load.setEntertime(tbEmployee.getEntertime());
			load.setBackjobcomment(tbEmployee.getBackjobcomment());
			load.setRemark(tbEmployee.getRemark());
			
			openSession.update(load);
			
			openSession.getTransaction().commit();
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			openSession.getTransaction().rollback();
			return false;
		}finally{
			openSession.close();
		}
	
	}
	
	public TbEmployee findById(java.lang.String id) {
		log.debug("getting TbEmployee instance with id: " + id);
		try {
			TbEmployee instance = (TbEmployee) getSession().get(
					"ppms.domain.TbEmployee", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbEmployee instance) {
		log.debug("finding TbEmployee instance by example");
		try {
			List results = getSession()
					.createCriteria("ppms.domain.TbEmployee")
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
		log.debug("finding TbEmployee instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TbEmployee as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByEmployeename(Object employeename) {
		return findByProperty(EMPLOYEENAME, employeename);
	}

	public List findByEmployeecode(Object employeecode) {
		return findByProperty(EMPLOYEECODE, employeecode);
	}

	public List findByIdnumber(Object idnumber) {
		return findByProperty(IDNUMBER, idnumber);
	}

	public List findByIdpassword(Object idpassword) {
		return findByProperty(IDPASSWORD, idpassword);
	}

	public List findByOrgtype(Object orgtype) {
		return findByProperty(ORGTYPE, orgtype);
	}

	public List findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	public List findByBankname(Object bankname) {
		return findByProperty(BANKNAME, bankname);
	}

	public List findByBanknumber(Object banknumber) {
		return findByProperty(BANKNUMBER, banknumber);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findByAcademicdegree(Object academicdegree) {
		return findByProperty(ACADEMICDEGREE, academicdegree);
	}

	public List findByAddressarea(Object addressarea) {
		return findByProperty(ADDRESSAREA, addressarea);
	}

	public List findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List findByMobilenumber(Object mobilenumber) {
		return findByProperty(MOBILENUMBER, mobilenumber);
	}

	public List findByShortmobilenumber(Object shortmobilenumber) {
		return findByProperty(SHORTMOBILENUMBER, shortmobilenumber);
	}

	public List findBySchoolname(Object schoolname) {
		return findByProperty(SCHOOLNAME, schoolname);
	}

	public List findBySpecialization(Object specialization) {
		return findByProperty(SPECIALIZATION, specialization);
	}

	public List findByTel(Object tel) {
		return findByProperty(TEL, tel);
	}

	public List findByFrontbackflag(Object frontbackflag) {
		return findByProperty(FRONTBACKFLAG, frontbackflag);
	}

	public List findByBackjobcomment(Object backjobcomment) {
		return findByProperty(BACKJOBCOMMENT, backjobcomment);
	}

	public List findByTelecomlevel(Object telecomlevel) {
		return findByProperty(TELECOMLEVEL, telecomlevel);
	}

	public List findByMobilelevel(Object mobilelevel) {
		return findByProperty(MOBILELEVEL, mobilelevel);
	}

	public List findByEmployeetype(Object employeetype) {
		return findByProperty(EMPLOYEETYPE, employeetype);
	}

	public List findByQualification(Object qualification) {
		return findByProperty(QUALIFICATION, qualification);
	}

	public List findByOperatorexpire(Object operatorexpire) {
		return findByProperty(OPERATOREXPIRE, operatorexpire);
	}

	public List findByOperatorvalidflag(Object operatorvalidflag) {
		return findByProperty(OPERATORVALIDFLAG, operatorvalidflag);
	}

	public List findByAuditexpire(Object auditexpire) {
		return findByProperty(AUDITEXPIRE, auditexpire);
	}

	public List findByAuditvalidflag(Object auditvalidflag) {
		return findByProperty(AUDITVALIDFLAG, auditvalidflag);
	}

	public List findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

	public List findByCreatedby(Object createdby) {
		return findByProperty(CREATEDBY, createdby);
	}

	public List findByModifiedby(Object modifiedby) {
		return findByProperty(MODIFIEDBY, modifiedby);
	}

	public List findAll() {
		log.debug("finding all TbEmployee instances");
		try {
			String queryString = "from TbEmployee";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TbEmployee merge(TbEmployee detachedInstance) {
		log.debug("merging TbEmployee instance");
		try {
			TbEmployee result = (TbEmployee) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TbEmployee instance) {
		log.debug("attaching dirty TbEmployee instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbEmployee instance) {
		log.debug("attaching clean TbEmployee instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}