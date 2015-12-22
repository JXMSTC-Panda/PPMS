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
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TbEmployee persistentInstance) {
		log.debug("deleting TbEmployee instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
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
			load.
			setIdnumber(tbEmployee.getIdnumber());
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
	
	public boolean detete(String id){
		Session openSession = null;
		try {
			openSession= this.getSessionFactory().openSession();
			
			openSession.beginTransaction();
			
			TbEmployee load = (TbEmployee) openSession.load(TbEmployee.class,id);
			
			if(load.getStatus()){
				load.setStatus(false);
				openSession.update(load);
				openSession.getTransaction().commit();
			}else{
				return false;
			}
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
			TbEmployee instance = (TbEmployee) getHibernateTemplate().get(
					"ppms.domain.TbEmployee", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}


	public TbEmployee merge(TbEmployee detachedInstance) {
		log.debug("merging TbEmployee instance");
		try {
			TbEmployee result = (TbEmployee) getHibernateTemplate().merge(
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
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbEmployee instance) {
		log.debug("attaching clean TbEmployee instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public List<TbEmployee> findByEmployeecode(String useracount) {
		String sql ="from TbEmployee where employeecode="+useracount;
		return getHibernateTemplate().find(sql);
	}

	public List<TbEmployee> findByIdnumber(String useracount) {
		String sql ="from TbEmployee where idnumber="+useracount;
		return getHibernateTemplate().find(sql);
	}
}