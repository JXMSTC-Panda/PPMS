package ppms.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * AbstractTbStage entity provides the base persistence definition of the TbStage entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbStage  implements java.io.Serializable {


    // Fields    

     private String stageid;
     private String stagename;
     private String stagecomment;
     private String seq;
     private String createdby;
     private Date createdtime;
     private String modifiedby;
     private Date modifiedtime;
     private Date deletedtime;
     private Set tbJobs = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractTbStage() {
    }

	/** minimal constructor */
    public AbstractTbStage(String stageid) {
        this.stageid = stageid;
    }
    
    /** full constructor */
    public AbstractTbStage(String stageid, String stagename, String stagecomment, String seq, String createdby, Date createdtime, String modifiedby, Date modifiedtime, Date deletedtime, Set tbJobs) {
        this.stageid = stageid;
        this.stagename = stagename;
        this.stagecomment = stagecomment;
        this.seq = seq;
        this.createdby = createdby;
        this.createdtime = createdtime;
        this.modifiedby = modifiedby;
        this.modifiedtime = modifiedtime;
        this.deletedtime = deletedtime;
        this.tbJobs = tbJobs;
    }

   
    // Property accessors

    public String getStageid() {
        return this.stageid;
    }
    
    public void setStageid(String stageid) {
        this.stageid = stageid;
    }

    public String getStagename() {
        return this.stagename;
    }
    
    public void setStagename(String stagename) {
        this.stagename = stagename;
    }

    public String getStagecomment() {
        return this.stagecomment;
    }
    
    public void setStagecomment(String stagecomment) {
        this.stagecomment = stagecomment;
    }

    public String getSeq() {
        return this.seq;
    }
    
    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getCreatedby() {
        return this.createdby;
    }
    
    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Date getCreatedtime() {
        return this.createdtime;
    }
    
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public String getModifiedby() {
        return this.modifiedby;
    }
    
    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    public Date getModifiedtime() {
        return this.modifiedtime;
    }
    
    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public Date getDeletedtime() {
        return this.deletedtime;
    }
    
    public void setDeletedtime(Date deletedtime) {
        this.deletedtime = deletedtime;
    }

    public Set getTbJobs() {
        return this.tbJobs;
    }
    
    public void setTbJobs(Set tbJobs) {
        this.tbJobs = tbJobs;
    }
   








}