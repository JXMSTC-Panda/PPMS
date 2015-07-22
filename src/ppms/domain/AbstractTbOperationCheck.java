package ppms.domain;

import java.util.Date;

/**
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

	// Constructors

	/** default constructor */
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
	}

	// Property accessors

	public String getOperationCheckId() {
		return this.operationCheckId;
	}

	public void setOperationCheckId(String operationCheckId) {
		this.operationCheckId = operationCheckId;
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
	}

}