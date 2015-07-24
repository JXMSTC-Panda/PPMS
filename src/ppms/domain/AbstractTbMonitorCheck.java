package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * AbstractTbMonitorcheck entity provides the base persistence definition of the
 * TbMonitorcheck entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbMonitorcheck implements java.io.Serializable {

	// Fields

	private String monitorcheckid;
	private OrganizationNj organizationNj;
	private Date checkdate;
	private String checktype;
	private String detail;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public AbstractTbMonitorcheck() {
	}

	/** minimal constructor */
	public AbstractTbMonitorcheck(String monitorcheckid) {
		this.monitorcheckid = monitorcheckid;
	}

	/** full constructor */
	public AbstractTbMonitorcheck(String monitorcheckid,
			OrganizationNj organizationNj, Date checkdate, String checktype,
			String detail, String createdby, Date createdtime,
			String modifiedby, Date modifiedtime) {
		this.monitorcheckid = monitorcheckid;
		this.organizationNj = organizationNj;
		this.checkdate = checkdate;
		this.checktype = checktype;
		this.detail = detail;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
	public String getMonitorcheckid() {
		return this.monitorcheckid;
	}

	public void setMonitorcheckid(String monitorcheckid) {
		this.monitorcheckid = monitorcheckid;
=======
	public String getMonitorCheckId() {
		return this.monitorCheckId;
	}

	public void setMonitorCheckId(String monitorCheckId) {
		this.monitorCheckId = monitorCheckId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public OrganizationNj getOrganizationNj() {
		return this.organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

<<<<<<< HEAD
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
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

<<<<<<< HEAD
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