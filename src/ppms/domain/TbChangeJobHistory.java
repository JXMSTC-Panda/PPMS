package ppms.domain;

import java.util.Date;

/**
 * TbChangeJobHistory entity. @author MyEclipse Persistence Tools
 */
public class TbChangeJobHistory extends AbstractTbChangeJobHistory implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
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
	}

}
