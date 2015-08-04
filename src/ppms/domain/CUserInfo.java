package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * CUserInfo entity. @author MyEclipse Persistence Tools
 */

public class CUserInfo implements java.io.Serializable {

	// Fields

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

	// Constructors

	/** default constructor */
	public CUserInfo() {
	}

	/** minimal constructor */
	public CUserInfo(BigDecimal operid) {
		this.operid = operid;
	}

	/** full constructor */
	public CUserInfo(BigDecimal operid, OrganizationNj organizationNj,
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
	}

	// Property accessors

	public BigDecimal getOperid() {
		return this.operid;
	}

	public void setOperid(BigDecimal operid) {
		this.operid = operid;
	}

	public OrganizationNj getOrganizationNj() {
		return this.organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

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
	}

}