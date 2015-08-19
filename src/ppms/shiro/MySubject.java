package ppms.shiro;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import ppms.domain.TbEmployee;
import ppms.domain.TbRole;
import ppms.domain.TbRolefunction;
import ppms.genericDao.TbRoleDAO;
import ppms.genericDao.TbRolefunctionDAO;
import ppms.serviceimpl.AuthoritySrviceImp;
import ppms.serviceimpl.EmployeeServiceImp;

public class MySubject {

	@Autowired
	AuthoritySrviceImp authoritySrviceImp;
	@Autowired
	EmployeeServiceImp employeeServiceImp;

	public TbEmployee tbEmployee = new TbEmployee();
	public TbRole tbRole = new TbRole();
	public TbRolefunction tbRolefunction = new TbRolefunction();

	public void CreatMySubject(TbEmployee tbEmployeeObject) {

		String employeeID = tbEmployeeObject.getEmployeeid();
		System.out.println(employeeID);
		try {
			tbEmployee = tbEmployeeObject;
			tbRole = tbEmployee.getTbRole();
			tbRolefunction = authoritySrviceImp.findTbRoleFunction(tbRole
					.getRoleid());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
