package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * TbMountguardexam entity. @author MyEclipse Persistence Tools
 */

public class TbMountguardexam implements java.io.Serializable {

	// Fields

	private String examid;
	private OrganizationNj organizationNj;
	private TbEmployee tbEmployee;
	private String examtype;
	private Date examdate;
	private Double examexpire;
	private Double examscore;
	private BigDecimal holdfailurecount;
	private Date lastdeletedtime;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;

	// Constructors

	/** default constructor */
	public TbMountguardexam() {
	}

	/** minimal constructor */
	public TbMountguardexam(String examid) {
		this.examid = examid;
	}

	/** full constructor */
	public TbMountguardexam(String examid, OrganizationNj organizationNj,
			TbEmployee tbEmployee, String examtype, Date examdate,
			Double examexpire, Double examscore, BigDecimal holdfailurecount,
			Date lastdeletedtime, String createdby, Date createdtime,
			String modifiedby, Date modifiedtime) {
		this.examid = examid;
		this.organizationNj = organizationNj;
		this.tbEmployee = tbEmployee;
		this.examtype = examtype;
		this.examdate = examdate;
		this.examexpire = examexpire;
		this.examscore = examscore;
		this.holdfailurecount = holdfailurecount;
		this.lastdeletedtime = lastdeletedtime;
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

	public String getExamtype() {
		return this.examtype;
	}

	public void setExamtype(String examtype) {
		this.examtype = examtype;
	}

	public Date getExamdate() {
		return this.examdate;
	}

	public void setExamdate(Date examdate) {
		this.examdate = examdate;
	}

	public Double getExamexpire() {
		return this.examexpire;
	}

	public void setExamexpire(Double examexpire) {
		this.examexpire = examexpire;
	}

	public Double getExamscore() {
		return this.examscore;
	}

	public void setExamscore(Double examscore) {
		this.examscore = examscore;
	}

	public BigDecimal getHoldfailurecount() {
		return this.holdfailurecount;
	}

	public void setHoldfailurecount(BigDecimal holdfailurecount) {
		this.holdfailurecount = holdfailurecount;
	}

	public Date getLastdeletedtime() {
		return this.lastdeletedtime;
	}

	public void setLastdeletedtime(Date lastdeletedtime) {
		this.lastdeletedtime = lastdeletedtime;
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