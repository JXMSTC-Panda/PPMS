package ppms.domain;

import java.util.Date;

/**
 * TbOperationcheck entity. @author MyEclipse Persistence Tools
 */

public class TbOperationcheck implements java.io.Serializable {

	// Fields

	private String operationcheckid;
	private OrganizationNj organizationNj;
	private TbEmployee tbEmployee;
	private Date operationdate;
	private String customermobilenumber;
	private String operationtype;
	private String punishresult;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;

	// Constructors

	/** default constructor */
	public TbOperationcheck() {
	}

	/** minimal constructor */
	public TbOperationcheck(String operationcheckid) {
		this.operationcheckid = operationcheckid;
	}

	/** full constructor */
	public TbOperationcheck(String operationcheckid,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			Date operationdate, String customermobilenumber,
			String operationtype, String punishresult, String createdby,
			Date createdtime, String modifiedby, Date modifiedtime) {
		this.operationcheckid = operationcheckid;
		this.organizationNj = organizationNj;
		this.tbEmployee = tbEmployee;
		this.operationdate = operationdate;
		this.customermobilenumber = customermobilenumber;
		this.operationtype = operationtype;
		this.punishresult = punishresult;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
	}

	// Property accessors

	public String getOperationcheckid() {
		return this.operationcheckid;
	}

	public void setOperationcheckid(String operationcheckid) {
		this.operationcheckid = operationcheckid;
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

	public Date getOperationdate() {
		return this.operationdate;
	}

	public void setOperationdate(Date operationdate) {
		this.operationdate = operationdate;
	}

	public String getCustomermobilenumber() {
		return this.customermobilenumber;
	}

	public void setCustomermobilenumber(String customermobilenumber) {
		this.customermobilenumber = customermobilenumber;
	}

	public String getOperationtype() {
		return this.operationtype;
	}

	public void setOperationtype(String operationtype) {
		this.operationtype = operationtype;
	}

	public String getPunishresult() {
		return this.punishresult;
	}

	public void setPunishresult(String punishresult) {
		this.punishresult = punishresult;
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