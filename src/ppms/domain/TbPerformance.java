package ppms.domain;

import java.util.Date;

/**
 * TbPerformance entity. @author MyEclipse Persistence Tools
 */

public class TbPerformance implements java.io.Serializable {

	// Fields

	private String performanceid;
	private OrganizationNj organizationNj;
	private TbEmployee tbEmployee;
	private Boolean performancetype;
	private Date performancedate;
	private Double performancescore;
	private String remark;
	private String gradestandardorgfilename;
	private String gradestandardfilename;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;

	// Constructors

	/** default constructor */
	public TbPerformance() {
	}

	/** minimal constructor */
	public TbPerformance(String performanceid) {
		this.performanceid = performanceid;
	}

	/** full constructor */
	public TbPerformance(String performanceid, OrganizationNj organizationNj,
			TbEmployee tbEmployee, Boolean performancetype,
			Date performancedate, Double performancescore, String remark,
			String gradestandardorgfilename, String gradestandardfilename,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
		this.performanceid = performanceid;
		this.organizationNj = organizationNj;
		this.tbEmployee = tbEmployee;
		this.performancetype = performancetype;
		this.performancedate = performancedate;
		this.performancescore = performancescore;
		this.remark = remark;
		this.gradestandardorgfilename = gradestandardorgfilename;
		this.gradestandardfilename = gradestandardfilename;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
	}

	// Property accessors

	public String getPerformanceid() {
		return this.performanceid;
	}

	public void setPerformanceid(String performanceid) {
		this.performanceid = performanceid;
	}

	public OrganizationNj getOrganizationNj() {
		return this.organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

	public TbEmployee getTbEmployee() {
		return this.tbEmployee;
	}

	public void setTbEmployee(TbEmployee tbEmployee) {
		this.tbEmployee = tbEmployee;
	}

	public Boolean getPerformancetype() {
		return this.performancetype;
	}

	public void setPerformancetype(Boolean performancetype) {
		this.performancetype = performancetype;
	}

	public Date getPerformancedate() {
		return this.performancedate;
	}

	public void setPerformancedate(Date performancedate) {
		this.performancedate = performancedate;
	}

	public Double getPerformancescore() {
		return this.performancescore;
	}

	public void setPerformancescore(Double performancescore) {
		this.performancescore = performancescore;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getGradestandardorgfilename() {
		return this.gradestandardorgfilename;
	}

	public void setGradestandardorgfilename(String gradestandardorgfilename) {
		this.gradestandardorgfilename = gradestandardorgfilename;
	}

	public String getGradestandardfilename() {
		return this.gradestandardfilename;
	}

	public void setGradestandardfilename(String gradestandardfilename) {
		this.gradestandardfilename = gradestandardfilename;
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