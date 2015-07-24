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

<<<<<<< HEAD
	private BigDecimal areaid;
	private TbSubarea tbSubarea;
	private String areadesc;
	private Boolean status;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
	private Set tbAreaorgrelations = new HashSet(0);
=======
	private BigDecimal areaId;
	private TbSubArea tbSubArea;
	private String areaDesc;
	private Boolean status;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;
	private Set tbAreaOrgRelations = new HashSet(0);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	private Set COrganizationNjs = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractTbArea() {
	}

	/** minimal constructor */
<<<<<<< HEAD
	public AbstractTbArea(BigDecimal areaid) {
		this.areaid = areaid;
	}

	/** full constructor */
	public AbstractTbArea(BigDecimal areaid, TbSubarea tbSubarea,
			String areadesc, Boolean status, String createdby,
			Date createdtime, String modifiedby, Date modifiedtime,
			Set tbAreaorgrelations, Set COrganizationNjs) {
		this.areaid = areaid;
		this.tbSubarea = tbSubarea;
		this.areadesc = areadesc;
		this.status = status;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
		this.tbAreaorgrelations = tbAreaorgrelations;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		this.COrganizationNjs = COrganizationNjs;
	}

	// Property accessors

<<<<<<< HEAD
	public BigDecimal getAreaid() {
		return this.areaid;
	}

	public void setAreaid(BigDecimal areaid) {
		this.areaid = areaid;
	}

	public TbSubarea getTbSubarea() {
		return this.tbSubarea;
	}

	public void setTbSubarea(TbSubarea tbSubarea) {
		this.tbSubarea = tbSubarea;
	}

	public String getAreadesc() {
		return this.areadesc;
	}

	public void setAreadesc(String areadesc) {
		this.areadesc = areadesc;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
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
	}

	public Set getTbAreaorgrelations() {
		return this.tbAreaorgrelations;
	}

	public void setTbAreaorgrelations(Set tbAreaorgrelations) {
		this.tbAreaorgrelations = tbAreaorgrelations;
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
	}

	public Set getTbAreaOrgRelations() {
		return this.tbAreaOrgRelations;
	}

	public void setTbAreaOrgRelations(Set tbAreaOrgRelations) {
		this.tbAreaOrgRelations = tbAreaOrgRelations;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public Set getCOrganizationNjs() {
		return this.COrganizationNjs;
	}

	public void setCOrganizationNjs(Set COrganizationNjs) {
		this.COrganizationNjs = COrganizationNjs;
	}

}