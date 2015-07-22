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
	}

}
