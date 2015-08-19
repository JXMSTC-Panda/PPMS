package ppms.service;

import java.util.List;

import ppms.domain.OrganizationNj;
import ppms.domain.TbInnovation;

public interface InvocationService {

	
	/**
	 * 查找营业厅
	 * @return
	 */
	public List<OrganizationNj> getOrganizations();

	/**
	 * 创新管理的单条录入
	 * @param innovation
	 * @return
	 */
	public boolean addInnovation(TbInnovation innovation);
	
	public List<TbInnovation> findAllInnovations();
}
