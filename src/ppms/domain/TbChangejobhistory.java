package ppms.domain;

import java.util.Date;


/**
 * TbChangejobhistory entity. @author MyEclipse Persistence Tools
 */
public class TbChangejobhistory extends AbstractTbChangejobhistory implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public TbChangejobhistory() {
    }

	/** minimal constructor */
    public TbChangejobhistory(String jobhistoryid) {
        super(jobhistoryid);        
    }
    
    /** full constructor */
    public TbChangejobhistory(String jobhistoryid, TbEmployee tbEmployee, TbJob tbJobByInjobid, TbJob tbJobByOutjobid, Date changedate, String createdby, Date createdtime, String modifiedby, Date modifiedtime) {
        super(jobhistoryid, tbEmployee, tbJobByInjobid, tbJobByOutjobid, changedate, createdby, createdtime, modifiedby, modifiedtime);        
    }
   
}
