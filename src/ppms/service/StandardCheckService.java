package ppms.service;

import java.awt.geom.Area;
import java.math.BigDecimal;
import java.util.List;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbAreaorgrelation;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.domain.TbPost;
import ppms.domain.TbRole;
import ppms.domain.TbStandardcheck;
import ppms.domain.TbSubarea;
import ppms.domain.TbSubareaorgrelation;

public interface StandardCheckService{
	/**
	 * 插入数据库信息
	 * @return
	 * 
	 * */
	public void addStandardInfo(TbStandardcheck tbStandardcheck);
	/**
	 * 获取标准化表的信息
	 * @return
	 * */
	public List<TbStandardcheck> findStandardCheckInfo();
	/**
	 * 通过营业厅编号来查询营业厅信息
	 * @return
	 * */
	public List<OrganizationNj> findOrganizationNjInfor(int orgId);
	/**
	 * 通过区域编号来获取区域表信息
	 * @return
	 * */
	public List<TbAreaorgrelation> findAreaorgrelation(int AreaId);
	/**
	 * 通过AreaId来获取Area表的信息
	 * @return:List
	 * */
	public List<TbArea> findAreaId(BigDecimal areId);
	/**
	 * 通过OrgId来查找tb_SubAreaOrgRelation表中的SubAreaId
	 * 
	 * */
	public List<TbSubareaorgrelation> findSubAreaId(Integer orgId);
	/**
	 * 通过subareaid来查找tb_SubArea表中的SubAreaDesc
	 * 
	 * */
	public List<TbSubarea> findSubareaDesc(BigDecimal subareaid);
	/**
	 * 获取营业厅表
	 * */
	public List<OrganizationNj> findOrganizationInfo();
	/**
	 * 根据orgId查询营业厅表
	 * */
	public List<OrganizationNj> findOrganizationId(Integer orgId);
	/**
	 * 插入方法
	 * */
	void save(Object object);
	
}
