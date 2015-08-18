package ppms.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.dao.IndividualGrowthFileDao;
import ppms.daoimpl.BaseDaoImp;
import ppms.daoimpl.IndividualGrowthFileDaoImp;
import ppms.domain.OrganizationNj;
import ppms.domain.TbChangejobhistory;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.service.IndividualGrowthFileService;

@Service
public class IndividualGrowthFileServiceImp implements
		IndividualGrowthFileService {

	@Autowired
	public IndividualGrowthFileDaoImp dao;
	
	private BaseDaoImp baseDaoImp;

	@Override
	public List<TbChangejobhistory> getTbChangejobhistories(String employeeid) {
		
		
		List<TbChangejobhistory> tbChangejobhistories = dao
				.getTbChangejobhistories();
		List<TbChangejobhistory> tbChangejobhistoriesNew = new ArrayList<>();

		
		for (TbChangejobhistory tbChangejobhistory : tbChangejobhistories) {
			String ss=tbChangejobhistory.getTbEmployee().getEmployeeid();
			if (ss.equals(employeeid)) {
				List<TbEmployee> tbEmployees=dao.getTbEmployee(tbChangejobhistory.getTbEmployee().getEmployeeid());
				List<OrganizationNj> organizationNjs=dao.getOrganizationNjs(tbEmployees.get(0).getOrganizationNj().getOrgid());
				tbEmployees.get(0).setOrganizationNj(organizationNjs.get(0));
				tbChangejobhistory.setTbEmployee(tbEmployees.get(0));
				List<TbJob> tbJobs=dao.getTbJobs(tbChangejobhistory.getTbJobByOutjobid().getJobid());
				tbChangejobhistory.setTbJobByOutjobid(tbJobs.get(0));
				tbChangejobhistoriesNew.add(tbChangejobhistory);
			}

			}
		return tbChangejobhistoriesNew;

	}

	@Override
	public List<TbJob> getTbJobs(String jobid) {
		return dao.getTbJobs(jobid);
	}

}
