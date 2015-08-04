package ppms.service;

import java.util.List;

import ppms.domain.OrganizationNj;

public interface InvocationService {

	/**
	 * 查找营业厅
	 * @return
	 */
	public List<OrganizationNj> getOrganizations();

}
