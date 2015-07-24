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
<<<<<<< HEAD
	public TbStage(String stageid) {
		super(stageid);
	}

	/** full constructor */
	public TbStage(String stageid, String stagename, String stagecomment,
			String seq, String createdby, Date createdtime, String modifiedby,
			Date modifiedtime, Date deletedtime, Set tbJobs) {
		super(stageid, stagename, stagecomment, seq, createdby, createdtime,
				modifiedby, modifiedtime, deletedtime, tbJobs);
=======
	public TbStage(String stageId) {
		super(stageId);
	}

	/** full constructor */
	public TbStage(String stageId, String stageName, String stageComment,
			String seq, String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime, Date deletedTime, Set tbJobs) {
		super(stageId, stageName, stageComment, seq, createdBy, createdTime,
				modifiedBy, modifiedTime, deletedTime, tbJobs);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
