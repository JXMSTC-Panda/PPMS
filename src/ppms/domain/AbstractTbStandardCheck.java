package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * AbstractTbStandardcheck entity provides the base persistence definition of
 * the TbStandardcheck entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbStandardcheck implements java.io.Serializable {

	// Fields

	private String standardcheckid;
	private OrganizationNj organizationNj;
	private Date checkdate;
	private Double checkscore;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public AbstractTbStandardcheck() {
	}

	/** minimal constructor */
	public AbstractTbStandardcheck(String standardcheckid) {
		this.standardcheckid = standardcheckid;
	}

	/** full constructor */
	public AbstractTbStandardcheck(String standardcheckid,
			OrganizationNj organizationNj, Date checkdate, Double checkscore,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
		this.standardcheckid = standardcheckid;
		this.organizationNj = organizationNj;
		this.checkdate = checkdate;
		this.checkscore = checkscore;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
	public String getStandardcheckid() {
		return this.standardcheckid;
	}

	public void setStandardcheckid(String standardcheckid) {
		this.standardcheckid = standardcheckid;
=======
	public String getStandardCheckId() {
		return this.standardCheckId;
	}

	public void setStandardCheckId(String standardCheckId) {
		this.standardCheckId = standardCheckId;
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

	public Double getCheckscore() {
		return this.checkscore;
	}

	public void setCheckscore(Double checkscore) {
		this.checkscore = checkscore;
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}