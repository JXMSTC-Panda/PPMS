package ppms.domain;

import java.util.Date;

import ppms.annotation.ValueChange;

/**
 * TbEmployeepraisecriticism entity. @author MyEclipse Persistence Tools
 */

public class TbEmployeepraisecriticism implements java.io.Serializable {


	// Fields

	
	private String praisecriticismid;
	private OrganizationNj organizationNj;
	private TbEmployee tbEmployee;
	private String type;
	private String level;
	private String score;
	
	
	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@ValueChange(key_type="EmployeePraiseCriticismType")
	private String praisecriticismtype;
	private String cause;
	private Date praisecriticismdate;
	@ValueChange(key_type="EmployeeCriticismLevel")
	private String praisecriticismlevel;
	private String orgpraisecriticmrelationid;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;

	// Constructors

	/** default constructor */
	public TbEmployeepraisecriticism() {
	}

	/** minimal constructor */
	public TbEmployeepraisecriticism(String praisecriticismid) {
		this.praisecriticismid = praisecriticismid;
	}

	/** full constructor */
	public TbEmployeepraisecriticism(String praisecriticismid,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			String praisecriticismtype, String cause, Date praisecriticismdate,
			String praisecriticismlevel, String orgpraisecriticmrelationid,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
		this.praisecriticismid = praisecriticismid;
		this.organizationNj = organizationNj;
		this.tbEmployee = tbEmployee;
		this.praisecriticismtype = praisecriticismtype;
		this.cause = cause;
		this.praisecriticismdate = praisecriticismdate;
		this.praisecriticismlevel = praisecriticismlevel;
		this.orgpraisecriticmrelationid = orgpraisecriticmrelationid;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
	}

	// Property accessors

	public String getPraisecriticismid() {
		return this.praisecriticismid;
	}

	public void setPraisecriticismid(String praisecriticismid) {
		this.praisecriticismid = praisecriticismid;
	}

	public OrganizationNj getOrganizationNj() {
		return this.organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

	public TbEmployee getTbEmployee() {
		return this.tbEmployee;
	}

	public void setTbEmployee(TbEmployee tbEmployee) {
		this.tbEmployee = tbEmployee;
	}

	public String getPraisecriticismtype() {
		return this.praisecriticismtype;
	}

	public void setPraisecriticismtype(String praisecriticismtype) {
		this.praisecriticismtype = praisecriticismtype;
	}

	public String getCause() {
		return this.cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public Date getPraisecriticismdate() {
		return this.praisecriticismdate;
	}

	public void setPraisecriticismdate(Date praisecriticismdate) {
		this.praisecriticismdate = praisecriticismdate;
	}

	public String getPraisecriticismlevel() {
		return this.praisecriticismlevel;
	}

	public void setPraisecriticismlevel(String praisecriticismlevel) {
		this.praisecriticismlevel = praisecriticismlevel;
	}

	public String getOrgpraisecriticmrelationid() {
		return this.orgpraisecriticmrelationid;
	}

	public void setOrgpraisecriticmrelationid(String orgpraisecriticmrelationid) {
		this.orgpraisecriticmrelationid = orgpraisecriticmrelationid;
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