package ppms.domain;

import java.util.Date;


/**
 * TbOperationcheck entity. @author MyEclipse Persistence Tools
 */
public class TbOperationcheck extends AbstractTbOperationcheck implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public TbOperationcheck() {
    }

	/** minimal constructor */
    public TbOperationcheck(String operationcheckid) {
        super(operationcheckid);        
    }
    
    /** full constructor */
    public TbOperationcheck(String operationcheckid, OrganizationNj organizationNj, TbEmployee tbEmployee, Date operationdate, String customermobilenumber, String operationtype, String punishresult, String createdby, Date createdtime, String modifiedby, Date modifiedtime) {
        super(operationcheckid, organizationNj, tbEmployee, operationdate, customermobilenumber, operationtype, punishresult, createdby, createdtime, modifiedby, modifiedtime);        
    }
   
}
