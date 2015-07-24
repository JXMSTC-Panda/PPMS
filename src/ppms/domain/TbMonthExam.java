package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * TbMonthexam entity. @author MyEclipse Persistence Tools
 */
public class TbMonthexam extends AbstractTbMonthexam implements
=======
 * TbMonthExam entity. @author MyEclipse Persistence Tools
 */
public class TbMonthExam extends AbstractTbMonthExam implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public TbMonthexam() {
	}

	/** minimal constructor */
	public TbMonthexam(String examid) {
		super(examid);
	}

	/** full constructor */
	public TbMonthexam(String examid, OrganizationNj organizationNj,
			TbEmployee tbEmployee, Date examdate, Double examscore,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
		super(examid, organizationNj, tbEmployee, examdate, examscore,
				createdby, createdtime, modifiedby, modifiedtime);
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
