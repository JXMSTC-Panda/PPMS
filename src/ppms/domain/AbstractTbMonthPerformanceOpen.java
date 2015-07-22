package ppms.domain;

import java.util.Date;

/**
 * AbstractTbMonthPerformanceOpen entity provides the base persistence
 * definition of the TbMonthPerformanceOpen entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractTbMonthPerformanceOpen implements
		java.io.Serializable {

	// Fields

	private String openId;
	private OrganizationNj organizationNj;
	private Date openMonth;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;

	// Constructors

	/** default constructor */
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
	}

	// Property accessors

	public String getOpenId() {
		return this.openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public OrganizationNj getOrganizationNj() {
		return this.organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

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
	}

}