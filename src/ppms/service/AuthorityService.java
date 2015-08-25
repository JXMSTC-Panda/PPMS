package ppms.service;

import java.util.List;

import ppms.domain.TbRole;
import ppms.domain.TbRolefunction;

import ppms.domain.TbSystemfunction;

/**
* <p>Title: AuthorityService</p>
* <p>Description: 权限角色接口</p>
* <p>Company:（c）版权所有 2015 NCHU.QQL</p> 
* <p>Version:</p>
* @author TyurinTsien
* @date 2015-8-12下午3:33:57
*/
public interface AuthorityService {


	/** 
	* @Title: findAllRole 
	* @Description: 查询所有角色
	* @return     
	* List<TbRole>     
	* @throws 
	*/
	public List<TbRole> findAllRole();
	
	/** 
	* @Title: findAllRolefunctions 
	* @Description: TODO
	* @return     
	* List<TbRolefunction>     
	* @throws 
	*/
	public List<TbRolefunction> findAllRolefunctions();
	
	/** 
	* @Title: findSystemFunctionJson 
	* @Description: 查询系统功能json
	* @param column(列名数组)
	* @return     
	* String     
	* @throws 
	*/

	public String findSystemFunctionJson(String[] column);
	
	/** 
	* @Title: findAllSystemfunctions 
	* @Description: 查询系统功能list
	* @return     
	* List<TbSystemfunction>     
	* @throws 
	*/
	public List<TbSystemfunction> findAllSystemfunctions();	
	
	/** 
	* @Title: saveRole 
	* @Description: 保存角色信息
	* @param roleID      角色ID
	* @param roleName    角色名称
	* @param roleType    系统管理员标识
	* @param creatRoleID 创建人ID
	* @param roleNodes   角色权限
	* @return     
	* Boolean     
	* @throws 
	*/
	public Boolean saveRole(String roleID,String roleName,Boolean roleType,String creatRoleID,String roleNodes);
	
	/** 
	* @Title: deleteRole 
	* @Description: TODO
	* @param roleID
	* @return     
	* Boolean     
	* @throws 
	*/
	public Boolean deleteRole(String roleID);
	
	/** 
	* @Title: findRoleJson 
	* @Description: TODO
	* @param roleID
	* @return     
	* String     
	* @throws 
	*/
	public TbRolefunction findTbRoleFunction(String roleID);
	/** 
	* @Title: updateRole 
	* @Description: TODO
	* @param roleID
	* @param roleName
	* @param roleType
	* @param creatRoleID
	* @param roleNodes
	* @return     
	* Boolean     
	* @throws 
	*/
	public Boolean updateRole(String roleID,String roleName,Boolean roleType,String creatRoleID,String roleNodes);
	/** 
	* @Title: findRoleJson 
	* @Description: TODO
	* @param roleID
	* @return     
	* String     
	* @throws 
	*/
	public TbRole findRoleByRoleID(String roleID);
}
