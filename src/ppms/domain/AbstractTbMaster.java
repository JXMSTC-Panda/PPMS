package ppms.domain;

/**
 * AbstractTbMaster entity provides the base persistence definition of the
 * TbMaster entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbMaster implements java.io.Serializable {

	// Fields

	private String masterId;
	private String type;
	private String key;
	private String value;
	private String seq;

	// Constructors

	/** default constructor */
	public AbstractTbMaster() {
	}

	/** minimal constructor */
	public AbstractTbMaster(String masterId) {
		this.masterId = masterId;
	}

	/** full constructor */
	public AbstractTbMaster(String masterId, String type, String key,
			String value, String seq) {
		this.masterId = masterId;
		this.type = type;
		this.key = key;
		this.value = value;
		this.seq = seq;
	}

	// Property accessors

	public String getMasterId() {
		return this.masterId;
	}

	public void setMasterId(String masterId) {
		this.masterId = masterId;
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