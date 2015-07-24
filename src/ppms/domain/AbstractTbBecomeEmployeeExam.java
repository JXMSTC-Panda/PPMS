package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * AbstractTbBecomeemployeeexam entity provides the base persistence definition
 * of the TbBecomeemployeeexam entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbBecomeemployeeexam implements
=======
 * AbstractTbBecomeEmployeeExam entity provides the base persistence definition
 * of the TbBecomeEmployeeExam entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbBecomeEmployeeExam implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Fields

<<<<<<< HEAD
	private String examid;
	private OrganizationNj organizationNj;
	private TbEmployee tbEmployee;
	private Date examdate;
	private Double examscore;
	private Short chineseprintcount;
	private Short numberprintcount;
	private String remark;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public AbstractTbBecomeemployeeexam() {
	}

	/** minimal constructor */
	public AbstractTbBecomeemployeeexam(String examid) {
		this.examid = examid;
	}

	/** full constructor */
	public AbstractTbBecomeemployeeexam(String examid,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			Date examdate, Double examscore, Short chineseprintcount,
			Short numberprintcount, String remark, String createdby,
			Date createdtime, String modifiedby, Date modifiedtime) {
		this.examid = examid;
		this.organizationNj = organizationNj;
		this.tbEmployee = tbEmployee;
		this.examdate = examdate;
		this.examscore = examscore;
		this.chineseprintcount = chineseprintcount;
		this.numberprintcount = numberprintcount;
		this.remark = remark;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
	public String getExamid() {
		return this.examid;
	}

	public void setExamid(String examid) {
		this.examid = examid;
=======
	public String getExamId() {
		return this.examId;
	}

	public void setExamId(String examId) {
		this.examId = examId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
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

<<<<<<< HEAD
	public Date getExamdate() {
		return this.examdate;
	}

	public void setExamdate(Date examdate) {
		this.examdate = examdate;
	}

	public Double getExamscore() {
		return this.examscore;
	}

	public void setExamscore(Double examscore) {
		this.examscore = examscore;
	}

	public Short getChineseprintcount() {
		return this.chineseprintcount;
	}

	public void setChineseprintcount(Short chineseprintcount) {
		this.chineseprintcount = chineseprintcount;
	}

	public Short getNumberprintcount() {
		return this.numberprintcount;
	}

	public void setNumberprintcount(Short numberprintcount) {
		this.numberprintcount = numberprintcount;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

<<<<<<< HEAD
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
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}