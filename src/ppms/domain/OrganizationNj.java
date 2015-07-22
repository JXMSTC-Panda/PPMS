package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 * OrganizationNj entity. @author MyEclipse Persistence Tools
 */
public class OrganizationNj extends AbstractOrganizationNj implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public OrganizationNj() {
	}

	/** minimal constructor */
	public OrganizationNj(Integer orgId) {
		super(orgId);
	}

	/** full constructor */
	public OrganizationNj(Integer orgId, String orgName, String address,
			Date expireTime, Integer superiorId, Boolean status,
			String contactName, String contactTel, BigDecimal userCounty,
			Byte type, Integer regionId, String channelType,
			Set tbMonthPerformanceOpens, Set tbBecomeEmployeeExams,
			Set tbSubAreaOrgRelations, Set tbStandardChecks,
			Set tbChangeOrgHistoriesForOutOrgId,
			Set tbInnovationsForEmployeeOrgId, Set tbOperationChecks,
			Set tbEmployeePraiseCriticisms, Set tbOperationTrainings,
			Set tbAreaOrgRelations, Set tbMonthExams, Set tbFreshEmployeeExams,
			Set tbMonitorChecks, Set tbMountGuardExams, Set tbPerformances,
			Set tbVisitChecks, Set tbOrgPraiseCriticisms,
			Set tbChangeOrgHistoriesForInOrgId, Set tbInnovationsForOrgId,
			Set COrganizationNjs, Set CUserInfos, Set tbEmployees,
			Set tbPromotionTrainings, Set operatorNjs) {
		super(orgId, orgName, address, expireTime, superiorId, status,
				contactName, contactTel, userCounty, type, regionId,
				channelType, tbMonthPerformanceOpens, tbBecomeEmployeeExams,
				tbSubAreaOrgRelations, tbStandardChecks,
				tbChangeOrgHistoriesForOutOrgId, tbInnovationsForEmployeeOrgId,
				tbOperationChecks, tbEmployeePraiseCriticisms,
				tbOperationTrainings, tbAreaOrgRelations, tbMonthExams,
				tbFreshEmployeeExams, tbMonitorChecks, tbMountGuardExams,
				tbPerformances, tbVisitChecks, tbOrgPraiseCriticisms,
				tbChangeOrgHistoriesForInOrgId, tbInnovationsForOrgId,
				COrganizationNjs, CUserInfos, tbEmployees,
				tbPromotionTrainings, operatorNjs);
	}

}
