/**  
* @文件名: OrganizationNjServiceImp.java 
* @包名: ppms.serviceimpl
* @描述: TODO 
* @修改人：
* @修改时间：2015-8-13 下午4:51:51 
* @修改内容：

* @version V1.0  
*/ 
package ppms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.daoimpl.OrganizationNjDaoImp;
import ppms.domain.OrganizationNj;
import ppms.service.OrganizationNjService;

/**   
 *    
 * 项目名称：PPMS   
 * 类名称：OrganizationNjServiceImp   
 * 类描述：   
 * 创建人：SuperPcf
 * 创建时间：2015-8-13 下午4:51:51   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-13 下午4:51:51   
 * 修改备注：   
 * @version    
 *    
 */
@Service
public class OrganizationNjServiceImp implements OrganizationNjService {

	@Autowired
	private OrganizationNjDaoImp dao;
	/* (non-Javadoc)
	 * @see ppms.service.OrganizationNjService#getOrganizationNjs()
	 */
	@Override
	public List<OrganizationNj> getOrganizationNjs() {
		// TODO Auto-generated method stub
		return dao.getOrganizationNjs();
	}

}
