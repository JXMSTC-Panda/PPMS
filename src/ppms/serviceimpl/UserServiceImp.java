package ppms.serviceImpl;

import org.springframework.beans.BeanUtils;

import ppms.dao.BaseDao;
import ppms.domain.User;
import ppms.forms.UserForm;
import ppms.service.UserService;

public class UserServiceImp implements UserService {

	private BaseDao dao;
	//提供set方法，spring注入实例化service对象（applicationContext.xml配置体现即可）

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
	    user.setUserId("1323");

	    dao.saveObject(user);  
		return true;
	}

}
