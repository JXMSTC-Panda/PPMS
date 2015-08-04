package ppms.domain;

import java.util.Date;

/**
 * TbStandardcheck entity. @author MyEclipse Persistence Tools
 */

public class TbStandardcheck implements java.io.Serializable {

	// Fields

	private String standardcheckid;
	private OrganizationNj organizationNj;
	private Date checkdate;
	private Double checkscore;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;

	// Constructors

	/** default constructor */
	public TbStandardcheck() {
	}

	/** minimal constructor */
	public TbStandardcheck(String standardcheckid) {
		this.standardcheckid = standardcheckid;
	}

	/** full constructor */
	public TbStandardcheck(String standardcheckid,
			OrganizationNj organizationNj, Date checkdate, Double checkscore,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
		this.standardcheckid = standardcheckid;
		this.organizationNj = organizationNj;
		this.checkdate = checkdate;
		this.checkscore = checkscore;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
	}

	// Property accessors

	public String getStandardcheckid() {
		return this.standardcheckid;
	}

	public void setStandardcheckid(String standardcheckid) {
		this.standardcheckid = standardcheckid;
	}

	public OrganizationNj getOrganizationNj() {
		return this.organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

	public Date getCheckdate() {
		return this.checkdate;
	}

	public void setCheckdate(Date checkdate) {
		this.checkdate = checkdate;
	}

	public Double getCheckscore() {
		return this.checkscore;
	}

	public void setCheckscore(Double checkscore) {
		this.checkscore = checkscore;
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