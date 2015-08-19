package ppms.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import ppms.domain.TbOperationcheck;

@Repository
public class OperationMistakeDaoImp extends BaseDaoImp{
/**
 * 查询业务差错检查成绩
 * @return
 */
	public List<TbOperationcheck> findOperationcheckInfor(){
		List results=null;
		try{
			String hql="from TbOperationcheck" ; //定义hql语句,获取TbEployee表中所有的数据
			results=getHibernateTemplate().find(hql);//执行find方法
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
		
		return results;  //返回结果
	}
}
