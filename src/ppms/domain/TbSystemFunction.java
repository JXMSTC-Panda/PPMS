package ppms.domain;

import java.util.Date;
import java.util.Set;

/**
<<<<<<< HEAD
 * TbSystemfunction entity. @author MyEclipse Persistence Tools
 */
public class TbSystemfunction extends AbstractTbSystemfunction implements
=======
 * TbSystemFunction entity. @author MyEclipse Persistence Tools
 */
public class TbSystemFunction extends AbstractTbSystemFunction implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Constructors

	/** default constructor */
<<<<<<< HEAD
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
=======
	public TbSystemFunction() {
	}

	/** minimal constructor */
	public TbSystemFunction(String functionId) {
		super(functionId);
	}

	/** full constructor */
	public TbSystemFunction(String functionId, String functionName,
			Boolean functionType, String functionUrl, String parentFunctionId,
			Boolean scope, String seq, Date createdTime, Set tbRoleFunctions) {
		super(functionId, functionName, functionType, functionUrl,
				parentFunctionId, scope, seq, createdTime, tbRoleFunctions);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
