package ppms.daoimpl;

import java.util.List;

import org.hibernate.type.TrueFalseType;
import org.springframework.stereotype.Repository;

import ppms.dao.GrowthFileDao;
import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.domain.TbStage;
/**   
 *    
 * 项目名称：PPMS   
 * 类名称：GrowthFileDaoImpl   
 * 类描述：   
 * 创建人：SuperYWJ
 * 创建时间：2015-8-18 下午3:51:51   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-18 下午8:51:51   
 * 修改备注：   
 * @version    
 *    
 */
@Repository
public class GrowthFileDaoImpl extends BaseDaoImp implements GrowthFileDao{
	/**
	 * hibernate查询表中所有数据
	 */
	@Override
	public List<TbEmployee> getTbEmployee(){
		return getHibernateTemplate().findByExample(new TbEmployee()); 
	}
	/**
	 * 通过stageid，查到表中对应id数据
	 */
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
	/**
	 * 通过orgid，查到表中对应id数据
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
	 * 通过jobid，查到表中对应id数据
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
}
