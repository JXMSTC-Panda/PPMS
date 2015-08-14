package ppms.serviceimpl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ppms.dao.StandardCheckDao;
import ppms.daoimpl.StandardCheckDaoImp;
import ppms.domain.OrganizationNj;
import ppms.domain.TbAreaorgrelation;
import ppms.domain.TbStandardcheck;
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
			// TODO: handle exception
		}
		return tbAreaorgrelationReslts;
	}
	
	
	
}
