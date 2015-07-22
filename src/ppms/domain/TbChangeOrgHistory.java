package ppms.domain;

import java.util.Date;

/**
 * TbChangeOrgHistory entity. @author MyEclipse Persistence Tools
 */
public class TbChangeOrgHistory extends AbstractTbChangeOrgHistory implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbChangeOrgHistory() {
	}

	/** minimal constructor */
	public TbChangeOrgHistory(String orgHistoryId) {
		super(orgHistoryId);
	}

	/** full constructor */
	public TbChangeOrgHistory(String orgHistoryId, TbEmployee tbEmployee,
			OrganizationNj organizationNjByOutOrgId,
			OrganizationNj organizationNjByInOrgId, Date changeDate,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime) {
		super(orgHistoryId, tbEmployee, organizationNjByOutOrgId,
				organizationNjByInOrgId, changeDate, createdBy, createdTime,
				modifiedBy, modifiedTime);
	}

}
