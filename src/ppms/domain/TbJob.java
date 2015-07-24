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
<<<<<<< HEAD
	public TbJob(String jobid) {
		super(jobid);
	}

	/** full constructor */
	public TbJob(String jobid, TbStage tbStage, TbPost tbPost, String jobname,
			String jobcomment, Boolean jobtype, String seq, String createdby,
			Date createdtime, String modifiedby, Date modifiedtime,
			Date deletedtime, Set tbEmployees,
			Set tbChangejobhistoriesForInjobid, Set tbPoints,
			Set tbChangejobhistoriesForOutjobid) {
		super(jobid, tbStage, tbPost, jobname, jobcomment, jobtype, seq,
				createdby, createdtime, modifiedby, modifiedtime, deletedtime,
				tbEmployees, tbChangejobhistoriesForInjobid, tbPoints,
				tbChangejobhistoriesForOutjobid);
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
