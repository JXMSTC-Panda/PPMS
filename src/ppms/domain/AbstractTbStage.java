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

<<<<<<< HEAD
	private String stageid;
	private String stagename;
	private String stagecomment;
	private String seq;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
	private Date deletedtime;
=======
	private String stageId;
	private String stageName;
	private String stageComment;
	private String seq;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;
	private Date deletedTime;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	private Set tbJobs = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractTbStage() {
	}

	/** minimal constructor */
<<<<<<< HEAD
	public AbstractTbStage(String stageid) {
		this.stageid = stageid;
	}

	/** full constructor */
	public AbstractTbStage(String stageid, String stagename,
			String stagecomment, String seq, String createdby,
			Date createdtime, String modifiedby, Date modifiedtime,
			Date deletedtime, Set tbJobs) {
		this.stageid = stageid;
		this.stagename = stagename;
		this.stagecomment = stagecomment;
		this.seq = seq;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
		this.deletedtime = deletedtime;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		this.tbJobs = tbJobs;
	}

	// Property accessors

<<<<<<< HEAD
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
=======
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

	public Set getTbJobs() {
		return this.tbJobs;
	}

	public void setTbJobs(Set tbJobs) {
		this.tbJobs = tbJobs;
	}

}