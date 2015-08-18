package ppms.dao;

import java.math.BigDecimal;
import java.util.List;

import ppms.domain.COrganizationNj;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbEmployee;

public interface MountGuardCardDao {
	/**
	 * @author CappuccinoH
	 * @Description:查询人员信息
	 * @param:
	 * @date 2015-8-11 下午5:42:55
	 */
	public List<TbEmployee> getTbEmployee();
	
	/**
	 * @author CappuccinoH
	 * @Description:查询片区-营业厅关系
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
	* @Title: getTbAreaByAreaId	
	* @Description: 按地域id查询相应的地域名称	
	* @param: @param TbAreaId	
	* @return:    List<TbArea>	
	* @auther: CappuccinoH	
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
}
