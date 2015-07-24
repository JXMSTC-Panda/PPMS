package ppms.domain;

/**
<<<<<<< HEAD
 * AbstractTbRolefunctionId entity provides the base persistence definition of
 * the TbRolefunctionId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbRolefunctionId implements java.io.Serializable {
=======
 * AbstractTbRoleFunctionId entity provides the base persistence definition of
 * the TbRoleFunctionId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbRoleFunctionId implements java.io.Serializable {
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Fields

	private TbRole tbRole;
<<<<<<< HEAD
	private TbSystemfunction tbSystemfunction;
=======
	private TbSystemFunction tbSystemFunction;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public AbstractTbRolefunctionId() {
	}

	/** full constructor */
	public AbstractTbRolefunctionId(TbRole tbRole,
			TbSystemfunction tbSystemfunction) {
		this.tbRole = tbRole;
		this.tbSystemfunction = tbSystemfunction;
=======
	public AbstractTbRoleFunctionId() {
	}

	/** full constructor */
	public AbstractTbRoleFunctionId(TbRole tbRole,
			TbSystemFunction tbSystemFunction) {
		this.tbRole = tbRole;
		this.tbSystemFunction = tbSystemFunction;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

	public TbRole getTbRole() {
		return this.tbRole;
	}

	public void setTbRole(TbRole tbRole) {
		this.tbRole = tbRole;
	}

<<<<<<< HEAD
	public TbSystemfunction getTbSystemfunction() {
		return this.tbSystemfunction;
	}

	public void setTbSystemfunction(TbSystemfunction tbSystemfunction) {
		this.tbSystemfunction = tbSystemfunction;
=======
	public TbSystemFunction getTbSystemFunction() {
		return this.tbSystemFunction;
	}

	public void setTbSystemFunction(TbSystemFunction tbSystemFunction) {
		this.tbSystemFunction = tbSystemFunction;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
<<<<<<< HEAD
		if (!(other instanceof AbstractTbRolefunctionId))
			return false;
		AbstractTbRolefunctionId castOther = (AbstractTbRolefunctionId) other;
=======
		if (!(other instanceof AbstractTbRoleFunctionId))
			return false;
		AbstractTbRoleFunctionId castOther = (AbstractTbRoleFunctionId) other;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

		return ((this.getTbRole() == castOther.getTbRole()) || (this
				.getTbRole() != null && castOther.getTbRole() != null && this
				.getTbRole().equals(castOther.getTbRole())))
<<<<<<< HEAD
				&& ((this.getTbSystemfunction() == castOther
						.getTbSystemfunction()) || (this.getTbSystemfunction() != null
						&& castOther.getTbSystemfunction() != null && this
						.getTbSystemfunction().equals(
								castOther.getTbSystemfunction())));
=======
				&& ((this.getTbSystemFunction() == castOther
						.getTbSystemFunction()) || (this.getTbSystemFunction() != null
						&& castOther.getTbSystemFunction() != null && this
						.getTbSystemFunction().equals(
								castOther.getTbSystemFunction())));
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTbRole() == null ? 0 : this.getTbRole().hashCode());
		result = 37
				* result
<<<<<<< HEAD
				+ (getTbSystemfunction() == null ? 0 : this
						.getTbSystemfunction().hashCode());
=======
				+ (getTbSystemFunction() == null ? 0 : this
						.getTbSystemFunction().hashCode());
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		return result;
	}

}