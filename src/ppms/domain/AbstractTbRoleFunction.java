package ppms.domain;

/**
 * AbstractTbRolefunction entity provides the base persistence definition of the
 * TbRolefunction entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbRolefunction implements java.io.Serializable {

	// Fields

	private TbRolefunctionId id;
	private String employeesearchscope;
	private String orgsearchscope;

	// Constructors

	/** default constructor */
	public AbstractTbRolefunction() {
	}

	/** minimal constructor */
	public AbstractTbRolefunction(TbRolefunctionId id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractTbRolefunction(TbRolefunctionId id,
			String employeesearchscope, String orgsearchscope) {
		this.id = id;
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