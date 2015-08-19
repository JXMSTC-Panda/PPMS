package ppms.daoimpl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sun.org.apache.bcel.internal.generic.NEW;

import ppms.dao.ChangeHallDao;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbChangeorghistory;
import ppms.domain.TbEmployee;
import ppms.domain.TbSubarea;
import ppms.domain.TbSubareaorgrelation;
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
	@Override
	public List<TbSubareaorgrelation> getTbSubareaorgrelations(){
		return getHibernateTemplate().findByExample(new TbSubareaorgrelation());
	}
	@Override
	public List<TbSubarea> getTbSubareas(BigDecimal subareaid){
		List results=null;
		try{
			String hql="from TbSubarea where subareaid='"+subareaid+"'"; 
			results=getHibernateTemplate().find(hql);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		
		return results;
	}
	@Override
	public List<TbArea> getAreas(BigDecimal areaid){
		List results=null;
		try{
			String hql="from TbArea where areaid='"+areaid+"'"; 
			results=getHibernateTemplate().find(hql);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		
		return results;
	}
}
