package ppms.daoimpl;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
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

	public BaseDaoImp() {

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
	 * 
	 * @param obj
	 * @return
	 */
	public <T> List<T> findAll(T obj) {

		return (List<T>) getHibernateTemplate().findByExample(obj);
	}

	/**
	 * 通过查询语句操作数据库5
	 * 
	 * @param HQL
	 *            查询语句
	 * @param t
	 *            要查询数据库表对应的对象
	 * @return
	 */
	public <T> List<T> findByHSQL(String HQL, T t) {

		return (List<T>) getHibernateTemplate().find(HQL);
	}

	/**
	 * 
	 * @param t
	 *            要查找表的的bean实例
	 * @param fields
	 *            是表实例类型的 成员变量名
	 * @return
	 */
	public <T> List<T> getEntitiestNotLazy(T t, String[] fields,
			SimpleExpression eq) {

		try {
			Criteria criteria = getSession().createCriteria(t.getClass());

			if (fields != null) {
				for (String string : fields) {
					criteria = criteria.setFetchMode(string, FetchMode.JOIN);
				}
			}
			if (eq != null) {

				criteria.add(eq);
			}
			return criteria.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 根据ID删除记录
	 * 
	 * @param clazz
	 * @param id
	 * @return
	 */
	public <T> boolean delete(T t, String id) {

		Session openSession = this.getSessionFactory().openSession();
		try {

			openSession.beginTransaction();
			T t1 = (T) openSession.load(t.getClass(), id);

			openSession.delete(t1);
			openSession.getTransaction().commit();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			openSession.getTransaction().rollback();
			return false;
		} finally {
			openSession.close();
		}

	}

	/**
	 * 更新修改数据
	 * 
	 * @param t
	 * @param newObj
	 * @return
	 */
	public <T> boolean update(T t, Object newObj) {

		int i = 2;
		Session openSession = this.getSessionFactory().openSession();
		try {

			openSession.beginTransaction();

			Class<? extends Object> clazz = t.getClass();
			String fieldName = t.getClass().getDeclaredFields()[0].getName();
			fieldName = fieldName.replaceFirst(fieldName.substring(0, 1),
					fieldName.substring(0, 1).toUpperCase());
			Object invoke = clazz.getMethod("get" + fieldName).invoke(newObj);
			T t1 = (T) openSession.load(clazz, (Serializable) invoke);
			Field[] fields = clazz.getDeclaredFields();

			Method setMethod;
			Method getMethod;
			for (Field field : fields) {

				fieldName = field.getName();
				fieldName = fieldName.replaceFirst(fieldName.substring(0, 1),
						fieldName.substring(0, 1).toUpperCase());

				setMethod = t1.getClass().getMethod("set" + fieldName,
						field.getType());
				getMethod = clazz.getMethod("get" + fieldName);
				Object invoke2 = getMethod.invoke(newObj);
				setMethod.invoke(t1, invoke2);
			}

			openSession.update(t1);
			openSession.getTransaction().commit();
			return true;
		} catch (Exception e) {

			openSession.getTransaction().rollback();
			e.printStackTrace();
			return false;
		} finally {
			openSession.close();
		}
	}
}
