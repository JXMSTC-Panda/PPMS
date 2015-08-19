package ppms.serviceimpl;

import java.math.BigDecimal;
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
import ppms.domain.TbMaster;
import ppms.domain.TbOrgpraisecriticism;
import ppms.domain.TbPost;
import ppms.domain.TbSubarea;
import ppms.domain.TbSubareaorgrelation;
import ppms.service.PraiseCriticismService;

@Service
public class PraiseCriticismServiceImp implements PraiseCriticismService {

	
	
	@Autowired
	private PraiseCriticismDaoImp dao; //创建一个PraiseCriticismDao的对象dao

	@Override
	public void save(Object tbEmployeepraisecriticism){
		
		dao.save(tbEmployeepraisecriticism);
	}
	@Override
	public void businessHallInforSave(Object tbOrgpraisecriticism){
		dao.businessHallInforSave(tbOrgpraisecriticism);
	}
	/**
	 * 更新数据
	 * @param object
	 */
	@Override
	public void update(Object object){
		dao.update(object);
	}
	/**
	 * 数据库完全删除数据
	 * @param object
	 */
	@Override
	public void delete(Object object){
		dao.delete(object);
	}
	/*
	 * 动态下拉框，根据奖惩类型，动态变化奖惩级别*/

	@Override
	public List<TbEmployeepraisecriticism> findLevel(int key){
		
		return dao.findLevel(key);
	}
	/**
	 * 根据key值查询营业厅奖惩类型
	 * @param key
	 * @return
	 */
	@Override
	public List<TbMaster> findOrgPraiseCriticismType(String key){
		return dao.findOrgPraiseCriticismType(key);
	}
	/**
	 * 根据奖惩类型typeKey值和奖惩级别levelKey查询营业厅奖惩级别
	 * @param typeKey
	 * @param levelKey
	 * @return
	 */
	@Override
	public List<TbMaster> findOrgPraiseCriticismLevel(String typeKey,String levelKey){
		return dao.findOrgPraiseCriticismLevel(typeKey, levelKey);
	}
	/**
	 * 根据key值查询员工奖惩类型
	 * @param key
	 * @return
	 */
	@Override
	public List<TbMaster> findEmployeePraiseCriticismType(String key){
		return dao.findEmployeePraiseCriticismType(key);
	}
	/**
	 * 根据奖惩类型typeKey值和奖惩级别levelKey查询员工奖惩级别
	 * @param typeKey
	 * @param levelKey
	 * @return
	 */
	@Override
	public List<TbMaster> findEmployeePraiseCriticismLevel(String typeKey,String levelKey){
		return dao.findEmployeePraiseCriticismLevel(typeKey, levelKey);
	}
	/*
	 * 获取数据可中所有的员工信息
	 * */
	@Override
	public List<TbEmployee> findAllEmployeeInfor(){
		return dao.findAllEmployeeInfor();
	};

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
		List<OrganizationNj> findOrganizationNjInfor=null;
		try {
			findOrganizationNjInfor = dao.findOrganizationNjInfor(orgId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return findOrganizationNjInfor;
	}
	@Override
	public List<OrganizationNj> findAllOrganizationNjInfor(){
		return dao.findAllOrganizationNjInfor();
	}
	@Override
	public List<TbEmployeepraisecriticism> findAllEmployeepraisecriticismInfor(){
		return dao.findAllEmployeepraisecriticismInfor();
	}
	/**
	 * 根据员工奖惩信息编号查询员工奖惩信息
	 * @param praisecriticismid
	 * @return
	 */
	@Override
	public List<TbEmployeepraisecriticism> findEmployeepraisecriticismInfor(String praisecriticismid){
		return dao.findEmployeepraisecriticismInfor(praisecriticismid);
	}
	@Override
	public List<TbOrgpraisecriticism> findAllOrgpraisecriticismInfor(){
		return dao.findAllOrgpraisecriticismInfor();
	}
	/**
	 * 根据营业厅奖惩信息编号获取营业厅奖惩信息
	 * @param praisecriticismid
	 * @return
	 */
	@Override
	public List<TbOrgpraisecriticism> findOrgpraisecriticismInfor(String praisecriticismid){
		return dao.findOrgpraisecriticismInfor(praisecriticismid);
	}
	@Override
	public List<TbSubareaorgrelation> findSubareaorgrelationInfor(int orgId){
		return dao.findSubareaorgrelationInfor(orgId);
	}
	@Override
	public List<TbSubarea> findSubareaInfor(BigDecimal subareaId){
		return dao.findSubareaInfor(subareaId);
	}
}
