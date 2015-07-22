package ppms.domain;

import java.util.Date;
import java.util.Set;

/**
 * TbSystemFunction entity. @author MyEclipse Persistence Tools
 */
public class TbSystemFunction extends AbstractTbSystemFunction implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
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
	}

}
