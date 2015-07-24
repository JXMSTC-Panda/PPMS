package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * AbstractTbOperationcheck entity provides the base persistence definition of
 * the TbOperationcheck entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbOperationcheck implements java.io.Serializable {

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
=======
 * AbstractTbOperationCheck entity provides the base persistence definition of
 * the TbOperationCheck entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbOperationCheck implements java.io.Serializable {

	// Fields

	private String operationCheckId;
	private OrganizationNj organizationNj;
	private TbEmployee tbEmployee;
	private Date operationDate;
	private String customerMobileNumber;
	private String operationType;
	private String punishResult;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public AbstractTbOperationcheck() {
	}

	/** minimal constructor */
	public AbstractTbOperationcheck(String operationcheckid) {
		this.operationcheckid = operationcheckid;
	}

	/** full constructor */
	public AbstractTbOperationcheck(String operationcheckid,
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
=======
	public AbstractTbOperationCheck() {
	}

	/** minimal constructor */
	public AbstractTbOperationCheck(String operationCheckId) {
		this.operationCheckId = operationCheckId;
	}

	/** full constructor */
	public AbstractTbOperationCheck(String operationCheckId,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			Date operationDate, String customerMobileNumber,
			String operationType, String punishResult, String createdBy,
			Date createdTime, String modifiedBy, Date modifiedTime) {
		this.operationCheckId = operationCheckId;
		this.organizationNj = organizationNj;
		this.tbEmployee = tbEmployee;
		this.operationDate = operationDate;
		this.customerMobileNumber = customerMobileNumber;
		this.operationType = operationType;
		this.punishResult = punishResult;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
	public String getOperationcheckid() {
		return this.operationcheckid;
	}

	public void setOperationcheckid(String operationcheckid) {
		this.operationcheckid = operationcheckid;
=======
	public String getOperationCheckId() {
		return this.operationCheckId;
	}

	public void setOperationCheckId(String operationCheckId) {
		this.operationCheckId = operationCheckId;
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
=======
	public Date getOperationDate() {
		return this.operationDate;
	}

	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}

	public String getCustomerMobileNumber() {
		return this.customerMobileNumber;
	}

	public void setCustomerMobileNumber(String customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}

	public String getOperationType() {
		return this.operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getPunishResult() {
		return this.punishResult;
	}

	public void setPunishResult(String punishResult) {
		this.punishResult = punishResult;
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