package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * TbChangejobhistory entity. @author MyEclipse Persistence Tools
 */
public class TbChangejobhistory extends AbstractTbChangejobhistory implements
=======
 * TbChangeJobHistory entity. @author MyEclipse Persistence Tools
 */
public class TbChangeJobHistory extends AbstractTbChangeJobHistory implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public TbChangejobhistory() {
	}

	/** minimal constructor */
	public TbChangejobhistory(String jobhistoryid) {
		super(jobhistoryid);
	}

	/** full constructor */
	public TbChangejobhistory(String jobhistoryid, TbEmployee tbEmployee,
			TbJob tbJobByInjobid, TbJob tbJobByOutjobid, Date changedate,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
		super(jobhistoryid, tbEmployee, tbJobByInjobid, tbJobByOutjobid,
				changedate, createdby, createdtime, modifiedby, modifiedtime);
=======
	public TbChangeJobHistory() {
	}

	/** minimal constructor */
	public TbChangeJobHistory(String jobHistoryId) {
		super(jobHistoryId);
	}

	/** full constructor */
	public TbChangeJobHistory(String jobHistoryId, TbEmployee tbEmployee,
			TbJob tbJobByInJobId, TbJob tbJobByOutJobId, Date changeDate,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime) {
		super(jobHistoryId, tbEmployee, tbJobByInJobId, tbJobByOutJobId,
				changeDate, createdBy, createdTime, modifiedBy, modifiedTime);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
