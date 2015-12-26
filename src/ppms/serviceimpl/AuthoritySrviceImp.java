package ppms.serviceimpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import ppms.domain.TbRole;
import ppms.domain.TbRolefunction;
import ppms.domain.TbSystemfunction;
import ppms.genericDao.TbRoleDAO;
import ppms.genericDao.TbRolefunctionDAO;
import ppms.genericDao.TbSystemfunctionDAO;
import ppms.service.AuthorityService;
import ppms.shiro.MyRealm;
import ppms.util.ToJsonUtil;

/**
 * <p>Title: AuthoritySrviceImp</p>
 * <p>Description:</p>
 * <p>Company:（c）版权所有 2015 NCHU.QQL</p>
 * <p>Version:</p>
 * 
 * @author TyurinTsien
 * @date 2015-8-12下午3:36:04
 */
@Service
public class AuthoritySrviceImp implements AuthorityService {

	// 角色dao
	@Autowired
	private TbRoleDAO tbRoleDAO;
	// 系统功能dao
	@Autowired
	private TbSystemfunctionDAO tbSystemfunctionDAO;
	// 角色权限权限DAO
	@Autowired
	private TbRolefunctionDAO tbRolefunctionDAO;

	@Override
	public List<TbRole> findAllRole() {
		// 查询所有角色List
		List<TbRole> tbRoles = tbRoleDAO.findAll(new TbRole());
		return tbRoles;
	}

	@Override
	public String findSystemFunctionJson(String[] column) {
		// 得到系统功能json
		ToJsonUtil toJsonUtil = new ToJsonUtil();
		Map<String, List<TbSystemfunction>> map = new HashMap<String, List<TbSystemfunction>>();
		map.put("TbSystemfunctions", this.findAllSystemfunctions());
		toJsonUtil.setFieldToJson(column);
		String resultString = "{\"ppms\":" + toJsonUtil.toJson(map, tbRoleDAO)
				+ "}";
		System.out.println(resultString);
		return resultString;
	}

	@Override
	public List<TbSystemfunction> findAllSystemfunctions() {
		// 查询系统功能list
		List<TbSystemfunction> tbSystemfunctions = new ArrayList<TbSystemfunction>();
		tbSystemfunctions = tbSystemfunctionDAO.findAll(new TbSystemfunction());
		MyRealm.setTbSystemfunctions(tbSystemfunctions);
		return tbSystemfunctions;
	}

	@Override
	public Boolean saveRole(String roleID, String roleName, Boolean roleType,
			String creatRoleID, String roleNodes) {
		// TODO 保存角色信息
		try {
			TbRole tbRole = new TbRole();
			TbRolefunction tbRolefunction = new TbRolefunction();

			tbRole.setRoleid(roleID);
			tbRole.setRolename(roleName);
			tbRole.setAdministratorflag(roleType);
			tbRole.setSeq("1");
			tbRole.setCreatedby(creatRoleID);
			// 保存角色
			tbRoleDAO.save(tbRole);

			tbRolefunction.setTbRole(tbRole);
			tbRolefunction.setFunctionids(roleNodes);
			// 保存角色权限信息
			tbRolefunctionDAO.save(tbRolefunction);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public Boolean deleteRole(String roleID) {
		// 修改角色状态信息
		try {
			TbRole tbRole = new TbRole();
			tbRole = tbRoleDAO.findById(roleID);
			if (tbRole.getSeq().equals("0"))
				tbRole.setSeq("1");
			else
				tbRole.setSeq("0");
			tbRoleDAO.attachDirty(tbRole);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public TbRolefunction findTbRoleFunction(String roleID) {
		// TODO Auto-generated method stub
		// 得到角色功能
		String roleFunctions="";		
		List<TbRolefunction> tbRolefunctions = new ArrayList<TbRolefunction>();
		tbRolefunctions = this.findAllRolefunctions();	
		TbRolefunction tbRolefunction = new TbRolefunction();
		for (TbRolefunction tbRolefunctionin : tbRolefunctions) {	
			
			System.out.println(tbRolefunctionin.getTbRole().getRoleid());
			if(tbRolefunctionin.getTbRole().getRoleid().equals(roleID)){
				
				tbRolefunction = tbRolefunctionin;
				roleFunctions = tbRolefunction.getFunctionids();
				System.out.println(roleFunctions);
			}
		}
		return tbRolefunction;
	}

	@Override
	public List<TbRolefunction> findAllRolefunctions() {
		// TODO Auto-generated method stub
		List<TbRolefunction> tbRolefunctions = tbRolefunctionDAO.findAll(new TbRolefunction());
		
		return tbRolefunctions;
	}

	@Override
	public TbRole findRoleByRoleID(String roleID) {
		// TODO Auto-generated method stub
		TbRole tbRole = tbRoleDAO.findById(roleID);
		return tbRole;
	}

	@Override
	public Boolean updateRole(String roleID, String roleName, Boolean roleType,
			String creatRoleID, String roleNodes) {
		// TODO Auto-generated method stub
		try {
			TbRole tbRole = new TbRole();
			TbRolefunction tbRolefunction = new TbRolefunction();

			tbRole = tbRoleDAO.findById(roleID);
			tbRole.setRolename(roleName);
			tbRole.setAdministratorflag(roleType);
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
			System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
			tbRole.setCreatedtime(new Date());
			//保存角色信息
			tbRoleDAO.update(tbRole);
			
			tbRolefunction = this.findTbRoleFunction(roleID);
			tbRolefunction.setTbRole(tbRole);
			tbRolefunction.setFunctionids(roleNodes);
			// 保存角色权限信息
			tbRolefunctionDAO.update(tbRolefunction);
			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
}
