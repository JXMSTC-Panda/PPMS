package ppms.domain;

import java.util.Date;

/**
 * TbBecomeemployeeexam entity. @author MyEclipse Persistence Tools
 */

public class TbBecomeemployeeexam implements java.io.Serializable {

	// Fields

	private String examid;
	private OrganizationNj organizationNj;
	private TbEmployee tbEmployee;
	private Date examdate;
	private Double examscore;
	private Short chineseprintcount;
	private Short numberprintcount;
	private String remark;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;

	// Constructors

	/** default constructor */
	public TbBecomeemployeeexam() {
	}

	/** minimal constructor */
	public TbBecomeemployeeexam(String examid) {
		this.examid = examid;
	}

	/** full constructor */
	public TbBecomeemployeeexam(String examid, OrganizationNj organizationNj,
			TbEmployee tbEmployee, Date examdate, Double examscore,
			Short chineseprintcount, Short numberprintcount, String remark,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
		this.examid = examid;
		this.organizationNj = organizationNj;
		this.tbEmployee = tbEmployee;
		this.examdate = examdate;
		this.examscore = examscore;
		this.chineseprintcount = chineseprintcount;
		this.numberprintcount = numberprintcount;
		this.remark = remark;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
	}

	// Property accessors

	public String getExamid() {
		return this.examid;
	}

	public void setExamid(String examid) {
		this.examid = examid;
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

	public Date getExamdate() {
		return this.examdate;
	}

	public void setExamdate(Date examdate) {
		this.examdate = examdate;
	}

	public Double getExamscore() {
		return this.examscore;
	}

	public void setExamscore(Double examscore) {
		this.examscore = examscore;
	}

	public Short getChineseprintcount() {
		return this.chineseprintcount;
	}

	public void setChineseprintcount(Short chineseprintcount) {
		this.chineseprintcount = chineseprintcount;
	}

	public Short getNumberprintcount() {
		return this.numberprintcount;
	}

	public void setNumberprintcount(Short numberprintcount) {
		this.numberprintcount = numberprintcount;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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