package ppms.domain;

import java.util.Date;
import java.util.Set;

/**
 * TbStage entity. @author MyEclipse Persistence Tools
 */
public class TbStage extends AbstractTbStage implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbStage() {
	}

	/** minimal constructor */
	public TbStage(String stageId) {
		super(stageId);
	}

	/** full constructor */
	public TbStage(String stageId, String stageName, String stageComment,
			String seq, String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime, Date deletedTime, Set tbJobs) {
		super(stageId, stageName, stageComment, seq, createdBy, createdTime,
				modifiedBy, modifiedTime, deletedTime, tbJobs);
	}

}
