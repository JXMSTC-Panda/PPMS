package ppms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.daoimpl.GrowthFileDaoImpl;
import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.domain.TbStage;
import ppms.service.GrowthFileService;

@Service
public class GrowthFileServiceImp implements GrowthFileService{
	
	@Autowired
	public GrowthFileDaoImpl dao;
	/**
	 * 调用dao层的getTbEmployee()方法
	 */
	@Override
	public List<TbEmployee> getTbEmployee() {
		// TODO Auto-generated method stub
		return dao.getTbEmployee();
	}
	@Override
	public List<TbJob> getTbJobs(String jobid){
		return dao.getTbJobs(jobid);
	}
	@Override
    public List<TbStage> getTbStages(String stageid){
    	return dao.getStages(stageid);
    }
	@Override
	public List<OrganizationNj> getOrganizationNjs(int orgid){
		return dao.getOrganizationNjs(orgid);
	}
}
