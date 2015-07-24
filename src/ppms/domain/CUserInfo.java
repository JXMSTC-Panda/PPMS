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
<<<<<<< HEAD
	public CUserInfo(BigDecimal operid) {
		super(operid);
	}

	/** full constructor */
	public CUserInfo(BigDecimal operid, OrganizationNj organizationNj,
			String opername, String operpass, String roleid,
			BigDecimal departid, BigDecimal centerid, String zwid,
			BigDecimal usercountry, BigDecimal isvalid, BigDecimal shortnum,
			BigDecimal mobilenum, BigDecimal operatingid, Date operatingdate) {
		super(operid, organizationNj, opername, operpass, roleid, departid,
				centerid, zwid, usercountry, isvalid, shortnum, mobilenum,
				operatingid, operatingdate);
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
