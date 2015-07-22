package ppms.domain;

import java.util.Date;

/**
 * AbstractTbPromotionTraining entity provides the base persistence definition
 * of the TbPromotionTraining entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbPromotionTraining implements
		java.io.Serializable {

	// Fields

	private String promotionTrainingId;
	private OrganizationNj organizationNj;
	private TbEmployee tbEmployee;
	private Date promotionTrainingDate;
	private String promotionContent;
	private Double promotionScore;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;

	// Constructors

	/** default constructor */
	public AbstractTbPromotionTraining() {
	}

	/** minimal constructor */
	public AbstractTbPromotionTraining(String promotionTrainingId) {
		this.promotionTrainingId = promotionTrainingId;
	}

	/** full constructor */
	public AbstractTbPromotionTraining(String promotionTrainingId,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			Date promotionTrainingDate, String promotionContent,
			Double promotionScore, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime) {
		this.promotionTrainingId = promotionTrainingId;
		this.organizationNj = organizationNj;
		this.tbEmployee = tbEmployee;
		this.promotionTrainingDate = promotionTrainingDate;
		this.promotionContent = promotionContent;
		this.promotionScore = promotionScore;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
	}

	// Property accessors

	public String getPromotionTrainingId() {
		return this.promotionTrainingId;
	}

	public void setPromotionTrainingId(String promotionTrainingId) {
		this.promotionTrainingId = promotionTrainingId;
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

	public Date getPromotionTrainingDate() {
		return this.promotionTrainingDate;
	}

	public void setPromotionTrainingDate(Date promotionTrainingDate) {
		this.promotionTrainingDate = promotionTrainingDate;
	}

	public String getPromotionContent() {
		return this.promotionContent;
	}

	public void setPromotionContent(String promotionContent) {
		this.promotionContent = promotionContent;
	}

	public Double getPromotionScore() {
		return this.promotionScore;
	}

	public void setPromotionScore(Double promotionScore) {
		this.promotionScore = promotionScore;
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