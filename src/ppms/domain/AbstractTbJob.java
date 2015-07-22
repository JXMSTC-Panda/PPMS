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

	private String jobid;
	private TbStage tbStage;
	private TbPost tbPost;
	private String jobname;
	private String jobcomment;
	private Boolean jobtype;
	private String seq;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
	private Date deletedtime;
	private Set tbEmployees = new HashSet(0);
	private Set tbChangejobhistoriesForInjobid = new HashSet(0);
	private Set tbPoints = new HashSet(0);
	private Set tbChangejobhistoriesForOutjobid = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractTbJob() {
	}

	/** minimal constructor */
	public AbstractTbJob(String jobid) {
		this.jobid = jobid;
	}

	/** full constructor */
	public AbstractTbJob(String jobid, TbStage tbStage, TbPost tbPost,
			String jobname, String jobcomment, Boolean jobtype, String seq,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime, Date deletedtime, Set tbEmployees,
			Set tbChangejobhistoriesForInjobid, Set tbPoints,
			Set tbChangejobhistoriesForOutjobid) {
		this.jobid = jobid;
		this.tbStage = tbStage;
		this.tbPost = tbPost;
		this.jobname = jobname;
		this.jobcomment = jobcomment;
		this.jobtype = jobtype;
		this.seq = seq;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
		this.deletedtime = deletedtime;
		this.tbEmployees = tbEmployees;
		this.tbChangejobhistoriesForInjobid = tbChangejobhistoriesForInjobid;
		this.tbPoints = tbPoints;
		this.tbChangejobhistoriesForOutjobid = tbChangejobhistoriesForOutjobid;
	}

	// Property accessors

	public String getJobid() {
		return this.jobid;
	}

	public void setJobid(String jobid) {
		this.jobid = jobid;
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

	public String getJobname() {
		return this.jobname;
	}

	public void setJobname(String jobname) {
		this.jobname = jobname;
	}

	public String getJobcomment() {
		return this.jobcomment;
	}

	public void setJobcomment(String jobcomment) {
		this.jobcomment = jobcomment;
	}

	public Boolean getJobtype() {
		return this.jobtype;
	}

	public void setJobtype(Boolean jobtype) {
		this.jobtype = jobtype;
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

	public Set getTbEmployees() {
		return this.tbEmployees;
	}

	public void setTbEmployees(Set tbEmployees) {
		this.tbEmployees = tbEmployees;
	}

	public Set getTbChangejobhistoriesForInjobid() {
		return this.tbChangejobhistoriesForInjobid;
	}

	public void setTbChangejobhistoriesForInjobid(
			Set tbChangejobhistoriesForInjobid) {
		this.tbChangejobhistoriesForInjobid = tbChangejobhistoriesForInjobid;
	}

	public Set getTbPoints() {
		return this.tbPoints;
	}

	public void setTbPoints(Set tbPoints) {
		this.tbPoints = tbPoints;
	}

	public Set getTbChangejobhistoriesForOutjobid() {
		return this.tbChangejobhistoriesForOutjobid;
	}

	public void setTbChangejobhistoriesForOutjobid(
			Set tbChangejobhistoriesForOutjobid) {
		this.tbChangejobhistoriesForOutjobid = tbChangejobhistoriesForOutjobid;
	}

}