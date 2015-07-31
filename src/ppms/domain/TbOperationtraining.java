package ppms.domain;

import java.util.Date;


/**
 * TbOperationtraining entity. @author MyEclipse Persistence Tools
 */
public class TbOperationtraining extends AbstractTbOperationtraining implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public TbOperationtraining() {
    }

	/** minimal constructor */
    public TbOperationtraining(String trainingid) {
        super(trainingid);        
    }
    
    /** full constructor */
    public TbOperationtraining(String trainingid, OrganizationNj organizationNj, TbEmployee tbEmployee, Date trainingdate, String traininglevel, String trainingcontent, Double trainingscore, String createdby, Date createdtime, String modifiedby, Date modifiedtime) {
        super(trainingid, organizationNj, tbEmployee, trainingdate, traininglevel, trainingcontent, trainingscore, createdby, createdtime, modifiedby, modifiedtime);        
    }
   
}
