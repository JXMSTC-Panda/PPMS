package ppms.domain;

import java.util.Date;

/**
 * AbstractTbVisitCheck entity provides the base persistence definition of the
 * TbVisitCheck entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbVisitCheck implements java.io.Serializable {

	// Fields

	private String visitCheckId;
	private OrganizationNj organizationNj;
	private Date checkDate;
	private Double firstScore;
	private Double secondScore;
	private Double consistencyScore;
	private Double averageScore;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;

	// Constructors

	/** default constructor */
	public AbstractTbVisitCheck() {
	}

	/** minimal constructor */
	public AbstractTbVisitCheck(String visitCheckId) {
		this.visitCheckId = visitCheckId;
	}

	/** full constructor */
	public AbstractTbVisitCheck(String visitCheckId,
			OrganizationNj organizationNj, Date checkDate, Double firstScore,
			Double secondScore, Double consistencyScore, Double averageScore,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime) {
		this.visitCheckId = visitCheckId;
		this.organizationNj = organizationNj;
		this.checkDate = checkDate;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
		this.consistencyScore = consistencyScore;
		this.averageScore = averageScore;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
	}

	// Property accessors

	public String getVisitCheckId() {
		return this.visitCheckId;
	}

	public void setVisitCheckId(String visitCheckId) {
		this.visitCheckId = visitCheckId;
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

	public Double getFirstScore() {
		return this.firstScore;
	}

	public void setFirstScore(Double firstScore) {
		this.firstScore = firstScore;
	}

	public Double getSecondScore() {
		return this.secondScore;
	}

	public void setSecondScore(Double secondScore) {
		this.secondScore = secondScore;
	}

	public Double getConsistencyScore() {
		return this.consistencyScore;
	}

	public void setConsistencyScore(Double consistencyScore) {
		this.consistencyScore = consistencyScore;
	}

	public Double getAverageScore() {
		return this.averageScore;
	}

	public void setAverageScore(Double averageScore) {
		this.averageScore = averageScore;
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