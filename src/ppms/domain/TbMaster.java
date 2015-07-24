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
<<<<<<< HEAD
	public TbMaster(String masterid) {
		super(masterid);
	}

	/** full constructor */
	public TbMaster(String masterid, String type, String key, String value,
			String seq) {
		super(masterid, type, key, value, seq);
=======
	public TbMaster(String masterId) {
		super(masterId);
	}

	/** full constructor */
	public TbMaster(String masterId, String type, String key, String value,
			String seq) {
		super(masterId, type, key, value, seq);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
