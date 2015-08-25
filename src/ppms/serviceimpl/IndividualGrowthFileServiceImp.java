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
/**   
 *    
 * 项目名称：PPMS   
 * 类名称：IndividualGrowthFileServiceImp   
 * 类描述：   
 * 创建人：SuperYWJ
 * 创建时间：2015-8-10 上午8:51:51   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-11 下午5:51:51   
 * 修改备注：   
 * @version    
 *    
 */
@Service
public class IndividualGrowthFileServiceImp implements
		IndividualGrowthFileService {
	/**
	 * 声明对应dao
	 */
	@Autowired
	public IndividualGrowthFileDaoImp dao;
	
	/**
	 * 通过employeeid查到数据，因表中有数据对象，需遍历
	 */
	@Override
	public List<TbChangejobhistory> getTbChangejobhistories(String employeeid) {
		
		/**
		 * 调用dao层方法，取到表中所有数据
		 */
		List<TbChangejobhistory> tbChangejobhistories = dao
				.getTbChangejobhistories();
		/**
		 * 定义一个空的list
		 */
		List<TbChangejobhistory> tbChangejobhistoriesNew = new ArrayList<>();

		/**
		 * 遍历，取到数据，封装，add到空的list中
		 */
		for (TbChangejobhistory tbChangejobhistory : tbChangejobhistories) {
			
			String ss=tbChangejobhistory.getTbEmployee().getEmployeeid();
			/**
			 * 判断id是否相等
			 */
			if (ss.equals(employeeid)) {
				/**
				 * 通过id查到TbEmployee数据，封装
				 */
				List<TbEmployee> tbEmployees=dao.getTbEmployee(tbChangejobhistory.getTbEmployee().getEmployeeid());	
				/**
				 * 通过id查到OrganizationNj数据，封装
				 */
				List<OrganizationNj> organizationNjs=dao.getOrganizationNjs(tbEmployees.get(0).getOrganizationNj().getOrgid());
				/**
				 * 将封装的数据set到tbChangejobhistory中
				 */
				tbEmployees.get(0).setOrganizationNj(organizationNjs.get(0));
				tbChangejobhistory.setTbEmployee(tbEmployees.get(0));
				/**
				 * 通过id查到TbJob数据，封装
				 */
				List<TbJob> tbJobs=dao.getTbJobs(tbChangejobhistory.getTbJobByOutjobid().getJobid());
				/**
				 * 将封装的数据set到tbChangejobhistory中
				 */
				tbChangejobhistory.setTbJobByOutjobid(tbJobs.get(0));
				/**
				 * 将对象add到空的list中
				 */
				tbChangejobhistoriesNew.add(tbChangejobhistory);
			}

			}
		return tbChangejobhistoriesNew;

	}
	/**
	 * 调用dao层方法，查询表中数据
	 */
	@Override
	public List<TbJob> getTbJobs(String jobid) {
		return dao.getTbJobs(jobid);
	}

}
