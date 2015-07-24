package ppms.domain;

import org.hibernate.Session;
<<<<<<< HEAD
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
=======
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727


/**
 * Data access object (DAO) for domain model
 * @author MyEclipse Persistence Tools
 */
<<<<<<< HEAD
public class BaseHibernateDAO extends HibernateDaoSupport{
	
	@Autowired  
    public void setSessionFactoryOverride(SessionFactory sessionFactory)  
    {  
  
        super.setSessionFactory(sessionFactory);  
    }  
=======
public class BaseHibernateDAO implements IBaseHibernateDAO {
	
	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	
}