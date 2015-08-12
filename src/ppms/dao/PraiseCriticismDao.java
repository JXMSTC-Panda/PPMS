package ppms.dao;

import java.math.BigDecimal;
import java.util.List;

import ppms.domain.COrganizationNj;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbEmployee;
import ppms.domain.TbEmployeepraisecriticism;
import ppms.domain.TbJob;
import ppms.domain.TbOrgpraisecriticism;
import ppms.domain.TbPost;
import ppms.domain.TbSubarea;
import ppms.domain.TbSubareaorgrelation;

public interface PraiseCriticismDao {

	/**
	 * 单条录入员工奖惩信息
	 * @param tbEmployeepraisecriticism
	 */
	public void save(Object tbEmployeepraisecriticism);
	/**
	 * 单条录入营业厅奖惩信息
	 * @param tbOrgpraisecriticism
	 */
	public void businessHallInforSave(Object tbOrgpraisecriticism);
	/**
	 * 动态下拉框，根据奖惩类型，动态变化奖惩级别
	 * @param key
	 * @return
	 */
	public List<TbEmployeepraisecriticism> findLevel(int key);
	/*
	 * 获取数据可中所有的员工信息
	 * */
	public List<TbEmployee> findAllEmployeeInfor();
	/**
	 * 根据员工编号获取数据可中所有的员工信息
	 * @param employeeId
	 * @return
	 */
	public List<TbEmployee> findEmployeeInfor(String employeeId);
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
	 * 根据营业厅编号获取所有本地营业厅，区域关系表的信息
	 * @return
	 */
	public List<COrganizationNj> findCOrganizationNjInfor(int orgid);
	/**
	 * 根据区域编号查询区域信息
	 * @param areaId
	 * @return
	 */
	public List<TbArea> findAreaDesc(BigDecimal areaId);
	/**
	 * 根据营业厅编号获取同步营业厅的信息
	 * @return
	 */
	public List<OrganizationNj> findOrganizationNjInfor(int orgId);
	/**
	 * 获取所有同步营业厅的信息
	 * @return
	 */
	 public List<OrganizationNj> findAllOrganizationNjInfor();
	/**
	 * 获取所有的员工奖惩信息
	 * @return
	 */
	public List<TbEmployeepraisecriticism> findEmployeepraisecriticismInfor();
	/**
	 * 获取所有的营业厅奖惩信息
	 * @return
	 */
	public List<TbOrgpraisecriticism> findOrgpraisecriticismInfor();
	/**
	 * 根据营业厅编号查询片区与营业厅关系
	 * @param orgId
	 * @return
	 */
	public List<TbSubareaorgrelation> findSubareaorgrelationInfor(int orgId);
	/**
	 * 根据片区编码查询片区名称
	 * @param subareaId
	 * @return
	 */
	public List<TbSubarea> findSubareaInfor(BigDecimal subareaId);
}
