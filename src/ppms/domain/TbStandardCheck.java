package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * TbStandardcheck entity. @author MyEclipse Persistence Tools
 */
public class TbStandardcheck extends AbstractTbStandardcheck implements
=======
 * TbStandardCheck entity. @author MyEclipse Persistence Tools
 */
public class TbStandardCheck extends AbstractTbStandardCheck implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public TbStandardcheck() {
	}

	/** minimal constructor */
	public TbStandardcheck(String standardcheckid) {
		super(standardcheckid);
	}

	/** full constructor */
	public TbStandardcheck(String standardcheckid,
			OrganizationNj organizationNj, Date checkdate, Double checkscore,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
		super(standardcheckid, organizationNj, checkdate, checkscore,
				createdby, createdtime, modifiedby, modifiedtime);
=======
	public TbStandardCheck() {
	}

	/** minimal constructor */
	public TbStandardCheck(String standardCheckId) {
		super(standardCheckId);
	}

	/** full constructor */
	public TbStandardCheck(String standardCheckId,
			OrganizationNj organizationNj, Date checkDate, Double checkScore,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime) {
		super(standardCheckId, organizationNj, checkDate, checkScore,
				createdBy, createdTime, modifiedBy, modifiedTime);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
