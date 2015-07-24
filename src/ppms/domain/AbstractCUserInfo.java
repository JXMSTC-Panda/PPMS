package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * AbstractCUserInfo entity provides the base persistence definition of the
 * CUserInfo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCUserInfo implements java.io.Serializable {

	// Fields

<<<<<<< HEAD
	private BigDecimal operid;
	private OrganizationNj organizationNj;
	private String opername;
	private String operpass;
	private String roleid;
	private BigDecimal departid;
	private BigDecimal centerid;
	private String zwid;
	private BigDecimal usercountry;
	private BigDecimal isvalid;
	private BigDecimal shortnum;
	private BigDecimal mobilenum;
	private BigDecimal operatingid;
	private Date operatingdate;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
	public AbstractCUserInfo() {
	}

	/** minimal constructor */
<<<<<<< HEAD
	public AbstractCUserInfo(BigDecimal operid) {
		this.operid = operid;
	}

	/** full constructor */
	public AbstractCUserInfo(BigDecimal operid, OrganizationNj organizationNj,
			String opername, String operpass, String roleid,
			BigDecimal departid, BigDecimal centerid, String zwid,
			BigDecimal usercountry, BigDecimal isvalid, BigDecimal shortnum,
			BigDecimal mobilenum, BigDecimal operatingid, Date operatingdate) {
		this.operid = operid;
		this.organizationNj = organizationNj;
		this.opername = opername;
		this.operpass = operpass;
		this.roleid = roleid;
		this.departid = departid;
		this.centerid = centerid;
		this.zwid = zwid;
		this.usercountry = usercountry;
		this.isvalid = isvalid;
		this.shortnum = shortnum;
		this.mobilenum = mobilenum;
		this.operatingid = operatingid;
		this.operatingdate = operatingdate;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
	public BigDecimal getOperid() {
		return this.operid;
	}

	public void setOperid(BigDecimal operid) {
		this.operid = operid;
=======
	public BigDecimal getOperId() {
		return this.operId;
	}

	public void setOperId(BigDecimal operId) {
		this.operId = operId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public OrganizationNj getOrganizationNj() {
		return this.organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

<<<<<<< HEAD
	public String getOpername() {
		return this.opername;
	}

	public void setOpername(String opername) {
		this.opername = opername;
	}

	public String getOperpass() {
		return this.operpass;
	}

	public void setOperpass(String operpass) {
		this.operpass = operpass;
	}

	public String getRoleid() {
		return this.roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public BigDecimal getDepartid() {
		return this.departid;
	}

	public void setDepartid(BigDecimal departid) {
		this.departid = departid;
	}

	public BigDecimal getCenterid() {
		return this.centerid;
	}

	public void setCenterid(BigDecimal centerid) {
		this.centerid = centerid;
	}

	public String getZwid() {
		return this.zwid;
	}

	public void setZwid(String zwid) {
		this.zwid = zwid;
	}

	public BigDecimal getUsercountry() {
		return this.usercountry;
	}

	public void setUsercountry(BigDecimal usercountry) {
		this.usercountry = usercountry;
	}

	public BigDecimal getIsvalid() {
		return this.isvalid;
	}

	public void setIsvalid(BigDecimal isvalid) {
		this.isvalid = isvalid;
	}

	public BigDecimal getShortnum() {
		return this.shortnum;
	}

	public void setShortnum(BigDecimal shortnum) {
		this.shortnum = shortnum;
	}

	public BigDecimal getMobilenum() {
		return this.mobilenum;
	}

	public void setMobilenum(BigDecimal mobilenum) {
		this.mobilenum = mobilenum;
	}

	public BigDecimal getOperatingid() {
		return this.operatingid;
	}

	public void setOperatingid(BigDecimal operatingid) {
		this.operatingid = operatingid;
	}

	public Date getOperatingdate() {
		return this.operatingdate;
	}

	public void setOperatingdate(Date operatingdate) {
		this.operatingdate = operatingdate;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}