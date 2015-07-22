package ppms.domain;

import java.util.Date;

/**
 * TbEmployeePraiseCriticism entity. @author MyEclipse Persistence Tools
 */
public class TbEmployeePraiseCriticism extends
		AbstractTbEmployeePraiseCriticism implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbEmployeePraiseCriticism() {
	}

	/** minimal constructor */
	public TbEmployeePraiseCriticism(String praiseCriticismId) {
		super(praiseCriticismId);
	}

	/** full constructor */
	public TbEmployeePraiseCriticism(String praiseCriticismId,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			String praiseCriticismType, String cause, Date praiseCriticismDate,
			String praiseCriticismLevel, String orgPraiseCriticmRelationId,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime) {
		super(praiseCriticismId, organizationNj, tbEmployee,
				praiseCriticismType, cause, praiseCriticismDate,
				praiseCriticismLevel, orgPraiseCriticmRelationId, createdBy,
				createdTime, modifiedBy, modifiedTime);
	}

}
