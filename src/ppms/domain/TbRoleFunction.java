package ppms.domain;

/**
<<<<<<< HEAD
 * TbRolefunction entity. @author MyEclipse Persistence Tools
 */
public class TbRolefunction extends AbstractTbRolefunction implements
=======
 * TbRoleFunction entity. @author MyEclipse Persistence Tools
 */
public class TbRoleFunction extends AbstractTbRoleFunction implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public TbRolefunction() {
	}

	/** minimal constructor */
	public TbRolefunction(TbRolefunctionId id) {
=======
	public TbRoleFunction() {
	}

	/** minimal constructor */
	public TbRoleFunction(TbRoleFunctionId id) {
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		super(id);
	}

	/** full constructor */
<<<<<<< HEAD
	public TbRolefunction(TbRolefunctionId id, String employeesearchscope,
			String orgsearchscope) {
		super(id, employeesearchscope, orgsearchscope);
=======
	public TbRoleFunction(TbRoleFunctionId id, String employeeSearchScope,
			String orgSearchScope) {
		super(id, employeeSearchScope, orgSearchScope);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
