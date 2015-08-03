package ppms.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
/**
 * dao层的基本类
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

}
