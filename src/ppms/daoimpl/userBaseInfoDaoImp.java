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
/**   
 *    
 * 项目名称：PPMS   
 * 类名称：userBaseInfoDaoImp   
 * 类描述：   
 * 创建人：SuperYWJ
 * 创建时间：2015-8-13 下午3:51:51   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-13 下午4:51:51   
 * 修改备注：   
 * @version    
 *    
 */
@Repository
public class userBaseInfoDaoImp extends BaseDaoImp implements userBaseInfoDao{
	/**
	 * hibernate操作，查询表OrganizationNj的所有数据
	 */
	@Override
	public List<OrganizationNj> getOrganizations() {
		
		return getHibernateTemplate().findByExample(new OrganizationNj());
	}
	/**
	 * hibernate操作，查询表TbPost的所有数据
	 */
	@Override
	public List<TbPost> getTbPosts(){
		
		return getHibernateTemplate().findByExample(new TbPost());
	}
	/**
	 * hibernate操作，查询表TbJob的所有数据
	 */
	@Override
	public List<TbJob> getTbJobs() {
		
		return getHibernateTemplate().findByExample(new TbJob());
	}
	
	/**
	 * sql操作，通过employeeid查询表TbEmployee的对应数据
	 */
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
	/**
	 * hibernate操作，查询表TbRole的所有数据
	 */
	@Override
	public List<TbRole> getTbRoles(){
		return getHibernateTemplate().findByExample(new TbRole());
	}
	/**
	 * hibernate操作，查询表TbEmployee的所有数据
	 */
	@Override
	public List<TbEmployee> getTbEmployees() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(new TbEmployee());
	}

}
