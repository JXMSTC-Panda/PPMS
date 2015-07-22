package ppms.domain;

/**
 * AbstractTbRoleFunctionId entity provides the base persistence definition of
 * the TbRoleFunctionId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbRoleFunctionId implements java.io.Serializable {

	// Fields

	private TbRole tbRole;
	private TbSystemFunction tbSystemFunction;

	// Constructors

	/** default constructor */
	public AbstractTbRoleFunctionId() {
	}

	/** full constructor */
	public AbstractTbRoleFunctionId(TbRole tbRole,
			TbSystemFunction tbSystemFunction) {
		this.tbRole = tbRole;
		this.tbSystemFunction = tbSystemFunction;
	}

	// Property accessors

	public TbRole getTbRole() {
		return this.tbRole;
	}

	public void setTbRole(TbRole tbRole) {
		this.tbRole = tbRole;
	}

	public TbSystemFunction getTbSystemFunction() {
		return this.tbSystemFunction;
	}

	public void setTbSystemFunction(TbSystemFunction tbSystemFunction) {
		this.tbSystemFunction = tbSystemFunction;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTbRoleFunctionId))
			return false;
		AbstractTbRoleFunctionId castOther = (AbstractTbRoleFunctionId) other;

		return ((this.getTbRole() == castOther.getTbRole()) || (this
				.getTbRole() != null && castOther.getTbRole() != null && this
				.getTbRole().equals(castOther.getTbRole())))
				&& ((this.getTbSystemFunction() == castOther
						.getTbSystemFunction()) || (this.getTbSystemFunction() != null
						&& castOther.getTbSystemFunction() != null && this
						.getTbSystemFunction().equals(
								castOther.getTbSystemFunction())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTbRole() == null ? 0 : this.getTbRole().hashCode());
		result = 37
				* result
				+ (getTbSystemFunction() == null ? 0 : this
						.getTbSystemFunction().hashCode());
		return result;
	}

}