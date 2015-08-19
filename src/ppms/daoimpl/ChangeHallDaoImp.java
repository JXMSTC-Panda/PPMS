package ppms.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import ppms.dao.ChangeHallDao;
import ppms.domain.OrganizationNj;
import ppms.domain.TbChangeorghistory;
import ppms.domain.TbEmployee;
@Repository
public class ChangeHallDaoImp extends BaseDaoImp implements ChangeHallDao{
	
	@Override
	public List<TbChangeorghistory> getTbChangeorghistories(){
		return getHibernateTemplate().findByExample(new TbChangeorghistory());
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
	public List<TbEmployee> getTbEmployees(String employeeid){
		List results=null;
		try{
			String hql="from TbEmployee where employeeid='"+employeeid+"'"; 
			results=getHibernateTemplate().find(hql);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		
		return results;
	}
}
