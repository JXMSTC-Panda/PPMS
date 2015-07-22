package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 * TbSubArea entity. @author MyEclipse Persistence Tools
 */
public class TbSubArea extends AbstractTbSubArea implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
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
	}

}
