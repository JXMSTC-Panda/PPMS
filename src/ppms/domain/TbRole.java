package ppms.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TbRole entity. @author MyEclipse Persistence Tools
 */

public class TbRole implements java.io.Serializable {

	// Fields

	private String roleid;
	private String rolename;
	private Boolean administratorflag;
	private String seq;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
	private Set tbEmployees = new HashSet(0);
	private Set tbRolefunctions = new HashSet(0);

	// Constructors

	/** default constructor */
	public TbRole() {
	}

	/** minimal constructor */
	public TbRole(String roleid) {
		this.roleid = roleid;
	}

	/** full constructor */
	public TbRole(String roleid, String rolename, Boolean administratorflag,
			String seq, String createdby, Date createdtime, String modifiedby,
			Date modifiedtime, Set tbEmployees, Set tbRolefunctions) {
		this.roleid = roleid;
		this.rolename = rolename;
		this.administratorflag = administratorflag;
		this.seq = seq;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
		this.tbEmployees = tbEmployees;
		this.tbRolefunctions = tbRolefunctions;
	}

	// Property accessors

	public String getRoleid() {
		return this.roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public Boolean getAdministratorflag() {
		return this.administratorflag;
	}

	public void setAdministratorflag(Boolean administratorflag) {
		this.administratorflag = administratorflag;
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

	public Set getTbEmployees() {
		return this.tbEmployees;
	}

	public void setTbEmployees(Set tbEmployees) {
		this.tbEmployees = tbEmployees;
	}

	public Set getTbRolefunctions() {
		return this.tbRolefunctions;
	}

	public void setTbRolefunctions(Set tbRolefunctions) {
		this.tbRolefunctions = tbRolefunctions;
	}

}