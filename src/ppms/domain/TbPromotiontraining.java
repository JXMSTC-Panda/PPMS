package ppms.domain;

import java.util.Date;


/**
 * TbPromotiontraining entity. @author MyEclipse Persistence Tools
 */
public class TbPromotiontraining extends AbstractTbPromotiontraining implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public TbPromotiontraining() {
    }

	/** minimal constructor */
    public TbPromotiontraining(String promotiontrainingid) {
        super(promotiontrainingid);        
    }
    
    /** full constructor */
    public TbPromotiontraining(String promotiontrainingid, OrganizationNj organizationNj, TbEmployee tbEmployee, Date promotiontrainingdate, String promotioncontent, Double promotionscore, String createdby, Date createdtime, String modifiedby, Date modifiedtime) {
        super(promotiontrainingid, organizationNj, tbEmployee, promotiontrainingdate, promotioncontent, promotionscore, createdby, createdtime, modifiedby, modifiedtime);        
    }
   
}
