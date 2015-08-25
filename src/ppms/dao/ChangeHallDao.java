package ppms.dao;

import java.math.BigDecimal;
import java.util.List;

import ppms.domain.OrganizationNj;
import ppms.domain.TbArea;
import ppms.domain.TbChangeorghistory;
import ppms.domain.TbEmployee;
import ppms.domain.TbSubarea;
import ppms.domain.TbSubareaorgrelation;

public interface ChangeHallDao {

	public List<OrganizationNj> getOrganizationNjs(int orgid);

	public List<TbEmployee> getTbEmployees(String employeeid);

	public List<TbChangeorghistory> getTbChangeorghistories();

	public List<TbSubareaorgrelation> getTbSubareaorgrelations();

	public List<TbSubarea> getTbSubareas(BigDecimal subareaid);

	public List<TbArea> getAreas(BigDecimal areaid);

}
