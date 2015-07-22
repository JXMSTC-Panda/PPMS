package ppms.domain;

import java.util.Date;
import java.util.Set;

/**
 * TbSystemfunction entity. @author MyEclipse Persistence Tools
 */
public class TbSystemfunction extends AbstractTbSystemfunction implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbSystemfunction() {
	}

	/** minimal constructor */
	public TbSystemfunction(String functionid) {
		super(functionid);
	}

	/** full constructor */
	public TbSystemfunction(String functionid, String functionname,
			Boolean functiontype, String functionurl, String parentfunctionid,
			Boolean scope, String seq, Date createdtime, Set tbRolefunctions) {
		super(functionid, functionname, functiontype, functionurl,
				parentfunctionid, scope, seq, createdtime, tbRolefunctions);
	}

}
