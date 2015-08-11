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
	* @Title: findEmployeeForLogin 
	* @Description: TODO
	* @param useracount
	* @param password
	* @return     
	* String     
	* @throws
	 */
	public String findEmployeeForLogin(String useracount,String password);
}
