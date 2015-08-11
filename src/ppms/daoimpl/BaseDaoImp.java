package ppms.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

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
<<<<<<< HEAD
=======
	
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	@Autowired
	public void setMySessionFactory(SessionFactory sessionFactory) {

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
	
	
}
