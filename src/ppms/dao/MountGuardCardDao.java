package ppms.dao;

import java.util.List;

import ppms.domain.COrganizationNj;
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
	 * @Description:
	 * @param:
	 * @date 2015-8-11 下午7:17:57
	 */
	public List<COrganizationNj> getCOrganizationNj();
}
