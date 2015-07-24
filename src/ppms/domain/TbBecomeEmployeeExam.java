package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * TbBecomeemployeeexam entity. @author MyEclipse Persistence Tools
 */
public class TbBecomeemployeeexam extends AbstractTbBecomeemployeeexam
=======
 * TbBecomeEmployeeExam entity. @author MyEclipse Persistence Tools
 */
public class TbBecomeEmployeeExam extends AbstractTbBecomeEmployeeExam
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public TbBecomeemployeeexam() {
	}

	/** minimal constructor */
	public TbBecomeemployeeexam(String examid) {
		super(examid);
	}

	/** full constructor */
	public TbBecomeemployeeexam(String examid, OrganizationNj organizationNj,
			TbEmployee tbEmployee, Date examdate, Double examscore,
			Short chineseprintcount, Short numberprintcount, String remark,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
		super(examid, organizationNj, tbEmployee, examdate, examscore,
				chineseprintcount, numberprintcount, remark, createdby,
				createdtime, modifiedby, modifiedtime);
=======
	public TbBecomeEmployeeExam() {
	}

	/** minimal constructor */
	public TbBecomeEmployeeExam(String examId) {
		super(examId);
	}

	/** full constructor */
	public TbBecomeEmployeeExam(String examId, OrganizationNj organizationNj,
			TbEmployee tbEmployee, Date examDate, Double examScore,
			Short chinesePrintCount, Short numberPrintCount, String remark,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime) {
		super(examId, organizationNj, tbEmployee, examDate, examScore,
				chinesePrintCount, numberPrintCount, remark, createdBy,
				createdTime, modifiedBy, modifiedTime);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
