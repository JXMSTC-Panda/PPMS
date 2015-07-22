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
	}

}
