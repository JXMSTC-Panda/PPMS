package ppms.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import ppms.domain.TbEmployee;
import ppms.domain.TbEmployeepraisecriticism;
@Repository
/*
 * 奖惩管理的dao层*/
public class PraiseCriticismDaoImp extends BaseDaoImp{

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
			String hql="from TbEmployee"; //定义hql语句,获取TbEployee表中所有的数据
			results=getHibernateTemplate().find(hql);//执行find方法
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		
		return results;  //返回结果
	}
	

}
