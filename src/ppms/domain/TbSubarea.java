package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TbSubarea entity. @author MyEclipse Persistence Tools
 */

public class TbSubarea implements java.io.Serializable {

	// Fields

	private BigDecimal subareaid;
	private String subareadesc;
	private Boolean status;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
	private Set tbSubareaorgrelations = new HashSet(0);
	private Set tbAreas = new HashSet(0);

	// Constructors

	/** default constructor */
	public TbSubarea() {
	}

	/** minimal constructor */
	public TbSubarea(BigDecimal subareaid) {
		this.subareaid = subareaid;
	}

	/** full constructor */
	public TbSubarea(BigDecimal subareaid, String subareadesc, Boolean status,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime, Set tbSubareaorgrelations, Set tbAreas) {
		this.subareaid = subareaid;
		this.subareadesc = subareadesc;
		this.status = status;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
		this.tbSubareaorgrelations = tbSubareaorgrelations;
		this.tbAreas = tbAreas;
	}

	// Property accessors

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
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
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
	}

	public Set getTbSubareaorgrelations() {
		return this.tbSubareaorgrelations;
	}

	public void setTbSubareaorgrelations(Set tbSubareaorgrelations) {
		this.tbSubareaorgrelations = tbSubareaorgrelations;
	}

	public Set getTbAreas() {
		return this.tbAreas;
	}

	public void setTbAreas(Set tbAreas) {
		this.tbAreas = tbAreas;
	}

}