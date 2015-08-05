package ppms.daoimpl;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * dao层的基本类
 * 
 * @author shark
 * @update 2015上午8:03:27
 * @function sessionFactory实例注入
 * 
 */
public class BaseDaoImp extends HibernateDaoSupport {

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
		return false;
	}
	
	public<T> T findAll(T obj){
		
		return (T) getHibernateTemplate().findByExample(obj);
	}
	
	public void fff(){
		
		
	}
}
