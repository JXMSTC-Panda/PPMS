package ppms.shiro;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.dao.userBaseInfoDao;
import ppms.domain.TbEmployee;
import ppms.domain.TbRole;
import ppms.domain.TbRolefunction;
import ppms.domain.TbSystemfunction;
import ppms.genericDao.TbRoleDAO;
import ppms.genericDao.TbRolefunctionDAO;
import ppms.serviceimpl.AuthoritySrviceImp;
import ppms.serviceimpl.EmployeeServiceImp;

public class MySubject {

	@Autowired
	EmployeeServiceImp employeeServiceImp;
	@Autowired
	userBaseInfoDao baseInfoDao;
	
	public static TbEmployee tbEmployee;
	public static TbRole tbRole;
	public static TbRolefunction tbRolefunction;
	
	public void CreatMySubject(TbEmployee tbEmployeeObject,TbRole tbRoleObject,TbRolefunction tbRolefunctionObjec) {

		tbEmployee = tbEmployeeObject;
		tbRole = tbRoleObject;
		tbRolefunction = tbRolefunctionObjec;
	}

	public TbEmployee getTbEmployee() {
		return tbEmployee;
	}

	public TbRole getTbRole() {
		return tbRole;
	}

	public TbRolefunction getTbRolefunction() {
		return tbRolefunction;
	}

}
