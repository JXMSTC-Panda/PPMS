package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * TbMountguardexam entity. @author MyEclipse Persistence Tools
 */
public class TbMountguardexam extends AbstractTbMountguardexam implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
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
	}

}
