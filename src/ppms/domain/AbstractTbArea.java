package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractTbArea entity provides the base persistence definition of the TbArea
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbArea implements java.io.Serializable {

	// Fields

	private BigDecimal areaId;
	private TbSubArea tbSubArea;
	private String areaDesc;
	private Boolean status;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;
	private Set tbAreaOrgRelations = new HashSet(0);
	private Set COrganizationNjs = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractTbArea() {
	}

	/** minimal constructor */
	public AbstractTbArea(BigDecimal areaId) {
		this.areaId = areaId;
	}

	/** full constructor */
	public AbstractTbArea(BigDecimal areaId, TbSubArea tbSubArea,
			String areaDesc, Boolean status, String createdBy,
			Date createdTime, String modifiedBy, Date modifiedTime,
			Set tbAreaOrgRelations, Set COrganizationNjs) {
		this.areaId = areaId;
		this.tbSubArea = tbSubArea;
		this.areaDesc = areaDesc;
		this.status = status;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
		this.tbAreaOrgRelations = tbAreaOrgRelations;
		this.COrganizationNjs = COrganizationNjs;
	}

	// Property accessors

	public BigDecimal getAreaId() {
		return this.areaId;
	}

	public void setAreaId(BigDecimal areaId) {
		this.areaId = areaId;
	}

	public TbSubArea getTbSubArea() {
		return this.tbSubArea;
	}

	public void setTbSubArea(TbSubArea tbSubArea) {
		this.tbSubArea = tbSubArea;
	}

	public String getAreaDesc() {
		return this.areaDesc;
	}

	public void setAreaDesc(String areaDesc) {
		this.areaDesc = areaDesc;
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

	public Set getTbAreaOrgRelations() {
		return this.tbAreaOrgRelations;
	}

	public void setTbAreaOrgRelations(Set tbAreaOrgRelations) {
		this.tbAreaOrgRelations = tbAreaOrgRelations;
	}

	public Set getCOrganizationNjs() {
		return this.COrganizationNjs;
	}

	public void setCOrganizationNjs(Set COrganizationNjs) {
		this.COrganizationNjs = COrganizationNjs;
	}

}