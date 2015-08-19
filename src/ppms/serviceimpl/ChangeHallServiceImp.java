package ppms.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.daoimpl.ChangeHallDaoImp;
import ppms.domain.OrganizationNj;
import ppms.domain.TbChangeorghistory;
import ppms.domain.TbEmployee;
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
}
