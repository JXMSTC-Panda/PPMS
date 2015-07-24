package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
<<<<<<< HEAD
 * AbstractTbMountguardexam entity provides the base persistence definition of
 * the TbMountguardexam entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbMountguardexam implements java.io.Serializable {

	// Fields

	private String examid;
	private OrganizationNj organizationNj;
	private TbEmployee tbEmployee;
	private String examtype;
	private Date examdate;
	private Double examexpire;
	private Double examscore;
	private BigDecimal holdfailurecount;
	private Date lastdeletedtime;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public AbstractTbMountguardexam() {
	}

	/** minimal constructor */
	public AbstractTbMountguardexam(String examid) {
		this.examid = examid;
	}

	/** full constructor */
	public AbstractTbMountguardexam(String examid,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			String examtype, Date examdate, Double examexpire,
			Double examscore, BigDecimal holdfailurecount,
			Date lastdeletedtime, String createdby, Date createdtime,
			String modifiedby, Date modifiedtime) {
		this.examid = examid;
		this.organizationNj = organizationNj;
		this.tbEmployee = tbEmployee;
		this.examtype = examtype;
		this.examdate = examdate;
		this.examexpire = examexpire;
		this.examscore = examscore;
		this.holdfailurecount = holdfailurecount;
		this.lastdeletedtime = lastdeletedtime;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
=======
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
	public String getExamtype() {
		return this.examtype;
	}

	public void setExamtype(String examtype) {
		this.examtype = examtype;
	}

	public Date getExamdate() {
		return this.examdate;
	}

	public void setExamdate(Date examdate) {
		this.examdate = examdate;
	}

	public Double getExamexpire() {
		return this.examexpire;
	}

	public void setExamexpire(Double examexpire) {
		this.examexpire = examexpire;
	}

	public Double getExamscore() {
		return this.examscore;
	}

	public void setExamscore(Double examscore) {
		this.examscore = examscore;
	}

	public BigDecimal getHoldfailurecount() {
		return this.holdfailurecount;
	}

	public void setHoldfailurecount(BigDecimal holdfailurecount) {
		this.holdfailurecount = holdfailurecount;
	}

	public Date getLastdeletedtime() {
		return this.lastdeletedtime;
	}

	public void setLastdeletedtime(Date lastdeletedtime) {
		this.lastdeletedtime = lastdeletedtime;
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}