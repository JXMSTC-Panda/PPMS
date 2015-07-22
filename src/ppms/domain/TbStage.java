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
	public TbStage(String stageid) {
		super(stageid);
	}

	/** full constructor */
	public TbStage(String stageid, String stagename, String stagecomment,
			String seq, String createdby, Date createdtime, String modifiedby,
			Date modifiedtime, Date deletedtime, Set tbJobs) {
		super(stageid, stagename, stagecomment, seq, createdby, createdtime,
				modifiedby, modifiedtime, deletedtime, tbJobs);
	}

}
