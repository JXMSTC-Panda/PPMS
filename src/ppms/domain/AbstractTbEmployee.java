package ppms.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * AbstractTbEmployee entity provides the base persistence definition of the TbEmployee entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbEmployee  implements java.io.Serializable {


    // Fields    

     private String employeeid;
     private OrganizationNj organizationNj;
     private TbJob tbJob;
     private TbRole tbRole;
     private TbPost tbPost;
     private String employeename;
     private String employeecode;
     private String idnumber;
     private String idpassword;
     private String orgtype;
     private Boolean sex;
     private Date birthday;
     private String bankname;
     private String banknumber;
     private Boolean status;
     private String academicdegree;
     private String addressarea;
     private String address;
     private String mobilenumber;
     private String shortmobilenumber;
     private String schoolname;
     private String specialization;
     private String tel;
     private Date entertime;
     private Boolean frontbackflag;
     private String backjobcomment;
     private Boolean telecomlevel;
     private Boolean mobilelevel;
     private String employeetype;
     private String qualification;
     private Date jobstartdate;
     private Date operatorpassdate;
     private Short operatorexpire;
     private Boolean operatorvalidflag;
     private Date auditpassdate;
     private Short auditexpire;
     private Boolean auditvalidflag;
     private String remark;
     private Date lastlogintime;
     private String createdby;
     private Date createdtime;
     private String modifiedby;
     private Date modifiedtime;
     private Set tbOperationchecks = new HashSet(0);
     private Set tbBecomeemployeeexams = new HashSet(0);
     private Set tbChangejobhistories = new HashSet(0);
     private Set tbFreshemployeeexams = new HashSet(0);
     private Set tbPerformances = new HashSet(0);
     private Set tbPoints = new HashSet(0);
     private Set tbChangeorghistories = new HashSet(0);
     private Set tbEmployeepraisecriticisms = new HashSet(0);
     private Set tbMountguardexams = new HashSet(0);
     private Set tbMonthexams = new HashSet(0);
     private Set tbInnovations = new HashSet(0);
     private Set tbOperationtrainings = new HashSet(0);
     private Set tbPromotiontrainings = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractTbEmployee() {
    }

	/** minimal constructor */
    public AbstractTbEmployee(String employeeid) {
        this.employeeid = employeeid;
    }
    
    /** full constructor */
    public AbstractTbEmployee(String employeeid, OrganizationNj organizationNj, TbJob tbJob, TbRole tbRole, TbPost tbPost, String employeename, String employeecode, String idnumber, String idpassword, String orgtype, Boolean sex, Date birthday, String bankname, String banknumber, Boolean status, String academicdegree, String addressarea, String address, String mobilenumber, String shortmobilenumber, String schoolname, String specialization, String tel, Date entertime, Boolean frontbackflag, String backjobcomment, Boolean telecomlevel, Boolean mobilelevel, String employeetype, String qualification, Date jobstartdate, Date operatorpassdate, Short operatorexpire, Boolean operatorvalidflag, Date auditpassdate, Short auditexpire, Boolean auditvalidflag, String remark, Date lastlogintime, String createdby, Date createdtime, String modifiedby, Date modifiedtime, Set tbOperationchecks, Set tbBecomeemployeeexams, Set tbChangejobhistories, Set tbFreshemployeeexams, Set tbPerformances, Set tbPoints, Set tbChangeorghistories, Set tbEmployeepraisecriticisms, Set tbMountguardexams, Set tbMonthexams, Set tbInnovations, Set tbOperationtrainings, Set tbPromotiontrainings) {
        this.employeeid = employeeid;
        this.organizationNj = organizationNj;
        this.tbJob = tbJob;
        this.tbRole = tbRole;
        this.tbPost = tbPost;
        this.employeename = employeename;
        this.employeecode = employeecode;
        this.idnumber = idnumber;
        this.idpassword = idpassword;
        this.orgtype = orgtype;
        this.sex = sex;
        this.birthday = birthday;
        this.bankname = bankname;
        this.banknumber = banknumber;
        this.status = status;
        this.academicdegree = academicdegree;
        this.addressarea = addressarea;
        this.address = address;
        this.mobilenumber = mobilenumber;
        this.shortmobilenumber = shortmobilenumber;
        this.schoolname = schoolname;
        this.specialization = specialization;
        this.tel = tel;
        this.entertime = entertime;
        this.frontbackflag = frontbackflag;
        this.backjobcomment = backjobcomment;
        this.telecomlevel = telecomlevel;
        this.mobilelevel = mobilelevel;
        this.employeetype = employeetype;
        this.qualification = qualification;
        this.jobstartdate = jobstartdate;
        this.operatorpassdate = operatorpassdate;
        this.operatorexpire = operatorexpire;
        this.operatorvalidflag = operatorvalidflag;
        this.auditpassdate = auditpassdate;
        this.auditexpire = auditexpire;
        this.auditvalidflag = auditvalidflag;
        this.remark = remark;
        this.lastlogintime = lastlogintime;
        this.createdby = createdby;
        this.createdtime = createdtime;
        this.modifiedby = modifiedby;
        this.modifiedtime = modifiedtime;
        this.tbOperationchecks = tbOperationchecks;
        this.tbBecomeemployeeexams = tbBecomeemployeeexams;
        this.tbChangejobhistories = tbChangejobhistories;
        this.tbFreshemployeeexams = tbFreshemployeeexams;
        this.tbPerformances = tbPerformances;
        this.tbPoints = tbPoints;
        this.tbChangeorghistories = tbChangeorghistories;
        this.tbEmployeepraisecriticisms = tbEmployeepraisecriticisms;
        this.tbMountguardexams = tbMountguardexams;
        this.tbMonthexams = tbMonthexams;
        this.tbInnovations = tbInnovations;
        this.tbOperationtrainings = tbOperationtrainings;
        this.tbPromotiontrainings = tbPromotiontrainings;
    }

   
    // Property accessors

    public String getEmployeeid() {
        return this.employeeid;
    }
    
    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public OrganizationNj getOrganizationNj() {
        return this.organizationNj;
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

    public TbRole getTbRole() {
        return this.tbRole;
    }
    
    public void setTbRole(TbRole tbRole) {
        this.tbRole = tbRole;
    }

    public TbPost getTbPost() {
        return this.tbPost;
    }
    
    public void setTbPost(TbPost tbPost) {
        this.tbPost = tbPost;
    }

    public String getEmployeename() {
        return this.employeename;
    }
    
    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmployeecode() {
        return this.employeecode;
    }
    
    public void setEmployeecode(String employeecode) {
        this.employeecode = employeecode;
    }

    public String getIdnumber() {
        return this.idnumber;
    }
    
    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getIdpassword() {
        return this.idpassword;
    }
    
    public void setIdpassword(String idpassword) {
        this.idpassword = idpassword;
    }

    public String getOrgtype() {
        return this.orgtype;
    }
    
    public void setOrgtype(String orgtype) {
        this.orgtype = orgtype;
    }

    public Boolean getSex() {
        return this.sex;
    }
    
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getBankname() {
        return this.bankname;
    }
    
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBanknumber() {
        return this.banknumber;
    }
    
    public void setBanknumber(String banknumber) {
        this.banknumber = banknumber;
    }

    public Boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getAcademicdegree() {
        return this.academicdegree;
    }
    
    public void setAcademicdegree(String academicdegree) {
        this.academicdegree = academicdegree;
    }

    public String getAddressarea() {
        return this.addressarea;
    }
    
    public void setAddressarea(String addressarea) {
        this.addressarea = addressarea;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobilenumber() {
        return this.mobilenumber;
    }
    
    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getShortmobilenumber() {
        return this.shortmobilenumber;
    }
    
    public void setShortmobilenumber(String shortmobilenumber) {
        this.shortmobilenumber = shortmobilenumber;
    }

    public String getSchoolname() {
        return this.schoolname;
    }
    
    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getSpecialization() {
        return this.specialization;
    }
    
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getEntertime() {
        return this.entertime;
    }
    
    public void setEntertime(Date entertime) {
        this.entertime = entertime;
    }

    public Boolean getFrontbackflag() {
        return this.frontbackflag;
    }
    
    public void setFrontbackflag(Boolean frontbackflag) {
        this.frontbackflag = frontbackflag;
    }

    public String getBackjobcomment() {
        return this.backjobcomment;
    }
    
    public void setBackjobcomment(String backjobcomment) {
        this.backjobcomment = backjobcomment;
    }

    public Boolean getTelecomlevel() {
        return this.telecomlevel;
    }
    
    public void setTelecomlevel(Boolean telecomlevel) {
        this.telecomlevel = telecomlevel;
    }

    public Boolean getMobilelevel() {
        return this.mobilelevel;
    }
    
    public void setMobilelevel(Boolean mobilelevel) {
        this.mobilelevel = mobilelevel;
    }

    public String getEmployeetype() {
        return this.employeetype;
    }
    
    public void setEmployeetype(String employeetype) {
        this.employeetype = employeetype;
    }

    public String getQualification() {
        return this.qualification;
    }
    
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Date getJobstartdate() {
        return this.jobstartdate;
    }
    
    public void setJobstartdate(Date jobstartdate) {
        this.jobstartdate = jobstartdate;
    }

    public Date getOperatorpassdate() {
        return this.operatorpassdate;
    }
    
    public void setOperatorpassdate(Date operatorpassdate) {
        this.operatorpassdate = operatorpassdate;
    }

    public Short getOperatorexpire() {
        return this.operatorexpire;
    }
    
    public void setOperatorexpire(Short operatorexpire) {
        this.operatorexpire = operatorexpire;
    }

    public Boolean getOperatorvalidflag() {
        return this.operatorvalidflag;
    }
    
    public void setOperatorvalidflag(Boolean operatorvalidflag) {
        this.operatorvalidflag = operatorvalidflag;
    }

    public Date getAuditpassdate() {
        return this.auditpassdate;
    }
    
    public void setAuditpassdate(Date auditpassdate) {
        this.auditpassdate = auditpassdate;
    }

    public Short getAuditexpire() {
        return this.auditexpire;
    }
    
    public void setAuditexpire(Short auditexpire) {
        this.auditexpire = auditexpire;
    }

    public Boolean getAuditvalidflag() {
        return this.auditvalidflag;
    }
    
    public void setAuditvalidflag(Boolean auditvalidflag) {
        this.auditvalidflag = auditvalidflag;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getLastlogintime() {
        return this.lastlogintime;
    }
    
    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
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

    public Set getTbOperationchecks() {
        return this.tbOperationchecks;
    }
    
    public void setTbOperationchecks(Set tbOperationchecks) {
        this.tbOperationchecks = tbOperationchecks;
    }

    public Set getTbBecomeemployeeexams() {
        return this.tbBecomeemployeeexams;
    }
    
    public void setTbBecomeemployeeexams(Set tbBecomeemployeeexams) {
        this.tbBecomeemployeeexams = tbBecomeemployeeexams;
    }

    public Set getTbChangejobhistories() {
        return this.tbChangejobhistories;
    }
    
    public void setTbChangejobhistories(Set tbChangejobhistories) {
        this.tbChangejobhistories = tbChangejobhistories;
    }

    public Set getTbFreshemployeeexams() {
        return this.tbFreshemployeeexams;
    }
    
    public void setTbFreshemployeeexams(Set tbFreshemployeeexams) {
        this.tbFreshemployeeexams = tbFreshemployeeexams;
    }

    public Set getTbPerformances() {
        return this.tbPerformances;
    }
    
    public void setTbPerformances(Set tbPerformances) {
        this.tbPerformances = tbPerformances;
    }

    public Set getTbPoints() {
        return this.tbPoints;
    }
    
    public void setTbPoints(Set tbPoints) {
        this.tbPoints = tbPoints;
    }

    public Set getTbChangeorghistories() {
        return this.tbChangeorghistories;
    }
    
    public void setTbChangeorghistories(Set tbChangeorghistories) {
        this.tbChangeorghistories = tbChangeorghistories;
    }

    public Set getTbEmployeepraisecriticisms() {
        return this.tbEmployeepraisecriticisms;
    }
    
    public void setTbEmployeepraisecriticisms(Set tbEmployeepraisecriticisms) {
        this.tbEmployeepraisecriticisms = tbEmployeepraisecriticisms;
    }

    public Set getTbMountguardexams() {
        return this.tbMountguardexams;
    }
    
    public void setTbMountguardexams(Set tbMountguardexams) {
        this.tbMountguardexams = tbMountguardexams;
    }

    public Set getTbMonthexams() {
        return this.tbMonthexams;
    }
    
    public void setTbMonthexams(Set tbMonthexams) {
        this.tbMonthexams = tbMonthexams;
    }

    public Set getTbInnovations() {
        return this.tbInnovations;
    }
    
    public void setTbInnovations(Set tbInnovations) {
        this.tbInnovations = tbInnovations;
    }

    public Set getTbOperationtrainings() {
        return this.tbOperationtrainings;
    }
    
    public void setTbOperationtrainings(Set tbOperationtrainings) {
        this.tbOperationtrainings = tbOperationtrainings;
    }

    public Set getTbPromotiontrainings() {
        return this.tbPromotiontrainings;
    }
    
    public void setTbPromotiontrainings(Set tbPromotiontrainings) {
        this.tbPromotiontrainings = tbPromotiontrainings;
    }
   








}