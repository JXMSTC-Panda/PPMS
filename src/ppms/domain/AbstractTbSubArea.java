package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
<<<<<<< HEAD
 * AbstractTbSubarea entity provides the base persistence definition of the
 * TbSubarea entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbSubarea implements java.io.Serializable {

	// Fields

	private BigDecimal subareaid;
	private String subareadesc;
	private Boolean status;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
	private Set tbSubareaorgrelations = new HashSet(0);
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	private Set tbAreas = new HashSet(0);

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public AbstractTbSubarea() {
	}

	/** minimal constructor */
	public AbstractTbSubarea(BigDecimal subareaid) {
		this.subareaid = subareaid;
	}

	/** full constructor */
	public AbstractTbSubarea(BigDecimal subareaid, String subareadesc,
			Boolean status, String createdby, Date createdtime,
			String modifiedby, Date modifiedtime, Set tbSubareaorgrelations,
			Set tbAreas) {
		this.subareaid = subareaid;
		this.subareadesc = subareadesc;
		this.status = status;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
		this.tbSubareaorgrelations = tbSubareaorgrelations;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		this.tbAreas = tbAreas;
	}

	// Property accessors

<<<<<<< HEAD
	public BigDecimal getSubareaid() {
		return this.subareaid;
	}

	public void setSubareaid(BigDecimal subareaid) {
		this.subareaid = subareaid;
	}

	public String getSubareadesc() {
		return this.subareadesc;
	}

	public void setSubareadesc(String subareadesc) {
		this.subareadesc = subareadesc;
=======
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

	public Set getTbSubareaorgrelations() {
		return this.tbSubareaorgrelations;
	}

	public void setTbSubareaorgrelations(Set tbSubareaorgrelations) {
		this.tbSubareaorgrelations = tbSubareaorgrelations;
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

	public Set getTbSubAreaOrgRelations() {
		return this.tbSubAreaOrgRelations;
	}

	public void setTbSubAreaOrgRelations(Set tbSubAreaOrgRelations) {
		this.tbSubAreaOrgRelations = tbSubAreaOrgRelations;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public Set getTbAreas() {
		return this.tbAreas;
	}

	public void setTbAreas(Set tbAreas) {
		this.tbAreas = tbAreas;
	}

}