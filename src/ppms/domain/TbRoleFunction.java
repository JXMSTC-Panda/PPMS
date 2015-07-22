package ppms.domain;

/**
 * TbRoleFunction entity. @author MyEclipse Persistence Tools
 */
public class TbRoleFunction extends AbstractTbRoleFunction implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbRoleFunction() {
	}

	/** minimal constructor */
	public TbRoleFunction(TbRoleFunctionId id) {
		super(id);
	}

	/** full constructor */
	public TbRoleFunction(TbRoleFunctionId id, String employeeSearchScope,
			String orgSearchScope) {
		super(id, employeeSearchScope, orgSearchScope);
	}

}
