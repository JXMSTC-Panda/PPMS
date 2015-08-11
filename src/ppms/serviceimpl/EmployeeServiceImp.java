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
	protected TbEmployeeDAO dao;
	@Autowired
	protected TbEmployee tbEmployee;
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
	public String findEmployeeForLogin(String useracount, String password) {
		// TODO Auto-generated method stub
		int sizeAccount = 0;
		int sizeIdNum = 0;
		MD5Util md5Util = new MD5Util();
		//得到密码的MD5值
		String md5Password = md5Util.getMD5String(password); 
		// 根据用户工号得到员工List
		List<TbEmployee> employeeByAccountList = dao.findByEmployeecode(useracount);
		// 根据用户身份证号得到员工List
		List<TbEmployee> employeeByIdNumList = dao.findByIdnumber(useracount);
		
		sizeAccount = employeeByAccountList.size();
		sizeIdNum = employeeByIdNumList.size();
		
		if(sizeAccount == 1)
		{
//<<<<<<< HEAD
//			//tbEmployee = employeeByAccountList;
//=======
//			String[] employeeStrings = (String[])employeeByAccountList.toArray(new String[sizeAccount]);
//>>>>>>> f28697d8192471077c1bb9beac756004c2afe3c5
		}
		String checkStateString = String.valueOf(sizeAccount|sizeIdNum);
		
		return checkStateString;
	}
	
}
