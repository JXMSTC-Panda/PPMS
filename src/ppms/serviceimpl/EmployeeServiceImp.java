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
 * <p>Description:员工相关业务逻辑处理</p>
 * <p>Company:（c）版权所有 2015 NCHU.QQL</p>
 * <p>Version:</p>
 * 
 * @author TyurinTsien
 * @date 2015-8-7下午5:34:38
 */

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private TbEmployeeDAO dao;

	@Override
	public List<TbEmployee> findAllEmployeeInfor() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 员工登录验证逻辑
	 */
	@Override
	public String findEmployeeForLogin(String useracount, String password) {
		// TODO Auto-generated method stub
		int sizeAccount = 0;
		int sizeIdNum = 0;
		String employeePasswordString;
		// 得到密码的MD5值
		String md5Password = MD5Util.getMD5String(password);
		// 根据用户工号得到员工List
		@SuppressWarnings("unchecked")
		List<TbEmployee> employeeByAccountList = dao
				.findByEmployeecode(useracount);
		// 根据用户身份证号得到员工List
		@SuppressWarnings("unchecked")
		List<TbEmployee> employeeByIdNumList = dao.findByIdnumber(useracount);

		if (employeeByAccountList.size() == 1
				&& employeeByAccountList.get(0).getIdpassword()
						.equals(md5Password)) {

			System.out.println(employeeByAccountList.get(0).getIdpassword()
					+ "  " + md5Password);
			// 工号，密码匹配，返回1
			sizeAccount = 1;

		}
		if (employeeByIdNumList.size() == 1 && employeeByIdNumList.get(0).equals(md5Password)) {

			System.out.println(employeeByIdNumList.get(0).getIdpassword()
					+ "  " + md5Password);
			// 工号，密码匹配，返回1
			sizeIdNum = 1;
		}
		//返回与运算结果，返回1表示成功，返回0则失败
		return String.valueOf(sizeAccount | sizeIdNum);
	}

}
