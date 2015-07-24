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
<<<<<<< HEAD
	public TbInnovation(String innovationid) {
		super(innovationid);
	}

	/** full constructor */
	public TbInnovation(String innovationid,
			OrganizationNj organizationNjByOrgid, TbEmployee tbEmployee,
			OrganizationNj organizationNjByEmployeeorgid,
			String innovationcontent, Date assessdate, String assessresult,
			String assesslevel, String encouragement, String createdby,
			Date createdtime, String modifiedby, Date modifiedtime) {
		super(innovationid, organizationNjByOrgid, tbEmployee,
				organizationNjByEmployeeorgid, innovationcontent, assessdate,
				assessresult, assesslevel, encouragement, createdby,
				createdtime, modifiedby, modifiedtime);
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
