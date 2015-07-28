package ppms.domain;

import java.util.Date;


/**
 * TbStandardcheck entity. @author MyEclipse Persistence Tools
 */
public class TbStandardcheck extends AbstractTbStandardcheck implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public TbStandardcheck() {
    }

	/** minimal constructor */
    public TbStandardcheck(String standardcheckid) {
        super(standardcheckid);        
    }
    
    /** full constructor */
    public TbStandardcheck(String standardcheckid, OrganizationNj organizationNj, Date checkdate, Double checkscore, String createdby, Date createdtime, String modifiedby, Date modifiedtime) {
        super(standardcheckid, organizationNj, checkdate, checkscore, createdby, createdtime, modifiedby, modifiedtime);        
    }
   
}
