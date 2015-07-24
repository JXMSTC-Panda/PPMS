package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * TbChangeorghistory entity. @author MyEclipse Persistence Tools
 */
public class TbChangeorghistory extends AbstractTbChangeorghistory implements
=======
 * TbChangeOrgHistory entity. @author MyEclipse Persistence Tools
 */
public class TbChangeOrgHistory extends AbstractTbChangeOrgHistory implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public TbChangeorghistory() {
	}

	/** minimal constructor */
	public TbChangeorghistory(String orghistoryid) {
		super(orghistoryid);
	}

	/** full constructor */
	public TbChangeorghistory(String orghistoryid, TbEmployee tbEmployee,
			OrganizationNj organizationNjByOutorgid,
			OrganizationNj organizationNjByInorgid, Date changedate,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
		super(orghistoryid, tbEmployee, organizationNjByOutorgid,
				organizationNjByInorgid, changedate, createdby, createdtime,
				modifiedby, modifiedtime);
=======
	public TbChangeOrgHistory() {
	}

	/** minimal constructor */
	public TbChangeOrgHistory(String orgHistoryId) {
		super(orgHistoryId);
	}

	/** full constructor */
	public TbChangeOrgHistory(String orgHistoryId, TbEmployee tbEmployee,
			OrganizationNj organizationNjByOutOrgId,
			OrganizationNj organizationNjByInOrgId, Date changeDate,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime) {
		super(orgHistoryId, tbEmployee, organizationNjByOutOrgId,
				organizationNjByInOrgId, changeDate, createdBy, createdTime,
				modifiedBy, modifiedTime);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
