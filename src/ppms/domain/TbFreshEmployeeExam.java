package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * TbFreshemployeeexam entity. @author MyEclipse Persistence Tools
 */
public class TbFreshemployeeexam extends AbstractTbFreshemployeeexam implements
=======
 * TbFreshEmployeeExam entity. @author MyEclipse Persistence Tools
 */
public class TbFreshEmployeeExam extends AbstractTbFreshEmployeeExam implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public TbFreshemployeeexam() {
	}

	/** minimal constructor */
	public TbFreshemployeeexam(String examid) {
		super(examid);
	}

	/** full constructor */
	public TbFreshemployeeexam(String examid, OrganizationNj organizationNj,
			TbEmployee tbEmployee, Date examdate, String examstage, Byte week,
			Double examscore, String createdby, Date createdtime,
			String modifiedby, Date modifiedtime) {
		super(examid, organizationNj, tbEmployee, examdate, examstage, week,
				examscore, createdby, createdtime, modifiedby, modifiedtime);
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
