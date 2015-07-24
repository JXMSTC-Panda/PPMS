package ppms.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractTbPost entity provides the base persistence definition of the TbPost
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbPost implements java.io.Serializable {

	// Fields

<<<<<<< HEAD
	private String postid;
	private String postname;
	private String postcomment;
	private String seq;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
	private Date deletedtime;
=======
	private String postId;
	private String postName;
	private String postComment;
	private String seq;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;
	private Date deletedTime;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	private Set tbEmployees = new HashSet(0);
	private Set tbJobs = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractTbPost() {
	}

	/** minimal constructor */
<<<<<<< HEAD
	public AbstractTbPost(String postid) {
		this.postid = postid;
	}

	/** full constructor */
	public AbstractTbPost(String postid, String postname, String postcomment,
			String seq, String createdby, Date createdtime, String modifiedby,
			Date modifiedtime, Date deletedtime, Set tbEmployees, Set tbJobs) {
		this.postid = postid;
		this.postname = postname;
		this.postcomment = postcomment;
		this.seq = seq;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
		this.deletedtime = deletedtime;
=======
	public AbstractTbPost(String postId) {
		this.postId = postId;
	}

	/** full constructor */
	public AbstractTbPost(String postId, String postName, String postComment,
			String seq, String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime, Date deletedTime, Set tbEmployees, Set tbJobs) {
		this.postId = postId;
		this.postName = postName;
		this.postComment = postComment;
		this.seq = seq;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
		this.deletedTime = deletedTime;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		this.tbEmployees = tbEmployees;
		this.tbJobs = tbJobs;
	}

	// Property accessors

<<<<<<< HEAD
	public String getPostid() {
		return this.postid;
	}

	public void setPostid(String postid) {
		this.postid = postid;
	}

	public String getPostname() {
		return this.postname;
	}

	public void setPostname(String postname) {
		this.postname = postname;
	}

	public String getPostcomment() {
		return this.postcomment;
	}

	public void setPostcomment(String postcomment) {
		this.postcomment = postcomment;
=======
	public String getPostId() {
		return this.postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getPostName() {
		return this.postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public String getPostComment() {
		return this.postComment;
	}

	public void setPostComment(String postComment) {
		this.postComment = postComment;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public String getSeq() {
		return this.seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

<<<<<<< HEAD
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
=======
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public Date getDeletedTime() {
		return this.deletedTime;
	}

	public void setDeletedTime(Date deletedTime) {
		this.deletedTime = deletedTime;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public Set getTbEmployees() {
		return this.tbEmployees;
	}

	public void setTbEmployees(Set tbEmployees) {
		this.tbEmployees = tbEmployees;
	}

	public Set getTbJobs() {
		return this.tbJobs;
	}

	public void setTbJobs(Set tbJobs) {
		this.tbJobs = tbJobs;
	}

}