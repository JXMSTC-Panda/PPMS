package ppms.domain;

import java.util.Date;

/**
 * TbFreshemployeeexam entity. @author MyEclipse Persistence Tools
 */
public class TbFreshemployeeexam extends AbstractTbFreshemployeeexam implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
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
	}

}
