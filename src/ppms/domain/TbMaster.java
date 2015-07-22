package ppms.domain;

/**
 * TbMaster entity. @author MyEclipse Persistence Tools
 */
public class TbMaster extends AbstractTbMaster implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbMaster() {
	}

	/** minimal constructor */
	public TbMaster(String masterid) {
		super(masterid);
	}

	/** full constructor */
	public TbMaster(String masterid, String type, String key, String value,
			String seq) {
		super(masterid, type, key, value, seq);
	}

}
