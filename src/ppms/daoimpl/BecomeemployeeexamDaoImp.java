package ppms.daoimpl;



import java.util.List;

import org.hibernate.classic.Session;
import org.springframework.stereotype.Repository;

import com.sun.org.apache.bcel.internal.generic.NEW;

import ppms.dao.BecomeemployeeexamDao;
import ppms.domain.OrganizationNj;
import ppms.domain.TbBecomeemployeeexam;
import ppms.domain.TbEmployee;
@Repository
public class BecomeemployeeexamDaoImp extends BaseDaoImp    implements BecomeemployeeexamDao {

	@Override
	public void addBecomeemployeeexam(Object object) {
		getHibernateTemplate().save(object);
		
	}

	@Override
	public List<TbBecomeemployeeexam> getBecomeemployeeexams() {
		
		return getHibernateTemplate().findByExample(new TbBecomeemployeeexam());
	}

	@Override
	public List<OrganizationNj> getOrganizationNjs() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(new OrganizationNj());
		
	}

	@Override
	public List<TbEmployee> getEmployees() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(new TbEmployee());
	}

	@Override
	public boolean update(TbBecomeemployeeexam tbBecomeemployeeexam){
		Session openSession = null;
		try {
			openSession= this.getSessionFactory().openSession();
			
			openSession.beginTransaction();
			
			TbBecomeemployeeexam load = (TbBecomeemployeeexam) openSession.load(TbBecomeemployeeexam.class,tbBecomeemployeeexam.getExamid());
			
			load.setExamid(tbBecomeemployeeexam.getExamid());
			//load.setOrganizationNj(tbBecomeemployeeexam.getOrganizationNj());
			
			//待修改
			load.setOrganizationNj(null);
			load.setTbEmployee(tbBecomeemployeeexam.getTbEmployee());
			load.setExamdate(tbBecomeemployeeexam.getExamdate());
			load.setExamscore(tbBecomeemployeeexam.getExamscore());
			load.setChineseprintcount(tbBecomeemployeeexam.getChineseprintcount());
			load.setNumberprintcount(tbBecomeemployeeexam.getChineseprintcount());
			load.setRemark(tbBecomeemployeeexam.getRemark());
			load.setCreatedby(tbBecomeemployeeexam.getCreatedby());
			load.setCreatedtime(tbBecomeemployeeexam.getCreatedtime());
			load.setModifiedby(tbBecomeemployeeexam.getModifiedby());
			load.setModifiedtime(tbBecomeemployeeexam.getCreatedtime());
			
			
		
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
}
