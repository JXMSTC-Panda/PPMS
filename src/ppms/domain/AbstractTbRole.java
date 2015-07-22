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

	// Constructors

	/** default constructor */
	public AbstractTbRole() {
	}

	/** minimal constructor */
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
	}

	// Property accessors

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

	public Set getTbEmployees() {
		return this.tbEmployees;
	}

	public void setTbEmployees(Set tbEmployees) {
		this.tbEmployees = tbEmployees;
	}

	public Set getTbRoleFunctions() {
		return this.tbRoleFunctions;
	}

	public void setTbRoleFunctions(Set tbRoleFunctions) {
		this.tbRoleFunctions = tbRoleFunctions;
	}

}