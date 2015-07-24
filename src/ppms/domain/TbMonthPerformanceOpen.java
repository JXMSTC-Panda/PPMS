package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * TbMonthperformanceopen entity. @author MyEclipse Persistence Tools
 */
public class TbMonthperformanceopen extends AbstractTbMonthperformanceopen
=======
 * TbMonthPerformanceOpen entity. @author MyEclipse Persistence Tools
 */
public class TbMonthPerformanceOpen extends AbstractTbMonthPerformanceOpen
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
<<<<<<< HEAD
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
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
