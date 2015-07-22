package ppms.domain;

import java.util.Date;

/**
 * OperatorNj entity. @author MyEclipse Persistence Tools
 */
public class OperatorNj extends AbstractOperatorNj implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public OperatorNj() {
	}

	/** minimal constructor */
	public OperatorNj(Integer operatorId) {
		super(operatorId);
	}

	/** full constructor */
	public OperatorNj(Integer operatorId, OrganizationNj organizationNj,
			String name, Boolean sex, String addr, String telephone,
			String office, Date createTime, Date invalidTime, Boolean statusId,
			Byte maxLoginTimes, Byte currLoginTimes, Integer empNo,
			Boolean type, String mobile, Date changeDate) {
		super(operatorId, organizationNj, name, sex, addr, telephone, office,
				createTime, invalidTime, statusId, maxLoginTimes,
				currLoginTimes, empNo, type, mobile, changeDate);
	}

}
