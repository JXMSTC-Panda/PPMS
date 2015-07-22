package ppms.domain;

import java.util.Date;

/**
 * AbstractTbBecomeEmployeeExam entity provides the base persistence definition
 * of the TbBecomeEmployeeExam entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbBecomeEmployeeExam implements
		java.io.Serializable {

	// Fields

	private String examId;
	private OrganizationNj organizationNj;
	private TbEmployee tbEmployee;
	private Date examDate;
	private Double examScore;
	private Short chinesePrintCount;
	private Short numberPrintCount;
	private String remark;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;

	// Constructors

	/** default constructor */
	public AbstractTbBecomeEmployeeExam() {
	}

	/** minimal constructor */
	public AbstractTbBecomeEmployeeExam(String examId) {
		this.examId = examId;
	}

	/** full constructor */
	public AbstractTbBecomeEmployeeExam(String examId,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			Date examDate, Double examScore, Short chinesePrintCount,
			Short numberPrintCount, String remark, String createdBy,
			Date createdTime, String modifiedBy, Date modifiedTime) {
		this.examId = examId;
		this.organizationNj = organizationNj;
		this.tbEmployee = tbEmployee;
		this.examDate = examDate;
		this.examScore = examScore;
		this.chinesePrintCount = chinesePrintCount;
		this.numberPrintCount = numberPrintCount;
		this.remark = remark;
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

	public Short getChinesePrintCount() {
		return this.chinesePrintCount;
	}

	public void setChinesePrintCount(Short chinesePrintCount) {
		this.chinesePrintCount = chinesePrintCount;
	}

	public Short getNumberPrintCount() {
		return this.numberPrintCount;
	}

	public void setNumberPrintCount(Short numberPrintCount) {
		this.numberPrintCount = numberPrintCount;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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