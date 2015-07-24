package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * AbstractTbSubareaorgrelation entity provides the base persistence definition
 * of the TbSubareaorgrelation entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbSubareaorgrelation implements
=======
 * AbstractTbSubAreaOrgRelation entity provides the base persistence definition
 * of the TbSubAreaOrgRelation entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbSubAreaOrgRelation implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Fields

<<<<<<< HEAD
	private Integer orgareaid;
	private OrganizationNj organizationNj;
	private TbSubarea tbSubarea;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
=======
	private Integer orgAreaId;
	private OrganizationNj organizationNj;
	private TbSubArea tbSubArea;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public AbstractTbSubareaorgrelation() {
	}

	/** minimal constructor */
	public AbstractTbSubareaorgrelation(Integer orgareaid) {
		this.orgareaid = orgareaid;
	}

	/** full constructor */
	public AbstractTbSubareaorgrelation(Integer orgareaid,
			OrganizationNj organizationNj, TbSubarea tbSubarea,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
		this.orgareaid = orgareaid;
		this.organizationNj = organizationNj;
		this.tbSubarea = tbSubarea;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
	public Integer getOrgareaid() {
		return this.orgareaid;
	}

	public void setOrgareaid(Integer orgareaid) {
		this.orgareaid = orgareaid;
=======
	public Integer getOrgAreaId() {
		return this.orgAreaId;
	}

	public void setOrgAreaId(Integer orgAreaId) {
		this.orgAreaId = orgAreaId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public OrganizationNj getOrganizationNj() {
		return this.organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

<<<<<<< HEAD
	public TbSubarea getTbSubarea() {
		return this.tbSubarea;
	}

	public void setTbSubarea(TbSubarea tbSubarea) {
		this.tbSubarea = tbSubarea;
	}

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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}