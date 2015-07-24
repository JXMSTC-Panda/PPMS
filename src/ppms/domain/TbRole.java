package ppms.domain;

import java.util.Date;
import java.util.Set;

/**
 * TbRole entity. @author MyEclipse Persistence Tools
 */
public class TbRole extends AbstractTbRole implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbRole() {
	}

	/** minimal constructor */
<<<<<<< HEAD
	public TbRole(String roleid) {
		super(roleid);
	}

	/** full constructor */
	public TbRole(String roleid, String rolename, Boolean administratorflag,
			String seq, String createdby, Date createdtime, String modifiedby,
			Date modifiedtime, Set tbEmployees, Set tbRolefunctions) {
		super(roleid, rolename, administratorflag, seq, createdby, createdtime,
				modifiedby, modifiedtime, tbEmployees, tbRolefunctions);
=======
	public TbRole(String roleId) {
		super(roleId);
	}

	/** full constructor */
	public TbRole(String roleId, String roleName, Boolean administratorFlag,
			String seq, String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime, Set tbEmployees, Set tbRoleFunctions) {
		super(roleId, roleName, administratorFlag, seq, createdBy, createdTime,
				modifiedBy, modifiedTime, tbEmployees, tbRoleFunctions);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
