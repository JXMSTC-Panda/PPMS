package ppms.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TbPost entity. @author MyEclipse Persistence Tools
 */

public class TbPost implements java.io.Serializable {

	// Fields

	private String postid;
	private String postname;
	private String postcomment;
	private String seq;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
	private Date deletedtime;
	private Set tbEmployees = new HashSet(0);
	private Set tbJobs = new HashSet(0);

	// Constructors

	/** default constructor */
	public TbPost() {
	}

	/** minimal constructor */
	public TbPost(String postid) {
		this.postid = postid;
	}

	/** full constructor */
	public TbPost(String postid, String postname, String postcomment,
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
		this.tbEmployees = tbEmployees;
		this.tbJobs = tbJobs;
	}

	// Property accessors

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

	public Set getTbJobs() {
		return this.tbJobs;
	}

	public void setTbJobs(Set tbJobs) {
		this.tbJobs = tbJobs;
	}

}