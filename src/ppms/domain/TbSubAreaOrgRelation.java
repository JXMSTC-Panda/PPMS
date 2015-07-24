package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * TbSubareaorgrelation entity. @author MyEclipse Persistence Tools
 */
public class TbSubareaorgrelation extends AbstractTbSubareaorgrelation
=======
 * TbSubAreaOrgRelation entity. @author MyEclipse Persistence Tools
 */
public class TbSubAreaOrgRelation extends AbstractTbSubAreaOrgRelation
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public TbSubareaorgrelation() {
	}

	/** minimal constructor */
	public TbSubareaorgrelation(Integer orgareaid) {
		super(orgareaid);
	}

	/** full constructor */
	public TbSubareaorgrelation(Integer orgareaid,
			OrganizationNj organizationNj, TbSubarea tbSubarea,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
		super(orgareaid, organizationNj, tbSubarea, createdby, createdtime,
				modifiedby, modifiedtime);
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
