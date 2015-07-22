package ppms.domain;

import java.util.Date;

/**
 * TbMonitorCheck entity. @author MyEclipse Persistence Tools
 */
public class TbMonitorCheck extends AbstractTbMonitorCheck implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbMonitorCheck() {
	}

	/** minimal constructor */
	public TbMonitorCheck(String monitorCheckId) {
		super(monitorCheckId);
	}

	/** full constructor */
	public TbMonitorCheck(String monitorCheckId, OrganizationNj organizationNj,
			Date checkDate, String checkType, String detail, String createdBy,
			Date createdTime, String modifiedBy, Date modifiedTime) {
		super(monitorCheckId, organizationNj, checkDate, checkType, detail,
				createdBy, createdTime, modifiedBy, modifiedTime);
	}

}
