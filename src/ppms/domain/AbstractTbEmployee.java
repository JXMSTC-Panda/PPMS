package ppms.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractTbEmployee entity provides the base persistence definition of the
 * TbEmployee entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbEmployee implements java.io.Serializable {

	// Fields

<<<<<<< HEAD
	private String employeeid;
=======
	private String employeeId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	private OrganizationNj organizationNj;
	private TbJob tbJob;
	private TbRole tbRole;
	private TbPost tbPost;
<<<<<<< HEAD
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
=======
	private String employeeName;
	private String employeeCode;
	private String idNumber;
	private String idPassword;
	private String orgType;
	private Boolean sex;
	private Date birthday;
	private String bankName;
	private String bankNumber;
	private Boolean status;
	private String academicDegree;
	private String addressArea;
	private String address;
	private String mobileNumber;
	private String shortMobileNumber;
	private String schoolName;
	private String specialization;
	private String tel;
	private Date enterTime;
	private Boolean frontBackFlag;
	private String backJobComment;
	private Boolean telecomLevel;
	private Boolean mobileLevel;
	private String employeeType;
	private String qualification;
	private Date jobStartDate;
	private Date operatorPassDate;
	private Short operatorExpire;
	private Boolean operatorValidFlag;
	private Date auditPassDate;
	private Short auditExpire;
	private Boolean auditValidFlag;
	private String remark;
	private Date lastLoginTime;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;
	private Set tbOperationTrainings = new HashSet(0);
	private Set tbBecomeEmployeeExams = new HashSet(0);
	private Set tbFreshEmployeeExams = new HashSet(0);
	private Set tbOperationChecks = new HashSet(0);
	private Set tbPerformances = new HashSet(0);
	private Set tbChangeJobHistories = new HashSet(0);
	private Set tbPoints = new HashSet(0);
	private Set tbEmployeePraiseCriticisms = new HashSet(0);
	private Set tbMountGuardExams = new HashSet(0);
	private Set tbMonthExams = new HashSet(0);
	private Set tbChangeOrgHistories = new HashSet(0);
	private Set tbInnovations = new HashSet(0);
	private Set tbPromotionTrainings = new HashSet(0);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
	public AbstractTbEmployee() {
	}

	/** minimal constructor */
<<<<<<< HEAD
	public AbstractTbEmployee(String employeeid) {
		this.employeeid = employeeid;
	}

	/** full constructor */
	public AbstractTbEmployee(String employeeid, OrganizationNj organizationNj,
			TbJob tbJob, TbRole tbRole, TbPost tbPost, String employeename,
			String employeecode, String idnumber, String idpassword,
			String orgtype, Boolean sex, Date birthday, String bankname,
			String banknumber, Boolean status, String academicdegree,
			String addressarea, String address, String mobilenumber,
			String shortmobilenumber, String schoolname, String specialization,
			String tel, Date entertime, Boolean frontbackflag,
			String backjobcomment, Boolean telecomlevel, Boolean mobilelevel,
			String employeetype, String qualification, Date jobstartdate,
			Date operatorpassdate, Short operatorexpire,
			Boolean operatorvalidflag, Date auditpassdate, Short auditexpire,
			Boolean auditvalidflag, String remark, Date lastlogintime,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime, Set tbOperationchecks,
			Set tbBecomeemployeeexams, Set tbChangejobhistories,
			Set tbFreshemployeeexams, Set tbPerformances, Set tbPoints,
			Set tbChangeorghistories, Set tbEmployeepraisecriticisms,
			Set tbMountguardexams, Set tbMonthexams, Set tbInnovations,
			Set tbOperationtrainings, Set tbPromotiontrainings) {
		this.employeeid = employeeid;
=======
	public AbstractTbEmployee(String employeeId) {
		this.employeeId = employeeId;
	}

	/** full constructor */
	public AbstractTbEmployee(String employeeId, OrganizationNj organizationNj,
			TbJob tbJob, TbRole tbRole, TbPost tbPost, String employeeName,
			String employeeCode, String idNumber, String idPassword,
			String orgType, Boolean sex, Date birthday, String bankName,
			String bankNumber, Boolean status, String academicDegree,
			String addressArea, String address, String mobileNumber,
			String shortMobileNumber, String schoolName, String specialization,
			String tel, Date enterTime, Boolean frontBackFlag,
			String backJobComment, Boolean telecomLevel, Boolean mobileLevel,
			String employeeType, String qualification, Date jobStartDate,
			Date operatorPassDate, Short operatorExpire,
			Boolean operatorValidFlag, Date auditPassDate, Short auditExpire,
			Boolean auditValidFlag, String remark, Date lastLoginTime,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime, Set tbOperationTrainings,
			Set tbBecomeEmployeeExams, Set tbFreshEmployeeExams,
			Set tbOperationChecks, Set tbPerformances,
			Set tbChangeJobHistories, Set tbPoints,
			Set tbEmployeePraiseCriticisms, Set tbMountGuardExams,
			Set tbMonthExams, Set tbChangeOrgHistories, Set tbInnovations,
			Set tbPromotionTrainings) {
		this.employeeId = employeeId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		this.organizationNj = organizationNj;
		this.tbJob = tbJob;
		this.tbRole = tbRole;
		this.tbPost = tbPost;
<<<<<<< HEAD
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
=======
		this.employeeName = employeeName;
		this.employeeCode = employeeCode;
		this.idNumber = idNumber;
		this.idPassword = idPassword;
		this.orgType = orgType;
		this.sex = sex;
		this.birthday = birthday;
		this.bankName = bankName;
		this.bankNumber = bankNumber;
		this.status = status;
		this.academicDegree = academicDegree;
		this.addressArea = addressArea;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.shortMobileNumber = shortMobileNumber;
		this.schoolName = schoolName;
		this.specialization = specialization;
		this.tel = tel;
		this.enterTime = enterTime;
		this.frontBackFlag = frontBackFlag;
		this.backJobComment = backJobComment;
		this.telecomLevel = telecomLevel;
		this.mobileLevel = mobileLevel;
		this.employeeType = employeeType;
		this.qualification = qualification;
		this.jobStartDate = jobStartDate;
		this.operatorPassDate = operatorPassDate;
		this.operatorExpire = operatorExpire;
		this.operatorValidFlag = operatorValidFlag;
		this.auditPassDate = auditPassDate;
		this.auditExpire = auditExpire;
		this.auditValidFlag = auditValidFlag;
		this.remark = remark;
		this.lastLoginTime = lastLoginTime;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
		this.tbOperationTrainings = tbOperationTrainings;
		this.tbBecomeEmployeeExams = tbBecomeEmployeeExams;
		this.tbFreshEmployeeExams = tbFreshEmployeeExams;
		this.tbOperationChecks = tbOperationChecks;
		this.tbPerformances = tbPerformances;
		this.tbChangeJobHistories = tbChangeJobHistories;
		this.tbPoints = tbPoints;
		this.tbEmployeePraiseCriticisms = tbEmployeePraiseCriticisms;
		this.tbMountGuardExams = tbMountGuardExams;
		this.tbMonthExams = tbMonthExams;
		this.tbChangeOrgHistories = tbChangeOrgHistories;
		this.tbInnovations = tbInnovations;
		this.tbPromotionTrainings = tbPromotionTrainings;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
	public String getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
=======
	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
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

<<<<<<< HEAD
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
=======
	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeCode() {
		return this.employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getIdNumber() {
		return this.idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getIdPassword() {
		return this.idPassword;
	}

	public void setIdPassword(String idPassword) {
		this.idPassword = idPassword;
	}

	public String getOrgType() {
		return this.orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
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

<<<<<<< HEAD
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
=======
	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankNumber() {
		return this.bankNumber;
	}

	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

<<<<<<< HEAD
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
=======
	public String getAcademicDegree() {
		return this.academicDegree;
	}

	public void setAcademicDegree(String academicDegree) {
		this.academicDegree = academicDegree;
	}

	public String getAddressArea() {
		return this.addressArea;
	}

	public void setAddressArea(String addressArea) {
		this.addressArea = addressArea;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

<<<<<<< HEAD
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
=======
	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getShortMobileNumber() {
		return this.shortMobileNumber;
	}

	public void setShortMobileNumber(String shortMobileNumber) {
		this.shortMobileNumber = shortMobileNumber;
	}

	public String getSchoolName() {
		return this.schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
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

<<<<<<< HEAD
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
=======
	public Date getEnterTime() {
		return this.enterTime;
	}

	public void setEnterTime(Date enterTime) {
		this.enterTime = enterTime;
	}

	public Boolean getFrontBackFlag() {
		return this.frontBackFlag;
	}

	public void setFrontBackFlag(Boolean frontBackFlag) {
		this.frontBackFlag = frontBackFlag;
	}

	public String getBackJobComment() {
		return this.backJobComment;
	}

	public void setBackJobComment(String backJobComment) {
		this.backJobComment = backJobComment;
	}

	public Boolean getTelecomLevel() {
		return this.telecomLevel;
	}

	public void setTelecomLevel(Boolean telecomLevel) {
		this.telecomLevel = telecomLevel;
	}

	public Boolean getMobileLevel() {
		return this.mobileLevel;
	}

	public void setMobileLevel(Boolean mobileLevel) {
		this.mobileLevel = mobileLevel;
	}

	public String getEmployeeType() {
		return this.employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public String getQualification() {
		return this.qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

<<<<<<< HEAD
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
=======
	public Date getJobStartDate() {
		return this.jobStartDate;
	}

	public void setJobStartDate(Date jobStartDate) {
		this.jobStartDate = jobStartDate;
	}

	public Date getOperatorPassDate() {
		return this.operatorPassDate;
	}

	public void setOperatorPassDate(Date operatorPassDate) {
		this.operatorPassDate = operatorPassDate;
	}

	public Short getOperatorExpire() {
		return this.operatorExpire;
	}

	public void setOperatorExpire(Short operatorExpire) {
		this.operatorExpire = operatorExpire;
	}

	public Boolean getOperatorValidFlag() {
		return this.operatorValidFlag;
	}

	public void setOperatorValidFlag(Boolean operatorValidFlag) {
		this.operatorValidFlag = operatorValidFlag;
	}

	public Date getAuditPassDate() {
		return this.auditPassDate;
	}

	public void setAuditPassDate(Date auditPassDate) {
		this.auditPassDate = auditPassDate;
	}

	public Short getAuditExpire() {
		return this.auditExpire;
	}

	public void setAuditExpire(Short auditExpire) {
		this.auditExpire = auditExpire;
	}

	public Boolean getAuditValidFlag() {
		return this.auditValidFlag;
	}

	public void setAuditValidFlag(Boolean auditValidFlag) {
		this.auditValidFlag = auditValidFlag;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

<<<<<<< HEAD
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
=======
	public Date getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
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

	public Set getTbOperationTrainings() {
		return this.tbOperationTrainings;
	}

	public void setTbOperationTrainings(Set tbOperationTrainings) {
		this.tbOperationTrainings = tbOperationTrainings;
	}

	public Set getTbBecomeEmployeeExams() {
		return this.tbBecomeEmployeeExams;
	}

	public void setTbBecomeEmployeeExams(Set tbBecomeEmployeeExams) {
		this.tbBecomeEmployeeExams = tbBecomeEmployeeExams;
	}

	public Set getTbFreshEmployeeExams() {
		return this.tbFreshEmployeeExams;
	}

	public void setTbFreshEmployeeExams(Set tbFreshEmployeeExams) {
		this.tbFreshEmployeeExams = tbFreshEmployeeExams;
	}

	public Set getTbOperationChecks() {
		return this.tbOperationChecks;
	}

	public void setTbOperationChecks(Set tbOperationChecks) {
		this.tbOperationChecks = tbOperationChecks;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public Set getTbPerformances() {
		return this.tbPerformances;
	}

	public void setTbPerformances(Set tbPerformances) {
		this.tbPerformances = tbPerformances;
	}

<<<<<<< HEAD
=======
	public Set getTbChangeJobHistories() {
		return this.tbChangeJobHistories;
	}

	public void setTbChangeJobHistories(Set tbChangeJobHistories) {
		this.tbChangeJobHistories = tbChangeJobHistories;
	}

>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	public Set getTbPoints() {
		return this.tbPoints;
	}

	public void setTbPoints(Set tbPoints) {
		this.tbPoints = tbPoints;
	}

<<<<<<< HEAD
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
=======
	public Set getTbEmployeePraiseCriticisms() {
		return this.tbEmployeePraiseCriticisms;
	}

	public void setTbEmployeePraiseCriticisms(Set tbEmployeePraiseCriticisms) {
		this.tbEmployeePraiseCriticisms = tbEmployeePraiseCriticisms;
	}

	public Set getTbMountGuardExams() {
		return this.tbMountGuardExams;
	}

	public void setTbMountGuardExams(Set tbMountGuardExams) {
		this.tbMountGuardExams = tbMountGuardExams;
	}

	public Set getTbMonthExams() {
		return this.tbMonthExams;
	}

	public void setTbMonthExams(Set tbMonthExams) {
		this.tbMonthExams = tbMonthExams;
	}

	public Set getTbChangeOrgHistories() {
		return this.tbChangeOrgHistories;
	}

	public void setTbChangeOrgHistories(Set tbChangeOrgHistories) {
		this.tbChangeOrgHistories = tbChangeOrgHistories;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public Set getTbInnovations() {
		return this.tbInnovations;
	}

	public void setTbInnovations(Set tbInnovations) {
		this.tbInnovations = tbInnovations;
	}

<<<<<<< HEAD
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
=======
	public Set getTbPromotionTrainings() {
		return this.tbPromotionTrainings;
	}

	public void setTbPromotionTrainings(Set tbPromotionTrainings) {
		this.tbPromotionTrainings = tbPromotionTrainings;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}