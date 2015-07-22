package ppms.domain;

import java.util.Date;

/**
 * TbMonthPerformanceOpen entity. @author MyEclipse Persistence Tools
 */
public class TbMonthPerformanceOpen extends AbstractTbMonthPerformanceOpen
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbMonthPerformanceOpen() {
	}

	/** minimal constructor */
	public TbMonthPerformanceOpen(String openId) {
		super(openId);
	}

	/** full constructor */
	public TbMonthPerformanceOpen(String openId, OrganizationNj organizationNj,
			Date openMonth, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime) {
		super(openId, organizationNj, openMonth, createdBy, createdTime,
				modifiedBy, modifiedTime);
	}

}
