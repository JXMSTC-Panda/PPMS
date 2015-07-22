package ppms.domain;

import java.util.Date;

/**
 * TbEmployeepraisecriticism entity. @author MyEclipse Persistence Tools
 */
public class TbEmployeepraisecriticism extends
		AbstractTbEmployeepraisecriticism implements java.io.Serializable {

	// Constructors

	/** default constructor */
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
	}

}
