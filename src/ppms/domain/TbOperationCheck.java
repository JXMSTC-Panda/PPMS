package ppms.domain;

import java.util.Date;

/**
 * TbOperationCheck entity. @author MyEclipse Persistence Tools
 */
public class TbOperationCheck extends AbstractTbOperationCheck implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbOperationCheck() {
	}

	/** minimal constructor */
	public TbOperationCheck(String operationCheckId) {
		super(operationCheckId);
	}

	/** full constructor */
	public TbOperationCheck(String operationCheckId,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			Date operationDate, String customerMobileNumber,
			String operationType, String punishResult, String createdBy,
			Date createdTime, String modifiedBy, Date modifiedTime) {
		super(operationCheckId, organizationNj, tbEmployee, operationDate,
				customerMobileNumber, operationType, punishResult, createdBy,
				createdTime, modifiedBy, modifiedTime);
	}

}
