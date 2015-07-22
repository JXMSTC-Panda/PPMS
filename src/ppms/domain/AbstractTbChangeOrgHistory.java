package ppms.domain;

import java.util.Date;

/**
 * AbstractTbChangeOrgHistory entity provides the base persistence definition of
 * the TbChangeOrgHistory entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbChangeOrgHistory implements
		java.io.Serializable {

	// Fields

	private String orgHistoryId;
	private TbEmployee tbEmployee;
	private OrganizationNj organizationNjByOutOrgId;
	private OrganizationNj organizationNjByInOrgId;
	private Date changeDate;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;

	// Constructors

	/** default constructor */
	public AbstractTbChangeOrgHistory() {
	}

	/** minimal constructor */
	public AbstractTbChangeOrgHistory(String orgHistoryId) {
		this.orgHistoryId = orgHistoryId;
	}

	/** full constructor */
	public AbstractTbChangeOrgHistory(String orgHistoryId,
			TbEmployee tbEmployee, OrganizationNj organizationNjByOutOrgId,
			OrganizationNj organizationNjByInOrgId, Date changeDate,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime) {
		this.orgHistoryId = orgHistoryId;
		this.tbEmployee = tbEmployee;
		this.organizationNjByOutOrgId = organizationNjByOutOrgId;
		this.organizationNjByInOrgId = organizationNjByInOrgId;
		this.changeDate = changeDate;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
	}

	// Property accessors

	public String getOrgHistoryId() {
		return this.orgHistoryId;
	}

	public void setOrgHistoryId(String orgHistoryId) {
		this.orgHistoryId = orgHistoryId;
	}

	public TbEmployee getTbEmployee() {
		return this.tbEmployee;
	}

	public void setTbEmployee(TbEmployee tbEmployee) {
		this.tbEmployee = tbEmployee;
	}

	public OrganizationNj getOrganizationNjByOutOrgId() {
		return this.organizationNjByOutOrgId;
	}

	public void setOrganizationNjByOutOrgId(
			OrganizationNj organizationNjByOutOrgId) {
		this.organizationNjByOutOrgId = organizationNjByOutOrgId;
	}

	public OrganizationNj getOrganizationNjByInOrgId() {
		return this.organizationNjByInOrgId;
	}

	public void setOrganizationNjByInOrgId(
			OrganizationNj organizationNjByInOrgId) {
		this.organizationNjByInOrgId = organizationNjByInOrgId;
	}

	public Date getChangeDate() {
		return this.changeDate;
	}

	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
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