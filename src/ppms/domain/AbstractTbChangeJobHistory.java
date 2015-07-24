package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * AbstractTbChangejobhistory entity provides the base persistence definition of
 * the TbChangejobhistory entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbChangejobhistory implements
=======
 * AbstractTbChangeJobHistory entity provides the base persistence definition of
 * the TbChangeJobHistory entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbChangeJobHistory implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Fields

<<<<<<< HEAD
	private String jobhistoryid;
	private TbEmployee tbEmployee;
	private TbJob tbJobByInjobid;
	private TbJob tbJobByOutjobid;
	private Date changedate;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
=======
	private String jobHistoryId;
	private TbEmployee tbEmployee;
	private TbJob tbJobByInJobId;
	private TbJob tbJobByOutJobId;
	private Date changeDate;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public AbstractTbChangejobhistory() {
	}

	/** minimal constructor */
	public AbstractTbChangejobhistory(String jobhistoryid) {
		this.jobhistoryid = jobhistoryid;
	}

	/** full constructor */
	public AbstractTbChangejobhistory(String jobhistoryid,
			TbEmployee tbEmployee, TbJob tbJobByInjobid, TbJob tbJobByOutjobid,
			Date changedate, String createdby, Date createdtime,
			String modifiedby, Date modifiedtime) {
		this.jobhistoryid = jobhistoryid;
		this.tbEmployee = tbEmployee;
		this.tbJobByInjobid = tbJobByInjobid;
		this.tbJobByOutjobid = tbJobByOutjobid;
		this.changedate = changedate;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
=======
	public AbstractTbChangeJobHistory() {
	}

	/** minimal constructor */
	public AbstractTbChangeJobHistory(String jobHistoryId) {
		this.jobHistoryId = jobHistoryId;
	}

	/** full constructor */
	public AbstractTbChangeJobHistory(String jobHistoryId,
			TbEmployee tbEmployee, TbJob tbJobByInJobId, TbJob tbJobByOutJobId,
			Date changeDate, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime) {
		this.jobHistoryId = jobHistoryId;
		this.tbEmployee = tbEmployee;
		this.tbJobByInJobId = tbJobByInJobId;
		this.tbJobByOutJobId = tbJobByOutJobId;
		this.changeDate = changeDate;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
	public String getJobhistoryid() {
		return this.jobhistoryid;
	}

	public void setJobhistoryid(String jobhistoryid) {
		this.jobhistoryid = jobhistoryid;
=======
	public String getJobHistoryId() {
		return this.jobHistoryId;
	}

	public void setJobHistoryId(String jobHistoryId) {
		this.jobHistoryId = jobHistoryId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public TbEmployee getTbEmployee() {
		return this.tbEmployee;
	}

	public void setTbEmployee(TbEmployee tbEmployee) {
		this.tbEmployee = tbEmployee;
	}

<<<<<<< HEAD
	public TbJob getTbJobByInjobid() {
		return this.tbJobByInjobid;
	}

	public void setTbJobByInjobid(TbJob tbJobByInjobid) {
		this.tbJobByInjobid = tbJobByInjobid;
	}

	public TbJob getTbJobByOutjobid() {
		return this.tbJobByOutjobid;
	}

	public void setTbJobByOutjobid(TbJob tbJobByOutjobid) {
		this.tbJobByOutjobid = tbJobByOutjobid;
	}

	public Date getChangedate() {
		return this.changedate;
	}

	public void setChangedate(Date changedate) {
		this.changedate = changedate;
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
=======
	public TbJob getTbJobByInJobId() {
		return this.tbJobByInJobId;
	}

	public void setTbJobByInJobId(TbJob tbJobByInJobId) {
		this.tbJobByInJobId = tbJobByInJobId;
	}

	public TbJob getTbJobByOutJobId() {
		return this.tbJobByOutJobId;
	}

	public void setTbJobByOutJobId(TbJob tbJobByOutJobId) {
		this.tbJobByOutJobId = tbJobByOutJobId;
	}

	public Date getChangeDate() {
		return this.changeDate;
	}

	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}