package ppms.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractTbJob entity provides the base persistence definition of the TbJob
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbJob implements java.io.Serializable {

	// Fields

	private String jobId;
	private TbStage tbStage;
	private TbPost tbPost;
	private String jobName;
	private String jobComment;
	private Boolean jobType;
	private String seq;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;
	private Date deletedTime;
	private Set tbChangeJobHistoriesForInJobId = new HashSet(0);
	private Set tbChangeJobHistoriesForOutJobId = new HashSet(0);
	private Set tbEmployees = new HashSet(0);
	private Set tbPoints = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractTbJob() {
	}

	/** minimal constructor */
	public AbstractTbJob(String jobId) {
		this.jobId = jobId;
	}

	/** full constructor */
	public AbstractTbJob(String jobId, TbStage tbStage, TbPost tbPost,
			String jobName, String jobComment, Boolean jobType, String seq,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime, Date deletedTime,
			Set tbChangeJobHistoriesForInJobId,
			Set tbChangeJobHistoriesForOutJobId, Set tbEmployees, Set tbPoints) {
		this.jobId = jobId;
		this.tbStage = tbStage;
		this.tbPost = tbPost;
		this.jobName = jobName;
		this.jobComment = jobComment;
		this.jobType = jobType;
		this.seq = seq;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
		this.deletedTime = deletedTime;
		this.tbChangeJobHistoriesForInJobId = tbChangeJobHistoriesForInJobId;
		this.tbChangeJobHistoriesForOutJobId = tbChangeJobHistoriesForOutJobId;
		this.tbEmployees = tbEmployees;
		this.tbPoints = tbPoints;
	}

	// Property accessors

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public TbStage getTbStage() {
		return this.tbStage;
	}

	public void setTbStage(TbStage tbStage) {
		this.tbStage = tbStage;
	}

	public TbPost getTbPost() {
		return this.tbPost;
	}

	public void setTbPost(TbPost tbPost) {
		this.tbPost = tbPost;
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobComment() {
		return this.jobComment;
	}

	public void setJobComment(String jobComment) {
		this.jobComment = jobComment;
	}

	public Boolean getJobType() {
		return this.jobType;
	}

	public void setJobType(Boolean jobType) {
		this.jobType = jobType;
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

	public Set getTbChangeJobHistoriesForInJobId() {
		return this.tbChangeJobHistoriesForInJobId;
	}

	public void setTbChangeJobHistoriesForInJobId(
			Set tbChangeJobHistoriesForInJobId) {
		this.tbChangeJobHistoriesForInJobId = tbChangeJobHistoriesForInJobId;
	}

	public Set getTbChangeJobHistoriesForOutJobId() {
		return this.tbChangeJobHistoriesForOutJobId;
	}

	public void setTbChangeJobHistoriesForOutJobId(
			Set tbChangeJobHistoriesForOutJobId) {
		this.tbChangeJobHistoriesForOutJobId = tbChangeJobHistoriesForOutJobId;
	}

	public Set getTbEmployees() {
		return this.tbEmployees;
	}

	public void setTbEmployees(Set tbEmployees) {
		this.tbEmployees = tbEmployees;
	}

	public Set getTbPoints() {
		return this.tbPoints;
	}

	public void setTbPoints(Set tbPoints) {
		this.tbPoints = tbPoints;
	}

}