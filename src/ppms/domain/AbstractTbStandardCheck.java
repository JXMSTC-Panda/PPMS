package ppms.domain;

import java.util.Date;

/**
 * AbstractTbStandardCheck entity provides the base persistence definition of
 * the TbStandardCheck entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbStandardCheck implements java.io.Serializable {

	// Fields

	private String standardCheckId;
	private OrganizationNj organizationNj;
	private Date checkDate;
	private Double checkScore;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;

	// Constructors

	/** default constructor */
	public AbstractTbStandardCheck() {
	}

	/** minimal constructor */
	public AbstractTbStandardCheck(String standardCheckId) {
		this.standardCheckId = standardCheckId;
	}

	/** full constructor */
	public AbstractTbStandardCheck(String standardCheckId,
			OrganizationNj organizationNj, Date checkDate, Double checkScore,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime) {
		this.standardCheckId = standardCheckId;
		this.organizationNj = organizationNj;
		this.checkDate = checkDate;
		this.checkScore = checkScore;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
	}

	// Property accessors

	public String getStandardCheckId() {
		return this.standardCheckId;
	}

	public void setStandardCheckId(String standardCheckId) {
		this.standardCheckId = standardCheckId;
	}

	public OrganizationNj getOrganizationNj() {
		return this.organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

	public Date getCheckDate() {
		return this.checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	public Double getCheckScore() {
		return this.checkScore;
	}

	public void setCheckScore(Double checkScore) {
		this.checkScore = checkScore;
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