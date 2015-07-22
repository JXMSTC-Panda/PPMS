package ppms.domain;

import java.util.Date;

/**
 * AbstractTbSubAreaOrgRelation entity provides the base persistence definition
 * of the TbSubAreaOrgRelation entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbSubAreaOrgRelation implements
		java.io.Serializable {

	// Fields

	private Integer orgAreaId;
	private OrganizationNj organizationNj;
	private TbSubArea tbSubArea;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;

	// Constructors

	/** default constructor */
	public AbstractTbSubAreaOrgRelation() {
	}

	/** minimal constructor */
	public AbstractTbSubAreaOrgRelation(Integer orgAreaId) {
		this.orgAreaId = orgAreaId;
	}

	/** full constructor */
	public AbstractTbSubAreaOrgRelation(Integer orgAreaId,
			OrganizationNj organizationNj, TbSubArea tbSubArea,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime) {
		this.orgAreaId = orgAreaId;
		this.organizationNj = organizationNj;
		this.tbSubArea = tbSubArea;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
	}

	// Property accessors

	public Integer getOrgAreaId() {
		return this.orgAreaId;
	}

	public void setOrgAreaId(Integer orgAreaId) {
		this.orgAreaId = orgAreaId;
	}

	public OrganizationNj getOrganizationNj() {
		return this.organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

	public TbSubArea getTbSubArea() {
		return this.tbSubArea;
	}

	public void setTbSubArea(TbSubArea tbSubArea) {
		this.tbSubArea = tbSubArea;
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