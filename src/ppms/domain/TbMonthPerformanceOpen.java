package ppms.domain;

import java.util.Date;

/**
 * TbMonthperformanceopen entity. @author MyEclipse Persistence Tools
 */
public class TbMonthperformanceopen extends AbstractTbMonthperformanceopen
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbMonthperformanceopen() {
	}

	/** minimal constructor */
	public TbMonthperformanceopen(String openid) {
		super(openid);
	}

	/** full constructor */
	public TbMonthperformanceopen(String openid, OrganizationNj organizationNj,
			Date openmonth, String createdby, Date createdtime,
			String modifiedby, Date modifiedtime) {
		super(openid, organizationNj, openmonth, createdby, createdtime,
				modifiedby, modifiedtime);
	}

}
