package ppms.domain;

import java.util.Date;

/**
 * TbMonthExam entity. @author MyEclipse Persistence Tools
 */
public class TbMonthExam extends AbstractTbMonthExam implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbMonthExam() {
	}

	/** minimal constructor */
	public TbMonthExam(String examId) {
		super(examId);
	}

	/** full constructor */
	public TbMonthExam(String examId, OrganizationNj organizationNj,
			TbEmployee tbEmployee, Date examDate, Double examScore,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime) {
		super(examId, organizationNj, tbEmployee, examDate, examScore,
				createdBy, createdTime, modifiedBy, modifiedTime);
	}

}
