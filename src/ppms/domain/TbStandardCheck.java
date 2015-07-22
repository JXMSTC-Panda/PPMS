package ppms.domain;

import java.util.Date;

/**
 * TbStandardCheck entity. @author MyEclipse Persistence Tools
 */
public class TbStandardCheck extends AbstractTbStandardCheck implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbStandardCheck() {
	}

	/** minimal constructor */
	public TbStandardCheck(String standardCheckId) {
		super(standardCheckId);
	}

	/** full constructor */
	public TbStandardCheck(String standardCheckId,
			OrganizationNj organizationNj, Date checkDate, Double checkScore,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime) {
		super(standardCheckId, organizationNj, checkDate, checkScore,
				createdBy, createdTime, modifiedBy, modifiedTime);
	}

}
