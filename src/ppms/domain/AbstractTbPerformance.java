package ppms.domain;

import java.util.Date;

/**
 * AbstractTbPerformance entity provides the base persistence definition of the
 * TbPerformance entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbPerformance implements java.io.Serializable {

	// Fields

<<<<<<< HEAD
	private String performanceid;
	private OrganizationNj organizationNj;
	private TbEmployee tbEmployee;
	private Boolean performancetype;
	private Date performancedate;
	private Double performancescore;
	private String remark;
	private String gradestandardorgfilename;
	private String gradestandardfilename;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
	public AbstractTbPerformance() {
	}

	/** minimal constructor */
<<<<<<< HEAD
	public AbstractTbPerformance(String performanceid) {
		this.performanceid = performanceid;
	}

	/** full constructor */
	public AbstractTbPerformance(String performanceid,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			Boolean performancetype, Date performancedate,
			Double performancescore, String remark,
			String gradestandardorgfilename, String gradestandardfilename,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
		this.performanceid = performanceid;
		this.organizationNj = organizationNj;
		this.tbEmployee = tbEmployee;
		this.performancetype = performancetype;
		this.performancedate = performancedate;
		this.performancescore = performancescore;
		this.remark = remark;
		this.gradestandardorgfilename = gradestandardorgfilename;
		this.gradestandardfilename = gradestandardfilename;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
	public String getPerformanceid() {
		return this.performanceid;
	}

	public void setPerformanceid(String performanceid) {
		this.performanceid = performanceid;
=======
	public String getPerformanceId() {
		return this.performanceId;
	}

	public void setPerformanceId(String performanceId) {
		this.performanceId = performanceId;
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
	public Boolean getPerformancetype() {
		return this.performancetype;
	}

	public void setPerformancetype(Boolean performancetype) {
		this.performancetype = performancetype;
	}

	public Date getPerformancedate() {
		return this.performancedate;
	}

	public void setPerformancedate(Date performancedate) {
		this.performancedate = performancedate;
	}

	public Double getPerformancescore() {
		return this.performancescore;
	}

	public void setPerformancescore(Double performancescore) {
		this.performancescore = performancescore;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

<<<<<<< HEAD
	public String getGradestandardorgfilename() {
		return this.gradestandardorgfilename;
	}

	public void setGradestandardorgfilename(String gradestandardorgfilename) {
		this.gradestandardorgfilename = gradestandardorgfilename;
	}

	public String getGradestandardfilename() {
		return this.gradestandardfilename;
	}

	public void setGradestandardfilename(String gradestandardfilename) {
		this.gradestandardfilename = gradestandardfilename;
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}