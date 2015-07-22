package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractTbSubArea entity provides the base persistence definition of the
 * TbSubArea entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbSubArea implements java.io.Serializable {

	// Fields

	private BigDecimal subAreaId;
	private String subAreaDesc;
	private Boolean status;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;
	private Set tbSubAreaOrgRelations = new HashSet(0);
	private Set tbAreas = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractTbSubArea() {
	}

	/** minimal constructor */
	public AbstractTbSubArea(BigDecimal subAreaId) {
		this.subAreaId = subAreaId;
	}

	/** full constructor */
	public AbstractTbSubArea(BigDecimal subAreaId, String subAreaDesc,
			Boolean status, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime, Set tbSubAreaOrgRelations,
			Set tbAreas) {
		this.subAreaId = subAreaId;
		this.subAreaDesc = subAreaDesc;
		this.status = status;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
		this.tbSubAreaOrgRelations = tbSubAreaOrgRelations;
		this.tbAreas = tbAreas;
	}

	// Property accessors

	public BigDecimal getSubAreaId() {
		return this.subAreaId;
	}

	public void setSubAreaId(BigDecimal subAreaId) {
		this.subAreaId = subAreaId;
	}

	public String getSubAreaDesc() {
		return this.subAreaDesc;
	}

	public void setSubAreaDesc(String subAreaDesc) {
		this.subAreaDesc = subAreaDesc;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public Set getTbSubAreaOrgRelations() {
		return this.tbSubAreaOrgRelations;
	}

	public void setTbSubAreaOrgRelations(Set tbSubAreaOrgRelations) {
		this.tbSubAreaOrgRelations = tbSubAreaOrgRelations;
	}

	public Set getTbAreas() {
		return this.tbAreas;
	}

	public void setTbAreas(Set tbAreas) {
		this.tbAreas = tbAreas;
	}

}