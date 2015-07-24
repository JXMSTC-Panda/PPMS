package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * AbstractTbChangeorghistory entity provides the base persistence definition of
 * the TbChangeorghistory entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbChangeorghistory implements
=======
 * AbstractTbChangeOrgHistory entity provides the base persistence definition of
 * the TbChangeOrgHistory entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbChangeOrgHistory implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Fields

<<<<<<< HEAD
	private String orghistoryid;
	private TbEmployee tbEmployee;
	private OrganizationNj organizationNjByOutorgid;
	private OrganizationNj organizationNjByInorgid;
	private Date changedate;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
=======
	private String orgHistoryId;
	private TbEmployee tbEmployee;
	private OrganizationNj organizationNjByOutOrgId;
	private OrganizationNj organizationNjByInOrgId;
	private Date changeDate;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public AbstractTbChangeorghistory() {
	}

	/** minimal constructor */
	public AbstractTbChangeorghistory(String orghistoryid) {
		this.orghistoryid = orghistoryid;
	}

	/** full constructor */
	public AbstractTbChangeorghistory(String orghistoryid,
			TbEmployee tbEmployee, OrganizationNj organizationNjByOutorgid,
			OrganizationNj organizationNjByInorgid, Date changedate,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
		this.orghistoryid = orghistoryid;
		this.tbEmployee = tbEmployee;
		this.organizationNjByOutorgid = organizationNjByOutorgid;
		this.organizationNjByInorgid = organizationNjByInorgid;
		this.changedate = changedate;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
	public String getOrghistoryid() {
		return this.orghistoryid;
	}

	public void setOrghistoryid(String orghistoryid) {
		this.orghistoryid = orghistoryid;
=======
	public String getOrgHistoryId() {
		return this.orgHistoryId;
	}

	public void setOrgHistoryId(String orgHistoryId) {
		this.orgHistoryId = orgHistoryId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public TbEmployee getTbEmployee() {
		return this.tbEmployee;
	}

	public void setTbEmployee(TbEmployee tbEmployee) {
		this.tbEmployee = tbEmployee;
	}

<<<<<<< HEAD
	public OrganizationNj getOrganizationNjByOutorgid() {
		return this.organizationNjByOutorgid;
	}

	public void setOrganizationNjByOutorgid(
			OrganizationNj organizationNjByOutorgid) {
		this.organizationNjByOutorgid = organizationNjByOutorgid;
	}

	public OrganizationNj getOrganizationNjByInorgid() {
		return this.organizationNjByInorgid;
	}

	public void setOrganizationNjByInorgid(
			OrganizationNj organizationNjByInorgid) {
		this.organizationNjByInorgid = organizationNjByInorgid;
	}

	public Date getChangedate() {
		return this.changedate;
	}

	public void setChangedate(Date changedate) {
		this.changedate = changedate;
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}