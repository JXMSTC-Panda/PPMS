package ppms.domain;

import java.util.Date;


/**
 * TbBecomeemployeeexam entity. @author MyEclipse Persistence Tools
 */
public class TbBecomeemployeeexam extends AbstractTbBecomeemployeeexam implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public TbBecomeemployeeexam() {
    }

	/** minimal constructor */
    public TbBecomeemployeeexam(String examid) {
        super(examid);        
    }
    
    /** full constructor */
    public TbBecomeemployeeexam(String examid, OrganizationNj organizationNj, TbEmployee tbEmployee, Date examdate, Double examscore, Short chineseprintcount, Short numberprintcount, String remark, String createdby, Date createdtime, String modifiedby, Date modifiedtime) {
        super(examid, organizationNj, tbEmployee, examdate, examscore, chineseprintcount, numberprintcount, remark, createdby, createdtime, modifiedby, modifiedtime);        
    }
   
}
