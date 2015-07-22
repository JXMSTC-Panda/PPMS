package ppms.domain;

import java.util.Date;

/**
 * AbstractTbMonthperformanceopen entity provides the base persistence
 * definition of the TbMonthperformanceopen entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractTbMonthperformanceopen implements
		java.io.Serializable {

	// Fields

	private String openid;
	private OrganizationNj organizationNj;
	private Date openmonth;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;

	// Constructors

	/** default constructor */
	public AbstractTbMonthperformanceopen() {
	}

	/** minimal constructor */
	public AbstractTbMonthperformanceopen(String openid) {
		this.openid = openid;
	}

	/** full constructor */
	public AbstractTbMonthperformanceopen(String openid,
			OrganizationNj organizationNj, Date openmonth, String createdby,
			Date createdtime, String modifiedby, Date modifiedtime) {
		this.openid = openid;
		this.organizationNj = organizationNj;
		this.openmonth = openmonth;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
	}

	// Property accessors

	public String getOpenid() {
		return this.openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public OrganizationNj getOrganizationNj() {
		return this.organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

	public Date getOpenmonth() {
		return this.openmonth;
	}

	public void setOpenmonth(Date openmonth) {
		this.openmonth = openmonth;
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