package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * TbAreaorgrelation entity. @author MyEclipse Persistence Tools
 */
public class TbAreaorgrelation extends AbstractTbAreaorgrelation implements
=======
 * TbAreaOrgRelation entity. @author MyEclipse Persistence Tools
 */
public class TbAreaOrgRelation extends AbstractTbAreaOrgRelation implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public TbAreaorgrelation() {
	}

	/** minimal constructor */
	public TbAreaorgrelation(Integer areaorgid) {
		super(areaorgid);
	}

	/** full constructor */
	public TbAreaorgrelation(Integer areaorgid, OrganizationNj organizationNj,
			TbArea tbArea, String createdby, Date createdtime,
			String modifiedby, Date modifiedtime) {
		super(areaorgid, organizationNj, tbArea, createdby, createdtime,
				modifiedby, modifiedtime);
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
