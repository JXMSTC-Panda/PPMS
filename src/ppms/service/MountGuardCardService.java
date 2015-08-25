package ppms.service;

import java.math.BigDecimal;
import java.util.List;

import ppms.domain.COrganizationNj;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbEmployee;
import ppms.domain.TbMaster;
import ppms.domain.TbMountguardexam;

public interface MountGuardCardService {
	/**
	 * @author CappuccinoH
	 * @Description:查询人员信息
	 * @param:
	 * @date 2015-8-11 下午5:42:55
	 */
	public List<TbEmployee> getTbEmployee();

	/**
	 * @author CappuccinoH
	 * @Description:查询片区营业厅关系
	 * @param:
	 * @date 2015-8-11 下午7:17:57
	 */
	public List<COrganizationNj> getCOrganizationNj();

	/**
	 * @author CappuccinoH
	 * @Description:按员工姓名查询人员信息
	 * @param:
	 * @date 2015-8-13 下午2:36:57
	 */
	public List<TbEmployee> getTbEmployeeByName(String TbEmployeeName);

	/**
	 * 
	 * @Title: getTbAreaByAreaId
	 * 
	 * @Description: 按地域id查询相应的地域名称
	 * 
	 * @param: @param TbAreaId
	 * 
	 * 
	 * @return: List<TbArea>
	 * 
	 * @auther: CappuccinoH
	 * 
	 * @date: 2015-8-13 下午4:15:35
	 */
	public List<TbArea> getTbAreaByAreaId(BigDecimal TbAreaId);
	
	/**
	* @Title: getTbEmployeeByOrgId
	* @Description: 按营业厅对象查找相应的营业员集合
	* @param: @param organizationNj  
	* @return:    List<TbEmployee>
	* @auther: CappuccinoH
	* @date: 2015-8-13 下午4:47:17
	*/
	public List<TbEmployee> getTbEmployeeByOrgId(Integer OrgId);
	
	/**
	* @Title: getOrganizationNjByOrgId
	* @Description: 按营业厅编号查询营业厅集合
	* @param: @param OrgId    
	* @return:    List<OrganizationNj>
	* @auther: CappuccinoH
	* @date: 2015-8-13 下午7:18:47
	*/
	public List<OrganizationNj> getOrganizationNjByOrgId(Integer OrgId);
	
	/**
	* @Title: getTbEmployeeByTbEmployeeId
	* @Description: 按营业员号查询营业员集合
	* @param: @param TbEmployeeId   
	* @return:    List<TbEmployee>
	* @auther: CappuccinoH
	* @date: 2015-8-17 上午10:03:09
	*/
	public List<TbEmployee> getTbEmployeeByTbEmployeeId(String TbEmployeeId);
	
	/**
	* @Title: getTbMountguardexam
	* @Description: 查询TbMountguardexam合作厅上岗考证数据集
	* @param: 无    
	* @return:  List<TbMountguardexam>  
	* @auther: CappuccinoH
	* @date: 2015-8-18 上午10:32:59
	*/
	public List<TbMountguardexam> getTbMountguardexam();
	
	/**
	* @Title: getCOrganizationNjByOrgId
	* @Description: 按营业厅id查询区域营业厅集合
	* @param: @param orgid   
	* @return:    List<COrganizationNj>
	* @auther: CappuccinoH
	* @date: 2015-8-18 上午10:55:39
	*/
	public List<COrganizationNj> getCOrganizationNjByOrgId(Integer orgid);
	
	/**
	* @Title: getTbMasterByExamtype
	* @Description: 按考核类型查询字典表
	* @param: @param examtype
	* @param: @return    
	* @return:    List<TbMaster>
	* @auther: CappuccinoH
	* @date: 2015-8-24 上午5:44:41
	*/
	public List<TbMaster> getTbMasterByExamtype(String examtype);
	
	/**
	* @Title: addTbMountguardexam
	* @Description: 合作厅上岗信息数据录入
	* @param: @param tbMountguardexam
	* @param: @return    
	* @return:    
	* @auther: CappuccinoH
	* @date: 2015-8-24 下午12:14:16
	*/
	public boolean addTbMountguardexam(TbMountguardexam tbMountguardexam);
	
	/**
	* @Title: deleteTbMountguardexam
	* @Description: TODO
	* @param: @param idnumber    
	* @return:    无
	* @auther: CappuccinoH
	* @date: 2015-8-24 下午4:02:46
	*/
	public void deleteTbMountguardexam(TbMountguardexam tbMountguardexam);
	
	/**
	 * 根据id删除
	* @Title: delete
	* @Description: TODO
	* @param: @param id
	* @param: @return    
	* @return:    
	* @auther: CappuccinoH
	* @date: 2015-8-25 下午3:18:16
	 */
	public boolean delete(String id);
	
	/**
	 * 根据id查找记录
	* @Title: getEntity
	* @Description: TODO
	* @param: @param id
	* @param: @return    
	* @return:    
	* @auther: CappuccinoH
	* @date: 2015-8-25 下午3:38:28
	 */
	public TbMountguardexam getEntity(String id);
}
