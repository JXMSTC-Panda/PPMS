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
<<<<<<< HEAD
	public TbPost(String postid) {
		super(postid);
	}

	/** full constructor */
	public TbPost(String postid, String postname, String postcomment,
			String seq, String createdby, Date createdtime, String modifiedby,
			Date modifiedtime, Date deletedtime, Set tbEmployees, Set tbJobs) {
		super(postid, postname, postcomment, seq, createdby, createdtime,
				modifiedby, modifiedtime, deletedtime, tbEmployees, tbJobs);
=======
	public TbPost(String postId) {
		super(postId);
	}

	/** full constructor */
	public TbPost(String postId, String postName, String postComment,
			String seq, String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime, Date deletedTime, Set tbEmployees, Set tbJobs) {
		super(postId, postName, postComment, seq, createdBy, createdTime,
				modifiedBy, modifiedTime, deletedTime, tbEmployees, tbJobs);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
