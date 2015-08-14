package ppms.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.domain.TbRole;
import ppms.domain.TbSystemfunction;
import ppms.genericDao.TbRoleDAO;
import ppms.service.AuthorityService;
import ppms.util.ToJsonUtil;

/**
* <p>Title: AuthoritySrviceImp</p>
* <p>Description: </p>
* <p>Company:（c）版权所有 2015 NCHU.QQL</p> 
* <p>Version:</p>
* @author TyurinTsien
* @date 2015-8-12下午3:36:04
*/
@Service
public class AuthoritySrviceImp implements AuthorityService{

	@Autowired
	TbRoleDAO roleDAO;
	
	@Override
	public List<TbRole> findAllRole() {
		// TODO Auto-generated method stub
		List<TbRole> tbRoles = roleDAO.findAll();
		return tbRoles;
	}

	@Override
	public String findSystemFunctionJson(List<TbSystemfunction> tbSystemfunctions) {
		// TODO 得到系统功能json
		ToJsonUtil toJsonUtil = new ToJsonUtil();
		Map<String, List<TbSystemfunction>> map = new HashMap<String, List<TbSystemfunction>>();
		map.put("tbRoles", tbSystemfunctions);
		toJsonUtil.setFieldToJson(null);
		return toJsonUtil.toJson(map, roleDAO);
	}

}
