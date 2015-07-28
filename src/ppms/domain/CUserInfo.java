package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;


/**
 * CUserInfo entity. @author MyEclipse Persistence Tools
 */
public class CUserInfo extends AbstractCUserInfo implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public CUserInfo() {
    }

	/** minimal constructor */
    public CUserInfo(BigDecimal operid) {
        super(operid);        
    }
    
    /** full constructor */
    public CUserInfo(BigDecimal operid, OrganizationNj organizationNj, String opername, String operpass, String roleid, BigDecimal departid, BigDecimal centerid, String zwid, BigDecimal usercountry, BigDecimal isvalid, BigDecimal shortnum, BigDecimal mobilenum, BigDecimal operatingid, Date operatingdate) {
        super(operid, organizationNj, opername, operpass, roleid, departid, centerid, zwid, usercountry, isvalid, shortnum, mobilenum, operatingid, operatingdate);        
    }
   
}
