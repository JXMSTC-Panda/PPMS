package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 * TbSubarea entity. @author MyEclipse Persistence Tools
 */
public class TbSubarea extends AbstractTbSubarea implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbSubarea() {
	}

	/** minimal constructor */
	public TbSubarea(BigDecimal subareaid) {
		super(subareaid);
	}

	/** full constructor */
	public TbSubarea(BigDecimal subareaid, String subareadesc, Boolean status,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime, Set tbSubareaorgrelations, Set tbAreas) {
		super(subareaid, subareadesc, status, createdby, createdtime,
				modifiedby, modifiedtime, tbSubareaorgrelations, tbAreas);
	}

}
