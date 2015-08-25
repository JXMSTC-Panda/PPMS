package ppms.dao;

import java.util.List;

import ppms.domain.OrganizationNj;
import ppms.domain.TbBecomeemployeeexam;
import ppms.domain.TbEmployee;

public interface BecomeemployeeexamDao {

	public void addBecomeemployeeexam(Object object);
	
	public List<TbBecomeemployeeexam> getBecomeemployeeexams();
	
	public List<OrganizationNj> getOrganizationNjs();
	
	public List<TbEmployee> getEmployees();

	/** 
	
	* @方法名: update 
	
	* @描述: 修改转正成绩考核表
	
	* @param @param tb
	* @param @return    设定文件
	
	* @return boolean    返回类型
	
	* @throws 
	
	*/ 
	public boolean update(TbBecomeemployeeexam tb);
}
