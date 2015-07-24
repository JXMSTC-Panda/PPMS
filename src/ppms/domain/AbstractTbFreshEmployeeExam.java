package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * AbstractTbFreshemployeeexam entity provides the base persistence definition
 * of the TbFreshemployeeexam entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbFreshemployeeexam implements
=======
 * AbstractTbFreshEmployeeExam entity provides the base persistence definition
 * of the TbFreshEmployeeExam entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbFreshEmployeeExam implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Fields

<<<<<<< HEAD
	private String examid;
	private OrganizationNj organizationNj;
	private TbEmployee tbEmployee;
	private Date examdate;
	private String examstage;
	private Byte week;
	private Double examscore;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
=======
	private String examId;
	private OrganizationNj organizationNj;
	private TbEmployee tbEmployee;
	private Date examDate;
	private String examStage;
	private Byte week;
	private Double examScore;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public AbstractTbFreshemployeeexam() {
	}

	/** minimal constructor */
	public AbstractTbFreshemployeeexam(String examid) {
		this.examid = examid;
	}

	/** full constructor */
	public AbstractTbFreshemployeeexam(String examid,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			Date examdate, String examstage, Byte week, Double examscore,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
		this.examid = examid;
		this.organizationNj = organizationNj;
		this.tbEmployee = tbEmployee;
		this.examdate = examdate;
		this.examstage = examstage;
		this.week = week;
		this.examscore = examscore;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
=======
	public AbstractTbFreshEmployeeExam() {
	}

	/** minimal constructor */
	public AbstractTbFreshEmployeeExam(String examId) {
		this.examId = examId;
	}

	/** full constructor */
	public AbstractTbFreshEmployeeExam(String examId,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			Date examDate, String examStage, Byte week, Double examScore,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime) {
		this.examId = examId;
		this.organizationNj = organizationNj;
		this.tbEmployee = tbEmployee;
		this.examDate = examDate;
		this.examStage = examStage;
		this.week = week;
		this.examScore = examScore;
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

	public String getExamstage() {
		return this.examstage;
	}

	public void setExamstage(String examstage) {
		this.examstage = examstage;
=======
	public Date getExamDate() {
		return this.examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public String getExamStage() {
		return this.examStage;
	}

	public void setExamStage(String examStage) {
		this.examStage = examStage;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public Byte getWeek() {
		return this.week;
	}

	public void setWeek(Byte week) {
		this.week = week;
	}

<<<<<<< HEAD
	public Double getExamscore() {
		return this.examscore;
	}

	public void setExamscore(Double examscore) {
		this.examscore = examscore;
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
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}