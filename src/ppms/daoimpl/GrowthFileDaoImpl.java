package ppms.daoimpl;

import java.util.List;

import org.hibernate.type.TrueFalseType;
import org.springframework.stereotype.Repository;

import ppms.dao.GrowthFileDao;
import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.domain.TbStage;

@Repository
public class GrowthFileDaoImpl extends BaseDaoImp implements GrowthFileDao{
	@Override
	public List<TbEmployee> getTbEmployee(){
		return getHibernateTemplate().findByExample(new TbEmployee()); 
	}
	@Override
    public List<TbStage> getStages(String stageid){
    	List results=null;
		try{
			String hql="from TbStage where stageid='"+stageid+"'"; 
			results=getHibernateTemplate().find(hql);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		
		return results;  
    }
    @Override
    public List<OrganizationNj> getOrganizationNjs(int orgid){
    	List results=null;
		try{
			String hql="from OrganizationNj where orgid='"+orgid+"'"; 
			results=getHibernateTemplate().find(hql);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		
		return results;  
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
}
