package ppms.dao;

import java.util.List;

import ppms.domain.OrganizationNj;
import ppms.domain.TbChangejobhistory;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;

public interface IndividualGrowthFileDao {

	public List<TbChangejobhistory> getTbChangejobhistories();

	public List<TbJob> getTbJobs(String jobid);

	public List<TbEmployee> getTbEmployee(String jobhistoryid);

	public List<OrganizationNj> getOrganizationNjs(Integer orgid);

}
