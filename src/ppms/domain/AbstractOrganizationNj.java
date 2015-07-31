package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * AbstractOrganizationNj entity provides the base persistence definition of the OrganizationNj entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOrganizationNj  implements java.io.Serializable {


    // Fields    

     private Integer orgid;
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
    public AbstractOrganizationNj() {
    }

	/** minimal constructor */
    public AbstractOrganizationNj(Integer orgid) {
        this.orgid = orgid;
    }
    
    /** full constructor */
    public AbstractOrganizationNj(Integer orgid, String orgName, String address, Date expireTime, Integer superiorId, Boolean status, String contactName, String contactTel, BigDecimal userCounty, Byte type, Integer regionId, String channelType, Set tbChangeorghistoriesForOutorgid, Set tbChangeorghistoriesForInorgid, Set tbBecomeemployeeexams, Set tbMonthexams, Set tbSubareaorgrelations, Set tbStandardchecks, Set tbOperationtrainings, Set tbAreaorgrelations, Set tbOperationchecks, Set tbFreshemployeeexams, Set tbMonitorchecks, Set tbMountguardexams, Set tbPerformances, Set tbVisitchecks, Set tbOrgpraisecriticisms, Set tbInnovationsForOrgid, Set tbMonthperformanceopens, Set COrganizationNjs, Set tbEmployees, Set CUserInfos, Set tbEmployeepraisecriticisms, Set tbInnovationsForEmployeeorgid, Set tbPromotiontrainings, Set operatorNjs) {
        this.orgid = orgid;
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

   
    // Property accessors

    public Integer getOrgid() {
        return this.orgid;
    }
    
    public void setOrgid(Integer orgid) {
        this.orgid = orgid;
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

    public Set getTbChangeorghistoriesForOutorgid() {
        return this.tbChangeorghistoriesForOutorgid;
    }
    
    public void setTbChangeorghistoriesForOutorgid(Set tbChangeorghistoriesForOutorgid) {
        this.tbChangeorghistoriesForOutorgid = tbChangeorghistoriesForOutorgid;
    }

    public Set getTbChangeorghistoriesForInorgid() {
        return this.tbChangeorghistoriesForInorgid;
    }
    
    public void setTbChangeorghistoriesForInorgid(Set tbChangeorghistoriesForInorgid) {
        this.tbChangeorghistoriesForInorgid = tbChangeorghistoriesForInorgid;
    }

    public Set getTbBecomeemployeeexams() {
        return this.tbBecomeemployeeexams;
    }
    
    public void setTbBecomeemployeeexams(Set tbBecomeemployeeexams) {
        this.tbBecomeemployeeexams = tbBecomeemployeeexams;
    }

    public Set getTbMonthexams() {
        return this.tbMonthexams;
    }
    
    public void setTbMonthexams(Set tbMonthexams) {
        this.tbMonthexams = tbMonthexams;
    }

    public Set getTbSubareaorgrelations() {
        return this.tbSubareaorgrelations;
    }
    
    public void setTbSubareaorgrelations(Set tbSubareaorgrelations) {
        this.tbSubareaorgrelations = tbSubareaorgrelations;
    }

    public Set getTbStandardchecks() {
        return this.tbStandardchecks;
    }
    
    public void setTbStandardchecks(Set tbStandardchecks) {
        this.tbStandardchecks = tbStandardchecks;
    }

    public Set getTbOperationtrainings() {
        return this.tbOperationtrainings;
    }
    
    public void setTbOperationtrainings(Set tbOperationtrainings) {
        this.tbOperationtrainings = tbOperationtrainings;
    }

    public Set getTbAreaorgrelations() {
        return this.tbAreaorgrelations;
    }
    
    public void setTbAreaorgrelations(Set tbAreaorgrelations) {
        this.tbAreaorgrelations = tbAreaorgrelations;
    }

    public Set getTbOperationchecks() {
        return this.tbOperationchecks;
    }
    
    public void setTbOperationchecks(Set tbOperationchecks) {
        this.tbOperationchecks = tbOperationchecks;
    }

    public Set getTbFreshemployeeexams() {
        return this.tbFreshemployeeexams;
    }
    
    public void setTbFreshemployeeexams(Set tbFreshemployeeexams) {
        this.tbFreshemployeeexams = tbFreshemployeeexams;
    }

    public Set getTbMonitorchecks() {
        return this.tbMonitorchecks;
    }
    
    public void setTbMonitorchecks(Set tbMonitorchecks) {
        this.tbMonitorchecks = tbMonitorchecks;
    }

    public Set getTbMountguardexams() {
        return this.tbMountguardexams;
    }
    
    public void setTbMountguardexams(Set tbMountguardexams) {
        this.tbMountguardexams = tbMountguardexams;
    }

    public Set getTbPerformances() {
        return this.tbPerformances;
    }
    
    public void setTbPerformances(Set tbPerformances) {
        this.tbPerformances = tbPerformances;
    }

    public Set getTbVisitchecks() {
        return this.tbVisitchecks;
    }
    
    public void setTbVisitchecks(Set tbVisitchecks) {
        this.tbVisitchecks = tbVisitchecks;
    }

    public Set getTbOrgpraisecriticisms() {
        return this.tbOrgpraisecriticisms;
    }
    
    public void setTbOrgpraisecriticisms(Set tbOrgpraisecriticisms) {
        this.tbOrgpraisecriticisms = tbOrgpraisecriticisms;
    }

    public Set getTbInnovationsForOrgid() {
        return this.tbInnovationsForOrgid;
    }
    
    public void setTbInnovationsForOrgid(Set tbInnovationsForOrgid) {
        this.tbInnovationsForOrgid = tbInnovationsForOrgid;
    }

    public Set getTbMonthperformanceopens() {
        return this.tbMonthperformanceopens;
    }
    
    public void setTbMonthperformanceopens(Set tbMonthperformanceopens) {
        this.tbMonthperformanceopens = tbMonthperformanceopens;
    }

    public Set getCOrganizationNjs() {
        return this.COrganizationNjs;
    }
    
    public void setCOrganizationNjs(Set COrganizationNjs) {
        this.COrganizationNjs = COrganizationNjs;
    }

    public Set getTbEmployees() {
        return this.tbEmployees;
    }
    
    public void setTbEmployees(Set tbEmployees) {
        this.tbEmployees = tbEmployees;
    }

    public Set getCUserInfos() {
        return this.CUserInfos;
    }
    
    public void setCUserInfos(Set CUserInfos) {
        this.CUserInfos = CUserInfos;
    }

    public Set getTbEmployeepraisecriticisms() {
        return this.tbEmployeepraisecriticisms;
    }
    
    public void setTbEmployeepraisecriticisms(Set tbEmployeepraisecriticisms) {
        this.tbEmployeepraisecriticisms = tbEmployeepraisecriticisms;
    }

    public Set getTbInnovationsForEmployeeorgid() {
        return this.tbInnovationsForEmployeeorgid;
    }
    
    public void setTbInnovationsForEmployeeorgid(Set tbInnovationsForEmployeeorgid) {
        this.tbInnovationsForEmployeeorgid = tbInnovationsForEmployeeorgid;
    }

    public Set getTbPromotiontrainings() {
        return this.tbPromotiontrainings;
    }
    
    public void setTbPromotiontrainings(Set tbPromotiontrainings) {
        this.tbPromotiontrainings = tbPromotiontrainings;
    }

    public Set getOperatorNjs() {
        return this.operatorNjs;
    }
    
    public void setOperatorNjs(Set operatorNjs) {
        this.operatorNjs = operatorNjs;
    }
   








}