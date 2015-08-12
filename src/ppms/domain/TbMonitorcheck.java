package ppms.domain;

import java.util.Date;

import ppms.annotation.ValueChange;

/**
 * TbMonitorcheck entity. @author MyEclipse Persistence Tools
 */

public class TbMonitorcheck implements java.io.Serializable {

	// Fields

	private String monitorcheckid;
	private OrganizationNj organizationNj;
	private Date checkdate;
	@ValueChange(key_type="MonitorType")
	private String checktype;
	private String detail;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;

	// Constructors

	/** default constructor */
	public TbMonitorcheck() {
	}

	/** minimal constructor */
	public TbMonitorcheck(String monitorcheckid) {
		this.monitorcheckid = monitorcheckid;
	}

	/** full constructor */
	public TbMonitorcheck(String monitorcheckid, OrganizationNj organizationNj,
			Date checkdate, String checktype, String detail, String createdby,
			Date createdtime, String modifiedby, Date modifiedtime) {
		this.monitorcheckid = monitorcheckid;
		this.organizationNj = organizationNj;
		this.checkdate = checkdate;
		this.checktype = checktype;
		this.detail = detail;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
	}

	// Property accessors

	public String getMonitorcheckid() {
		return this.monitorcheckid;
	}

	public void setMonitorcheckid(String monitorcheckid) {
		this.monitorcheckid = monitorcheckid;
	}

	public OrganizationNj getOrganizationNj() {
		return this.organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

	public Date getCheckdate() {
		return this.checkdate;
	}

	public void setCheckdate(Date checkdate) {
		this.checkdate = checkdate;
	}

	public String getChecktype() {
		return this.checktype;
	}

	public void setChecktype(String checktype) {
		this.checktype = checktype;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
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