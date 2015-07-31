package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;


/**
 * TbArea entity. @author MyEclipse Persistence Tools
 */
public class TbArea extends AbstractTbArea implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public TbArea() {
    }

	/** minimal constructor */
    public TbArea(BigDecimal areaid) {
        super(areaid);        
    }
    
    /** full constructor */
    public TbArea(BigDecimal areaid, TbSubarea tbSubarea, String areadesc, Boolean status, String createdby, Date createdtime, String modifiedby, Date modifiedtime, Set tbAreaorgrelations, Set COrganizationNjs) {
        super(areaid, tbSubarea, areadesc, status, createdby, createdtime, modifiedby, modifiedtime, tbAreaorgrelations, COrganizationNjs);        
    }
   
}
