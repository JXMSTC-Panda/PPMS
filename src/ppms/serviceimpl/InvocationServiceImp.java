package ppms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppms.daoimpl.InvocationDaoImp;
import ppms.domain.OrganizationNj;
import ppms.service.InvocationService;

@Service
public class InvocationServiceImp implements InvocationService {

	@Autowired
	private InvocationDaoImp dao;
	@Override
	public List<OrganizationNj> getOrganizations() {
		return dao.getOrganizations();
	}
}
