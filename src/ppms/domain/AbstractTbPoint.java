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

	// Constructors

	/** default constructor */
	public AbstractTbPoint() {
	}

	/** minimal constructor */
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
	}

	// Property accessors

	public String getPointId() {
		return this.pointId;
	}

	public void setPointId(String pointId) {
		this.pointId = pointId;
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
	}

	public Double getTax() {
		return this.tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

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
	}

}