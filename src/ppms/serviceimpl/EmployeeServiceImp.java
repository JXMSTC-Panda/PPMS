package ppms.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

import ppms.genericDao.TbEmployeeDAO;
import ppms.domain.TbEmployee;
import ppms.service.EmployeeService;
import ppms.util.MD5Util;
/**
* <p>Title: EmployeeServiceImp</p>
* <p>Description: </p>
* <p>Company:（c）版权所有 2015 NCHU.QQL</p> 
* <p>Version:</p>
* @author TyurinTsien
* @date 2015-8-7下午5:34:38
*/

@Service
public class EmployeeServiceImp implements EmployeeService{
	
	@Autowired
<<<<<<< HEAD
	private TbEmployeeDAO dao;
=======
	protected TbEmployeeDAO dao;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	@Override
	public List<TbEmployee> findAllEmployeeInfor() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see ppms.service.EmployeeService#findEmployeeForLogin(java.lang.String, java.lang.String)
	 */
	@Override
<<<<<<< HEAD
	public String findEmployeeForLogin(String useracount, String password) {
		// TODO Auto-generated method stub
		int sizeAccount = 0;
		int sizeIdNum = 0;
=======
	public int findEmployeeForLogin(String useracount, String password) {
		// TODO Auto-generated method stub
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
		MD5Util md5Util = new MD5Util();
		//得到密码的MD5值
		String md5Password = md5Util.getMD5String(password); 
		// 根据用户工号得到员工List
		List<TbEmployee> employeeByAccountList = dao.findByEmployeecode(useracount);
		// 根据用户身份证号得到员工List
		List<TbEmployee> employeeByIdNumList = dao.findByIdnumber(useracount);
<<<<<<< HEAD
			
		if(employeeByAccountList.size() == 1 && employeeByAccountList.get(0).getIdpassword() == md5Password){
			System.out.println(employeeByAccountList.get(0).getIdpassword() + "  " + md5Password);
			//工号，密码匹配，返回1
			sizeAccount = 1;
		}
		if(employeeByIdNumList.size() == 1 && employeeByIdNumList.get(0).getIdpassword() == md5Password){
			System.out.println(employeeByAccountList.get(0).getIdpassword() + "  " + md5Password);
			//身份证，密码匹配，返回1
			sizeIdNum = 1;
		}
		int v = sizeAccount|sizeIdNum;
		return String.valueOf(sizeAccount|sizeIdNum);
=======
		
		int sizeAccount = employeeByAccountList.size();
		int sizeIdNum = employeeByIdNumList.size();
		
		return employeeByAccountList.size();
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}
	
}
