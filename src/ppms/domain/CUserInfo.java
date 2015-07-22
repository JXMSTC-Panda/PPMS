package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * CUserInfo entity. @author MyEclipse Persistence Tools
 */
public class CUserInfo extends AbstractCUserInfo implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CUserInfo() {
	}

	/** minimal constructor */
	public CUserInfo(BigDecimal operId) {
		super(operId);
	}

	/** full constructor */
	public CUserInfo(BigDecimal operId, OrganizationNj organizationNj,
			String operName, String operPass, String roleId,
			BigDecimal departId, BigDecimal centerId, String zwId,
			BigDecimal userCountry, BigDecimal isValid, BigDecimal shortNum,
			BigDecimal mobileNum, BigDecimal operatingId, Date operatingDate) {
		super(operId, organizationNj, operName, operPass, roleId, departId,
				centerId, zwId, userCountry, isValid, shortNum, mobileNum,
				operatingId, operatingDate);
	}

}
