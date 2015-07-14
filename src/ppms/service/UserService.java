package ppms.service;

import ppms.forms.UserForm;

public interface UserService {

	/**
	 * 判断用户是否存在
	 * @param user
	 * @return
	 */
	boolean isExit(UserForm user);

	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	boolean insert_register(UserForm user);

}
