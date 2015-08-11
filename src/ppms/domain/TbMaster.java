package ppms.domain;

/**
 * TbMaster entity. @author MyEclipse Persistence Tools
 */

public class TbMaster implements java.io.Serializable {

	// Fields

	private String masterid;
	private String type;
	private String key;
	private String value;
	private String seq;

	// Constructors

	/** default constructor */
	public TbMaster() {
	}

	/** minimal constructor */
	public TbMaster(String masterid) {
		this.masterid = masterid;
	}

	/** full constructor */
	public TbMaster(String masterid, String type, String key, String value,
			String seq) {
		this.masterid = masterid;
		this.type = type;
		this.key = key;
		this.value = value;
		this.seq = seq;
	}

	// Property accessors

	public String getMasterid() {
		return this.masterid;
	}

	public void setMasterid(String masterid) {
		this.masterid = masterid;
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