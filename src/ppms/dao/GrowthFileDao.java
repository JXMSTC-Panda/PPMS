package ppms.dao;

import java.util.List;

import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.domain.TbStage;

public interface GrowthFileDao {
	/**
	 * 查找员工
	 * @return
	 */
	public List<TbEmployee> getTbEmployee();


	public List<OrganizationNj> getOrganizationNjs(int orgid);


	public List<TbJob> getTbJobs(String jobid);


	public List<TbStage> getStages(String stageid);

	
}
