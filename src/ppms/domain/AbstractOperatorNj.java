package ppms.domain;

import java.util.Date;

/**
 * AbstractOperatorNj entity provides the base persistence definition of the
 * OperatorNj entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOperatorNj implements java.io.Serializable {

	// Fields

<<<<<<< HEAD
	private Integer operatorid;
=======
	private Integer operatorId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	private OrganizationNj organizationNj;
	private String name;
	private Boolean sex;
	private String addr;
	private String telephone;
	private String office;
<<<<<<< HEAD
	private Date createtime;
	private Date invalidtime;
	private Boolean statusid;
	private Byte maxlogintimes;
	private Byte currlogintimes;
	private Integer empno;
	private Boolean type;
	private String mobile;
	private Date changedate;
=======
	private Date createTime;
	private Date invalidTime;
	private Boolean statusId;
	private Byte maxLoginTimes;
	private Byte currLoginTimes;
	private Integer empNo;
	private Boolean type;
	private String mobile;
	private Date changeDate;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
	public AbstractOperatorNj() {
	}

	/** minimal constructor */
<<<<<<< HEAD
	public AbstractOperatorNj(Integer operatorid) {
		this.operatorid = operatorid;
	}

	/** full constructor */
	public AbstractOperatorNj(Integer operatorid,
			OrganizationNj organizationNj, String name, Boolean sex,
			String addr, String telephone, String office, Date createtime,
			Date invalidtime, Boolean statusid, Byte maxlogintimes,
			Byte currlogintimes, Integer empno, Boolean type, String mobile,
			Date changedate) {
		this.operatorid = operatorid;
=======
	public AbstractOperatorNj(Integer operatorId) {
		this.operatorId = operatorId;
	}

	/** full constructor */
	public AbstractOperatorNj(Integer operatorId,
			OrganizationNj organizationNj, String name, Boolean sex,
			String addr, String telephone, String office, Date createTime,
			Date invalidTime, Boolean statusId, Byte maxLoginTimes,
			Byte currLoginTimes, Integer empNo, Boolean type, String mobile,
			Date changeDate) {
		this.operatorId = operatorId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		this.organizationNj = organizationNj;
		this.name = name;
		this.sex = sex;
		this.addr = addr;
		this.telephone = telephone;
		this.office = office;
<<<<<<< HEAD
		this.createtime = createtime;
		this.invalidtime = invalidtime;
		this.statusid = statusid;
		this.maxlogintimes = maxlogintimes;
		this.currlogintimes = currlogintimes;
		this.empno = empno;
		this.type = type;
		this.mobile = mobile;
		this.changedate = changedate;
=======
		this.createTime = createTime;
		this.invalidTime = invalidTime;
		this.statusId = statusId;
		this.maxLoginTimes = maxLoginTimes;
		this.currLoginTimes = currLoginTimes;
		this.empNo = empNo;
		this.type = type;
		this.mobile = mobile;
		this.changeDate = changeDate;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
	public Integer getOperatorid() {
		return this.operatorid;
	}

	public void setOperatorid(Integer operatorid) {
		this.operatorid = operatorid;
=======
	public Integer getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(Integer operatorId) {
		this.operatorId = operatorId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public OrganizationNj getOrganizationNj() {
		return this.organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getSex() {
		return this.sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getOffice() {
		return this.office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

<<<<<<< HEAD
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getInvalidtime() {
		return this.invalidtime;
	}

	public void setInvalidtime(Date invalidtime) {
		this.invalidtime = invalidtime;
	}

	public Boolean getStatusid() {
		return this.statusid;
	}

	public void setStatusid(Boolean statusid) {
		this.statusid = statusid;
	}

	public Byte getMaxlogintimes() {
		return this.maxlogintimes;
	}

	public void setMaxlogintimes(Byte maxlogintimes) {
		this.maxlogintimes = maxlogintimes;
	}

	public Byte getCurrlogintimes() {
		return this.currlogintimes;
	}

	public void setCurrlogintimes(Byte currlogintimes) {
		this.currlogintimes = currlogintimes;
	}

	public Integer getEmpno() {
		return this.empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
=======
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getInvalidTime() {
		return this.invalidTime;
	}

	public void setInvalidTime(Date invalidTime) {
		this.invalidTime = invalidTime;
	}

	public Boolean getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Boolean statusId) {
		this.statusId = statusId;
	}

	public Byte getMaxLoginTimes() {
		return this.maxLoginTimes;
	}

	public void setMaxLoginTimes(Byte maxLoginTimes) {
		this.maxLoginTimes = maxLoginTimes;
	}

	public Byte getCurrLoginTimes() {
		return this.currLoginTimes;
	}

	public void setCurrLoginTimes(Byte currLoginTimes) {
		this.currLoginTimes = currLoginTimes;
	}

	public Integer getEmpNo() {
		return this.empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public Boolean getType() {
		return this.type;
	}

	public void setType(Boolean type) {
		this.type = type;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

<<<<<<< HEAD
	public Date getChangedate() {
		return this.changedate;
	}

	public void setChangedate(Date changedate) {
		this.changedate = changedate;
=======
	public Date getChangeDate() {
		return this.changeDate;
	}

	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}