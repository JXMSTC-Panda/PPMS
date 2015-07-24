package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * AbstractTbVisitcheck entity provides the base persistence definition of the
 * TbVisitcheck entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbVisitcheck implements java.io.Serializable {

	// Fields

	private String visitcheckid;
	private OrganizationNj organizationNj;
	private Date checkdate;
	private Double firstscore;
	private Double secondscore;
	private Double consistencyscore;
	private Double averagescore;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public AbstractTbVisitcheck() {
	}

	/** minimal constructor */
	public AbstractTbVisitcheck(String visitcheckid) {
		this.visitcheckid = visitcheckid;
	}

	/** full constructor */
	public AbstractTbVisitcheck(String visitcheckid,
			OrganizationNj organizationNj, Date checkdate, Double firstscore,
			Double secondscore, Double consistencyscore, Double averagescore,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
		this.visitcheckid = visitcheckid;
		this.organizationNj = organizationNj;
		this.checkdate = checkdate;
		this.firstscore = firstscore;
		this.secondscore = secondscore;
		this.consistencyscore = consistencyscore;
		this.averagescore = averagescore;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
	public String getVisitcheckid() {
		return this.visitcheckid;
	}

	public void setVisitcheckid(String visitcheckid) {
		this.visitcheckid = visitcheckid;
=======
	public String getVisitCheckId() {
		return this.visitCheckId;
	}

	public void setVisitCheckId(String visitCheckId) {
		this.visitCheckId = visitCheckId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public OrganizationNj getOrganizationNj() {
		return this.organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

<<<<<<< HEAD
	public Date getCheckdate() {
		return this.checkdate;
	}

	public void setCheckdate(Date checkdate) {
		this.checkdate = checkdate;
	}

	public Double getFirstscore() {
		return this.firstscore;
	}

	public void setFirstscore(Double firstscore) {
		this.firstscore = firstscore;
	}

	public Double getSecondscore() {
		return this.secondscore;
	}

	public void setSecondscore(Double secondscore) {
		this.secondscore = secondscore;
	}

	public Double getConsistencyscore() {
		return this.consistencyscore;
	}

	public void setConsistencyscore(Double consistencyscore) {
		this.consistencyscore = consistencyscore;
	}

	public Double getAveragescore() {
		return this.averagescore;
	}

	public void setAveragescore(Double averagescore) {
		this.averagescore = averagescore;
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}