package ppms.domain;

import ppms.excel.template.BaseExcelObject;

/**
 * TbRolefunctionId entity. @author MyEclipse Persistence Tools
 */

public class TbRolefunctionId extends BaseExcelObject implements java.io.Serializable {

	// Fields

	private String roleid;
	private String functionid;

	// Constructors

	/** default constructor */
	public TbRolefunctionId() {
	}

	/** full constructor */
	public TbRolefunctionId(String roleid, String functionid) {
		this.roleid = roleid;
		this.functionid = functionid;
	}

	// Property accessors

	public String getRoleid() {
		return this.roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getFunctionid() {
		return this.functionid;
	}

	public void setFunctionid(String functionid) {
		this.functionid = functionid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbRolefunctionId))
			return false;
		TbRolefunctionId castOther = (TbRolefunctionId) other;

		return ((this.getRoleid() == castOther.getRoleid()) || (this
				.getRoleid() != null && castOther.getRoleid() != null && this
				.getRoleid().equals(castOther.getRoleid())))
				&& ((this.getFunctionid() == castOther.getFunctionid()) || (this
						.getFunctionid() != null
						&& castOther.getFunctionid() != null && this
						.getFunctionid().equals(castOther.getFunctionid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRoleid() == null ? 0 : this.getRoleid().hashCode());
		result = 37
				* result
				+ (getFunctionid() == null ? 0 : this.getFunctionid()
						.hashCode());
		return result;
	}

}