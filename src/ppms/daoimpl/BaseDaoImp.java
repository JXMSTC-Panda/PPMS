package ppms.daoimpl;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import ppms.domain.TbInnovation;

/**
 * dao层的基本类
 * 
 * @author shark
 * @update 2015上午8:03:27
 * @function sessionFactory实例注入
 * 
 */
@Repository
public class BaseDaoImp extends HibernateDaoSupport {

	public BaseDaoImp(){
		
		System.out.println(this.getClass().getName());
	}
	@Autowired
	public void setMySessionFactory(SessionFactory sessionFactory) {

		Map map = sessionFactory.getAllClassMetadata();
		super.setSessionFactory(sessionFactory);
	}

	/**
	 * 将对象插入数据库
	 * 
	 * @param obj
	 * @throws HibernateException
	 */
	public boolean saveObject(Object obj) throws HibernateException {

		if (obj != null) {
			
			try {
				
				getHibernateTemplate().save(obj);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			throw new RuntimeException("插入的对象为空");
		}
		return true;
	}
	
	/**
	 * 查找obj对应表的所有数据
	 * @param obj
	 * @return
	 */
	public<T> List<T> findAll(T obj){
		
		return (List<T>) getHibernateTemplate().findByExample(obj);
	}
	/**
	 * 通过查询语句操作数据库5
	 * @param HQL 查询语句
	 * @param t 要查询数据库表对应的对象
	 * @return
	 */
	public <T> List<T> findByHSQL(String HQL,T t){
		
		 return (List<T>)getHibernateTemplate().find(HQL);
	}
	
	/**
	 * 
	 * @param t 要查找表的的bean实例
	 * @param fields 是表实例类型的 成员变量名
	 * @return
	 */
	public<T> List<T> getEntitiestNotLazy(T t,String [] fields){
		
		try {
			Criteria criteria = getSession().createCriteria(t.getClass());
			
			for (String string : fields) {
				criteria=criteria.setFetchMode(string, FetchMode.JOIN);
			}
			return criteria.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	} 
	
}
