package ppms.service;

import java.math.BigDecimal;
import java.util.List;

import ppms.domain.COrganizationNj;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbEmployee;
import ppms.domain.TbMaster;
import ppms.domain.TbMountguardexam;
import ppms.domain.TbPerformance;
import ppms.domain.TbPost;
import ppms.domain.TbPromotiontraining;
import ppms.domain.TbVisitcheck;

public interface HallKeeperService {
	/**
	* @Title: getTbMaster
	* @Description: 查询进阶类型为value的系统字典表
	* @param: @param value
	* @return:    List<TbMaster>
	* @auther: CappuccinoH
	* @date: 2015-8-19 下午2:45:35
	*/
	public List<TbMaster> getTbMaster(String value);
	
	/**
	* @Title: getTbPromotiontraining
	* @Description: 获取进阶id为进阶店长的集合表
	* @param: 无    
	* @return:   List<TbPromotiontraining> 
	* @auther: CappuccinoH
	* @date: 2015-8-19 下午2:35:40
	*/
	public List<TbPromotiontraining> getTbPromotiontraining(String promotioncontent);
	
	/**
	* @Title: getTbEmployee
	* @Description: 按employeeid查询员工信息表
	* @param: @param employeeid    
	* @return:    List<TbEmployee>
	* @auther: CappuccinoH
	* @date: 2015-8-19 下午2:50:49
	*/
	public List<TbEmployee> getTbEmployee(String employeeid);
	
	/**
	* @Title: getCOrganizationNj
	* @Description: 按区域营业厅关系查询区域关系集合
	* @param: @param orgid
	* @return:    List<COrganizationNj>
	* @auther: CappuccinoH
	* @date: 2015-8-19 下午2:58:52
	*/
	public List<COrganizationNj> getCOrganizationNj(Integer orgid);
	
	/**
	* @Title: getOrganizationNj
	* @Description: 按地域id查询地域的集合
	* @param: @param areaid
	* @return:   List<TbArea> 
	* @auther: CappuccinoH
	* @date: 2015-8-19 下午3:01:40
	*/
	public List<TbArea> getOrganizationNj(BigDecimal areaid);
	
	/**
	* @Title: getOrganizationNj
	* @Description: 按营业厅id查询营业厅集合
	* @param: @param orgid
	* @param: @return    
	* @return:    
	* @auther: CappuccinoH
	* @date: 2015-8-19 下午3:04:11
	*/
	public List<OrganizationNj> getOrganizationNj(Integer orgid);
	
	/**
	* @Title: getTbVisitcheck
	* @Description: 按营业厅id查询暗访表集合
	* @param: @param orgid
	* @param: @return    
	* @return:    
	* @auther: CappuccinoH
	* @date: 2015-8-19 下午3:12:19
	*/
	public List<TbVisitcheck> getTbVisitcheck(Integer orgid);
	
	/**
	* @Title: getTbPerformance
	* @Description: 按员工id查询年度绩效
	* @param: @param employeeid
	* @param: @param performancetype
	* @return:    List<TbPerformance>
	* @auther: CappuccinoH
	* @date: 2015-8-19 下午3:23:25
	*/
	public List<TbPerformance> getTbPerformance(String employeeid);
	
	/**
	* @Title: getTbPost
	* @Description: 按岗职id查询岗职表
	* @param: @param postid   
	* @return:    List<TbPost>
	* @auther: CappuccinoH
	* @date: 2015-8-20 上午11:04:33
	*/
	public List<TbPost> getTbPost(String postid);
	
	/**
	 * 
	* @Title: getAll
	* @Description: TODO
	* @param: @param key    
	* @return:    
	* @auther: CappuccinoH
	* @date: 2015-8-26 下午2:26:27
	 */
	public List<TbMountguardexam> getAll(String key);
}
