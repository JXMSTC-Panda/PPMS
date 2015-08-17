package ppms.service;

import java.util.List;

import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.domain.TbStage;

public interface GrowthFileService {
	/**
	 * 查员工表
	 * @return
	 */
	public List<TbEmployee> getTbEmployee();


	public List<OrganizationNj> getOrganizationNjs(int orgid);

	public List<TbJob> getTbJobs(String jobid);


	public List<TbStage> getTbStages(String stageid);



	
}
