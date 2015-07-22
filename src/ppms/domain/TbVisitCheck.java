package ppms.domain;

import java.util.Date;

/**
 * TbVisitCheck entity. @author MyEclipse Persistence Tools
 */
public class TbVisitCheck extends AbstractTbVisitCheck implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbVisitCheck() {
	}

	/** minimal constructor */
	public TbVisitCheck(String visitCheckId) {
		super(visitCheckId);
	}

	/** full constructor */
	public TbVisitCheck(String visitCheckId, OrganizationNj organizationNj,
			Date checkDate, Double firstScore, Double secondScore,
			Double consistencyScore, Double averageScore, String createdBy,
			Date createdTime, String modifiedBy, Date modifiedTime) {
		super(visitCheckId, organizationNj, checkDate, firstScore, secondScore,
				consistencyScore, averageScore, createdBy, createdTime,
				modifiedBy, modifiedTime);
	}

}
