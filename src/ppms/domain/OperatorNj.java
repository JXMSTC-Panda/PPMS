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
<<<<<<< HEAD
	public OperatorNj(Integer operatorid) {
		super(operatorid);
	}

	/** full constructor */
	public OperatorNj(Integer operatorid, OrganizationNj organizationNj,
			String name, Boolean sex, String addr, String telephone,
			String office, Date createtime, Date invalidtime, Boolean statusid,
			Byte maxlogintimes, Byte currlogintimes, Integer empno,
			Boolean type, String mobile, Date changedate) {
		super(operatorid, organizationNj, name, sex, addr, telephone, office,
				createtime, invalidtime, statusid, maxlogintimes,
				currlogintimes, empno, type, mobile, changedate);
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
