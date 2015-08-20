package ppms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.daoimpl.userBaseInfoDaoImp;
import ppms.domain.OrganizationNj;
import ppms.domain.TbEmployee;
import ppms.domain.TbJob;
import ppms.domain.TbPost;
import ppms.domain.TbRole;
import ppms.service.userBaseInfoService;

@Service
public class userBaseInfoServiceImp implements userBaseInfoService{

	/*
	 * 创建一个员工dao
	 */
	@Autowired
	private userBaseInfoDaoImp dao;
	
	@Override
	public List<OrganizationNj> getOrganizations() {
		
		return dao.getOrganizations();
	}
	@Override
	public List<TbPost> getTbPosts(){
		return dao.getTbPosts();
	}
	
    @Override
	public void adduserBaseInfo(TbEmployee tbEmployee) {
    	dao.saveObject(tbEmployee);
    }
    @Override
	public List<TbJob> getTbJobs() {
		return dao.getTbJobs();
	}
    @Override
	public List<TbEmployee> getTbEmployees(String employeeid) {
		
		return dao.getTbEmployees(employeeid);
	}
    @Override
    public List<TbRole> getTbRoles(){
    	return dao.getTbRoles();
    }
    @Override
	public List<TbEmployee> getTbEmployee() {
		
		return dao.getTbEmployees();
	}   
	
}
