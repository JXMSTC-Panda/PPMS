package ppms.domain;

import java.util.Date;

/**
 * TbSubAreaOrgRelation entity. @author MyEclipse Persistence Tools
 */
public class TbSubAreaOrgRelation extends AbstractTbSubAreaOrgRelation
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbSubAreaOrgRelation() {
	}

	/** minimal constructor */
	public TbSubAreaOrgRelation(Integer orgAreaId) {
		super(orgAreaId);
	}

	/** full constructor */
	public TbSubAreaOrgRelation(Integer orgAreaId,
			OrganizationNj organizationNj, TbSubArea tbSubArea,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime) {
		super(orgAreaId, organizationNj, tbSubArea, createdBy, createdTime,
				modifiedBy, modifiedTime);
	}

}
