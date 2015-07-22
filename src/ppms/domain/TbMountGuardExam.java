package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * TbMountGuardExam entity. @author MyEclipse Persistence Tools
 */
public class TbMountGuardExam extends AbstractTbMountGuardExam implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbMountGuardExam() {
	}

	/** minimal constructor */
	public TbMountGuardExam(String examId) {
		super(examId);
	}

	/** full constructor */
	public TbMountGuardExam(String examId, OrganizationNj organizationNj,
			TbEmployee tbEmployee, String examType, Date examDate,
			Double examExpire, Double examScore, BigDecimal holdFailureCount,
			Date lastDeletedTime, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime) {
		super(examId, organizationNj, tbEmployee, examType, examDate,
				examExpire, examScore, holdFailureCount, lastDeletedTime,
				createdBy, createdTime, modifiedBy, modifiedTime);
	}

}
