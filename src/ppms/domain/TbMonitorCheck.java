package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * TbMonitorcheck entity. @author MyEclipse Persistence Tools
 */
public class TbMonitorcheck extends AbstractTbMonitorcheck implements
=======
 * TbMonitorCheck entity. @author MyEclipse Persistence Tools
 */
public class TbMonitorCheck extends AbstractTbMonitorCheck implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public TbMonitorcheck() {
	}

	/** minimal constructor */
	public TbMonitorcheck(String monitorcheckid) {
		super(monitorcheckid);
	}

	/** full constructor */
	public TbMonitorcheck(String monitorcheckid, OrganizationNj organizationNj,
			Date checkdate, String checktype, String detail, String createdby,
			Date createdtime, String modifiedby, Date modifiedtime) {
		super(monitorcheckid, organizationNj, checkdate, checktype, detail,
				createdby, createdtime, modifiedby, modifiedtime);
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
