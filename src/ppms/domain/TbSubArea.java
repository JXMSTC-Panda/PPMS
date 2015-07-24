package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
<<<<<<< HEAD
 * TbSubarea entity. @author MyEclipse Persistence Tools
 */
public class TbSubarea extends AbstractTbSubarea implements
=======
 * TbSubArea entity. @author MyEclipse Persistence Tools
 */
public class TbSubArea extends AbstractTbSubArea implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public TbSubarea() {
	}

	/** minimal constructor */
	public TbSubarea(BigDecimal subareaid) {
		super(subareaid);
	}

	/** full constructor */
	public TbSubarea(BigDecimal subareaid, String subareadesc, Boolean status,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime, Set tbSubareaorgrelations, Set tbAreas) {
		super(subareaid, subareadesc, status, createdby, createdtime,
				modifiedby, modifiedtime, tbSubareaorgrelations, tbAreas);
=======
	public TbSubArea() {
	}

	/** minimal constructor */
	public TbSubArea(BigDecimal subAreaId) {
		super(subAreaId);
	}

	/** full constructor */
	public TbSubArea(BigDecimal subAreaId, String subAreaDesc, Boolean status,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime, Set tbSubAreaOrgRelations, Set tbAreas) {
		super(subAreaId, subAreaDesc, status, createdBy, createdTime,
				modifiedBy, modifiedTime, tbSubAreaOrgRelations, tbAreas);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
