package ppms.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sun.org.apache.bcel.internal.generic.NEW;

import ppms.dao.IndividualGrowthFileDao;
import ppms.domain.OrganizationNj;
import ppms.domain.TbChangejobhistory;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;

/**   
 *    
 * 项目名称：PPMS   
 * 类名称：IndividualGrowthFileDaoImp   
 * 类描述：   
 * 创建人：SuperYWJ
 * 创建时间：2015-8-14 上午8:51:51   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-15 下午5:51:51   
 * 修改备注：   
 * @version    
 *    
 */

@Repository
public class IndividualGrowthFileDaoImp extends BaseDaoImp implements IndividualGrowthFileDao{
	
	/**
	 * 查到TbChangejobhistory表中所有数据
	 */
	@Override
	public List<TbChangejobhistory> getTbChangejobhistories(){
		
		return getHibernateTemplate().findByExample(new TbChangejobhistory());
	}
	/**
	 * 通过jobid查到对应数据
	 */
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
	/**
	 * 通过employeeid查到对应数据
	 */
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
	/**
	 * 通过orgid查到对应数据
	 */
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
