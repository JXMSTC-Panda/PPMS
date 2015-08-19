package ppms.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sun.org.apache.bcel.internal.generic.NEW;

import ppms.dao.IndividualGrowthFileDao;
import ppms.domain.OrganizationNj;
import ppms.domain.TbChangejobhistory;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
@Repository
public class IndividualGrowthFileDaoImp extends BaseDaoImp implements IndividualGrowthFileDao{
	@Override
	public List<TbChangejobhistory> getTbChangejobhistories(){
		
		return getHibernateTemplate().findByExample(new TbChangejobhistory());
	}
	@Override
	public List<TbJob> getTbJobs(String jobid){
		List results=null;
		try{
			String hql="from TbJob where jobid='"+jobid+"'"; 
			results=getHibernateTemplate().find(hql);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		
		return results; 
	}
	@Override
	public List<TbEmployee> getTbEmployee(String employeeid) {
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
	public List<OrganizationNj> getOrganizationNjs(Integer orgid) {
		List results=null;
		try{
			String hql="from OrganizationNj where orgid='"+orgid+"'"; 
			results=getHibernateTemplate().find(hql);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		
		return results; 
	}
}
