package ppms.domain;

import java.util.Date;

/**
 * AbstractTbOperationTraining entity provides the base persistence definition
 * of the TbOperationTraining entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbOperationTraining implements
		java.io.Serializable {

	// Fields

	private String trainingId;
	private OrganizationNj organizationNj;
	private TbEmployee tbEmployee;
	private Date trainingDate;
	private String trainingLevel;
	private String trainingContent;
	private Double trainingScore;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;

	// Constructors

	/** default constructor */
	public AbstractTbOperationTraining() {
	}

	/** minimal constructor */
	public AbstractTbOperationTraining(String trainingId) {
		this.trainingId = trainingId;
	}

	/** full constructor */
	public AbstractTbOperationTraining(String trainingId,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			Date trainingDate, String trainingLevel, String trainingContent,
			Double trainingScore, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime) {
		this.trainingId = trainingId;
		this.organizationNj = organizationNj;
		this.tbEmployee = tbEmployee;
		this.trainingDate = trainingDate;
		this.trainingLevel = trainingLevel;
		this.trainingContent = trainingContent;
		this.trainingScore = trainingScore;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
	}

	// Property accessors

	public String getTrainingId() {
		return this.trainingId;
	}

	public void setTrainingId(String trainingId) {
		this.trainingId = trainingId;
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

	public Date getTrainingDate() {
		return this.trainingDate;
	}

	public void setTrainingDate(Date trainingDate) {
		this.trainingDate = trainingDate;
	}

	public String getTrainingLevel() {
		return this.trainingLevel;
	}

	public void setTrainingLevel(String trainingLevel) {
		this.trainingLevel = trainingLevel;
	}

	public String getTrainingContent() {
		return this.trainingContent;
	}

	public void setTrainingContent(String trainingContent) {
		this.trainingContent = trainingContent;
	}

	public Double getTrainingScore() {
		return this.trainingScore;
	}

	public void setTrainingScore(Double trainingScore) {
		this.trainingScore = trainingScore;
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