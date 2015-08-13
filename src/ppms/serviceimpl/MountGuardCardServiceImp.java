package ppms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.daoimpl.MountGuardCardDapImp;
import ppms.domain.COrganizationNj;
import ppms.domain.TbEmployee;
import ppms.service.MountGuardCardService;

@Service
public class MountGuardCardServiceImp implements MountGuardCardService {

	@Autowired
	private MountGuardCardDapImp dao;

	/**
	 * 
	 * 
	 * @Title: getTbEmployee
	 * 
	 * @Description: TODO
	 * 
	 * @param:
	 * 
	 * @auther: CappuccinoH
	 * 
	 * @date: 2015-8-11 下午8:21:05
	 */
	@Override
	public List<TbEmployee> getTbEmployee() {
		// TODO Auto-generated method stub
		return dao.getTbEmployee();
	}

	/**
	 * 
	 * 
	 * @Title: getCOrganizationNj
	 * 
	 * @Description: TODO
	 * 
	 * @param: @return
	 * 
	 * @auther: CappuccinoH
	 * 
	 * @date: 2015-8-11 下午8:21:41
	 */
	@Override
	public List<COrganizationNj> getCOrganizationNj() {
		// TODO Auto-generated method stub
		return dao.getCOrganizationNj();
	}

}
