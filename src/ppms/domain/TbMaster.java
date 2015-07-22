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
	public TbMaster(String masterId) {
		super(masterId);
	}

	/** full constructor */
	public TbMaster(String masterId, String type, String key, String value,
			String seq) {
		super(masterId, type, key, value, seq);
	}

}
