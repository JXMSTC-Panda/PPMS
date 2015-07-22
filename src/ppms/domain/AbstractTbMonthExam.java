package ppms.domain;

import java.util.Date;

/**
 * AbstractTbMonthExam entity provides the base persistence definition of the
 * TbMonthExam entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbMonthExam implements java.io.Serializable {

	// Fields

	private String examId;
	private OrganizationNj organizationNj;
	private TbEmployee tbEmployee;
	private Date examDate;
	private Double examScore;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;

	// Constructors

	/** default constructor */
	public AbstractTbMonthExam() {
	}

	/** minimal constructor */
	public AbstractTbMonthExam(String examId) {
		this.examId = examId;
	}

	/** full constructor */
	public AbstractTbMonthExam(String examId, OrganizationNj organizationNj,
			TbEmployee tbEmployee, Date examDate, Double examScore,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime) {
		this.examId = examId;
		this.organizationNj = organizationNj;
		this.tbEmployee = tbEmployee;
		this.examDate = examDate;
		this.examScore = examScore;
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

	public Date getExamDate() {
		return this.examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public Double getExamScore() {
		return this.examScore;
	}

	public void setExamScore(Double examScore) {
		this.examScore = examScore;
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