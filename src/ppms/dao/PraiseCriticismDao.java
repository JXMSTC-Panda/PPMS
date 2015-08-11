package ppms.dao;

import java.util.List;

import ppms.domain.COrganizationNj;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbEmployee;
import ppms.domain.TbEmployeepraisecriticism;
import ppms.domain.TbJob;
import ppms.domain.TbPost;

public interface PraiseCriticismDao {

	/**
	 * 动态下拉框，根据奖惩类型，动态变化奖惩级别
	 * @param key
	 * @return
	 */
	public List<TbEmployeepraisecriticism> findLevel(int key);
	/**
	 * 获取数据可中所有的员工信息
	 * @return
	 */
	public List<TbEmployee> findAllEmployeeInfor();
	/**
	 * 获取所有的岗职信息
	 * @return
	 */
	public List<TbPost> findAllPostInfor();
	/**
	 * 根据岗职编号查询岗职民称
	 * @param postId
	 * @return
	 */
	public List<TbPost> findPostName(String postId);
	/**
	 * 根据岗位编号查询岗位名称
	 * @param jobId
	 * @return
	 */
	public List<TbJob> findJobName(String jobId);
	/**
	 * 获取所有本地营业厅，区域关系表的信息
	 * @return
	 */
	public List<COrganizationNj> findCOrganizationNjInfor();
	/**
	 * 根据区域编号查询区域名称
	 * @param areaId
	 * @return
	 */
	public List<TbArea> findAreaDesc(String areaId);
	/**
	 * 根据营业厅编号获取同步营业厅的信息
	 * @return
	 */
	public List<OrganizationNj> findOrganizationNjInfor(int orgId);
}
