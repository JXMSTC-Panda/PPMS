package ppms.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractTbRole entity provides the base persistence definition of the TbRole
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbRole implements java.io.Serializable {

	// Fields

<<<<<<< HEAD
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
=======
	private String roleId;
	private String roleName;
	private Boolean administratorFlag;
	private String seq;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;
	private Set tbEmployees = new HashSet(0);
	private Set tbRoleFunctions = new HashSet(0);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
	public AbstractTbRole() {
	}

	/** minimal constructor */
<<<<<<< HEAD
	public AbstractTbRole(String roleid) {
		this.roleid = roleid;
	}

	/** full constructor */
	public AbstractTbRole(String roleid, String rolename,
			Boolean administratorflag, String seq, String createdby,
			Date createdtime, String modifiedby, Date modifiedtime,
			Set tbEmployees, Set tbRolefunctions) {
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
=======
	public AbstractTbRole(String roleId) {
		this.roleId = roleId;
	}

	/** full constructor */
	public AbstractTbRole(String roleId, String roleName,
			Boolean administratorFlag, String seq, String createdBy,
			Date createdTime, String modifiedBy, Date modifiedTime,
			Set tbEmployees, Set tbRoleFunctions) {
		this.roleId = roleId;
		this.roleName = roleName;
		this.administratorFlag = administratorFlag;
		this.seq = seq;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
		this.tbEmployees = tbEmployees;
		this.tbRoleFunctions = tbRoleFunctions;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
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
=======
	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Boolean getAdministratorFlag() {
		return this.administratorFlag;
	}

	public void setAdministratorFlag(Boolean administratorFlag) {
		this.administratorFlag = administratorFlag;
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public Set getTbEmployees() {
		return this.tbEmployees;
	}

	public void setTbEmployees(Set tbEmployees) {
		this.tbEmployees = tbEmployees;
	}

<<<<<<< HEAD
	public Set getTbRolefunctions() {
		return this.tbRolefunctions;
	}

	public void setTbRolefunctions(Set tbRolefunctions) {
		this.tbRolefunctions = tbRolefunctions;
=======
	public Set getTbRoleFunctions() {
		return this.tbRoleFunctions;
	}

	public void setTbRoleFunctions(Set tbRoleFunctions) {
		this.tbRoleFunctions = tbRoleFunctions;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}