package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * TbPromotiontraining entity. @author MyEclipse Persistence Tools
 */
public class TbPromotiontraining extends AbstractTbPromotiontraining implements
=======
 * TbPromotionTraining entity. @author MyEclipse Persistence Tools
 */
public class TbPromotionTraining extends AbstractTbPromotionTraining implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public TbPromotiontraining() {
	}

	/** minimal constructor */
	public TbPromotiontraining(String promotiontrainingid) {
		super(promotiontrainingid);
	}

	/** full constructor */
	public TbPromotiontraining(String promotiontrainingid,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			Date promotiontrainingdate, String promotioncontent,
			Double promotionscore, String createdby, Date createdtime,
			String modifiedby, Date modifiedtime) {
		super(promotiontrainingid, organizationNj, tbEmployee,
				promotiontrainingdate, promotioncontent, promotionscore,
				createdby, createdtime, modifiedby, modifiedtime);
=======
	public TbPromotionTraining() {
	}

	/** minimal constructor */
	public TbPromotionTraining(String promotionTrainingId) {
		super(promotionTrainingId);
	}

	/** full constructor */
	public TbPromotionTraining(String promotionTrainingId,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			Date promotionTrainingDate, String promotionContent,
			Double promotionScore, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime) {
		super(promotionTrainingId, organizationNj, tbEmployee,
				promotionTrainingDate, promotionContent, promotionScore,
				createdBy, createdTime, modifiedBy, modifiedTime);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
