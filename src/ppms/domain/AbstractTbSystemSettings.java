package ppms.domain;

import java.util.Date;

/**
 * AbstractTbSystemSettings entity provides the base persistence definition of
 * the TbSystemSettings entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbSystemSettings implements java.io.Serializable {

	// Fields

	private String settingsId;
	private String masterType1;
	private String key1;
	private String masterType2;
	private String key2;
	private String value;
	private Boolean valueType;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;

	// Constructors

	/** default constructor */
	public AbstractTbSystemSettings() {
	}

	/** minimal constructor */
	public AbstractTbSystemSettings(String settingsId) {
		this.settingsId = settingsId;
	}

	/** full constructor */
	public AbstractTbSystemSettings(String settingsId, String masterType1,
			String key1, String masterType2, String key2, String value,
			Boolean valueType, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime) {
		this.settingsId = settingsId;
		this.masterType1 = masterType1;
		this.key1 = key1;
		this.masterType2 = masterType2;
		this.key2 = key2;
		this.value = value;
		this.valueType = valueType;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
	}

	// Property accessors

	public String getSettingsId() {
		return this.settingsId;
	}

	public void setSettingsId(String settingsId) {
		this.settingsId = settingsId;
	}

	public String getMasterType1() {
		return this.masterType1;
	}

	public void setMasterType1(String masterType1) {
		this.masterType1 = masterType1;
	}

	public String getKey1() {
		return this.key1;
	}

	public void setKey1(String key1) {
		this.key1 = key1;
	}

	public String getMasterType2() {
		return this.masterType2;
	}

	public void setMasterType2(String masterType2) {
		this.masterType2 = masterType2;
	}

	public String getKey2() {
		return this.key2;
	}

	public void setKey2(String key2) {
		this.key2 = key2;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Boolean getValueType() {
		return this.valueType;
	}

	public void setValueType(Boolean valueType) {
		this.valueType = valueType;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

}