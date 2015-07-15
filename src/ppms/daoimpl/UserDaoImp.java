package ppms.daoimpl;
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
