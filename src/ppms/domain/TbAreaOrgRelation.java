package ppms.domain;

import java.util.Date;

/**
 * TbAreaOrgRelation entity. @author MyEclipse Persistence Tools
 */
public class TbAreaOrgRelation extends AbstractTbAreaOrgRelation implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbAreaOrgRelation() {
	}

	/** minimal constructor */
	public TbAreaOrgRelation(Integer areaOrgId) {
		super(areaOrgId);
	}

	/** full constructor */
	public TbAreaOrgRelation(Integer areaOrgId, OrganizationNj organizationNj,
			TbArea tbArea, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime) {
		super(areaOrgId, organizationNj, tbArea, createdBy, createdTime,
				modifiedBy, modifiedTime);
	}

}
