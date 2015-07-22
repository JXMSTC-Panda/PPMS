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

	private String employeeId;
	private OrganizationNj organizationNj;
	private TbJob tbJob;
	private TbRole tbRole;
	private TbPost tbPost;
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

	// Constructors

	/** default constructor */
	public AbstractTbEmployee() {
	}

	/** minimal constructor */
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
		this.organizationNj = organizationNj;
		this.tbJob = tbJob;
		this.tbRole = tbRole;
		this.tbPost = tbPost;
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
	}

	// Property accessors

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
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
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

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
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

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
	}

	public String getQualification() {
		return this.qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

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
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

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
	}

	public Set getTbPerformances() {
		return this.tbPerformances;
	}

	public void setTbPerformances(Set tbPerformances) {
		this.tbPerformances = tbPerformances;
	}

	public Set getTbChangeJobHistories() {
		return this.tbChangeJobHistories;
	}

	public void setTbChangeJobHistories(Set tbChangeJobHistories) {
		this.tbChangeJobHistories = tbChangeJobHistories;
	}

	public Set getTbPoints() {
		return this.tbPoints;
	}

	public void setTbPoints(Set tbPoints) {
		this.tbPoints = tbPoints;
	}

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
	}

	public Set getTbInnovations() {
		return this.tbInnovations;
	}

	public void setTbInnovations(Set tbInnovations) {
		this.tbInnovations = tbInnovations;
	}

	public Set getTbPromotionTrainings() {
		return this.tbPromotionTrainings;
	}

	public void setTbPromotionTrainings(Set tbPromotionTrainings) {
		this.tbPromotionTrainings = tbPromotionTrainings;
	}

}