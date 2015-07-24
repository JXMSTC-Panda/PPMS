package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * TbVisitcheck entity. @author MyEclipse Persistence Tools
 */
public class TbVisitcheck extends AbstractTbVisitcheck implements
=======
 * TbVisitCheck entity. @author MyEclipse Persistence Tools
 */
public class TbVisitCheck extends AbstractTbVisitCheck implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public TbVisitcheck() {
	}

	/** minimal constructor */
	public TbVisitcheck(String visitcheckid) {
		super(visitcheckid);
	}

	/** full constructor */
	public TbVisitcheck(String visitcheckid, OrganizationNj organizationNj,
			Date checkdate, Double firstscore, Double secondscore,
			Double consistencyscore, Double averagescore, String createdby,
			Date createdtime, String modifiedby, Date modifiedtime) {
		super(visitcheckid, organizationNj, checkdate, firstscore, secondscore,
				consistencyscore, averagescore, createdby, createdtime,
				modifiedby, modifiedtime);
=======
	public TbVisitCheck() {
	}

	/** minimal constructor */
	public TbVisitCheck(String visitCheckId) {
		super(visitCheckId);
	}

	/** full constructor */
	public TbVisitCheck(String visitCheckId, OrganizationNj organizationNj,
			Date checkDate, Double firstScore, Double secondScore,
			Double consistencyScore, Double averageScore, String createdBy,
			Date createdTime, String modifiedBy, Date modifiedTime) {
		super(visitCheckId, organizationNj, checkDate, firstScore, secondScore,
				consistencyScore, averageScore, createdBy, createdTime,
				modifiedBy, modifiedTime);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
