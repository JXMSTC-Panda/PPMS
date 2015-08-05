package ppms.domain;

import java.util.Date;

/**
 * TbChangejobhistory entity. @author MyEclipse Persistence Tools
 */

public class TbChangejobhistory implements java.io.Serializable {

	// Fields

	private String jobhistoryid;
	private TbEmployee tbEmployee;
	private TbJob tbJobByInjobid;
	private TbJob tbJobByOutjobid;
	private Date changedate;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;

	// Constructors

	/** default constructor */
	public TbChangejobhistory() {
	}

	/** minimal constructor */
	public TbChangejobhistory(String jobhistoryid) {
		this.jobhistoryid = jobhistoryid;
	}

	/** full constructor */
	public TbChangejobhistory(String jobhistoryid, TbEmployee tbEmployee,
			TbJob tbJobByInjobid, TbJob tbJobByOutjobid, Date changedate,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
		this.jobhistoryid = jobhistoryid;
		this.tbEmployee = tbEmployee;
		this.tbJobByInjobid = tbJobByInjobid;
		this.tbJobByOutjobid = tbJobByOutjobid;
		this.changedate = changedate;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
	}

	// Property accessors

	public String getJobhistoryid() {
		return this.jobhistoryid;
	}

	public void setJobhistoryid(String jobhistoryid) {
		this.jobhistoryid = jobhistoryid;
	}

	public TbEmployee getTbEmployee() {
		return this.tbEmployee;
	}

	public void setTbEmployee(TbEmployee tbEmployee) {
		this.tbEmployee = tbEmployee;
	}

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
	}

}