package ppms.domain;

/**
 * AbstractTbRoleFunction entity provides the base persistence definition of the
 * TbRoleFunction entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbRoleFunction implements java.io.Serializable {

	// Fields

	private TbRoleFunctionId id;
	private String employeeSearchScope;
	private String orgSearchScope;

	// Constructors

	/** default constructor */
	public AbstractTbRoleFunction() {
	}

	/** minimal constructor */
	public AbstractTbRoleFunction(TbRoleFunctionId id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractTbRoleFunction(TbRoleFunctionId id,
			String employeeSearchScope, String orgSearchScope) {
		this.id = id;
		this.employeeSearchScope = employeeSearchScope;
		this.orgSearchScope = orgSearchScope;
	}

	// Property accessors

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
	}

}