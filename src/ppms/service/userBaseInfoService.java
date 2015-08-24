package ppms.service;

import java.util.List;

import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.domain.TbPost;
import ppms.domain.TbRole;


public interface userBaseInfoService {
	
	/**
	 * 查找营业厅
	 * @return
	 */
	public List<OrganizationNj> getOrganizations();
	/**
	 * 查找岗职
	 * @return
	 */
	public List<TbPost> getTbPosts();
	/**
	 * 查找岗位
	 * @return
	 */
	public List<TbJob> getTbJobs();
	/**
	 * 查找人员
	 * @return
	 */

	/**
	 * 查找角色
	 * @return
	 */
	public List<TbRole> getTbRoles();
	
	public void adduserBaseInfo(TbEmployee tbEmployee);
	
	public List<TbEmployee> getTbEmployees(String employeeid);
	public List<TbEmployee> getTbEmployee();
	public void delete(Object object);
	public void update(Object object);
}
