package ppms.domain;

/**
 * AbstractTbMaster entity provides the base persistence definition of the
 * TbMaster entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbMaster implements java.io.Serializable {

	// Fields

<<<<<<< HEAD
	private String masterid;
=======
	private String masterId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	private String type;
	private String key;
	private String value;
	private String seq;

	// Constructors

	/** default constructor */
	public AbstractTbMaster() {
	}

	/** minimal constructor */
<<<<<<< HEAD
	public AbstractTbMaster(String masterid) {
		this.masterid = masterid;
	}

	/** full constructor */
	public AbstractTbMaster(String masterid, String type, String key,
			String value, String seq) {
		this.masterid = masterid;
=======
	public AbstractTbMaster(String masterId) {
		this.masterId = masterId;
	}

	/** full constructor */
	public AbstractTbMaster(String masterId, String type, String key,
			String value, String seq) {
		this.masterId = masterId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		this.type = type;
		this.key = key;
		this.value = value;
		this.seq = seq;
	}

	// Property accessors

<<<<<<< HEAD
	public String getMasterid() {
		return this.masterid;
	}

	public void setMasterid(String masterid) {
		this.masterid = masterid;
=======
	public String getMasterId() {
		return this.masterId;
	}

	public void setMasterId(String masterId) {
		this.masterId = masterId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getSeq() {
		return this.seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

}