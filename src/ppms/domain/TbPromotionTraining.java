package ppms.domain;

import java.util.Date;

/**
 * TbPromotionTraining entity. @author MyEclipse Persistence Tools
 */
public class TbPromotionTraining extends AbstractTbPromotionTraining implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
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
	}

}
