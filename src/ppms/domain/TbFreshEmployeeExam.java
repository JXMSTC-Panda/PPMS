package ppms.domain;

import java.util.Date;

/**
 * TbFreshEmployeeExam entity. @author MyEclipse Persistence Tools
 */
public class TbFreshEmployeeExam extends AbstractTbFreshEmployeeExam implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbFreshEmployeeExam() {
	}

	/** minimal constructor */
	public TbFreshEmployeeExam(String examId) {
		super(examId);
	}

	/** full constructor */
	public TbFreshEmployeeExam(String examId, OrganizationNj organizationNj,
			TbEmployee tbEmployee, Date examDate, String examStage, Byte week,
			Double examScore, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime) {
		super(examId, organizationNj, tbEmployee, examDate, examStage, week,
				examScore, createdBy, createdTime, modifiedBy, modifiedTime);
	}

}
