package ppms.domain;

import java.util.Date;

/**
 * TbPerformance entity. @author MyEclipse Persistence Tools
 */
public class TbPerformance extends AbstractTbPerformance implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbPerformance() {
	}

	/** minimal constructor */
	public TbPerformance(String performanceId) {
		super(performanceId);
	}

	/** full constructor */
	public TbPerformance(String performanceId, OrganizationNj organizationNj,
			TbEmployee tbEmployee, Boolean performanceType,
			Date performanceDate, Double performanceScore, String remark,
			String gradeStandardOrgFileName, String gradeStandardFileName,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime) {
		super(performanceId, organizationNj, tbEmployee, performanceType,
				performanceDate, performanceScore, remark,
				gradeStandardOrgFileName, gradeStandardFileName, createdBy,
				createdTime, modifiedBy, modifiedTime);
	}

}
