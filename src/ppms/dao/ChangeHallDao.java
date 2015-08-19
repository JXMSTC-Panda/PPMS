package ppms.dao;

import java.util.List;

import ppms.domain.OrganizationNj;
import ppms.domain.TbChangeorghistory;
import ppms.domain.TbEmployee;

public interface ChangeHallDao {

	public List<OrganizationNj> getOrganizationNjs(int orgid);

	public List<TbEmployee> getTbEmployees(String employeeid);

	public List<TbChangeorghistory> getTbChangeorghistories();

}
