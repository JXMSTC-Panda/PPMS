package ppms.dao;

import java.util.List;

import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.domain.TbPost;
import ppms.domain.TbRole;


public interface userBaseInfoDao {
	/**
	 * 查找营业厅的信息
	 * @return
	 */
	public List<OrganizationNj> getOrganizations();
	
	/**
	 * 查找岗职的信息
	 * @return
	 */
	public List<TbPost> getTbPosts();
	
	/**
	 * 查找岗位的信息
	 * @return
	 */
	public List<TbJob> getTbJobs();
	
	/**
	 * 查找人员的信息
	 * @return
	 */
	public List<TbEmployee> getTbEmployees();
	
	/**
	 * 查找人员的信息
	 * @return
	 */
	public List<TbRole> getTbRoles();
}
