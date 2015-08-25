package ppms.service;

import java.util.List;

import ppms.domain.OrganizationNj;
import ppms.domain.TbBecomeemployeeexam;
import ppms.domain.TbEmployee;

public interface BecomeemployeeexamService {

	public void addBecomeemployeeexam(Object object);
	
	public List<TbBecomeemployeeexam> getBecomeemployeeexams();
	
	public List<OrganizationNj> getOrganizationNjs();
	
	public List<TbEmployee> geTbEmployees();

	/** 
	
	* @方法名: deleteBecomeemployeeexam 
	
	* @描述: TODO(这里用一句话描述这个方法的作用) 
	
	* @param @param tbBecomeemployeeexam
	* @param @param id    设定文件
	
	* @return void    返回类型
	
	* @throws 
	
	*/ 
	public void deleteBecomeemployeeexam(TbBecomeemployeeexam tbBecomeemployeeexam,
			String id);
}
