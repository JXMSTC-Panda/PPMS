package ppms.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.daoimpl.ChangeHallDaoImp;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbChangeorghistory;
import ppms.domain.TbEmployee;
import ppms.domain.TbSubarea;
import ppms.domain.TbSubareaorgrelation;
import ppms.service.ChangeHallService;

/**   
 *    
 * 项目名称：PPMS   
 * 类名称：ChangeHallServiceImp   
 * 类描述：   
 * 创建人：SuperYWJ
 * 创建时间：2015-8-19 下午3:51:51   
 * 修改人：（修改人的名字） 
 * 修改时间：2015-8-19 下午8:51:51   
 * 修改备注：   
 * @version    
 *    
 */
@Service
public class ChangeHallServiceImp implements ChangeHallService{
	/**
	 * 声明对应dao层
	 */
	@Autowired
	public ChangeHallDaoImp dao;
	
	@Override
	public List<TbChangeorghistory> getTbChangeorghistories(){
		/**
		 * 调用dao层，取到TbChangeorghistory中所有数据
		 */
		List<TbChangeorghistory> tbChangeorghistories =dao.getTbChangeorghistories();
		/**
		 * 声明一个空的list
		 */
		List<TbChangeorghistory> tbChangeorghistoriesNew=new ArrayList<>();
		/**
		 * 遍历，通过id取到数据，set到对应对象，add到空的list中
		 */
		for(TbChangeorghistory tbChangeorghistory:tbChangeorghistories){
			List<TbEmployee> tbEmployees=dao.getTbEmployees(tbChangeorghistory.getTbEmployee().getEmployeeid());
			tbChangeorghistory.setTbEmployee(tbEmployees.get(0));
			List<OrganizationNj> organizationNjs =dao.getOrganizationNjs(tbChangeorghistory.getOrganizationNjByInorgid().getOrgid());
			tbChangeorghistory.setOrganizationNjByInorgid(organizationNjs.get(0));
			List<OrganizationNj> organizationNjsTwo=dao.getOrganizationNjs(tbChangeorghistory.getOrganizationNjByOutorgid().getOrgid());
			tbChangeorghistory.setOrganizationNjByOutorgid(organizationNjsTwo.get(0));
			tbChangeorghistoriesNew.add(tbChangeorghistory);
		}
		return tbChangeorghistoriesNew;
	}
	
	public List<TbSubareaorgrelation> getTbSubareaorgrelations(){
		/**
		 * 调用dao层，取到TbChangeorghistory中所有数据
		 */
		List<TbSubareaorgrelation> tbSubareaorgrelations=dao.getTbSubareaorgrelations();
		/**
		 * 声明一个空的list
		 */
		List<TbSubareaorgrelation> tbSubareaorgrelationsNew =new ArrayList<>();
		/**
		 * 遍历，通过id取到数据，set到对应对象，add到空的list中
		 */
		for(TbSubareaorgrelation tbSubareaorgrelation:tbSubareaorgrelations){
			List<OrganizationNj> organizationNjs=dao.getOrganizationNjs(tbSubareaorgrelation.getOrganizationNj().getOrgid());
			tbSubareaorgrelation.setOrganizationNj(organizationNjs.get(0));
			if(tbSubareaorgrelation.getTbSubarea()!=null){
				List<TbSubarea> tbSubareas=dao.getTbSubareas(tbSubareaorgrelation.getTbSubarea().getSubareaid());
				List<TbArea> tbAreas=dao.getAreas(tbSubareas.get(0).getTbArea().getAreaid());
				TbSubarea tbSubarea = tbSubareas.get(0);
				tbSubarea.setTbArea(tbAreas.get(0));
				tbSubareaorgrelation.setTbSubarea(tbSubareas.get(0));
			}		
			tbSubareaorgrelationsNew.add(tbSubareaorgrelation);
		}
		return tbSubareaorgrelationsNew;
	}
}
