package ppms.service;

import java.util.List;
import ppms.domain.OrganizationNj;
import ppms.domain.TbAreaorgrelation;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.domain.TbPost;
import ppms.domain.TbRole;
import ppms.domain.TbStandardcheck;

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
	
}
