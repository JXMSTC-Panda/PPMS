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
/**   
 *    
 * 项目名称：PPMS   
 * 类名称：ChangeHallDaoImp   
 * 类描述：   
 * 创建人：SuperYWJ
 * 创建时间：2015-8-13 下午3:51:51   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-14 下午8:51:51   
 * 修改备注：   
 * @version    
 *    
 */
@Repository
public class ChangeHallDaoImp extends BaseDaoImp implements ChangeHallDao{
	/**
	 * hibernate取到TbChangeorghistory表中所有数据
	 */
	@Override
	public List<TbChangeorghistory> getTbChangeorghistories(){
		return getHibernateTemplate().findByExample(new TbChangeorghistory());
	}
	/**
	 * 通过id取到OrganizationNj对应数据
	 */
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
	/**
	 * 通过id取到TbEmployee对应数据
	 */
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
	/**
	 * hibernate取到TbSubareaorgrelation表中所有数据
	 */
	@Override
	public List<TbSubareaorgrelation> getTbSubareaorgrelations(){
		return getHibernateTemplate().findByExample(new TbSubareaorgrelation());
	}
	/**
	 * 通过id取到TbSubarea对应数据
	 */
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
	/**
	 * 通过id取到TbArea对应数据
	 */
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
