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
	* @Title: findAllEmployeeInfor 
	* @Description: TODO
	* @return     
	* List<TbEmployee>     
	* @throws
	 */
	public List<TbEmployee> findAllEmployeeInfor();

	/**
	 * 
	 * @param useracount 账号/身份证号
	 * @param password 密码
	 * @return 返回验证结果，成功为1，失败为0
 	 */

	public String findEmployeeForLogin(String useracount,String password);
}
