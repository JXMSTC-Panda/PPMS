package ppms.domain;

import java.util.Date;
import java.util.Set;


/**
 * TbEmployee entity. @author MyEclipse Persistence Tools
 */
public class TbEmployee extends AbstractTbEmployee implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public TbEmployee() {
    }

	/** minimal constructor */
    public TbEmployee(String employeeid) {
        super(employeeid);        
    }
    
    /** full constructor */
    public TbEmployee(String employeeid, OrganizationNj organizationNj, TbJob tbJob, TbRole tbRole, TbPost tbPost, String employeename, String employeecode, String idnumber, String idpassword, String orgtype, Boolean sex, Date birthday, String bankname, String banknumber, Boolean status, String academicdegree, String addressarea, String address, String mobilenumber, String shortmobilenumber, String schoolname, String specialization, String tel, Date entertime, Boolean frontbackflag, String backjobcomment, Boolean telecomlevel, Boolean mobilelevel, String employeetype, String qualification, Date jobstartdate, Date operatorpassdate, Short operatorexpire, Boolean operatorvalidflag, Date auditpassdate, Short auditexpire, Boolean auditvalidflag, String remark, Date lastlogintime, String createdby, Date createdtime, String modifiedby, Date modifiedtime, Set tbOperationchecks, Set tbBecomeemployeeexams, Set tbChangejobhistories, Set tbFreshemployeeexams, Set tbPerformances, Set tbPoints, Set tbChangeorghistories, Set tbEmployeepraisecriticisms, Set tbMountguardexams, Set tbMonthexams, Set tbInnovations, Set tbOperationtrainings, Set tbPromotiontrainings) {
        super(employeeid, organizationNj, tbJob, tbRole, tbPost, employeename, employeecode, idnumber, idpassword, orgtype, sex, birthday, bankname, banknumber, status, academicdegree, addressarea, address, mobilenumber, shortmobilenumber, schoolname, specialization, tel, entertime, frontbackflag, backjobcomment, telecomlevel, mobilelevel, employeetype, qualification, jobstartdate, operatorpassdate, operatorexpire, operatorvalidflag, auditpassdate, auditexpire, auditvalidflag, remark, lastlogintime, createdby, createdtime, modifiedby, modifiedtime, tbOperationchecks, tbBecomeemployeeexams, tbChangejobhistories, tbFreshemployeeexams, tbPerformances, tbPoints, tbChangeorghistories, tbEmployeepraisecriticisms, tbMountguardexams, tbMonthexams, tbInnovations, tbOperationtrainings, tbPromotiontrainings);        
    }
   
}
