package ppms.service;

import java.util.List;

import ppms.domain.TbChangejobhistory;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;

public interface IndividualGrowthFileService {



	public List<TbJob> getTbJobs(String jobid);


	public List<TbChangejobhistory> getTbChangejobhistories(String employeeid);

}
