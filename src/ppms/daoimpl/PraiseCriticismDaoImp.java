package ppms.daoimpl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import ppms.domain.COrganizationNj;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbEmployee;
import ppms.domain.TbEmployeepraisecriticism;
import ppms.domain.TbJob;
import ppms.domain.TbPost;
@Repository
/*
 * 奖惩管理的dao层*/
public class PraiseCriticismDaoImp extends BaseDaoImp{
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

	/*
	 *动态下拉框，根据奖惩类型，动态变化奖惩级别*/
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
	
	/*
	 * 获取数据可中所有的员工信息
	 * */
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
	 * 获取所有的员工奖惩信息
	 * @return
	 */
	public List<TbEmployeepraisecriticism> findEmployeepraisecriticismInfor(){
		List results=null;
		try{
			String hql="from TbEmployeepraisecriticism"; 
			results=getHibernateTemplate().find(hql);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		return results; 
	}

}
