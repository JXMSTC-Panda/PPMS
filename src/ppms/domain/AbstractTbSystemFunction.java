package ppms.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
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

	// Constructors

	/** default constructor */
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
	}

	// Property accessors

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
	}

}