package ppms.dao;

import java.util.List;

import ppms.domain.OrganizationNj;

public interface InvocationDao {

	/**
	 * 查找营业厅的信息
	 * @return
	 */
	public List<OrganizationNj> getOrganizations();

}
