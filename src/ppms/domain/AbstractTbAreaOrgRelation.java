package ppms.domain;

import java.util.Date;

/**
 * AbstractTbAreaOrgRelation entity provides the base persistence definition of
 * the TbAreaOrgRelation entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbAreaOrgRelation implements java.io.Serializable {

	// Fields

	private Integer areaOrgId;
	private OrganizationNj organizationNj;
	private TbArea tbArea;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;

	// Constructors

	/** default constructor */
	public AbstractTbAreaOrgRelation() {
	}

	/** minimal constructor */
	public AbstractTbAreaOrgRelation(Integer areaOrgId) {
		this.areaOrgId = areaOrgId;
	}

	/** full constructor */
	public AbstractTbAreaOrgRelation(Integer areaOrgId,
			OrganizationNj organizationNj, TbArea tbArea, String createdBy,
			Date createdTime, String modifiedBy, Date modifiedTime) {
		this.areaOrgId = areaOrgId;
		this.organizationNj = organizationNj;
		this.tbArea = tbArea;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
	}

	// Property accessors

	public Integer getAreaOrgId() {
		return this.areaOrgId;
	}

	public void setAreaOrgId(Integer areaOrgId) {
		this.areaOrgId = areaOrgId;
	}

	public OrganizationNj getOrganizationNj() {
		return this.organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

	public TbArea getTbArea() {
		return this.tbArea;
	}

	public void setTbArea(TbArea tbArea) {
		this.tbArea = tbArea;
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

}