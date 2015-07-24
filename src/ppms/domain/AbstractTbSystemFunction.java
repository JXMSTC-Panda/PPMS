package ppms.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
<<<<<<< HEAD
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
=======
 * AbstractTbSystemFunction entity provides the base persistence definition of
 * the TbSystemFunction entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbSystemFunction implements java.io.Serializable {

	// Fields

	private String functionId;
	private String functionName;
	private Boolean functionType;
	private String functionUrl;
	private String parentFunctionId;
	private Boolean scope;
	private String seq;
	private Date createdTime;
	private Set tbRoleFunctions = new HashSet(0);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
<<<<<<< HEAD
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
=======
	public AbstractTbSystemFunction() {
	}

	/** minimal constructor */
	public AbstractTbSystemFunction(String functionId) {
		this.functionId = functionId;
	}

	/** full constructor */
	public AbstractTbSystemFunction(String functionId, String functionName,
			Boolean functionType, String functionUrl, String parentFunctionId,
			Boolean scope, String seq, Date createdTime, Set tbRoleFunctions) {
		this.functionId = functionId;
		this.functionName = functionName;
		this.functionType = functionType;
		this.functionUrl = functionUrl;
		this.parentFunctionId = parentFunctionId;
		this.scope = scope;
		this.seq = seq;
		this.createdTime = createdTime;
		this.tbRoleFunctions = tbRoleFunctions;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
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
=======
	public String getFunctionId() {
		return this.functionId;
	}

	public void setFunctionId(String functionId) {
		this.functionId = functionId;
	}

	public String getFunctionName() {
		return this.functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public Boolean getFunctionType() {
		return this.functionType;
	}

	public void setFunctionType(Boolean functionType) {
		this.functionType = functionType;
	}

	public String getFunctionUrl() {
		return this.functionUrl;
	}

	public void setFunctionUrl(String functionUrl) {
		this.functionUrl = functionUrl;
	}

	public String getParentFunctionId() {
		return this.parentFunctionId;
	}

	public void setParentFunctionId(String parentFunctionId) {
		this.parentFunctionId = parentFunctionId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
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

<<<<<<< HEAD
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
=======
	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Set getTbRoleFunctions() {
		return this.tbRoleFunctions;
	}

	public void setTbRoleFunctions(Set tbRoleFunctions) {
		this.tbRoleFunctions = tbRoleFunctions;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}