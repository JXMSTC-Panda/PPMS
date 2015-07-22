package ppms.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractTbSystemfunction entity provides the base persistence definition of
 * the TbSystemfunction entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbSystemfunction implements java.io.Serializable {

	// Fields

	private String functionid;
	private String functionname;
	private Boolean functiontype;
	private String functionurl;
	private String parentfunctionid;
	private Boolean scope;
	private String seq;
	private Date createdtime;
	private Set tbRolefunctions = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractTbSystemfunction() {
	}

	/** minimal constructor */
	public AbstractTbSystemfunction(String functionid) {
		this.functionid = functionid;
	}

	/** full constructor */
	public AbstractTbSystemfunction(String functionid, String functionname,
			Boolean functiontype, String functionurl, String parentfunctionid,
			Boolean scope, String seq, Date createdtime, Set tbRolefunctions) {
		this.functionid = functionid;
		this.functionname = functionname;
		this.functiontype = functiontype;
		this.functionurl = functionurl;
		this.parentfunctionid = parentfunctionid;
		this.scope = scope;
		this.seq = seq;
		this.createdtime = createdtime;
		this.tbRolefunctions = tbRolefunctions;
	}

	// Property accessors

	public String getFunctionid() {
		return this.functionid;
	}

	public void setFunctionid(String functionid) {
		this.functionid = functionid;
	}

	public String getFunctionname() {
		return this.functionname;
	}

	public void setFunctionname(String functionname) {
		this.functionname = functionname;
	}

	public Boolean getFunctiontype() {
		return this.functiontype;
	}

	public void setFunctiontype(Boolean functiontype) {
		this.functiontype = functiontype;
	}

	public String getFunctionurl() {
		return this.functionurl;
	}

	public void setFunctionurl(String functionurl) {
		this.functionurl = functionurl;
	}

	public String getParentfunctionid() {
		return this.parentfunctionid;
	}

	public void setParentfunctionid(String parentfunctionid) {
		this.parentfunctionid = parentfunctionid;
	}

	public Boolean getScope() {
		return this.scope;
	}

	public void setScope(Boolean scope) {
		this.scope = scope;
	}

	public String getSeq() {
		return this.seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public Date getCreatedtime() {
		return this.createdtime;
	}

	public void setCreatedtime(Date createdtime) {
		this.createdtime = createdtime;
	}

	public Set getTbRolefunctions() {
		return this.tbRolefunctions;
	}

	public void setTbRolefunctions(Set tbRolefunctions) {
		this.tbRolefunctions = tbRolefunctions;
	}

}