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
	
	/**
	 * 获取所有的创新提案
	 * @return
	 */
	public List<TbInnovation> findAllInnovations();
	
	/**
	 * 根据ID删除创新方案
	 * @param id
	 * @return
	 */
	public boolean delete(String id);
	
	/**
	 * 修改创新提案的内容
	 * @param tbInnovation
	 * @return
	 */
	public boolean update(TbInnovation tbInnovation);
	
	/**
	 * 根据id查询提案
	 * @param id
	 * @return
	 */
	public TbInnovation find(String id);
}
