package ppms.domain;

import java.util.Date;

/**
 * TbChangeorghistory entity. @author MyEclipse Persistence Tools
 */
public class TbChangeorghistory extends AbstractTbChangeorghistory implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
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
	}

}
