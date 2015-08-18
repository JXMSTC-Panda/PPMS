package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * OrganizationNj entity. @author MyEclipse Persistence Tools
 */

public class OrganizationNj implements java.io.Serializable {

	// Fields

	private Integer orgid;
	private String org_Name;
	private String areadesc;
	
	public String getAreadesc() {
		return areadesc;
	}

	public void setAreadesc(String areadesc) {
		this.areadesc = areadesc;
	}

	private String address;
	private Date expire_Time;
	private Integer superior_Id;
	private Boolean status;
	private String contact_Name;
	private String contact_Tel;
	private BigDecimal user_County;
	private Byte type;
	private Integer region_Id;
	private String channel_Type;
	private Set tbChangeorghistoriesForOutorgid = new HashSet(0);
	private Set tbChangeorghistoriesForInorgid = new HashSet(0);
	private Set tbBecomeemployeeexams = new HashSet(0);
	private Set tbMonthexams = new HashSet(0);
	private Set tbSubareaorgrelations = new HashSet(0);
	private Set tbStandardchecks = new HashSet(0);
	private Set tbOperationtrainings = new HashSet(0);
	private Set tbAreaorgrelations = new HashSet(0);
	private Set tbOperationchecks = new HashSet(0);
	private Set tbFreshemployeeexams = new HashSet(0);
	private Set tbMonitorchecks = new HashSet(0);
	private Set tbMountguardexams = new HashSet(0);
	private Set tbPerformances = new HashSet(0);
	private Set tbVisitchecks = new HashSet(0);
	private Set tbOrgpraisecriticisms = new HashSet(0);
	private Set tbInnovationsForOrgid = new HashSet(0);
	private Set tbMonthperformanceopens = new HashSet(0);
	private Set COrganizationNjs = new HashSet(0);
	private Set tbEmployees = new HashSet(0);
	private Set CUserInfos = new HashSet(0);
	private Set tbEmployeepraisecriticisms = new HashSet(0);
	private Set tbInnovationsForEmployeeorgid = new HashSet(0);
	private Set tbPromotiontrainings = new HashSet(0);
	private Set operatorNjs = new HashSet(0);

	// Constructors

	/** default constructor */
	public OrganizationNj() {
	}

	/** minimal constructor */
	public OrganizationNj(Integer orgid) {
		this.orgid = orgid;
	}

	/** full constructor */
	public OrganizationNj(Integer orgid, String orgName, String address,
			Date expireTime, Integer superiorId, Boolean status,
			String contactName, String contactTel, BigDecimal userCounty,
			Byte type, Integer regionId, String channelType,
			Set tbChangeorghistoriesForOutorgid,
			Set tbChangeorghistoriesForInorgid, Set tbBecomeemployeeexams,
			Set tbMonthexams, Set tbSubareaorgrelations, Set tbStandardchecks,
			Set tbOperationtrainings, Set tbAreaorgrelations,
			Set tbOperationchecks, Set tbFreshemployeeexams,
			Set tbMonitorchecks, Set tbMountguardexams, Set tbPerformances,
			Set tbVisitchecks, Set tbOrgpraisecriticisms,
			Set tbInnovationsForOrgid, Set tbMonthperformanceopens,
			Set COrganizationNjs, Set tbEmployees, Set CUserInfos,
			Set tbEmployeepraisecriticisms, Set tbInnovationsForEmployeeorgid,
			Set tbPromotiontrainings, Set operatorNjs) {
		this.orgid = orgid;
		this.org_Name = orgName;
		this.address = address;
		this.expire_Time = expireTime;
		this.superior_Id = superiorId;
		this.status = status;
		this.contact_Name = contactName;
		this.contact_Tel = contactTel;
		this.user_County = userCounty;
		this.type = type;
		this.region_Id = regionId;
		this.channel_Type = channelType;
		this.tbChangeorghistoriesForOutorgid = tbChangeorghistoriesForOutorgid;
		this.tbChangeorghistoriesForInorgid = tbChangeorghistoriesForInorgid;
		this.tbBecomeemployeeexams = tbBecomeemployeeexams;
		this.tbMonthexams = tbMonthexams;
		this.tbSubareaorgrelations = tbSubareaorgrelations;
		this.tbStandardchecks = tbStandardchecks;
		this.tbOperationtrainings = tbOperationtrainings;
		this.tbAreaorgrelations = tbAreaorgrelations;
		this.tbOperationchecks = tbOperationchecks;
		this.tbFreshemployeeexams = tbFreshemployeeexams;
		this.tbMonitorchecks = tbMonitorchecks;
		this.tbMountguardexams = tbMountguardexams;
		this.tbPerformances = tbPerformances;
		this.tbVisitchecks = tbVisitchecks;
		this.tbOrgpraisecriticisms = tbOrgpraisecriticisms;
		this.tbInnovationsForOrgid = tbInnovationsForOrgid;
		this.tbMonthperformanceopens = tbMonthperformanceopens;
		this.COrganizationNjs = COrganizationNjs;
		this.tbEmployees = tbEmployees;
		this.CUserInfos = CUserInfos;
		this.tbEmployeepraisecriticisms = tbEmployeepraisecriticisms;
		this.tbInnovationsForEmployeeorgid = tbInnovationsForEmployeeorgid;
		this.tbPromotiontrainings = tbPromotiontrainings;
		this.operatorNjs = operatorNjs;
	}

