package ppms.domain;

/**
<<<<<<< HEAD
 * AbstractTbRolefunction entity provides the base persistence definition of the
 * TbRolefunction entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbRolefunction implements java.io.Serializable {

	// Fields

	private TbRolefunctionId id;
	private String employeesearchscope;
	private String orgsearchscope;
=======
 * AbstractTbRoleFunction entity provides the base persistence definition of the
 * TbRoleFunction entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbRoleFunction implements java.io.Serializable {

	// Fields

	private TbRoleFunctionId id;
	private String employeeSearchScope;
	private String orgSearchScope;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public AbstractTbRolefunction() {
	}

	/** minimal constructor */
	public AbstractTbRolefunction(TbRolefunctionId id) {
=======
	public AbstractTbRoleFunction() {
	}

	/** minimal constructor */
	public AbstractTbRoleFunction(TbRoleFunctionId id) {
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		this.id = id;
	}

	/** full constructor */
<<<<<<< HEAD
	public AbstractTbRolefunction(TbRolefunctionId id,
			String employeesearchscope, String orgsearchscope) {
		this.id = id;
		this.employeesearchscope = employeesearchscope;
		this.orgsearchscope = orgsearchscope;
=======
	public AbstractTbRoleFunction(TbRoleFunctionId id,
			String employeeSearchScope, String orgSearchScope) {
		this.id = id;
		this.employeeSearchScope = employeeSearchScope;
		this.orgSearchScope = orgSearchScope;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
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
=======
	public TbRoleFunctionId getId() {
		return this.id;
	}

	public void setId(TbRoleFunctionId id) {
		this.id = id;
	}

	public String getEmployeeSearchScope() {
		return this.employeeSearchScope;
	}

	public void setEmployeeSearchScope(String employeeSearchScope) {
		this.employeeSearchScope = employeeSearchScope;
	}

	public String getOrgSearchScope() {
		return this.orgSearchScope;
	}

	public void setOrgSearchScope(String orgSearchScope) {
		this.orgSearchScope = orgSearchScope;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}