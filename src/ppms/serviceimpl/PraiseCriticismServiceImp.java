package ppms.serviceimpl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.daoimpl.PraiseCriticismDaoImp;
import ppms.domain.TbEmployee;
import ppms.domain.TbEmployeepraisecriticism;
import ppms.service.PraiseCriticismService;

@Service
public class PraiseCriticismServiceImp implements PraiseCriticismService {

	
	
	@Autowired
	private PraiseCriticismDaoImp dao; //创建一个PraiseCriticismDao的对象dao
<<<<<<< HEAD
	@Override
	public void save(Object tbEmployeepraisecriticism){
		
		dao.save(tbEmployeepraisecriticism);
	}
	
=======
	
	/*
	 * 动态下拉框，根据奖惩类型，动态变化奖惩级别*/
>>>>>>> 5b3167661c0cff3dc4643649624e47f41266728d
	@Override
	public List<TbEmployeepraisecriticism> findLevel(int key){
		
		return dao.findLevel(key);
	}
	
	/*
	 * 获取数据可中所有的员工信息
	 * */
	@Override
	public List<TbEmployee> findAllEmployeeInfor(){
		return dao.findAllEmployeeInfor();
	};
<<<<<<< HEAD
	@Override
	public List<TbEmployee> findEmployeeInfor(String employeeId){
		return dao.findEmployeeInfor(employeeId);
	}
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
	public List<COrganizationNj> findCOrganizationNjInfor(int orgid){
		return dao.findCOrganizationNjInfor(orgid);
	}
	@Override
	public List<TbArea> findAreaDesc(BigDecimal areaId){
		return dao.findAreaDesc(areaId);
	}
	@Override
	public List<OrganizationNj> findOrganizationNjInfor(int orgId){
		return dao.findOrganizationNjInfor(orgId);
	}
	@Override
	public List<TbEmployeepraisecriticism> findEmployeepraisecriticismInfor(){
		return dao.findEmployeepraisecriticismInfor();
	}
=======
>>>>>>> 5b3167661c0cff3dc4643649624e47f41266728d
}
