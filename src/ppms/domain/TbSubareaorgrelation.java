package ppms.domain;

import java.util.Date;

/**
 * TbSubareaorgrelation entity. @author MyEclipse Persistence Tools
 */

public class TbSubareaorgrelation implements java.io.Serializable {

	// Fields

	private Integer orgareaid;
	private OrganizationNj organizationNj;
	private TbSubarea tbSubarea;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;

	// Constructors

	/** default constructor */
	public TbSubareaorgrelation() {
	}

	/** minimal constructor */
	public TbSubareaorgrelation(Integer orgareaid) {
		this.orgareaid = orgareaid;
	}

	/** full constructor */
	public TbSubareaorgrelation(Integer orgareaid,
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
	}

	// Property accessors

	public Integer getOrgareaid() {
		return this.orgareaid;
	}

	public void setOrgareaid(Integer orgareaid) {
		this.orgareaid = orgareaid;
	}

	public OrganizationNj getOrganizationNj() {
		return this.organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

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
	}

}