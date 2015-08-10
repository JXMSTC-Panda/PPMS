package ppms.domain;

import ppms.excel.template.BaseExcelObject;

/**
 * TbRolefunction entity. @author MyEclipse Persistence Tools
 */

public class TbRolefunction extends BaseExcelObject implements java.io.Serializable {

	// Fields

	private TbRolefunctionId id;
	private TbSystemfunction tbSystemfunction;
	private TbRole tbRole;
	private String employeesearchscope;
	private String orgsearchscope;

	// Constructors

	/** default constructor */
	public TbRolefunction() {
	}

	/** minimal constructor */
	public TbRolefunction(TbRolefunctionId id,
			TbSystemfunction tbSystemfunction, TbRole tbRole) {
		this.id = id;
		this.tbSystemfunction = tbSystemfunction;
		this.tbRole = tbRole;
	}

	/** full constructor */
	public TbRolefunction(TbRolefunctionId id,
			TbSystemfunction tbSystemfunction, TbRole tbRole,
			String employeesearchscope, String orgsearchscope) {
		this.id = id;
		this.tbSystemfunction = tbSystemfunction;
		this.tbRole = tbRole;
		this.employeesearchscope = employeesearchscope;
		this.orgsearchscope = orgsearchscope;
	}

	// Property accessors

	public TbRolefunctionId getId() {
		return this.id;
	}

	public void setId(TbRolefunctionId id) {
		this.id = id;
	}

	public TbSystemfunction getTbSystemfunction() {
		return this.tbSystemfunction;
	}

	public void setTbSystemfunction(TbSystemfunction tbSystemfunction) {
		this.tbSystemfunction = tbSystemfunction;
	}

	public TbRole getTbRole() {
		return this.tbRole;
	}

	public void setTbRole(TbRole tbRole) {
		this.tbRole = tbRole;
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