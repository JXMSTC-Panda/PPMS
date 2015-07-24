package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * AbstractTbPromotiontraining entity provides the base persistence definition
 * of the TbPromotiontraining entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbPromotiontraining implements
=======
 * AbstractTbPromotionTraining entity provides the base persistence definition
 * of the TbPromotionTraining entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbPromotionTraining implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Fields

<<<<<<< HEAD
	private String promotiontrainingid;
	private OrganizationNj organizationNj;
	private TbEmployee tbEmployee;
	private Date promotiontrainingdate;
	private String promotioncontent;
	private Double promotionscore;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public AbstractTbPromotiontraining() {
	}

	/** minimal constructor */
	public AbstractTbPromotiontraining(String promotiontrainingid) {
		this.promotiontrainingid = promotiontrainingid;
	}

	/** full constructor */
	public AbstractTbPromotiontraining(String promotiontrainingid,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			Date promotiontrainingdate, String promotioncontent,
			Double promotionscore, String createdby, Date createdtime,
			String modifiedby, Date modifiedtime) {
		this.promotiontrainingid = promotiontrainingid;
		this.organizationNj = organizationNj;
		this.tbEmployee = tbEmployee;
		this.promotiontrainingdate = promotiontrainingdate;
		this.promotioncontent = promotioncontent;
		this.promotionscore = promotionscore;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
	public String getPromotiontrainingid() {
		return this.promotiontrainingid;
	}

	public void setPromotiontrainingid(String promotiontrainingid) {
		this.promotiontrainingid = promotiontrainingid;
=======
	public String getPromotionTrainingId() {
		return this.promotionTrainingId;
	}

	public void setPromotionTrainingId(String promotionTrainingId) {
		this.promotionTrainingId = promotionTrainingId;
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
	public Date getPromotiontrainingdate() {
		return this.promotiontrainingdate;
	}

	public void setPromotiontrainingdate(Date promotiontrainingdate) {
		this.promotiontrainingdate = promotiontrainingdate;
	}

	public String getPromotioncontent() {
		return this.promotioncontent;
	}

	public void setPromotioncontent(String promotioncontent) {
		this.promotioncontent = promotioncontent;
	}

	public Double getPromotionscore() {
		return this.promotionscore;
	}

	public void setPromotionscore(Double promotionscore) {
		this.promotionscore = promotionscore;
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}