package ppms.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractTbStage entity provides the base persistence definition of the
 * TbStage entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbStage implements java.io.Serializable {

	// Fields

	private String stageId;
	private String stageName;
	private String stageComment;
	private String seq;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;
	private Date deletedTime;
	private Set tbJobs = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractTbStage() {
	}

	/** minimal constructor */
	public AbstractTbStage(String stageId) {
		this.stageId = stageId;
	}

	/** full constructor */
	public AbstractTbStage(String stageId, String stageName,
			String stageComment, String seq, String createdBy,
			Date createdTime, String modifiedBy, Date modifiedTime,
			Date deletedTime, Set tbJobs) {
		this.stageId = stageId;
		this.stageName = stageName;
		this.stageComment = stageComment;
		this.seq = seq;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
		this.deletedTime = deletedTime;
		this.tbJobs = tbJobs;
	}

	// Property accessors

	public String getStageId() {
		return this.stageId;
	}

	public void setStageId(String stageId) {
		this.stageId = stageId;
	}

	public String getStageName() {
		return this.stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	public String getStageComment() {
		return this.stageComment;
	}

	public void setStageComment(String stageComment) {
		this.stageComment = stageComment;
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

	public Set getTbJobs() {
		return this.tbJobs;
	}

	public void setTbJobs(Set tbJobs) {
		this.tbJobs = tbJobs;
	}

}