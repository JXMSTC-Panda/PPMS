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
	public TbRole(String roleId) {
		super(roleId);
	}

	/** full constructor */
	public TbRole(String roleId, String roleName, Boolean administratorFlag,
			String seq, String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime, Set tbEmployees, Set tbRoleFunctions) {
		super(roleId, roleName, administratorFlag, seq, createdBy, createdTime,
				modifiedBy, modifiedTime, tbEmployees, tbRoleFunctions);
	}

}
