package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
<<<<<<< HEAD
 * TbMountguardexam entity. @author MyEclipse Persistence Tools
 */
public class TbMountguardexam extends AbstractTbMountguardexam implements
=======
 * TbMountGuardExam entity. @author MyEclipse Persistence Tools
 */
public class TbMountGuardExam extends AbstractTbMountGuardExam implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public TbMountguardexam() {
	}

	/** minimal constructor */
	public TbMountguardexam(String examid) {
		super(examid);
	}

	/** full constructor */
	public TbMountguardexam(String examid, OrganizationNj organizationNj,
			TbEmployee tbEmployee, String examtype, Date examdate,
			Double examexpire, Double examscore, BigDecimal holdfailurecount,
			Date lastdeletedtime, String createdby, Date createdtime,
			String modifiedby, Date modifiedtime) {
		super(examid, organizationNj, tbEmployee, examtype, examdate,
				examexpire, examscore, holdfailurecount, lastdeletedtime,
				createdby, createdtime, modifiedby, modifiedtime);
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
