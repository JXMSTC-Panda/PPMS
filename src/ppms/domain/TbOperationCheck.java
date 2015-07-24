package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * TbOperationcheck entity. @author MyEclipse Persistence Tools
 */
public class TbOperationcheck extends AbstractTbOperationcheck implements
=======
 * TbOperationCheck entity. @author MyEclipse Persistence Tools
 */
public class TbOperationCheck extends AbstractTbOperationCheck implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public TbOperationcheck() {
	}

	/** minimal constructor */
	public TbOperationcheck(String operationcheckid) {
		super(operationcheckid);
	}

	/** full constructor */
	public TbOperationcheck(String operationcheckid,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			Date operationdate, String customermobilenumber,
			String operationtype, String punishresult, String createdby,
			Date createdtime, String modifiedby, Date modifiedtime) {
		super(operationcheckid, organizationNj, tbEmployee, operationdate,
				customermobilenumber, operationtype, punishresult, createdby,
				createdtime, modifiedby, modifiedtime);
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
