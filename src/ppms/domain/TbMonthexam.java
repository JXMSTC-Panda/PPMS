package ppms.domain;

import java.util.Date;


/**
 * TbMonthexam entity. @author MyEclipse Persistence Tools
 */
public class TbMonthexam extends AbstractTbMonthexam implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public TbMonthexam() {
    }

	/** minimal constructor */
    public TbMonthexam(String examid) {
        super(examid);        
    }
    
    /** full constructor */
    public TbMonthexam(String examid, OrganizationNj organizationNj, TbEmployee tbEmployee, Date examdate, Double examscore, String createdby, Date createdtime, String modifiedby, Date modifiedtime) {
        super(examid, organizationNj, tbEmployee, examdate, examscore, createdby, createdtime, modifiedby, modifiedtime);        
    }
   
}
