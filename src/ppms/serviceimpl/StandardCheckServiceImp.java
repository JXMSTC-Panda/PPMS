package ppms.serviceimpl;


import java.awt.geom.Area;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ppms.dao.StandardCheckDao;
import ppms.daoimpl.StandardCheckDaoImp;
import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbAreaorgrelation;
import ppms.domain.TbStandardcheck;
import ppms.domain.TbSubarea;
import ppms.domain.TbSubareaorgrelation;
import ppms.service.StandardCheckService;

@Service
public class StandardCheckServiceImp implements StandardCheckService {
	//DaoImp
	@Autowired
	private StandardCheckDaoImp dao;
	
	@Override
	public void addStandardInfo(TbStandardcheck tbStandardcheck){
		dao.saveObject(tbStandardcheck);
		System.out.println("我在addStandardInfo");
	}
	@Override
	public List<TbStandardcheck> findStandardCheckInfo(){
		return dao.findStandardCheckinfo();
	}
	@Override
	public List<OrganizationNj> findOrganizationNjInfor(int orgId){
		List<OrganizationNj> organizationNjResults = null;
		try {
			organizationNjResults = dao.findOrganizationNjInfor(orgId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return organizationNjResults;
	}
	@Override
	public List<TbAreaorgrelation> findAreaorgrelation(int orgId){
		List<TbAreaorgrelation> tbAreaorgrelationReslts = null;
		try {
			tbAreaorgrelationReslts = dao.findAreaorgrelation(orgId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tbAreaorgrelationReslts;
	}
	
	@Override
	public List<TbArea> findAreaId(BigDecimal areId) {
		List<TbArea> areaResults = null;
		try {
			areaResults = dao.findArea(areId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return areaResults;
	}
	@Override
	public List<TbSubareaorgrelation> findSubAreaId(Integer orgId) {
		List<TbSubareaorgrelation> tbSubareaResults = null;
		try {
			tbSubareaResults = dao.findSubAreaId(orgId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tbSubareaResults;
	}
	@Override
	public List<TbSubarea> findSubareaDesc(BigDecimal subareaid) {
		List<TbSubarea> tbSubareaResults = null;
		try {
			tbSubareaResults = dao.findSubAreaDesc(subareaid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tbSubareaResults;
	}
	@Override
	public List<OrganizationNj> findOrganizationInfo() {
		List<OrganizationNj> organizationNjResults = null;
		try {
			organizationNjResults = dao.findOrganizationNjInfor();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return organizationNjResults;
	}
	@Override
	public List<OrganizationNj> findOrganizationId(Integer orgId) {
		List<OrganizationNj> organizationNjResults = null;
		try {
			organizationNjResults = dao.findOrganizationId(orgId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return organizationNjResults;
	}
	
	
	
}
