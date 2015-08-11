package ppms.service;

import java.util.List;

import ppms.domain.TbEmployee;

/**
* <p>Title: EmployeeService</p>
* <p>Description: </p>
* <p>Company:（c）版权所有 2015 NCHU.QQL</p> 
* <p>Version:</p>
* @author TyurinTsien
* @date 2015-8-7下午5:34:38
*/
public interface EmployeeService {

	/**
	 * 
	 * @return 获取员工List
	 */
	public List<TbEmployee> findAllEmployeeInfor();

	/**
	 * 
	 * @param useracount 账号/身份证号
	 * @param password 密码
	 * @return 返回记录条数
 	 */
<<<<<<< HEAD
	public String findEmployeeForLogin(String useracount,String password);
=======
	public int findEmployeeForLogin(String useracount,String password);
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
}
