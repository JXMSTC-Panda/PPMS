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
<<<<<<< HEAD
	private String org_Name;
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
=======
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
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
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
<<<<<<< HEAD
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
=======
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
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
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

<<<<<<< HEAD
	public Integer getOrgid() {
		return orgid;
=======
	// Property accessors

	public Integer getOrgid() {
		return this.orgid;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setOrgid(Integer orgid) {
		this.orgid = orgid;
	}

<<<<<<< HEAD
	public String getOrg_Name() {
		return org_Name;
	}

	public void setOrg_Name(String org_Name) {
		this.org_Name = org_Name;
	}

	public String getAddress() {
		return address;
=======
	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getAddress() {
		return this.address;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setAddress(String address) {
		this.address = address;
	}

<<<<<<< HEAD
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
=======
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
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

<<<<<<< HEAD
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
=======
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
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setType(Byte type) {
		this.type = type;
	}

<<<<<<< HEAD
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
=======
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

	public Set getTbChangeorghistoriesForOutorgid() {
		return this.tbChangeorghistoriesForOutorgid;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setTbChangeorghistoriesForOutorgid(
			Set tbChangeorghistoriesForOutorgid) {
		this.tbChangeorghistoriesForOutorgid = tbChangeorghistoriesForOutorgid;
	}

	public Set getTbChangeorghistoriesForInorgid() {
<<<<<<< HEAD
		return tbChangeorghistoriesForInorgid;
	}

	public void setTbChangeorghistoriesForInorgid(Set tbChangeorghistoriesForInorgid) {
=======
		return this.tbChangeorghistoriesForInorgid;
	}

	public void setTbChangeorghistoriesForInorgid(
			Set tbChangeorghistoriesForInorgid) {
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
		this.tbChangeorghistoriesForInorgid = tbChangeorghistoriesForInorgid;
	}

	public Set getTbBecomeemployeeexams() {
<<<<<<< HEAD
		return tbBecomeemployeeexams;
=======
		return this.tbBecomeemployeeexams;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setTbBecomeemployeeexams(Set tbBecomeemployeeexams) {
		this.tbBecomeemployeeexams = tbBecomeemployeeexams;
	}

	public Set getTbMonthexams() {
<<<<<<< HEAD
		return tbMonthexams;
=======
		return this.tbMonthexams;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setTbMonthexams(Set tbMonthexams) {
		this.tbMonthexams = tbMonthexams;
	}

	public Set getTbSubareaorgrelations() {
<<<<<<< HEAD
		return tbSubareaorgrelations;
=======
		return this.tbSubareaorgrelations;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setTbSubareaorgrelations(Set tbSubareaorgrelations) {
		this.tbSubareaorgrelations = tbSubareaorgrelations;
	}

	public Set getTbStandardchecks() {
<<<<<<< HEAD
		return tbStandardchecks;
=======
		return this.tbStandardchecks;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setTbStandardchecks(Set tbStandardchecks) {
		this.tbStandardchecks = tbStandardchecks;
	}

	public Set getTbOperationtrainings() {
<<<<<<< HEAD
		return tbOperationtrainings;
=======
		return this.tbOperationtrainings;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setTbOperationtrainings(Set tbOperationtrainings) {
		this.tbOperationtrainings = tbOperationtrainings;
	}

	public Set getTbAreaorgrelations() {
<<<<<<< HEAD
		return tbAreaorgrelations;
=======
		return this.tbAreaorgrelations;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setTbAreaorgrelations(Set tbAreaorgrelations) {
		this.tbAreaorgrelations = tbAreaorgrelations;
	}

	public Set getTbOperationchecks() {
<<<<<<< HEAD
		return tbOperationchecks;
=======
		return this.tbOperationchecks;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setTbOperationchecks(Set tbOperationchecks) {
		this.tbOperationchecks = tbOperationchecks;
	}

	public Set getTbFreshemployeeexams() {
<<<<<<< HEAD
		return tbFreshemployeeexams;
=======
		return this.tbFreshemployeeexams;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setTbFreshemployeeexams(Set tbFreshemployeeexams) {
		this.tbFreshemployeeexams = tbFreshemployeeexams;
	}

	public Set getTbMonitorchecks() {
<<<<<<< HEAD
		return tbMonitorchecks;
=======
		return this.tbMonitorchecks;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setTbMonitorchecks(Set tbMonitorchecks) {
		this.tbMonitorchecks = tbMonitorchecks;
	}

	public Set getTbMountguardexams() {
<<<<<<< HEAD
		return tbMountguardexams;
=======
		return this.tbMountguardexams;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setTbMountguardexams(Set tbMountguardexams) {
		this.tbMountguardexams = tbMountguardexams;
	}

	public Set getTbPerformances() {
<<<<<<< HEAD
		return tbPerformances;
=======
		return this.tbPerformances;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setTbPerformances(Set tbPerformances) {
		this.tbPerformances = tbPerformances;
	}

	public Set getTbVisitchecks() {
<<<<<<< HEAD
		return tbVisitchecks;
=======
		return this.tbVisitchecks;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setTbVisitchecks(Set tbVisitchecks) {
		this.tbVisitchecks = tbVisitchecks;
	}

	public Set getTbOrgpraisecriticisms() {
<<<<<<< HEAD
		return tbOrgpraisecriticisms;
=======
		return this.tbOrgpraisecriticisms;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setTbOrgpraisecriticisms(Set tbOrgpraisecriticisms) {
		this.tbOrgpraisecriticisms = tbOrgpraisecriticisms;
	}

	public Set getTbInnovationsForOrgid() {
<<<<<<< HEAD
		return tbInnovationsForOrgid;
=======
		return this.tbInnovationsForOrgid;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setTbInnovationsForOrgid(Set tbInnovationsForOrgid) {
		this.tbInnovationsForOrgid = tbInnovationsForOrgid;
	}

	public Set getTbMonthperformanceopens() {
<<<<<<< HEAD
		return tbMonthperformanceopens;
=======
		return this.tbMonthperformanceopens;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setTbMonthperformanceopens(Set tbMonthperformanceopens) {
		this.tbMonthperformanceopens = tbMonthperformanceopens;
	}

	public Set getCOrganizationNjs() {
<<<<<<< HEAD
		return COrganizationNjs;
	}

	public void setCOrganizationNjs(Set cOrganizationNjs) {
		COrganizationNjs = cOrganizationNjs;
	}

	public Set getTbEmployees() {
		return tbEmployees;
=======
		return this.COrganizationNjs;
	}

	public void setCOrganizationNjs(Set COrganizationNjs) {
		this.COrganizationNjs = COrganizationNjs;
	}

	public Set getTbEmployees() {
		return this.tbEmployees;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setTbEmployees(Set tbEmployees) {
		this.tbEmployees = tbEmployees;
	}

	public Set getCUserInfos() {
<<<<<<< HEAD
		return CUserInfos;
	}

	public void setCUserInfos(Set cUserInfos) {
		CUserInfos = cUserInfos;
	}

	public Set getTbEmployeepraisecriticisms() {
		return tbEmployeepraisecriticisms;
=======
		return this.CUserInfos;
	}

	public void setCUserInfos(Set CUserInfos) {
		this.CUserInfos = CUserInfos;
	}

	public Set getTbEmployeepraisecriticisms() {
		return this.tbEmployeepraisecriticisms;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setTbEmployeepraisecriticisms(Set tbEmployeepraisecriticisms) {
		this.tbEmployeepraisecriticisms = tbEmployeepraisecriticisms;
	}

	public Set getTbInnovationsForEmployeeorgid() {
<<<<<<< HEAD
		return tbInnovationsForEmployeeorgid;
	}

	public void setTbInnovationsForEmployeeorgid(Set tbInnovationsForEmployeeorgid) {
=======
		return this.tbInnovationsForEmployeeorgid;
	}

	public void setTbInnovationsForEmployeeorgid(
			Set tbInnovationsForEmployeeorgid) {
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
		this.tbInnovationsForEmployeeorgid = tbInnovationsForEmployeeorgid;
	}

	public Set getTbPromotiontrainings() {
<<<<<<< HEAD
		return tbPromotiontrainings;
=======
		return this.tbPromotiontrainings;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setTbPromotiontrainings(Set tbPromotiontrainings) {
		this.tbPromotiontrainings = tbPromotiontrainings;
	}

	public Set getOperatorNjs() {
<<<<<<< HEAD
		return operatorNjs;
=======
		return this.operatorNjs;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setOperatorNjs(Set operatorNjs) {
		this.operatorNjs = operatorNjs;
	}

<<<<<<< HEAD
	// Property accessors


=======
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
}