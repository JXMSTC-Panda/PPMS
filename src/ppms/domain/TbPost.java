package ppms.domain;

import java.util.Date;
import java.util.Set;


/**
 * TbPost entity. @author MyEclipse Persistence Tools
 */
public class TbPost extends AbstractTbPost implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public TbPost() {
    }

	/** minimal constructor */
    public TbPost(String postid) {
        super(postid);        
    }
    
    /** full constructor */
    public TbPost(String postid, String postname, String postcomment, String seq, String createdby, Date createdtime, String modifiedby, Date modifiedtime, Date deletedtime, Set tbEmployees, Set tbJobs) {
        super(postid, postname, postcomment, seq, createdby, createdtime, modifiedby, modifiedtime, deletedtime, tbEmployees, tbJobs);        
    }
   
}
