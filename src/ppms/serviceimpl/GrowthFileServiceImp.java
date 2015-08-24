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
/**   
 *    
 * 项目名称：PPMS   
 * 类名称：GrowthFileServiceImp   
 * 类描述：   
 * 创建人：SuperYWJ
 * 创建时间：2015-8-18 下午3:51:51   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-18 下午8:51:51   
 * 修改备注：   
 * @version    
 *    
 */
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
	/**
	 * 调用dao层的getTbJobs()方法
	 */
	@Override
	public List<TbJob> getTbJobs(String jobid){
		return dao.getTbJobs(jobid);
	}
	/**
	 * 调用dao层的getTbStages()方法
	 */
	@Override
    public List<TbStage> getTbStages(String stageid){
    	return dao.getStages(stageid);
    }
	/**
	 * 调用dao层的getOrganizationNjs()方法
	 */
	@Override
	public List<OrganizationNj> getOrganizationNjs(int orgid){
		return dao.getOrganizationNjs(orgid);
	}
}
