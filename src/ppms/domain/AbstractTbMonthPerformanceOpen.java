package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * AbstractTbMonthperformanceopen entity provides the base persistence
 * definition of the TbMonthperformanceopen entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractTbMonthperformanceopen implements
=======
 * AbstractTbMonthPerformanceOpen entity provides the base persistence
 * definition of the TbMonthPerformanceOpen entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractTbMonthPerformanceOpen implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Fields

<<<<<<< HEAD
	private String openid;
	private OrganizationNj organizationNj;
	private Date openmonth;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
=======
	private String openId;
	private OrganizationNj organizationNj;
	private Date openMonth;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public AbstractTbMonthperformanceopen() {
	}

	/** minimal constructor */
	public AbstractTbMonthperformanceopen(String openid) {
		this.openid = openid;
	}

	/** full constructor */
	public AbstractTbMonthperformanceopen(String openid,
			OrganizationNj organizationNj, Date openmonth, String createdby,
			Date createdtime, String modifiedby, Date modifiedtime) {
		this.openid = openid;
		this.organizationNj = organizationNj;
		this.openmonth = openmonth;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
=======
	public AbstractTbMonthPerformanceOpen() {
	}

	/** minimal constructor */
	public AbstractTbMonthPerformanceOpen(String openId) {
		this.openId = openId;
	}

	/** full constructor */
	public AbstractTbMonthPerformanceOpen(String openId,
			OrganizationNj organizationNj, Date openMonth, String createdBy,
			Date createdTime, String modifiedBy, Date modifiedTime) {
		this.openId = openId;
		this.organizationNj = organizationNj;
		this.openMonth = openMonth;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
	public String getOpenid() {
		return this.openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
=======
	public String getOpenId() {
		return this.openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public OrganizationNj getOrganizationNj() {
		return this.organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

<<<<<<< HEAD
	public Date getOpenmonth() {
		return this.openmonth;
	}

	public void setOpenmonth(Date openmonth) {
		this.openmonth = openmonth;
	}

	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getCreatedtime() {
		return this.createdtime;
	}

	public void setCreatedtime(Date createdtime) {
		this.createdtime = createdtime;
	}

	public String getModifiedby() {
		return this.modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}

	public Date getModifiedtime() {
		return this.modifiedtime;
	}

	public void setModifiedtime(Date modifiedtime) {
		this.modifiedtime = modifiedtime;
=======
	public Date getOpenMonth() {
		return this.openMonth;
	}

	public void setOpenMonth(Date openMonth) {
		this.openMonth = openMonth;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}