	public Integer getOrgid() {
		return orgid;
	}

	public void setOrgid(Integer orgid) {
		this.orgid = orgid;
	}

	public String getOrg_Name() {
		return org_Name;
	}

	public void setOrg_Name(String org_Name) {
		this.org_Name = org_Name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getExpire_Time() {
		return expire_Time;
	}

	public void setExpire_Time(Date expire_Time) {
		this.expire_Time = expire_Time;
	}

	public Integer getSuperior_Id() {
		return superior_Id;
	}

	public void setSuperior_Id(Integer superiorId) {
		this.superior_Id = superiorId;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getContact_Name() {
		return contact_Name;
	}

	public void setContact_Name(String contact_Name) {
		this.contact_Name = contact_Name;
	}

	public String getContact_Tel() {
		return contact_Tel;
	}

	public void setContact_Tel(String contact_Tel) {
		this.contact_Tel = contact_Tel;
	}

	public BigDecimal getUser_County() {
		return user_County;
	}

	public void setUser_County(BigDecimal user_County) {
		this.user_County = user_County;
	}

	public Byte getType() {
		return type;
	}

	public void setType(Byte type) {
		this.type = type;
	}

	public Integer getRegion_Id() {
		return region_Id;
	}

	public void setRegion_Id(Integer region_Id) {
		this.region_Id = region_Id;
	}

	public String getChannel_Type() {
		return channel_Type;
	}

	public void setChannel_Type(String channel_Type) {
		this.channel_Type = channel_Type;
	}

	public Set getTbChangeorghistoriesForOutorgid() {
		return tbChangeorghistoriesForOutorgid;
	}

	public void setTbChangeorghistoriesForOutorgid(
			Set tbChangeorghistoriesForOutorgid) {
		this.tbChangeorghistoriesForOutorgid = tbChangeorghistoriesForOutorgid;
	}

	public Set getTbChangeorghistoriesForInorgid() {
		return tbChangeorghistoriesForInorgid;
	}

	public void setTbChangeorghistoriesForInorgid(Set tbChangeorghistoriesForInorgid) {
		this.tbChangeorghistoriesForInorgid = tbChangeorghistoriesForInorgid;
	}

	public Set getTbBecomeemployeeexams() {
		return tbBecomeemployeeexams;
	}

	public void setTbBecomeemployeeexams(Set tbBecomeemployeeexams) {
		this.tbBecomeemployeeexams = tbBecomeemployeeexams;
	}

	public Set getTbMonthexams() {
		return tbMonthexams;
	}

	public void setTbMonthexams(Set tbMonthexams) {
		this.tbMonthexams = tbMonthexams;
	}

	public Set getTbSubareaorgrelations() {
		return tbSubareaorgrelations;
	}

	public void setTbSubareaorgrelations(Set tbSubareaorgrelations) {
		this.tbSubareaorgrelations = tbSubareaorgrelations;
	}

	public Set getTbStandardchecks() {
		return tbStandardchecks;
	}

	public void setTbStandardchecks(Set tbStandardchecks) {
		this.tbStandardchecks = tbStandardchecks;
	}

	public Set getTbOperationtrainings() {
		return tbOperationtrainings;
	}

	public void setTbOperationtrainings(Set tbOperationtrainings) {
		this.tbOperationtrainings = tbOperationtrainings;
	}

	public Set getTbAreaorgrelations() {
		return tbAreaorgrelations;
	}

	public void setTbAreaorgrelations(Set tbAreaorgrelations) {
		this.tbAreaorgrelations = tbAreaorgrelations;
	}

	public Set getTbOperationchecks() {
		return tbOperationchecks;
	}

	public void setTbOperationchecks(Set tbOperationchecks) {
		this.tbOperationchecks = tbOperationchecks;
	}

	public Set getTbFreshemployeeexams() {
		return tbFreshemployeeexams;
	}

	public void setTbFreshemployeeexams(Set tbFreshemployeeexams) {
		this.tbFreshemployeeexams = tbFreshemployeeexams;
	}

	public Set getTbMonitorchecks() {
		return tbMonitorchecks;
	}

	public void setTbMonitorchecks(Set tbMonitorchecks) {
		this.tbMonitorchecks = tbMonitorchecks;
	}

	public Set getTbMountguardexams() {
		return tbMountguardexams;
	}

	public void setTbMountguardexams(Set tbMountguardexams) {
		this.tbMountguardexams = tbMountguardexams;
	}

	public Set getTbPerformances() {
		return tbPerformances;
	}

	public void setTbPerformances(Set tbPerformances) {
		this.tbPerformances = tbPerformances;
	}

	public Set getTbVisitchecks() {
		return tbVisitchecks;
	}

	public void setTbVisitchecks(Set tbVisitchecks) {
		this.tbVisitchecks = tbVisitchecks;
	}

	public Set getTbOrgpraisecriticisms() {
		return tbOrgpraisecriticisms;
	}

	public void setTbOrgpraisecriticisms(Set tbOrgpraisecriticisms) {
		this.tbOrgpraisecriticisms = tbOrgpraisecriticisms;
	}

	public Set getTbInnovationsForOrgid() {
		return tbInnovationsForOrgid;
	}

	public void setTbInnovationsForOrgid(Set tbInnovationsForOrgid) {
		this.tbInnovationsForOrgid = tbInnovationsForOrgid;
	}

	public Set getTbMonthperformanceopens() {
		return tbMonthperformanceopens;
	}

	public void setTbMonthperformanceopens(Set tbMonthperformanceopens) {
		this.tbMonthperformanceopens = tbMonthperformanceopens;
	}

	public Set getCOrganizationNjs() {
		return COrganizationNjs;
	}

	public void setCOrganizationNjs(Set cOrganizationNjs) {
		COrganizationNjs = cOrganizationNjs;
	}

	public Set getTbEmployees() {
		return tbEmployees;
	}

	public void setTbEmployees(Set tbEmployees) {
		this.tbEmployees = tbEmployees;
	}

	public Set getCUserInfos() {
		return CUserInfos;
	}

	public void setCUserInfos(Set cUserInfos) {
		CUserInfos = cUserInfos;
	}

	public Set getTbEmployeepraisecriticisms() {
		return tbEmployeepraisecriticisms;
	}

	public void setTbEmployeepraisecriticisms(Set tbEmployeepraisecriticisms) {
		this.tbEmployeepraisecriticisms = tbEmployeepraisecriticisms;
	}

	public Set getTbInnovationsForEmployeeorgid() {
		return tbInnovationsForEmployeeorgid;
	}

	public void setTbInnovationsForEmployeeorgid(Set tbInnovationsForEmployeeorgid) {
		this.tbInnovationsForEmployeeorgid = tbInnovationsForEmployeeorgid;
	}

	public Set getTbPromotiontrainings() {
		return tbPromotiontrainings;
	}

	public void setTbPromotiontrainings(Set tbPromotiontrainings) {
		this.tbPromotiontrainings = tbPromotiontrainings;
	}

	public Set getOperatorNjs() {
		return operatorNjs;
	}

	public void setOperatorNjs(Set operatorNjs) {
		this.operatorNjs = operatorNjs;
	}


	// Property accessors


}