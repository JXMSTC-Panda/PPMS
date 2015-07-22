package ppms.domain;

/**
 * TbRolefunctionId entity. @author MyEclipse Persistence Tools
 */
public class TbRolefunctionId extends AbstractTbRolefunctionId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbRolefunctionId() {
	}

	/** full constructor */
	public TbRolefunctionId(TbRole tbRole, TbSystemfunction tbSystemfunction) {
		super(tbRole, tbSystemfunction);
	}

}
