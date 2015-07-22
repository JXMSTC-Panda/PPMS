package ppms.domain;

import java.util.Date;

/**
 * TbSubareaorgrelation entity. @author MyEclipse Persistence Tools
 */
public class TbSubareaorgrelation extends AbstractTbSubareaorgrelation
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbSubareaorgrelation() {
	}

	/** minimal constructor */
	public TbSubareaorgrelation(Integer orgareaid) {
		super(orgareaid);
	}

	/** full constructor */
	public TbSubareaorgrelation(Integer orgareaid,
			OrganizationNj organizationNj, TbSubarea tbSubarea,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
		super(orgareaid, organizationNj, tbSubarea, createdby, createdtime,
				modifiedby, modifiedtime);
	}

}
