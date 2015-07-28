package ppms.domain;

import java.util.Date;
import java.util.Set;


/**
 * TbJob entity. @author MyEclipse Persistence Tools
 */
public class TbJob extends AbstractTbJob implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public TbJob() {
    }

	/** minimal constructor */
    public TbJob(String jobid) {
        super(jobid);        
    }
    
    /** full constructor */
    public TbJob(String jobid, TbStage tbStage, TbPost tbPost, String jobname, String jobcomment, Boolean jobtype, String seq, String createdby, Date createdtime, String modifiedby, Date modifiedtime, Date deletedtime, Set tbEmployees, Set tbChangejobhistoriesForInjobid, Set tbPoints, Set tbChangejobhistoriesForOutjobid) {
        super(jobid, tbStage, tbPost, jobname, jobcomment, jobtype, seq, createdby, createdtime, modifiedby, modifiedtime, deletedtime, tbEmployees, tbChangejobhistoriesForInjobid, tbPoints, tbChangejobhistoriesForOutjobid);        
    }
   
}
