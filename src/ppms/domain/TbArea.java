package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 * TbArea entity. @author MyEclipse Persistence Tools
 */
public class TbArea extends AbstractTbArea implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbArea() {
	}

	/** minimal constructor */
<<<<<<< HEAD
	public TbArea(BigDecimal areaid) {
		super(areaid);
	}

	/** full constructor */
	public TbArea(BigDecimal areaid, TbSubarea tbSubarea, String areadesc,
			Boolean status, String createdby, Date createdtime,
			String modifiedby, Date modifiedtime, Set tbAreaorgrelations,
			Set COrganizationNjs) {
		super(areaid, tbSubarea, areadesc, status, createdby, createdtime,
				modifiedby, modifiedtime, tbAreaorgrelations, COrganizationNjs);
=======
	public TbArea(BigDecimal areaId) {
		super(areaId);
	}

	/** full constructor */
	public TbArea(BigDecimal areaId, TbSubArea tbSubArea, String areaDesc,
			Boolean status, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime, Set tbAreaOrgRelations,
			Set COrganizationNjs) {
		super(areaId, tbSubArea, areaDesc, status, createdBy, createdTime,
				modifiedBy, modifiedTime, tbAreaOrgRelations, COrganizationNjs);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
