package ppms.domain;

import java.util.Date;

/**
 * TbChangeorghistory entity. @author MyEclipse Persistence Tools
 */

public class TbChangeorghistory implements java.io.Serializable {

	// Fields

	private String orghistoryid;
	private TbEmployee tbEmployee;
	private OrganizationNj organizationNjByOutorgid;
	private OrganizationNj organizationNjByInorgid;
	private Date changedate;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;

	// Constructors

	/** default constructor */
	public TbChangeorghistory() {
	}

	/** minimal constructor */
	public TbChangeorghistory(String orghistoryid) {
		this.orghistoryid = orghistoryid;
	}

	/** full constructor */
	public TbChangeorghistory(String orghistoryid, TbEmployee tbEmployee,
			OrganizationNj organizationNjByOutorgid,
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
	}

	// Property accessors

	public String getOrghistoryid() {
		return this.orghistoryid;
	}

	public void setOrghistoryid(String orghistoryid) {
		this.orghistoryid = orghistoryid;
	}

	public TbEmployee getTbEmployee() {
		return this.tbEmployee;
	}

	public void setTbEmployee(TbEmployee tbEmployee) {
		this.tbEmployee = tbEmployee;
	}

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
	}

}