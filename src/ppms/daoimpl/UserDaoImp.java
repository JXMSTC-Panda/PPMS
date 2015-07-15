<<<<<<< HEAD
package ppms.daoImpl;
=======
package ppms.daoimpl;
>>>>>>> 26d1baed399ee2a111e8f775f2857a8b903a1b08

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import ppms.dao.BaseDao;

public class UserDaoImp extends HibernateDaoSupport implements BaseDao {

	@Override
	public void saveObject(Object obj) throws HibernateException {
		getHibernateTemplate().save(obj);
	}


}
