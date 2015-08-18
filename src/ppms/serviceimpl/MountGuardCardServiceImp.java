package ppms.serviceimpl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.daoimpl.MountGuardCardDapImp;
import ppms.domain.COrganizationNj;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbEmployee;
import ppms.service.MountGuardCardService;

@Service
public class MountGuardCardServiceImp implements MountGuardCardService {

	@Autowired
	private MountGuardCardDapImp dao;

	/**
	 * 
	 * 
	 * @Title: getTbEmployee
	 * 
	 * @Description: 取营业员的信息
	 * 
	 * @param:
	 * 
	 * @auther: CappuccinoH
	 * 
	 * @date: 2015-8-11 下午8:21:05
	 */
	@Override
	public List<TbEmployee> getTbEmployee() {
		// TODO Auto-generated method stub
		return dao.getTbEmployee();
	}

	/**
	 * 
	 * 
	 * @Title: getCOrganizationNj
	 * 
	 * @Description: 查询营业厅的基本信息
	 * 
	 * @param: @return
	 * 
	 * @auther: CappuccinoH
	 * 
	 * @date: 2015-8-11 下午8:21:41
	 */
	@Override
	public List<COrganizationNj> getCOrganizationNj() {
		// TODO Auto-generated method stub
		return dao.getCOrganizationNj();
	}

	/**
	 * @author CappuccinoH
	 * @Description:按员工姓名查询人员信息
	 * @param:
	 * @date 2015-8-13 下午2:36:57
	 */
	@Override
	public List<TbEmployee> getTbEmployeeByName(String TbEmployeeName) {
		// TODO Auto-generated method stub
		return dao.getTbEmployeeByName(TbEmployeeName);
	}

	
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
	@Override
	public List<TbArea> getTbAreaByAreaId(BigDecimal TbAreaId) {
		// TODO Auto-generated method stub
		return dao.getTbAreaByAreaId(TbAreaId);
	}

	
	/**
	 * @Title: getTbEmployeeByOrgId
	 * @Description: 按营业厅对象查找相应的营业员集合
	 * @param: @param organizationNj
	 * @return: List<TbEmployee>
	 * @auther: CappuccinoH
	 * @date: 2015-8-13 下午4:47:17
	 */
	@Override
	public List<TbEmployee> getTbEmployeeByOrgId(Integer OrgId) {
		// TODO Auto-generated method stub
		return dao.getTbEmployeeByOrgId(OrgId);
	}

	
	/**
	* @Title: getOrganizationNjByOrgId
	* @Description: 按营业厅编号查询营业厅集合
	* @param: @param OrgId    
	* @return:    List<OrganizationNj>
	* @auther: CappuccinoH
	* @date: 2015-8-13 下午7:18:47
	*/
	@Override
	public List<OrganizationNj> getOrganizationNjByOrgId(Integer OrgId) {
		// TODO Auto-generated method stub
		return dao.getOrganizationNjByOrgId(OrgId);
	}

	/**
	* @Title: getTbEmployeeByTbEmployeeId
	* @Description: 按营业员号查询营业员集合
	* @param: @param TbEmployeeId   
	* @return:    List<TbEmployee>
	* @auther: CappuccinoH
	* @date: 2015-8-17 上午10:03:09
	*/
	@Override
	public List<TbEmployee> getTbEmployeeByTbEmployeeId(String TbEmployeeId) {
		// TODO Auto-generated method stub
		return dao.getTbEmployeeByTbEmployeeId(TbEmployeeId);
	}

}
