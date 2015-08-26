package ppms.domain;

/**
 * TbRolefunction entity. @author MyEclipse Persistence Tools
 */

public class TbRolefunction implements java.io.Serializable {

	// Fields

	private String rolefunctionid;
	private TbRole tbRole;
	private String functionids;
	private String employeesearchscope;
	private String orgsearchscope;

	// Constructors

	/** default constructor */
	public TbRolefunction() {
	}

	/** minimal constructor */
	public TbRolefunction(String rolefunctionid, TbRole tbRole,
			String functionids) {
		this.rolefunctionid = rolefunctionid;
		this.tbRole = tbRole;
		this.functionids = functionids;
	}

	/** full constructor */
	public TbRolefunction(String rolefunctionid, TbRole tbRole,
			String functionids, String employeesearchscope,
			String orgsearchscope) {
		this.rolefunctionid = rolefunctionid;
		this.tbRole = tbRole;
		this.functionids = functionids;
		this.employeesearchscope = employeesearchscope;
		this.orgsearchscope = orgsearchscope;
	}

	// Property accessors

	public String getRolefunctionid() {
		return this.rolefunctionid;
	}

	public void setRolefunctionid(String rolefunctionid) {
		this.rolefunctionid = rolefunctionid;
	}

	public TbRole getTbRole() {
		return this.tbRole;
	}

	public void setTbRole(TbRole tbRole) {
		this.tbRole = tbRole;
	}

	public String getFunctionids() {
		return this.functionids;
	}

	public void setFunctionids(String functionids) {
		this.functionids = functionids;
	}

	public String getEmployeesearchscope() {
		return this.employeesearchscope;
	}

	public void setEmployeesearchscope(String employeesearchscope) {
		this.employeesearchscope = employeesearchscope;
	}

	public String getOrgsearchscope() {
		return this.orgsearchscope;
	}

	public void setOrgsearchscope(String orgsearchscope) {
		this.orgsearchscope = orgsearchscope;
	}

}