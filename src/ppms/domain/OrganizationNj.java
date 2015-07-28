package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;


/**
 * OrganizationNj entity. @author MyEclipse Persistence Tools
 */
public class OrganizationNj extends AbstractOrganizationNj implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public OrganizationNj() {
    }

	/** minimal constructor */
    public OrganizationNj(Integer orgid) {
        super(orgid);        
    }
    
    /** full constructor */
    public OrganizationNj(Integer orgid, String orgName, String address, Date expireTime, Integer superiorId, Boolean status, String contactName, String contactTel, BigDecimal userCounty, Byte type, Integer regionId, String channelType, Set tbChangeorghistoriesForOutorgid, Set tbChangeorghistoriesForInorgid, Set tbBecomeemployeeexams, Set tbMonthexams, Set tbSubareaorgrelations, Set tbStandardchecks, Set tbOperationtrainings, Set tbAreaorgrelations, Set tbOperationchecks, Set tbFreshemployeeexams, Set tbMonitorchecks, Set tbMountguardexams, Set tbPerformances, Set tbVisitchecks, Set tbOrgpraisecriticisms, Set tbInnovationsForOrgid, Set tbMonthperformanceopens, Set COrganizationNjs, Set tbEmployees, Set CUserInfos, Set tbEmployeepraisecriticisms, Set tbInnovationsForEmployeeorgid, Set tbPromotiontrainings, Set operatorNjs) {
        super(orgid, orgName, address, expireTime, superiorId, status, contactName, contactTel, userCounty, type, regionId, channelType, tbChangeorghistoriesForOutorgid, tbChangeorghistoriesForInorgid, tbBecomeemployeeexams, tbMonthexams, tbSubareaorgrelations, tbStandardchecks, tbOperationtrainings, tbAreaorgrelations, tbOperationchecks, tbFreshemployeeexams, tbMonitorchecks, tbMountguardexams, tbPerformances, tbVisitchecks, tbOrgpraisecriticisms, tbInnovationsForOrgid, tbMonthperformanceopens, COrganizationNjs, tbEmployees, CUserInfos, tbEmployeepraisecriticisms, tbInnovationsForEmployeeorgid, tbPromotiontrainings, operatorNjs);        
    }
   
}
