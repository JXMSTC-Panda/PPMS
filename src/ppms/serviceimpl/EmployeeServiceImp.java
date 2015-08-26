package ppms.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.genericDao.TbEmployeeDAO;
import ppms.domain.TbEmployee;
import ppms.service.EmployeeService;
import ppms.util.MD5Util;
import ppms.util.ToJsonUtil;

/**
 * <p>
 * Title: EmployeeServiceImp
 * </p>
 * <p>
 * Description: 员工相关业务处理实现
 * </p>
 * <p>
 * Company:（c）版权所有 2015 NCHU.QQL
 * </p>
 * <p>
 * Version:
 * </p>
 * 
 * @author TyurinTsien
 * @date 2015-8-7下午5:34:38
 */
@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private TbEmployeeDAO dao;
	public TbEmployee tbEmployee;

	@Override
	public List<TbEmployee> findAllEmployeeInfor() {
		// TODO 得到所有员工list
		return null;
	}

	@Override
	public String loginCheck(String useracount, String password) {
		// TODO 登录验证
		// 员工列表
		List<TbEmployee> tbEmployees = new ArrayList<TbEmployee>();
		tbEmployees = loginHelp(useracount, password);
		// 返回员工列表数量
		return String.valueOf(tbEmployees.size());
	}

	@Override
	public String employeeToJson(List<TbEmployee> tbEmployee) {
		// TODO 员工list转
		ToJsonUtil toJsonUtil = new ToJsonUtil();
		Map<String, List<TbEmployee>> map = new HashMap<String, List<TbEmployee>>();
		map.put("tbemployeeMap", tbEmployee);
		// 设置全部列都序列化到json
		toJsonUtil.setFieldToJson(null);
		// 返回json
		return toJsonUtil.toJson(map, dao);
	}

	@Override
	public String findEmployeeID(String useracount, String password) {
		// TODO 登录时得到员工ID
		// 员工列表
		List<TbEmployee> tbEmployees = new ArrayList<TbEmployee>();
		tbEmployees = loginHelp(useracount, password);
		if (tbEmployees.size() == 1) {
			// 返回员工ID
			return tbEmployees.get(0).getEmployeeid();
		}
		return null;
	}

	/**
	 * @Title: loginHelp
	 * @Description: 登录帮助方法
	 * @param useracount
	 * @param password
	 * @return TbEmployee
	 * @throws
	 */
	public List<TbEmployee> loginHelp(String useracount, String password) {

		// 员工对象
		TbEmployee tbEmployee = new TbEmployee();
		// 员工列表
		List<TbEmployee> tbEmployees = new ArrayList<TbEmployee>();

		int sizeEmployee = 0;
		// 得到密码的MD5值
		String md5Password = MD5Util.getMD5String(password);

		try {

			// 根据用户工号得到员工List
			List<TbEmployee> employeeByAccountList = dao
					.findByEmployeecode(useracount);

			if (employeeByAccountList.size() == 1
					&& employeeByAccountList.get(0).getIdpassword()
							.equals(md5Password)) {

				System.out.println(employeeByAccountList.get(0).getIdpassword()
						+ "  " + md5Password);
				// 工号，密码匹配，返回1
				sizeEmployee = 1;
				tbEmployee = employeeByAccountList.get(0);
			}
		} catch (Exception e) {
			// TODO: handle exception
			// 根据用户身份证号得到员工List
			List<TbEmployee> employeeByIdNumList = dao
					.findByIdnumber(useracount);
			if (employeeByIdNumList.size() == 1
					&& employeeByIdNumList.get(0).equals(md5Password)) {

				System.out.println(employeeByIdNumList.get(0).getIdpassword()
						+ "  " + md5Password);
				// 工号，密码匹配，返回1
				sizeEmployee = 1;
				tbEmployee = employeeByIdNumList.get(0);
			}
		}
		tbEmployees.add(tbEmployee);
		return tbEmployees;
	}

	@Override
	public TbEmployee findEmployee(String tbEmployeeID) {
		// TODO Auto-generated method stub
		TbEmployee tbEmployee = new TbEmployee();
		tbEmployee = dao.findById(tbEmployeeID);
		return tbEmployee;
	}

	@Override
	public TbEmployee getEmployee() {
		// TODO Auto-generated method stub
		return this.tbEmployee;
	}
}
