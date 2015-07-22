package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * COrganizationNj entity. @author MyEclipse Persistence Tools
 */
public class COrganizationNj extends AbstractCOrganizationNj implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public COrganizationNj() {
	}

	/** minimal constructor */
	public COrganizationNj(BigDecimal orgAreaId) {
		super(orgAreaId);
	}

	/** full constructor */
	public COrganizationNj(BigDecimal orgAreaId, OrganizationNj organizationNj,
			TbArea tbArea, String orgName, BigDecimal orgTypeId,
			BigDecimal regionId, String idDesc, BigDecimal type,
			Date operatingDate, BigDecimal operatingId, String countyDesc,
			String countyLx, String idDesc2, Boolean isSq, Boolean isSjmc,
			Boolean isXyd, BigDecimal idType2, BigDecimal countyLxId,
			BigDecimal countyId, Boolean xsId, Boolean dyId, Boolean hzlxId,
			Byte qdlxId, Boolean fsxzId, Boolean zdxsId, Short dzsxId,
			String channelId1, String dy, String qdlx, BigDecimal status) {
		super(orgAreaId, organizationNj, tbArea, orgName, orgTypeId, regionId,
				idDesc, type, operatingDate, operatingId, countyDesc, countyLx,
				idDesc2, isSq, isSjmc, isXyd, idType2, countyLxId, countyId,
				xsId, dyId, hzlxId, qdlxId, fsxzId, zdxsId, dzsxId, channelId1,
				dy, qdlx, status);
	}

}
