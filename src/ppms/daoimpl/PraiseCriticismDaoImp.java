package ppms.daoimpl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import ppms.dao.PraiseCriticismDao;
import ppms.domain.COrganizationNj;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbEmployee;
import ppms.domain.TbEmployeepraisecriticism;
import ppms.domain.TbJob;
import ppms.domain.TbMaster;
import ppms.domain.TbOrgpraisecriticism;
import ppms.domain.TbPost;
import ppms.domain.TbSubarea;
import ppms.domain.TbSubareaorgrelation;
@Repository
/*
 * 奖惩管理的dao层*/
public class PraiseCriticismDaoImp extends BaseDaoImp implements PraiseCriticismDao{
	/**
	 * 单条录入员工奖惩信息
	 * @param tbEmployeepraisecriticism
	 */
	public void save(Object tbEmployeepraisecriticism){
		try {
			getHibernateTemplate().save(tbEmployeepraisecriticism);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * 单条录入营业厅奖惩信息
	 * @param tbOrgpraisecriticism
	 */
	public void businessHallInforSave(Object tbOrgpraisecriticism){
		getHibernateTemplate().save(tbOrgpraisecriticism);
	}
	/**
	 * 更新数据
	 * @param object
	 */
	public void update(Object object){
		try {
			getHibernateTemplate().update(object);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * 数据库完全删除数据
	 * @param object
	 */
	public void delete(Object object){
		try {
			getHibernateTemplate().delete(object);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * 动态下拉框，根据奖惩类型，动态变化奖惩级别
	 * @param key
	 * @return
	 */
	public List<TbEmployeepraisecriticism> findLevel(int key){
		List find=null;
		String type=null;
		
		if(key==1)
			type="EmployeePraiseLevel"; //表彰级别的type
		else if(key==2)
			type="EmployeeCriticismLevel";//惩罚级别的type
		try{
			String hql="select value from TbMaster where type='"+type+"'";  
			//hql语句，根据type查询value
			find=getHibernateTemplate().find(hql);
			//执行find方法
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		return find; //返回查询到的value
	}
	/**
	 * 根据key值查询营业厅奖惩类型
	 * @param key
	 * @return
	 */
	public List<TbMaster> findOrgPraiseCriticismType(String key){
		
		List results=null;
		try{
			String hql="from TbMaster tbmaster where tbmaster.type='OrgPraiseCriticismType' and  tbmaster.key='"+key+"'" ; //定义hql语句,获取TbEployee表中所有的数据
			results=getHibernateTemplate().find(hql);//执行find方法
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		
		return results;  //返回结果
	}
	/**
	 * 根据奖惩类型typeKey值和奖惩级别levelKey查询营业厅奖惩级别
	 * @param typeKey
	 * @param levelKey
	 * @return
	 */
	public List<TbMaster> findOrgPraiseCriticismLevel(String typeKey,String levelKey){
		List find=null;
		String type=null;
		int key=Integer.parseInt(typeKey);
		if(key==0001)
			type="OrgPraiseLevel"; //表彰级别的type
		else 
			if(key==0002)
			type="OrgCriticismLevel";//惩罚级别的type
		try{
			String hql="from TbMaster tbmaster where tbmaster.type='"+type+"' and  tbmaster.key='"+levelKey+"'";  
			//hql语句，根据type查询value
			find=getHibernateTemplate().find(hql);
			//执行find方法
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		return find; //返回查询到的value
	}
	/**
	 * 根据key值查询员工奖惩类型
	 * @param key
	 * @return
	 */
	public List<TbMaster> findEmployeePraiseCriticismType(String key){
		
		List results=null;
		try{
			String hql="from TbMaster where type='EmployeePraiseCriticismType' and key='"+key+"'" ; 
			results=getHibernateTemplate().find(hql);//执行find方法
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		
		return results;  //返回结果
	}
	/**
	 * 根据奖惩类型typeKey值和奖惩级别levelKey查询员工奖惩级别
	 * @param typeKey
	 * @param levelKey
	 * @return
	 */
	public List<TbMaster> findEmployeePraiseCriticismLevel(String typeKey,String levelKey){
		List find=null;
		String type=null;
		int key=Integer.parseInt(typeKey);
		if(key==1)
			type="EmployeePraiseLevel"; //表彰级别的type
		else if(key==2)
			type="EmployeeCriticismLevel";//惩罚级别的type
		try{
			String hql="from TbMaster where type='"+type+"'and key='"+levelKey+"'";  
			//hql语句，根据type查询value
			find=getHibernateTemplate().find(hql);
			//执行find方法
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		return find; //返回查询到的value
	}
	/**
	 *  获取数据可中所有的员工信息
	 * @return
	 */
	public List<TbEmployee> findAllEmployeeInfor(){
		List results=null;
		try{
			String hql="from TbEmployee where employeeid!='000000'"; //定义hql语句,获取TbEployee表中所有的数据
			results=getHibernateTemplate().find(hql);//执行find方法
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		
		return results;  //返回结果
	}
	/**
	 * 根据员工编号获取数据可中所有的员工信息
	 * @param employeeId
	 * @return
	 */
	public List<TbEmployee> findEmployeeInfor(String employeeId){
		List results=null;
		try{
			String hql="from TbEmployee where employeeid='"+employeeId+"'"; //定义hql语句,获取TbEployee表中所有的数据
			results=getHibernateTemplate().find(hql);//执行find方法
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		
		return results;  //返回结果
	}
	/**
	 * 获取所有的岗职信息
	 * @return
	 */
	public List<TbPost> findAllPostInfor(){
		List results=null;
		try{
			String hql="from TbPost"; 
			results=getHibernateTemplate().find(hql);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		
		return results;  
	}
	/**
	 * 根据岗职编号查询岗职信息
	 * @param postId
	 * @return
	 */
	public List<TbPost> findPostName(String postId){
		List results=null;
		try{
			String hql="from TbPost where postid='"+postId+"'"; 
			results=getHibernateTemplate().find(hql);
	
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		
		return results;  
	}
	/**
	 * 根据岗位编号查询岗位信息
	 * @param jobId
	 * @return
	 */
	public List<TbJob> findJobName(String jobId){
		List results=null;
		try{
			String hql="from TbJob where jobid='"+jobId+"'"; 
			results=getHibernateTemplate().find(hql);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		
		return results;  
	}
	/**
	 * 根据营业厅编号获取所有本地营业厅，区域关系表的信息
	 * @return
	 */
	public List<COrganizationNj> findCOrganizationNjInfor(int orgid){
		List results=null;
		try{
			String hql="from COrganizationNj where organizationNj="+orgid+""; 
			results=getHibernateTemplate().find(hql);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		
		return results;  
	}
	/**
	 * 根据区域编号查询区域信息
	 * @param areaId
	 * @return
	 */
	public List<TbArea> findAreaDesc(BigDecimal areaId){
		List results=null;
		try{
			String hql="from TbArea where areaid="+areaId+""; 
			results=getHibernateTemplate().find(hql);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		
		return results;  
	}
	/**
	 * 根据营业厅编号获取同步营业厅的信息
	 * @return
	 */
	public List<OrganizationNj> findOrganizationNjInfor(int orgId){
		List results=null;
		try{
			String hql="from OrganizationNj where orgid="+orgId+""; 
			results=getHibernateTemplate().find(hql);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		return results;  
	}
	/**
	 * 获取所有同步营业厅的信息
	 * @return
	 */
	 public List<OrganizationNj> findAllOrganizationNjInfor(){
		 List results=null;
			try{
				String hql="from OrganizationNj"; 
				results=getHibernateTemplate().find(hql);
				
			}catch(Exception e){
				e.printStackTrace();
			}finally{}
			return results;  
	 }
	/**
	 * 获取所有的员工奖惩信息
	 * @return
	 */
	public List<TbEmployeepraisecriticism> findAllEmployeepraisecriticismInfor(){
		List results=null;
		try{
			String hql="from TbEmployeepraisecriticism"; 
			results=getHibernateTemplate().find(hql);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		return results; 
	}
	/**
	 * 根据员工奖惩信息编号查询员工奖惩信息
	 * @param praisecriticismid
	 * @return
	 */
	public List<TbEmployeepraisecriticism> findEmployeepraisecriticismInfor(String praisecriticismid){
		List results=null;
		try{
			String hql="from TbEmployeepraisecriticism where praisecriticismid='"+praisecriticismid+"'"; 
			results=getHibernateTemplate().find(hql);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		return results; 
	}
	/**
	 * 获取所有的营业厅奖惩信息
	 * @return
	 */
	public List<TbOrgpraisecriticism> findAllOrgpraisecriticismInfor(){
		List results=null;
		try{
			String hql="from TbOrgpraisecriticism"; 
			results=getHibernateTemplate().find(hql);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		return results; 
	}
	/**
	 * 根据营业厅奖惩信息编号获取营业厅奖惩信息
	 * @param praisecriticismid
	 * @return
	 */
	public List<TbOrgpraisecriticism> findOrgpraisecriticismInfor(String praisecriticismid){
		List results=null;
		try{
			String hql="from TbOrgpraisecriticism where praisecriticismid='"+praisecriticismid+"'"; 
			results=getHibernateTemplate().find(hql);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		return results; 
	}
	/**
	 * 根据营业厅编号查询片区与营业厅关系
	 * @param orgId
	 * @return
	 */
	public List<TbSubareaorgrelation> findSubareaorgrelationInfor(int orgId){
		List results=null;
		try{
			String hql="from TbSubareaorgrelation where organizationNj="+orgId+""; 
			results=getHibernateTemplate().find(hql);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		return results; 
	}

	/**
	 * 根据片区编码查询片区名称
	 * @param subareaId
	 * @return
	 */
	public List<TbSubarea> findSubareaInfor(BigDecimal subareaId){
		List results=null;
		try{
			String hql="from TbSubarea where subareaid="+subareaId+""; 
			results=getHibernateTemplate().find(hql);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		return results;
	}
}
