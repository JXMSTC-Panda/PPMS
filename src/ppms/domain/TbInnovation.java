package ppms.domain;

import java.util.Date;


/**
 * TbInnovation entity. @author MyEclipse Persistence Tools
 */
public class TbInnovation extends AbstractTbInnovation implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public TbInnovation() {
    }

	/** minimal constructor */
    public TbInnovation(String innovationid) {
        super(innovationid);        
    }
    
    /** full constructor */
    public TbInnovation(String innovationid, OrganizationNj organizationNjByOrgid, TbEmployee tbEmployee, OrganizationNj organizationNjByEmployeeorgid, String innovationcontent, Date assessdate, String assessresult, String assesslevel, String encouragement, String createdby, Date createdtime, String modifiedby, Date modifiedtime) {
        super(innovationid, organizationNjByOrgid, tbEmployee, organizationNjByEmployeeorgid, innovationcontent, assessdate, assessresult, assesslevel, encouragement, createdby, createdtime, modifiedby, modifiedtime);        
    }
   
}
