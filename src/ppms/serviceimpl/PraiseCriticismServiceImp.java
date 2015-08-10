package ppms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.daoimpl.PraiseCriticismDaoImp;
import ppms.domain.COrganizationNj;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbEmployee;
import ppms.domain.TbEmployeepraisecriticism;
import ppms.domain.TbJob;
import ppms.domain.TbPost;
import ppms.service.PraiseCriticismService;

@Service
public class PraiseCriticismServiceImp implements PraiseCriticismService {

	@Autowired
	private PraiseCriticismDaoImp dao; //创建一个PraiseCriticismDao的对象dao
	
	
	@Override
	public List<TbEmployeepraisecriticism> findLevel(int key){
		
		return dao.findLevel(key);
	}
	
	
	@Override
	public List<TbEmployee> findAllEmployeeInfor(){
		return dao.findAllEmployeeInfor();
	};
	@Override
	public List<TbPost> findAllPostInfor(){
		return dao.findAllPostInfor();
	}
	@Override
	public List<TbPost> findPostName(String postId){
		return dao.findPostName(postId);
	}
	@Override
	public List<TbJob> findJobName(String jobId){
		return dao.findJobName(jobId);
	}
	@Override
	public List<COrganizationNj> findCOrganizationNjInfor(){
		return dao.findCOrganizationNjInfor();
	}
	@Override
	public List<TbArea> findAreaDesc(String areaId){
		return dao.findAreaDesc(areaId);
	}
	@Override
	public List<OrganizationNj> findOrganizationNjInfor(int orgId){
		return dao.findOrganizationNjInfor(orgId);
	}
}
