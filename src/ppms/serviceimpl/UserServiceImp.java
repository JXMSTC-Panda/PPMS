package ppms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ppms.daoimpl.TestDao;
import ppms.forms.UserForm;
import ppms.service.UserService;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	public TestDao dao;

	public UserServiceImp(){
		System.out.println("create");
	}
	@Transactional
	public void get(){
		
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
