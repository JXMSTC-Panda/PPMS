package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractOrganizationNj entity provides the base persistence definition of the
 * OrganizationNj entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOrganizationNj implements java.io.Serializable {

	// Fields

	private Integer orgId;
	private String orgName;
	private String address;
	private Date expireTime;
	private Integer superiorId;
	private Boolean status;
	private String contactName;
	private String contactTel;
	private BigDecimal userCounty;
	private Byte type;
	private Integer regionId;
	private String channelType;
	private Set tbMonthPerformanceOpens = new HashSet(0);
	private Set tbBecomeEmployeeExams = new HashSet(0);
	private Set tbSubAreaOrgRelations = new HashSet(0);
	private Set tbStandardChecks = new HashSet(0);
	private Set tbChangeOrgHistoriesForOutOrgId = new HashSet(0);
	private Set tbInnovationsForEmployeeOrgId = new HashSet(0);
	private Set tbOperationChecks = new HashSet(0);
	private Set tbEmployeePraiseCriticisms = new HashSet(0);
	private Set tbOperationTrainings = new HashSet(0);
	private Set tbAreaOrgRelations = new HashSet(0);
	private Set tbMonthExams = new HashSet(0);
	private Set tbFreshEmployeeExams = new HashSet(0);
	private Set tbMonitorChecks = new HashSet(0);
	private Set tbMountGuardExams = new HashSet(0);
	private Set tbPerformances = new HashSet(0);
	private Set tbVisitChecks = new HashSet(0);
	private Set tbOrgPraiseCriticisms = new HashSet(0);
	private Set tbChangeOrgHistoriesForInOrgId = new HashSet(0);
	private Set tbInnovationsForOrgId = new HashSet(0);
	private Set COrganizationNjs = new HashSet(0);
	private Set CUserInfos = new HashSet(0);
	private Set tbEmployees = new HashSet(0);
	private Set tbPromotionTrainings = new HashSet(0);
	private Set operatorNjs = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractOrganizationNj() {
	}

	/** minimal constructor */
	public AbstractOrganizationNj(Integer orgId) {
		this.orgId = orgId;
	}

	/** full constructor */
	public AbstractOrganizationNj(Integer orgId, String orgName,
			String address, Date expireTime, Integer superiorId,
			Boolean status, String contactName, String contactTel,
			BigDecimal userCounty, Byte type, Integer regionId,
			String channelType, Set tbMonthPerformanceOpens,
			Set tbBecomeEmployeeExams, Set tbSubAreaOrgRelations,
			Set tbStandardChecks, Set tbChangeOrgHistoriesForOutOrgId,
			Set tbInnovationsForEmployeeOrgId, Set tbOperationChecks,
			Set tbEmployeePraiseCriticisms, Set tbOperationTrainings,
			Set tbAreaOrgRelations, Set tbMonthExams, Set tbFreshEmployeeExams,
			Set tbMonitorChecks, Set tbMountGuardExams, Set tbPerformances,
			Set tbVisitChecks, Set tbOrgPraiseCriticisms,
			Set tbChangeOrgHistoriesForInOrgId, Set tbInnovationsForOrgId,
			Set COrganizationNjs, Set CUserInfos, Set tbEmployees,
			Set tbPromotionTrainings, Set operatorNjs) {
		this.orgId = orgId;
		this.orgName = orgName;
		this.address = address;
		this.expireTime = expireTime;
		this.superiorId = superiorId;
		this.status = status;
		this.contactName = contactName;
		this.contactTel = contactTel;
		this.userCounty = userCounty;
		this.type = type;
		this.regionId = regionId;
		this.channelType = channelType;
		this.tbMonthPerformanceOpens = tbMonthPerformanceOpens;
		this.tbBecomeEmployeeExams = tbBecomeEmployeeExams;
		this.tbSubAreaOrgRelations = tbSubAreaOrgRelations;
		this.tbStandardChecks = tbStandardChecks;
		this.tbChangeOrgHistoriesForOutOrgId = tbChangeOrgHistoriesForOutOrgId;
		this.tbInnovationsForEmployeeOrgId = tbInnovationsForEmployeeOrgId;
		this.tbOperationChecks = tbOperationChecks;
		this.tbEmployeePraiseCriticisms = tbEmployeePraiseCriticisms;
		this.tbOperationTrainings = tbOperationTrainings;
		this.tbAreaOrgRelations = tbAreaOrgRelations;
		this.tbMonthExams = tbMonthExams;
		this.tbFreshEmployeeExams = tbFreshEmployeeExams;
		this.tbMonitorChecks = tbMonitorChecks;
		this.tbMountGuardExams = tbMountGuardExams;
		this.tbPerformances = tbPerformances;
		this.tbVisitChecks = tbVisitChecks;
		this.tbOrgPraiseCriticisms = tbOrgPraiseCriticisms;
		this.tbChangeOrgHistoriesForInOrgId = tbChangeOrgHistoriesForInOrgId;
		this.tbInnovationsForOrgId = tbInnovationsForOrgId;
		this.COrganizationNjs = COrganizationNjs;
		this.CUserInfos = CUserInfos;
		this.tbEmployees = tbEmployees;
		this.tbPromotionTrainings = tbPromotionTrainings;
		this.operatorNjs = operatorNjs;
	}

	// Property accessors

	public Integer getOrgId() {
		return this.orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public Integer getSuperiorId() {
		return this.superiorId;
	}

	public void setSuperiorId(Integer superiorId) {
		this.superiorId = superiorId;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactTel() {
		return this.contactTel;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	public BigDecimal getUserCounty() {
		return this.userCounty;
	}

	public void setUserCounty(BigDecimal userCounty) {
		this.userCounty = userCounty;
	}

	public Byte getType() {
		return this.type;
	}

	public void setType(Byte type) {
		this.type = type;
	}

	public Integer getRegionId() {
		return this.regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public String getChannelType() {
		return this.channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public Set getTbMonthPerformanceOpens() {
		return this.tbMonthPerformanceOpens;
	}

	public void setTbMonthPerformanceOpens(Set tbMonthPerformanceOpens) {
		this.tbMonthPerformanceOpens = tbMonthPerformanceOpens;
	}

	public Set getTbBecomeEmployeeExams() {
		return this.tbBecomeEmployeeExams;
	}

	public void setTbBecomeEmployeeExams(Set tbBecomeEmployeeExams) {
		this.tbBecomeEmployeeExams = tbBecomeEmployeeExams;
	}

	public Set getTbSubAreaOrgRelations() {
		return this.tbSubAreaOrgRelations;
	}

	public void setTbSubAreaOrgRelations(Set tbSubAreaOrgRelations) {
		this.tbSubAreaOrgRelations = tbSubAreaOrgRelations;
	}

	public Set getTbStandardChecks() {
		return this.tbStandardChecks;
	}

	public void setTbStandardChecks(Set tbStandardChecks) {
		this.tbStandardChecks = tbStandardChecks;
	}

	public Set getTbChangeOrgHistoriesForOutOrgId() {
		return this.tbChangeOrgHistoriesForOutOrgId;
	}

	public void setTbChangeOrgHistoriesForOutOrgId(
			Set tbChangeOrgHistoriesForOutOrgId) {
		this.tbChangeOrgHistoriesForOutOrgId = tbChangeOrgHistoriesForOutOrgId;
	}

	public Set getTbInnovationsForEmployeeOrgId() {
		return this.tbInnovationsForEmployeeOrgId;
	}

	public void setTbInnovationsForEmployeeOrgId(
			Set tbInnovationsForEmployeeOrgId) {
		this.tbInnovationsForEmployeeOrgId = tbInnovationsForEmployeeOrgId;
	}

	public Set getTbOperationChecks() {
		return this.tbOperationChecks;
	}

	public void setTbOperationChecks(Set tbOperationChecks) {
		this.tbOperationChecks = tbOperationChecks;
	}

	public Set getTbEmployeePraiseCriticisms() {
		return this.tbEmployeePraiseCriticisms;
	}

	public void setTbEmployeePraiseCriticisms(Set tbEmployeePraiseCriticisms) {
		this.tbEmployeePraiseCriticisms = tbEmployeePraiseCriticisms;
	}

	public Set getTbOperationTrainings() {
		return this.tbOperationTrainings;
	}

	public void setTbOperationTrainings(Set tbOperationTrainings) {
		this.tbOperationTrainings = tbOperationTrainings;
	}

	public Set getTbAreaOrgRelations() {
		return this.tbAreaOrgRelations;
	}

	public void setTbAreaOrgRelations(Set tbAreaOrgRelations) {
		this.tbAreaOrgRelations = tbAreaOrgRelations;
	}

	public Set getTbMonthExams() {
		return this.tbMonthExams;
	}

	public void setTbMonthExams(Set tbMonthExams) {
		this.tbMonthExams = tbMonthExams;
	}

	public Set getTbFreshEmployeeExams() {
		return this.tbFreshEmployeeExams;
	}

	public void setTbFreshEmployeeExams(Set tbFreshEmployeeExams) {
		this.tbFreshEmployeeExams = tbFreshEmployeeExams;
	}

	public Set getTbMonitorChecks() {
		return this.tbMonitorChecks;
	}

	public void setTbMonitorChecks(Set tbMonitorChecks) {
		this.tbMonitorChecks = tbMonitorChecks;
	}

	public Set getTbMountGuardExams() {
		return this.tbMountGuardExams;
	}

	public void setTbMountGuardExams(Set tbMountGuardExams) {
		this.tbMountGuardExams = tbMountGuardExams;
	}

	public Set getTbPerformances() {
		return this.tbPerformances;
	}

	public void setTbPerformances(Set tbPerformances) {
		this.tbPerformances = tbPerformances;
	}

	public Set getTbVisitChecks() {
		return this.tbVisitChecks;
	}

	public void setTbVisitChecks(Set tbVisitChecks) {
		this.tbVisitChecks = tbVisitChecks;
	}

	public Set getTbOrgPraiseCriticisms() {
		return this.tbOrgPraiseCriticisms;
	}

	public void setTbOrgPraiseCriticisms(Set tbOrgPraiseCriticisms) {
		this.tbOrgPraiseCriticisms = tbOrgPraiseCriticisms;
	}

	public Set getTbChangeOrgHistoriesForInOrgId() {
		return this.tbChangeOrgHistoriesForInOrgId;
	}

	public void setTbChangeOrgHistoriesForInOrgId(
			Set tbChangeOrgHistoriesForInOrgId) {
		this.tbChangeOrgHistoriesForInOrgId = tbChangeOrgHistoriesForInOrgId;
	}

	public Set getTbInnovationsForOrgId() {
		return this.tbInnovationsForOrgId;
	}

	public void setTbInnovationsForOrgId(Set tbInnovationsForOrgId) {
		this.tbInnovationsForOrgId = tbInnovationsForOrgId;
	}

	public Set getCOrganizationNjs() {
		return this.COrganizationNjs;
	}

	public void setCOrganizationNjs(Set COrganizationNjs) {
		this.COrganizationNjs = COrganizationNjs;
	}

	public Set getCUserInfos() {
		return this.CUserInfos;
	}

	public void setCUserInfos(Set CUserInfos) {
		this.CUserInfos = CUserInfos;
	}

	public Set getTbEmployees() {
		return this.tbEmployees;
	}

	public void setTbEmployees(Set tbEmployees) {
		this.tbEmployees = tbEmployees;
	}

	public Set getTbPromotionTrainings() {
		return this.tbPromotionTrainings;
	}

	public void setTbPromotionTrainings(Set tbPromotionTrainings) {
		this.tbPromotionTrainings = tbPromotionTrainings;
	}

	public Set getOperatorNjs() {
		return this.operatorNjs;
	}

	public void setOperatorNjs(Set operatorNjs) {
		this.operatorNjs = operatorNjs;
	}

}