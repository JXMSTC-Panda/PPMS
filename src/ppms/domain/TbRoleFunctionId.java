package ppms.domain;

/**
 * TbRoleFunctionId entity. @author MyEclipse Persistence Tools
 */
public class TbRoleFunctionId extends AbstractTbRoleFunctionId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbRoleFunctionId() {
	}

	/** full constructor */
	public TbRoleFunctionId(TbRole tbRole, TbSystemFunction tbSystemFunction) {
		super(tbRole, tbSystemFunction);
	}

}
