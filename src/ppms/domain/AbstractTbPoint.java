package ppms.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractTbPoint entity provides the base persistence definition of the
 * TbPoint entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbPoint implements java.io.Serializable {

	// Fields

<<<<<<< HEAD
	private String pointid;
	private TbEmployee tbEmployee;
	private TbJob tbJob;
	private Integer orgid;
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
=======
	private String pointId;
	private TbEmployee tbEmployee;
	private TbJob tbJob;
	private Integer orgId;
	private Date pointMonth;
	private String orgType;
	private Double employeePoint;
	private Double employeePerformance;
	private Double orgPerformance;
	private Double regulatePoint;
	private Integer rankSeq;
	private Double encouragementMoney;
	private Double tax;
	private Double netIncome;
	private Double orgLevel;
	private Double breachDeductPoint;
	private Double lastPoint;
	private Double deductTax;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;
	private Set tbPointDetails = new HashSet(0);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
	public AbstractTbPoint() {
	}

	/** minimal constructor */
<<<<<<< HEAD
	public AbstractTbPoint(String pointid) {
		this.pointid = pointid;
	}

	/** full constructor */
	public AbstractTbPoint(String pointid, TbEmployee tbEmployee, TbJob tbJob,
			Integer orgid, Date pointmonth, String orgtype,
			Double employeepoint, Double employeeperformance,
			Double orgperformance, Double regulatepoint, Integer rankseq,
			Double encouragementmoney, Double tax, Double netincome,
			Double orglevel, Double breachdeductpoint, Double lastpoint,
			Double deducttax, String createdby, Date createdtime,
			String modifiedby, Date modifiedtime, Set tbPointdetails) {
		this.pointid = pointid;
		this.tbEmployee = tbEmployee;
		this.tbJob = tbJob;
		this.orgid = orgid;
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
=======
	public AbstractTbPoint(String pointId) {
		this.pointId = pointId;
	}

	/** full constructor */
	public AbstractTbPoint(String pointId, TbEmployee tbEmployee, TbJob tbJob,
			Integer orgId, Date pointMonth, String orgType,
			Double employeePoint, Double employeePerformance,
			Double orgPerformance, Double regulatePoint, Integer rankSeq,
			Double encouragementMoney, Double tax, Double netIncome,
			Double orgLevel, Double breachDeductPoint, Double lastPoint,
			Double deductTax, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime, Set tbPointDetails) {
		this.pointId = pointId;
		this.tbEmployee = tbEmployee;
		this.tbJob = tbJob;
		this.orgId = orgId;
		this.pointMonth = pointMonth;
		this.orgType = orgType;
		this.employeePoint = employeePoint;
		this.employeePerformance = employeePerformance;
		this.orgPerformance = orgPerformance;
		this.regulatePoint = regulatePoint;
		this.rankSeq = rankSeq;
		this.encouragementMoney = encouragementMoney;
		this.tax = tax;
		this.netIncome = netIncome;
		this.orgLevel = orgLevel;
		this.breachDeductPoint = breachDeductPoint;
		this.lastPoint = lastPoint;
		this.deductTax = deductTax;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
		this.tbPointDetails = tbPointDetails;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
	public String getPointid() {
		return this.pointid;
	}

	public void setPointid(String pointid) {
		this.pointid = pointid;
=======
	public String getPointId() {
		return this.pointId;
	}

	public void setPointId(String pointId) {
		this.pointId = pointId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public TbEmployee getTbEmployee() {
		return this.tbEmployee;
	}

	public void setTbEmployee(TbEmployee tbEmployee) {
		this.tbEmployee = tbEmployee;
	}

	public TbJob getTbJob() {
		return this.tbJob;
	}

	public void setTbJob(TbJob tbJob) {
		this.tbJob = tbJob;
	}

<<<<<<< HEAD
	public Integer getOrgid() {
		return this.orgid;
	}

	public void setOrgid(Integer orgid) {
		this.orgid = orgid;
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
=======
	public Integer getOrgId() {
		return this.orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public Date getPointMonth() {
		return this.pointMonth;
	}

	public void setPointMonth(Date pointMonth) {
		this.pointMonth = pointMonth;
	}

	public String getOrgType() {
		return this.orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	public Double getEmployeePoint() {
		return this.employeePoint;
	}

	public void setEmployeePoint(Double employeePoint) {
		this.employeePoint = employeePoint;
	}

	public Double getEmployeePerformance() {
		return this.employeePerformance;
	}

	public void setEmployeePerformance(Double employeePerformance) {
		this.employeePerformance = employeePerformance;
	}

	public Double getOrgPerformance() {
		return this.orgPerformance;
	}

	public void setOrgPerformance(Double orgPerformance) {
		this.orgPerformance = orgPerformance;
	}

	public Double getRegulatePoint() {
		return this.regulatePoint;
	}

	public void setRegulatePoint(Double regulatePoint) {
		this.regulatePoint = regulatePoint;
	}

	public Integer getRankSeq() {
		return this.rankSeq;
	}

	public void setRankSeq(Integer rankSeq) {
		this.rankSeq = rankSeq;
	}

	public Double getEncouragementMoney() {
		return this.encouragementMoney;
	}

	public void setEncouragementMoney(Double encouragementMoney) {
		this.encouragementMoney = encouragementMoney;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public Double getTax() {
		return this.tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

<<<<<<< HEAD
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
=======
	public Double getNetIncome() {
		return this.netIncome;
	}

	public void setNetIncome(Double netIncome) {
		this.netIncome = netIncome;
	}

	public Double getOrgLevel() {
		return this.orgLevel;
	}

	public void setOrgLevel(Double orgLevel) {
		this.orgLevel = orgLevel;
	}

	public Double getBreachDeductPoint() {
		return this.breachDeductPoint;
	}

	public void setBreachDeductPoint(Double breachDeductPoint) {
		this.breachDeductPoint = breachDeductPoint;
	}

	public Double getLastPoint() {
		return this.lastPoint;
	}

	public void setLastPoint(Double lastPoint) {
		this.lastPoint = lastPoint;
	}

	public Double getDeductTax() {
		return this.deductTax;
	}

	public void setDeductTax(Double deductTax) {
		this.deductTax = deductTax;
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
	}

	public Set getTbPointDetails() {
		return this.tbPointDetails;
	}

	public void setTbPointDetails(Set tbPointDetails) {
		this.tbPointDetails = tbPointDetails;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}