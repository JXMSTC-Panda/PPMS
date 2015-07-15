<<<<<<< HEAD
package ppms.serviceImpl;
=======
package ppms.serviceimpl;
>>>>>>> 26d1baed399ee2a111e8f775f2857a8b903a1b08

import org.springframework.beans.BeanUtils;

import ppms.dao.BaseDao;
import ppms.domain.User;
import ppms.forms.UserForm;
import ppms.service.UserService;

public class UserServiceImp implements UserService {

	private BaseDao dao;
<<<<<<< HEAD
	
	//提供set方法，spring注入实例化service对象（applicationContext.xml配置体现即可）
=======
>>>>>>> 26d1baed399ee2a111e8f775f2857a8b903a1b08
	public void setDao(BaseDao dao){
		this.dao=dao;
	}

	@Override
	public boolean isExit(UserForm user) {
		return false;
	}

	@Override
	public boolean insert_register(UserForm userForm) {

//		session = HibernateSessionFactory.currentSession();
//		dao.setSession(session);
//		// 鑾峰彇浜嬪姟
//		Transaction ts = session.beginTransaction();
//		// 鏋勯�User瀵硅薄
//		User user = new User();
//		user.setUserId("123");
//		user.setUserName(userForm.getUsername());
//		user.setPassword(userForm.getPwd());
//		user.setType(userForm.getType());
//		// 淇濆瓨User瀵硅薄
//		dao.saveObject(user);
//		// 鎻愪氦浜嬪姟
//		ts.commit();
//		// 鍏抽棴Session
//		HibernateSessionFactory.closeSession();
		
		User user = new User();  
	    BeanUtils.copyProperties(userForm, user); 
<<<<<<< HEAD
	    user.setUserId("1323");
=======
	    user.setUserId("123323");
>>>>>>> 26d1baed399ee2a111e8f775f2857a8b903a1b08
	    dao.saveObject(user);  
		return true;
	}

}
