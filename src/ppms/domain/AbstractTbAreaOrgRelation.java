package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * AbstractTbAreaorgrelation entity provides the base persistence definition of
 * the TbAreaorgrelation entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbAreaorgrelation implements java.io.Serializable {

	// Fields

	private Integer areaorgid;
	private OrganizationNj organizationNj;
	private TbArea tbArea;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public AbstractTbAreaorgrelation() {
	}

	/** minimal constructor */
	public AbstractTbAreaorgrelation(Integer areaorgid) {
		this.areaorgid = areaorgid;
	}

	/** full constructor */
	public AbstractTbAreaorgrelation(Integer areaorgid,
			OrganizationNj organizationNj, TbArea tbArea, String createdby,
			Date createdtime, String modifiedby, Date modifiedtime) {
		this.areaorgid = areaorgid;
		this.organizationNj = organizationNj;
		this.tbArea = tbArea;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
	public Integer getAreaorgid() {
		return this.areaorgid;
	}

	public void setAreaorgid(Integer areaorgid) {
		this.areaorgid = areaorgid;
=======
	public Integer getAreaOrgId() {
		return this.areaOrgId;
	}

	public void setAreaOrgId(Integer areaOrgId) {
		this.areaOrgId = areaOrgId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
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

<<<<<<< HEAD
	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getCreatedtime() {
		return this.createdtime;
	}

	public void setCreatedtime(Date createdtime) {
		this.createdtime = createdtime;
	}

	public String getModifiedby() {
		return this.modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}

	public Date getModifiedtime() {
		return this.modifiedtime;
	}

	public void setModifiedtime(Date modifiedtime) {
		this.modifiedtime = modifiedtime;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}