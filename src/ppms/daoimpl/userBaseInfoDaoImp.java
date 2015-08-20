package ppms.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.w3c.dom.ls.LSInput;

import com.sun.org.apache.bcel.internal.generic.NEW;

import ppms.dao.userBaseInfoDao;
import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.domain.TbPost;
import ppms.domain.TbRole;
import ppms.service.userBaseInfoService;

@Repository
public class userBaseInfoDaoImp extends BaseDaoImp implements userBaseInfoDao{

	@Override
	public List<OrganizationNj> getOrganizations() {
		
		return getHibernateTemplate().findByExample(new OrganizationNj());
	}

	@Override
	public List<TbPost> getTbPosts(){
		
		return getHibernateTemplate().findByExample(new TbPost());
	}
	@Override
	public List<TbJob> getTbJobs() {
		
		return getHibernateTemplate().findByExample(new TbJob());
	}
	@Override
	public List<TbEmployee> getTbEmployees(String employeeid) {
		List results=null;
		try{
			String hql="from TbEmployee where employeeid='"+employeeid+"'"; 
			results=getHibernateTemplate().find(hql);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		
		return results; 
	}
	@Override
	public List<TbRole> getTbRoles(){
		return getHibernateTemplate().findByExample(new TbRole());
	}

	public List<TbEmployee> getTbEmployees() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(new TbEmployee());
	}

}
