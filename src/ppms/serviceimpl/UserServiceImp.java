package ppms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ppms.domain.TbRoleDAO;
import ppms.forms.UserForm;
import ppms.service.UserService;
public class UserServiceImp implements UserService {

	@Autowired
	public TbRoleDAO dao;

	public void test(){
		List findAll = dao.findAll();
		
		int i=0;
	}

	@Override
	public boolean isExit(UserForm user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insert_register(UserForm user) {
		// TODO Auto-generated method stub
		return false;
	}
}
