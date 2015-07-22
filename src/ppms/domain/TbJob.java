package ppms.domain;

import java.util.Date;
import java.util.Set;

/**
 * TbJob entity. @author MyEclipse Persistence Tools
 */
public class TbJob extends AbstractTbJob implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbJob() {
	}

	/** minimal constructor */
	public TbJob(String jobId) {
		super(jobId);
	}

	/** full constructor */
	public TbJob(String jobId, TbStage tbStage, TbPost tbPost, String jobName,
			String jobComment, Boolean jobType, String seq, String createdBy,
			Date createdTime, String modifiedBy, Date modifiedTime,
			Date deletedTime, Set tbChangeJobHistoriesForInJobId,
			Set tbChangeJobHistoriesForOutJobId, Set tbEmployees, Set tbPoints) {
		super(jobId, tbStage, tbPost, jobName, jobComment, jobType, seq,
				createdBy, createdTime, modifiedBy, modifiedTime, deletedTime,
				tbChangeJobHistoriesForInJobId,
				tbChangeJobHistoriesForOutJobId, tbEmployees, tbPoints);
	}

}
