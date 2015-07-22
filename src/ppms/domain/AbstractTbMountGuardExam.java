package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * AbstractTbMountGuardExam entity provides the base persistence definition of
 * the TbMountGuardExam entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbMountGuardExam implements java.io.Serializable {

	// Fields

	private String examId;
	private OrganizationNj organizationNj;
	private TbEmployee tbEmployee;
	private String examType;
	private Date examDate;
	private Double examExpire;
	private Double examScore;
	private BigDecimal holdFailureCount;
	private Date lastDeletedTime;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;

	// Constructors

	/** default constructor */
	public AbstractTbMountGuardExam() {
	}

	/** minimal constructor */
	public AbstractTbMountGuardExam(String examId) {
		this.examId = examId;
	}

	/** full constructor */
	public AbstractTbMountGuardExam(String examId,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			String examType, Date examDate, Double examExpire,
			Double examScore, BigDecimal holdFailureCount,
			Date lastDeletedTime, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime) {
		this.examId = examId;
		this.organizationNj = organizationNj;
		this.tbEmployee = tbEmployee;
		this.examType = examType;
		this.examDate = examDate;
		this.examExpire = examExpire;
		this.examScore = examScore;
		this.holdFailureCount = holdFailureCount;
		this.lastDeletedTime = lastDeletedTime;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
	}

	// Property accessors

	public String getExamId() {
		return this.examId;
	}

	public void setExamId(String examId) {
		this.examId = examId;
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

	public String getExamType() {
		return this.examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	public Date getExamDate() {
		return this.examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public Double getExamExpire() {
		return this.examExpire;
	}

	public void setExamExpire(Double examExpire) {
		this.examExpire = examExpire;
	}

	public Double getExamScore() {
		return this.examScore;
	}

	public void setExamScore(Double examScore) {
		this.examScore = examScore;
	}

	public BigDecimal getHoldFailureCount() {
		return this.holdFailureCount;
	}

	public void setHoldFailureCount(BigDecimal holdFailureCount) {
		this.holdFailureCount = holdFailureCount;
	}

	public Date getLastDeletedTime() {
		return this.lastDeletedTime;
	}

	public void setLastDeletedTime(Date lastDeletedTime) {
		this.lastDeletedTime = lastDeletedTime;
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