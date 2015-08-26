package ppms.serviceimpl;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.daoimpl.HallKeeperDaoImp;
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
import ppms.service.HallKeeperService;

@Service
public class HallKeeperServiceImp implements HallKeeperService {

	@Autowired
	private HallKeeperDaoImp dao;
	
	@Override
	public List<TbMaster> getTbMaster(String value) {
		// TODO Auto-generated method stub
		return dao.getTbMaster(value);
	}

	@Override
	public List<TbPromotiontraining> getTbPromotiontraining(
			String promotioncontent) {
		// TODO Auto-generated method stub
		return dao.getTbPromotiontraining(promotioncontent);
	}

	@Override
	public List<TbEmployee> getTbEmployee(String employeeid) {
		// TODO Auto-generated method stub
		return dao.getEntitiestNotLazy(new TbEmployee(), new String[]{"organizationNj","tbJob","tbRole","tbPost"}, Restrictions.eq("employeeid", employeeid));
	}

	@Override
	public List<COrganizationNj> getCOrganizationNj(Integer orgid) {
		// TODO Auto-generated method stub
		return dao.getCOrganizationNj(orgid);
	}

	@Override
	public List<TbArea> getOrganizationNj(BigDecimal areaid) {
		// TODO Auto-generated method stub
		return dao.getOrganizationNj(areaid);
	}

	@Override
	public List<OrganizationNj> getOrganizationNj(Integer orgid) {
		// TODO Auto-generated method stub
		return dao.getOrganizationNj(orgid);
	}

	@Override
	public List<TbVisitcheck> getTbVisitcheck(Integer orgid) {
		// TODO Auto-generated method stub
		return dao.getTbVisitcheck(orgid);
	}

	@Override
	public List<TbPerformance> getTbPerformance(String employeeid) {
		// TODO Auto-generated method stub
		return dao.getTbPerformance(employeeid);
	}

	@Override
	public List<TbPost> getTbPost(String postid) {
		// TODO Auto-generated method stub
		return dao.getTbPost(postid);
	}

	@Override
	public List<TbMountguardexam> getAll(String key) {
		List<TbMountguardexam> entitiestNotLazy = dao.getEntitiestNotLazy(new TbMountguardexam(), new String[]{"organizationNj","tbEmployee"}, Restrictions.eq("examtype", key));
		return entitiestNotLazy;
	}

}
