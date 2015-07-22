package ppms.domain;

import java.util.Date;

/**
 * AbstractTbChangeJobHistory entity provides the base persistence definition of
 * the TbChangeJobHistory entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbChangeJobHistory implements
		java.io.Serializable {

	// Fields

	private String jobHistoryId;
	private TbEmployee tbEmployee;
	private TbJob tbJobByInJobId;
	private TbJob tbJobByOutJobId;
	private Date changeDate;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;

	// Constructors

	/** default constructor */
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
	}

	// Property accessors

	public String getJobHistoryId() {
		return this.jobHistoryId;
	}

	public void setJobHistoryId(String jobHistoryId) {
		this.jobHistoryId = jobHistoryId;
	}

	public TbEmployee getTbEmployee() {
		return this.tbEmployee;
	}

	public void setTbEmployee(TbEmployee tbEmployee) {
		this.tbEmployee = tbEmployee;
	}

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
	}

}