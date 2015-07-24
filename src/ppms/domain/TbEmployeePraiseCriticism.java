package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * TbEmployeepraisecriticism entity. @author MyEclipse Persistence Tools
 */
public class TbEmployeepraisecriticism extends
		AbstractTbEmployeepraisecriticism implements java.io.Serializable {
=======
 * TbEmployeePraiseCriticism entity. @author MyEclipse Persistence Tools
 */
public class TbEmployeePraiseCriticism extends
		AbstractTbEmployeePraiseCriticism implements java.io.Serializable {
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public TbEmployeepraisecriticism() {
	}

	/** minimal constructor */
	public TbEmployeepraisecriticism(String praisecriticismid) {
		super(praisecriticismid);
	}

	/** full constructor */
	public TbEmployeepraisecriticism(String praisecriticismid,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			String praisecriticismtype, String cause, Date praisecriticismdate,
			String praisecriticismlevel, String orgpraisecriticmrelationid,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
		super(praisecriticismid, organizationNj, tbEmployee,
				praisecriticismtype, cause, praisecriticismdate,
				praisecriticismlevel, orgpraisecriticmrelationid, createdby,
				createdtime, modifiedby, modifiedtime);
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
