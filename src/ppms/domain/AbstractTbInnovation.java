package ppms.domain;

import java.util.Date;

/**
 * AbstractTbInnovation entity provides the base persistence definition of the
 * TbInnovation entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbInnovation implements java.io.Serializable {

	// Fields

<<<<<<< HEAD
	private String innovationid;
	private OrganizationNj organizationNjByOrgid;
	private TbEmployee tbEmployee;
	private OrganizationNj organizationNjByEmployeeorgid;
	private String innovationcontent;
	private Date assessdate;
	private String assessresult;
	private String assesslevel;
	private String encouragement;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
=======
	private String innovationId;
	private OrganizationNj organizationNjByOrgId;
	private TbEmployee tbEmployee;
	private OrganizationNj organizationNjByEmployeeOrgId;
	private String innovationContent;
	private Date assessDate;
	private String assessResult;
	private String assessLevel;
	private String encouragement;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
	public AbstractTbInnovation() {
	}

	/** minimal constructor */
<<<<<<< HEAD
	public AbstractTbInnovation(String innovationid) {
		this.innovationid = innovationid;
	}

	/** full constructor */
	public AbstractTbInnovation(String innovationid,
			OrganizationNj organizationNjByOrgid, TbEmployee tbEmployee,
			OrganizationNj organizationNjByEmployeeorgid,
			String innovationcontent, Date assessdate, String assessresult,
			String assesslevel, String encouragement, String createdby,
			Date createdtime, String modifiedby, Date modifiedtime) {
		this.innovationid = innovationid;
		this.organizationNjByOrgid = organizationNjByOrgid;
		this.tbEmployee = tbEmployee;
		this.organizationNjByEmployeeorgid = organizationNjByEmployeeorgid;
		this.innovationcontent = innovationcontent;
		this.assessdate = assessdate;
		this.assessresult = assessresult;
		this.assesslevel = assesslevel;
		this.encouragement = encouragement;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
=======
	public AbstractTbInnovation(String innovationId) {
		this.innovationId = innovationId;
	}

	/** full constructor */
	public AbstractTbInnovation(String innovationId,
			OrganizationNj organizationNjByOrgId, TbEmployee tbEmployee,
			OrganizationNj organizationNjByEmployeeOrgId,
			String innovationContent, Date assessDate, String assessResult,
			String assessLevel, String encouragement, String createdBy,
			Date createdTime, String modifiedBy, Date modifiedTime) {
		this.innovationId = innovationId;
		this.organizationNjByOrgId = organizationNjByOrgId;
		this.tbEmployee = tbEmployee;
		this.organizationNjByEmployeeOrgId = organizationNjByEmployeeOrgId;
		this.innovationContent = innovationContent;
		this.assessDate = assessDate;
		this.assessResult = assessResult;
		this.assessLevel = assessLevel;
		this.encouragement = encouragement;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
	public String getInnovationid() {
		return this.innovationid;
	}

	public void setInnovationid(String innovationid) {
		this.innovationid = innovationid;
	}

	public OrganizationNj getOrganizationNjByOrgid() {
		return this.organizationNjByOrgid;
	}

	public void setOrganizationNjByOrgid(OrganizationNj organizationNjByOrgid) {
		this.organizationNjByOrgid = organizationNjByOrgid;
=======
	public String getInnovationId() {
		return this.innovationId;
	}

	public void setInnovationId(String innovationId) {
		this.innovationId = innovationId;
	}

	public OrganizationNj getOrganizationNjByOrgId() {
		return this.organizationNjByOrgId;
	}

	public void setOrganizationNjByOrgId(OrganizationNj organizationNjByOrgId) {
		this.organizationNjByOrgId = organizationNjByOrgId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public TbEmployee getTbEmployee() {
		return this.tbEmployee;
	}

	public void setTbEmployee(TbEmployee tbEmployee) {
		this.tbEmployee = tbEmployee;
	}

<<<<<<< HEAD
	public OrganizationNj getOrganizationNjByEmployeeorgid() {
		return this.organizationNjByEmployeeorgid;
	}

	public void setOrganizationNjByEmployeeorgid(
			OrganizationNj organizationNjByEmployeeorgid) {
		this.organizationNjByEmployeeorgid = organizationNjByEmployeeorgid;
	}

	public String getInnovationcontent() {
		return this.innovationcontent;
	}

	public void setInnovationcontent(String innovationcontent) {
		this.innovationcontent = innovationcontent;
	}

	public Date getAssessdate() {
		return this.assessdate;
	}

	public void setAssessdate(Date assessdate) {
		this.assessdate = assessdate;
	}

	public String getAssessresult() {
		return this.assessresult;
	}

	public void setAssessresult(String assessresult) {
		this.assessresult = assessresult;
	}

	public String getAssesslevel() {
		return this.assesslevel;
	}

	public void setAssesslevel(String assesslevel) {
		this.assesslevel = assesslevel;
=======
	public OrganizationNj getOrganizationNjByEmployeeOrgId() {
		return this.organizationNjByEmployeeOrgId;
	}

	public void setOrganizationNjByEmployeeOrgId(
			OrganizationNj organizationNjByEmployeeOrgId) {
		this.organizationNjByEmployeeOrgId = organizationNjByEmployeeOrgId;
	}

	public String getInnovationContent() {
		return this.innovationContent;
	}

	public void setInnovationContent(String innovationContent) {
		this.innovationContent = innovationContent;
	}

	public Date getAssessDate() {
		return this.assessDate;
	}

	public void setAssessDate(Date assessDate) {
		this.assessDate = assessDate;
	}

	public String getAssessResult() {
		return this.assessResult;
	}

	public void setAssessResult(String assessResult) {
		this.assessResult = assessResult;
	}

	public String getAssessLevel() {
		return this.assessLevel;
	}

	public void setAssessLevel(String assessLevel) {
		this.assessLevel = assessLevel;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public String getEncouragement() {
		return this.encouragement;
	}

	public void setEncouragement(String encouragement) {
		this.encouragement = encouragement;
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