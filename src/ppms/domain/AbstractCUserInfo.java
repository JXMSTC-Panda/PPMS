package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * AbstractCUserInfo entity provides the base persistence definition of the
 * CUserInfo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCUserInfo implements java.io.Serializable {

	// Fields

	private BigDecimal operId;
	private OrganizationNj organizationNj;
	private String operName;
	private String operPass;
	private String roleId;
	private BigDecimal departId;
	private BigDecimal centerId;
	private String zwId;
	private BigDecimal userCountry;
	private BigDecimal isValid;
	private BigDecimal shortNum;
	private BigDecimal mobileNum;
	private BigDecimal operatingId;
	private Date operatingDate;

	// Constructors

	/** default constructor */
	public AbstractCUserInfo() {
	}

	/** minimal constructor */
	public AbstractCUserInfo(BigDecimal operId) {
		this.operId = operId;
	}

	/** full constructor */
	public AbstractCUserInfo(BigDecimal operId, OrganizationNj organizationNj,
			String operName, String operPass, String roleId,
			BigDecimal departId, BigDecimal centerId, String zwId,
			BigDecimal userCountry, BigDecimal isValid, BigDecimal shortNum,
			BigDecimal mobileNum, BigDecimal operatingId, Date operatingDate) {
		this.operId = operId;
		this.organizationNj = organizationNj;
		this.operName = operName;
		this.operPass = operPass;
		this.roleId = roleId;
		this.departId = departId;
		this.centerId = centerId;
		this.zwId = zwId;
		this.userCountry = userCountry;
		this.isValid = isValid;
		this.shortNum = shortNum;
		this.mobileNum = mobileNum;
		this.operatingId = operatingId;
		this.operatingDate = operatingDate;
	}

	// Property accessors

	public BigDecimal getOperId() {
		return this.operId;
	}

	public void setOperId(BigDecimal operId) {
		this.operId = operId;
	}

	public OrganizationNj getOrganizationNj() {
		return this.organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

	public String getOperName() {
		return this.operName;
	}

	public void setOperName(String operName) {
		this.operName = operName;
	}

	public String getOperPass() {
		return this.operPass;
	}

	public void setOperPass(String operPass) {
		this.operPass = operPass;
	}

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public BigDecimal getDepartId() {
		return this.departId;
	}

	public void setDepartId(BigDecimal departId) {
		this.departId = departId;
	}

	public BigDecimal getCenterId() {
		return this.centerId;
	}

	public void setCenterId(BigDecimal centerId) {
		this.centerId = centerId;
	}

	public String getZwId() {
		return this.zwId;
	}

	public void setZwId(String zwId) {
		this.zwId = zwId;
	}

	public BigDecimal getUserCountry() {
		return this.userCountry;
	}

	public void setUserCountry(BigDecimal userCountry) {
		this.userCountry = userCountry;
	}

	public BigDecimal getIsValid() {
		return this.isValid;
	}

	public void setIsValid(BigDecimal isValid) {
		this.isValid = isValid;
	}

	public BigDecimal getShortNum() {
		return this.shortNum;
	}

	public void setShortNum(BigDecimal shortNum) {
		this.shortNum = shortNum;
	}

	public BigDecimal getMobileNum() {
		return this.mobileNum;
	}

	public void setMobileNum(BigDecimal mobileNum) {
		this.mobileNum = mobileNum;
	}

	public BigDecimal getOperatingId() {
		return this.operatingId;
	}

	public void setOperatingId(BigDecimal operatingId) {
		this.operatingId = operatingId;
	}

	public Date getOperatingDate() {
		return this.operatingDate;
	}

	public void setOperatingDate(Date operatingDate) {
		this.operatingDate = operatingDate;
	}

}