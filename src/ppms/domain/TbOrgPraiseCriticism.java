package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * TbOrgpraisecriticism entity. @author MyEclipse Persistence Tools
 */
public class TbOrgpraisecriticism extends AbstractTbOrgpraisecriticism
=======
 * TbOrgPraiseCriticism entity. @author MyEclipse Persistence Tools
 */
public class TbOrgPraiseCriticism extends AbstractTbOrgPraiseCriticism
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public TbOrgpraisecriticism() {
	}

	/** minimal constructor */
	public TbOrgpraisecriticism(String praisecriticismid) {
		super(praisecriticismid);
	}

	/** full constructor */
	public TbOrgpraisecriticism(String praisecriticismid,
			OrganizationNj organizationNj, String praisecriticismtype,
			String cause, Date praisecriticismdate,
			String praisecriticismlevel, String createdby, Date createdtime,
			String modifiedby, Date modifiedtime) {
		super(praisecriticismid, organizationNj, praisecriticismtype, cause,
				praisecriticismdate, praisecriticismlevel, createdby,
				createdtime, modifiedby, modifiedtime);
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
