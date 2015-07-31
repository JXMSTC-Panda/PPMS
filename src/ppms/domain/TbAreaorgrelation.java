package ppms.domain;

import java.util.Date;


/**
 * TbAreaorgrelation entity. @author MyEclipse Persistence Tools
 */
public class TbAreaorgrelation extends AbstractTbAreaorgrelation implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public TbAreaorgrelation() {
    }

	/** minimal constructor */
    public TbAreaorgrelation(Integer areaorgid) {
        super(areaorgid);        
    }
    
    /** full constructor */
    public TbAreaorgrelation(Integer areaorgid, OrganizationNj organizationNj, TbArea tbArea, String createdby, Date createdtime, String modifiedby, Date modifiedtime) {
        super(areaorgid, organizationNj, tbArea, createdby, createdtime, modifiedby, modifiedtime);        
    }
   
}
