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

	private String postId;
	private String postName;
	private String postComment;
	private String seq;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;
	private Date deletedTime;
	private Set tbEmployees = new HashSet(0);
	private Set tbJobs = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractTbPost() {
	}

	/** minimal constructor */
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
		this.tbEmployees = tbEmployees;
		this.tbJobs = tbJobs;
	}

	// Property accessors

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
	}

	public String getSeq() {
		return this.seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

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