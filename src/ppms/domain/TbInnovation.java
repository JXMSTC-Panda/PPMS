package ppms.domain;

import java.util.Date;

/**
 * TbInnovation entity. @author MyEclipse Persistence Tools
 */
public class TbInnovation extends AbstractTbInnovation implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbInnovation() {
	}

	/** minimal constructor */
	public TbInnovation(String innovationId) {
		super(innovationId);
	}

	/** full constructor */
	public TbInnovation(String innovationId,
			OrganizationNj organizationNjByOrgId, TbEmployee tbEmployee,
			OrganizationNj organizationNjByEmployeeOrgId,
			String innovationContent, Date assessDate, String assessResult,
			String assessLevel, String encouragement, String createdBy,
			Date createdTime, String modifiedBy, Date modifiedTime) {
		super(innovationId, organizationNjByOrgId, tbEmployee,
				organizationNjByEmployeeOrgId, innovationContent, assessDate,
				assessResult, assessLevel, encouragement, createdBy,
				createdTime, modifiedBy, modifiedTime);
	}

}
