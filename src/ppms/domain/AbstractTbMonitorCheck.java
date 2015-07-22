package ppms.domain;

import java.util.Date;

/**
 * AbstractTbMonitorCheck entity provides the base persistence definition of the
 * TbMonitorCheck entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbMonitorCheck implements java.io.Serializable {

	// Fields

	private String monitorCheckId;
	private OrganizationNj organizationNj;
	private Date checkDate;
	private String checkType;
	private String detail;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;

	// Constructors

	/** default constructor */
	public AbstractTbMonitorCheck() {
	}

	/** minimal constructor */
	public AbstractTbMonitorCheck(String monitorCheckId) {
		this.monitorCheckId = monitorCheckId;
	}

	/** full constructor */
	public AbstractTbMonitorCheck(String monitorCheckId,
			OrganizationNj organizationNj, Date checkDate, String checkType,
			String detail, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime) {
		this.monitorCheckId = monitorCheckId;
		this.organizationNj = organizationNj;
		this.checkDate = checkDate;
		this.checkType = checkType;
		this.detail = detail;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
	}

	// Property accessors

	public String getMonitorCheckId() {
		return this.monitorCheckId;
	}

	public void setMonitorCheckId(String monitorCheckId) {
		this.monitorCheckId = monitorCheckId;
	}

	public OrganizationNj getOrganizationNj() {
		return this.organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

	public Date getCheckDate() {
		return this.checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	public String getCheckType() {
		return this.checkType;
	}

	public void setCheckType(String checkType) {
		this.checkType = checkType;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
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