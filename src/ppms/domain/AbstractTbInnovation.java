package ppms.domain;

import java.util.Date;

/**
 * AbstractTbInnovation entity provides the base persistence definition of the
 * TbInnovation entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbInnovation implements java.io.Serializable {

	// Fields

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

	// Constructors

	/** default constructor */
	public AbstractTbInnovation() {
	}

	/** minimal constructor */
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
	}

	// Property accessors

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
	}

	public TbEmployee getTbEmployee() {
		return this.tbEmployee;
	}

	public void setTbEmployee(TbEmployee tbEmployee) {
		this.tbEmployee = tbEmployee;
	}

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
	}

	public String getEncouragement() {
		return this.encouragement;
	}

	public void setEncouragement(String encouragement) {
		this.encouragement = encouragement;
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