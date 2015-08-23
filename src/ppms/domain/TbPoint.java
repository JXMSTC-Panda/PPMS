package ppms.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TbPoint entity. @author MyEclipse Persistence Tools
 */

public class TbPoint implements java.io.Serializable {

	// Fields

	private String pointid;
	private TbEmployee tbEmployee;
	private OrganizationNj organizationNj;
	private TbJob tbJob;
	private Date pointmonth;
	private String orgtype;
	private Double employeepoint;
	private Double employeeperformance;
	private Double orgperformance;
	private Double regulatepoint;
	private Integer rankseq;
	private Double encouragementmoney;
	private Double tax;
	private Double netincome;
	private Double orglevel;
	private Double breachdeductpoint;
	private Double lastpoint;
	private Double deducttax;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
	private Set tbPointdetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public TbPoint() {
	}

	/** minimal constructor */
	public TbPoint(String pointid) {
		this.pointid = pointid;
	}

	/** full constructor */
	public TbPoint(String pointid, TbEmployee tbEmployee, TbJob tbJob,
			OrganizationNj organizationNj, Date pointmonth, String orgtype,
			Double employeepoint, Double employeeperformance,
			Double orgperformance, Double regulatepoint, Integer rankseq,
			Double encouragementmoney, Double tax, Double netincome,
			Double orglevel, Double breachdeductpoint, Double lastpoint,
			Double deducttax, String createdby, Date createdtime,
			String modifiedby, Date modifiedtime, Set tbPointdetails) {
		this.pointid = pointid;
		this.tbEmployee = tbEmployee;
		this.tbJob = tbJob;
		this.organizationNj = organizationNj;
		this.pointmonth = pointmonth;
		this.orgtype = orgtype;
		this.employeepoint = employeepoint;
		this.employeeperformance = employeeperformance;
		this.orgperformance = orgperformance;
		this.regulatepoint = regulatepoint;
		this.rankseq = rankseq;
		this.encouragementmoney = encouragementmoney;
		this.tax = tax;
		this.netincome = netincome;
		this.orglevel = orglevel;
		this.breachdeductpoint = breachdeductpoint;
		this.lastpoint = lastpoint;
		this.deducttax = deducttax;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
		this.tbPointdetails = tbPointdetails;
	}

	// Property accessors

	public String getPointid() {
		return this.pointid;
	}

	public void setPointid(String pointid) {
		this.pointid = pointid;
	}

	public TbEmployee getTbEmployee() {
		return this.tbEmployee;
	}

	public void setTbEmployee(TbEmployee tbEmployee) {
		this.tbEmployee = tbEmployee;
	}

	public OrganizationNj getOrganizationNj() {
		return organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

	public TbJob getTbJob() {
		return this.tbJob;
	}

	public void setTbJob(TbJob tbJob) {
		this.tbJob = tbJob;
	}

	public Date getPointmonth() {
		return this.pointmonth;
	}

	public void setPointmonth(Date pointmonth) {
		this.pointmonth = pointmonth;
	}

	public String getOrgtype() {
		return this.orgtype;
	}

	public void setOrgtype(String orgtype) {
		this.orgtype = orgtype;
	}

	public Double getEmployeepoint() {
		return this.employeepoint;
	}

	public void setEmployeepoint(Double employeepoint) {
		this.employeepoint = employeepoint;
	}

	public Double getEmployeeperformance() {
		return this.employeeperformance;
	}

	public void setEmployeeperformance(Double employeeperformance) {
		this.employeeperformance = employeeperformance;
	}

	public Double getOrgperformance() {
		return this.orgperformance;
	}

	public void setOrgperformance(Double orgperformance) {
		this.orgperformance = orgperformance;
	}

	public Double getRegulatepoint() {
		return this.regulatepoint;
	}

	public void setRegulatepoint(Double regulatepoint) {
		this.regulatepoint = regulatepoint;
	}

	public Integer getRankseq() {
		return this.rankseq;
	}

	public void setRankseq(Integer rankseq) {
		this.rankseq = rankseq;
	}

	public Double getEncouragementmoney() {
		return this.encouragementmoney;
	}

	public void setEncouragementmoney(Double encouragementmoney) {
		this.encouragementmoney = encouragementmoney;
	}

	public Double getTax() {
		return this.tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getNetincome() {
		return this.netincome;
	}

	public void setNetincome(Double netincome) {
		this.netincome = netincome;
	}

	public Double getOrglevel() {
		return this.orglevel;
	}

	public void setOrglevel(Double orglevel) {
		this.orglevel = orglevel;
	}

	public Double getBreachdeductpoint() {
		return this.breachdeductpoint;
	}

	public void setBreachdeductpoint(Double breachdeductpoint) {
		this.breachdeductpoint = breachdeductpoint;
	}

	public Double getLastpoint() {
		return this.lastpoint;
	}

	public void setLastpoint(Double lastpoint) {
		this.lastpoint = lastpoint;
	}

	public Double getDeducttax() {
		return this.deducttax;
	}

	public void setDeducttax(Double deducttax) {
		this.deducttax = deducttax;
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

	public Set getTbPointdetails() {
		return this.tbPointdetails;
	}

	public void setTbPointdetails(Set tbPointdetails) {
		this.tbPointdetails = tbPointdetails;
	}

}