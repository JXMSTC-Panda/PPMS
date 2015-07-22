package ppms.domain;

import java.util.Date;

/**
 * TbOrgPraiseCriticism entity. @author MyEclipse Persistence Tools
 */
public class TbOrgPraiseCriticism extends AbstractTbOrgPraiseCriticism
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbOrgPraiseCriticism() {
	}

	/** minimal constructor */
	public TbOrgPraiseCriticism(String praiseCriticismId) {
		super(praiseCriticismId);
	}

	/** full constructor */
	public TbOrgPraiseCriticism(String praiseCriticismId,
			OrganizationNj organizationNj, String praiseCriticismType,
			String cause, Date praiseCriticismDate,
			String praiseCriticismLevel, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime) {
		super(praiseCriticismId, organizationNj, praiseCriticismType, cause,
				praiseCriticismDate, praiseCriticismLevel, createdBy,
				createdTime, modifiedBy, modifiedTime);
	}

}
