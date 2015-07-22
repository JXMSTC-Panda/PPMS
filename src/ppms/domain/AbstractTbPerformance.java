package ppms.domain;

import java.util.Date;

/**
 * AbstractTbPerformance entity provides the base persistence definition of the
 * TbPerformance entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbPerformance implements java.io.Serializable {

	// Fields

	private String performanceId;
	private OrganizationNj organizationNj;
	private TbEmployee tbEmployee;
	private Boolean performanceType;
	private Date performanceDate;
	private Double performanceScore;
	private String remark;
	private String gradeStandardOrgFileName;
	private String gradeStandardFileName;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;

	// Constructors

	/** default constructor */
	public AbstractTbPerformance() {
	}

	/** minimal constructor */
	public AbstractTbPerformance(String performanceId) {
		this.performanceId = performanceId;
	}

	/** full constructor */
	public AbstractTbPerformance(String performanceId,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			Boolean performanceType, Date performanceDate,
			Double performanceScore, String remark,
			String gradeStandardOrgFileName, String gradeStandardFileName,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime) {
		this.performanceId = performanceId;
		this.organizationNj = organizationNj;
		this.tbEmployee = tbEmployee;
		this.performanceType = performanceType;
		this.performanceDate = performanceDate;
		this.performanceScore = performanceScore;
		this.remark = remark;
		this.gradeStandardOrgFileName = gradeStandardOrgFileName;
		this.gradeStandardFileName = gradeStandardFileName;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
	}

	// Property accessors

	public String getPerformanceId() {
		return this.performanceId;
	}

	public void setPerformanceId(String performanceId) {
		this.performanceId = performanceId;
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

	public Boolean getPerformanceType() {
		return this.performanceType;
	}

	public void setPerformanceType(Boolean performanceType) {
		this.performanceType = performanceType;
	}

	public Date getPerformanceDate() {
		return this.performanceDate;
	}

	public void setPerformanceDate(Date performanceDate) {
		this.performanceDate = performanceDate;
	}

	public Double getPerformanceScore() {
		return this.performanceScore;
	}

	public void setPerformanceScore(Double performanceScore) {
		this.performanceScore = performanceScore;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getGradeStandardOrgFileName() {
		return this.gradeStandardOrgFileName;
	}

	public void setGradeStandardOrgFileName(String gradeStandardOrgFileName) {
		this.gradeStandardOrgFileName = gradeStandardOrgFileName;
	}

	public String getGradeStandardFileName() {
		return this.gradeStandardFileName;
	}

	public void setGradeStandardFileName(String gradeStandardFileName) {
		this.gradeStandardFileName = gradeStandardFileName;
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