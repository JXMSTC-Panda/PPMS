package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * AbstractTbEmployeepraisecriticism entity provides the base persistence
 * definition of the TbEmployeepraisecriticism entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractTbEmployeepraisecriticism implements
=======
 * AbstractTbEmployeePraiseCriticism entity provides the base persistence
 * definition of the TbEmployeePraiseCriticism entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractTbEmployeePraiseCriticism implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Fields

<<<<<<< HEAD
	private String praisecriticismid;
	private OrganizationNj organizationNj;
	private TbEmployee tbEmployee;
	private String praisecriticismtype;
	private String cause;
	private Date praisecriticismdate;
	private String praisecriticismlevel;
	private String orgpraisecriticmrelationid;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
=======
	private String praiseCriticismId;
	private OrganizationNj organizationNj;
	private TbEmployee tbEmployee;
	private String praiseCriticismType;
	private String cause;
	private Date praiseCriticismDate;
	private String praiseCriticismLevel;
	private String orgPraiseCriticmRelationId;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public AbstractTbEmployeepraisecriticism() {
	}

	/** minimal constructor */
	public AbstractTbEmployeepraisecriticism(String praisecriticismid) {
		this.praisecriticismid = praisecriticismid;
	}

	/** full constructor */
	public AbstractTbEmployeepraisecriticism(String praisecriticismid,
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
=======
	public AbstractTbEmployeePraiseCriticism() {
	}

	/** minimal constructor */
	public AbstractTbEmployeePraiseCriticism(String praiseCriticismId) {
		this.praiseCriticismId = praiseCriticismId;
	}

	/** full constructor */
	public AbstractTbEmployeePraiseCriticism(String praiseCriticismId,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			String praiseCriticismType, String cause, Date praiseCriticismDate,
			String praiseCriticismLevel, String orgPraiseCriticmRelationId,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime) {
		this.praiseCriticismId = praiseCriticismId;
		this.organizationNj = organizationNj;
		this.tbEmployee = tbEmployee;
		this.praiseCriticismType = praiseCriticismType;
		this.cause = cause;
		this.praiseCriticismDate = praiseCriticismDate;
		this.praiseCriticismLevel = praiseCriticismLevel;
		this.orgPraiseCriticmRelationId = orgPraiseCriticmRelationId;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
	public String getPraisecriticismid() {
		return this.praisecriticismid;
	}

	public void setPraisecriticismid(String praisecriticismid) {
		this.praisecriticismid = praisecriticismid;
=======
	public String getPraiseCriticismId() {
		return this.praiseCriticismId;
	}

	public void setPraiseCriticismId(String praiseCriticismId) {
		this.praiseCriticismId = praiseCriticismId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
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

<<<<<<< HEAD
	public String getPraisecriticismtype() {
		return this.praisecriticismtype;
	}

	public void setPraisecriticismtype(String praisecriticismtype) {
		this.praisecriticismtype = praisecriticismtype;
=======
	public String getPraiseCriticismType() {
		return this.praiseCriticismType;
	}

	public void setPraiseCriticismType(String praiseCriticismType) {
		this.praiseCriticismType = praiseCriticismType;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public String getCause() {
		return this.cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

<<<<<<< HEAD
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
=======
	public Date getPraiseCriticismDate() {
		return this.praiseCriticismDate;
	}

	public void setPraiseCriticismDate(Date praiseCriticismDate) {
		this.praiseCriticismDate = praiseCriticismDate;
	}

	public String getPraiseCriticismLevel() {
		return this.praiseCriticismLevel;
	}

	public void setPraiseCriticismLevel(String praiseCriticismLevel) {
		this.praiseCriticismLevel = praiseCriticismLevel;
	}

	public String getOrgPraiseCriticmRelationId() {
		return this.orgPraiseCriticmRelationId;
	}

	public void setOrgPraiseCriticmRelationId(String orgPraiseCriticmRelationId) {
		this.orgPraiseCriticmRelationId = orgPraiseCriticmRelationId;
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