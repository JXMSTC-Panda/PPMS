package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * TbOperationtraining entity. @author MyEclipse Persistence Tools
 */
public class TbOperationtraining extends AbstractTbOperationtraining implements
=======
 * TbOperationTraining entity. @author MyEclipse Persistence Tools
 */
public class TbOperationTraining extends AbstractTbOperationTraining implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public TbOperationtraining() {
	}

	/** minimal constructor */
	public TbOperationtraining(String trainingid) {
		super(trainingid);
	}

	/** full constructor */
	public TbOperationtraining(String trainingid,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			Date trainingdate, String traininglevel, String trainingcontent,
			Double trainingscore, String createdby, Date createdtime,
			String modifiedby, Date modifiedtime) {
		super(trainingid, organizationNj, tbEmployee, trainingdate,
				traininglevel, trainingcontent, trainingscore, createdby,
				createdtime, modifiedby, modifiedtime);
=======
	public TbOperationTraining() {
	}

	/** minimal constructor */
	public TbOperationTraining(String trainingId) {
		super(trainingId);
	}

	/** full constructor */
	public TbOperationTraining(String trainingId,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			Date trainingDate, String trainingLevel, String trainingContent,
			Double trainingScore, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime) {
		super(trainingId, organizationNj, tbEmployee, trainingDate,
				trainingLevel, trainingContent, trainingScore, createdBy,
				createdTime, modifiedBy, modifiedTime);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
