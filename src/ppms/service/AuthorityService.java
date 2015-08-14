package ppms.service;

import java.util.List;

import ppms.domain.TbRole;
<<<<<<< HEAD
=======
import ppms.domain.TbSystemfunction;
>>>>>>> eac40d6990fe23d2b8f0c9d57102578d658a202e

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
<<<<<<< HEAD
=======
	
	
	/** 
	* @Title: findSystemFunctionJson 
	* @Description: TODO
	* @param tbRoles
	* @return     
	* String     
	* @throws 
	*/
	public String findSystemFunctionJson(List<TbSystemfunction> tbSystemfunctions);
>>>>>>> eac40d6990fe23d2b8f0c9d57102578d658a202e
}
