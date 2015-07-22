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
	public TbPost(String postId) {
		super(postId);
	}

	/** full constructor */
	public TbPost(String postId, String postName, String postComment,
			String seq, String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime, Date deletedTime, Set tbEmployees, Set tbJobs) {
		super(postId, postName, postComment, seq, createdBy, createdTime,
				modifiedBy, modifiedTime, deletedTime, tbEmployees, tbJobs);
	}

}
