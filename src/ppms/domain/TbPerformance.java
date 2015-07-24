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
<<<<<<< HEAD
	public TbPerformance(String performanceid) {
		super(performanceid);
	}

	/** full constructor */
	public TbPerformance(String performanceid, OrganizationNj organizationNj,
			TbEmployee tbEmployee, Boolean performancetype,
			Date performancedate, Double performancescore, String remark,
			String gradestandardorgfilename, String gradestandardfilename,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
		super(performanceid, organizationNj, tbEmployee, performancetype,
				performancedate, performancescore, remark,
				gradestandardorgfilename, gradestandardfilename, createdby,
				createdtime, modifiedby, modifiedtime);
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
