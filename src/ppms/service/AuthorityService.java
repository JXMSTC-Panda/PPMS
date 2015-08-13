package ppms.service;

import java.util.List;

import ppms.domain.TbRole;

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
}