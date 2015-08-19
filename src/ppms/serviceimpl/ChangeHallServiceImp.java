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
@Service
public class ChangeHallServiceImp implements ChangeHallService{
	@Autowired
	public ChangeHallDaoImp dao;
	
	@Override
	public List<TbChangeorghistory> getTbChangeorghistories(){
		List<TbChangeorghistory> tbChangeorghistories =dao.getTbChangeorghistories();
		
		List<TbChangeorghistory> tbChangeorghistoriesNew=new ArrayList<>();
		
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
		List<TbSubareaorgrelation> tbSubareaorgrelations=dao.getTbSubareaorgrelations();
		
		List<TbSubareaorgrelation> tbSubareaorgrelationsNew =new ArrayList<>();
		
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
