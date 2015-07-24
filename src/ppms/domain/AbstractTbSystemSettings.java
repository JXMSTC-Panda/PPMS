package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * AbstractTbSystemsettings entity provides the base persistence definition of
 * the TbSystemsettings entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbSystemsettings implements java.io.Serializable {

	// Fields

	private String settingsid;
	private String mastertype1;
	private String key1;
	private String mastertype2;
	private String key2;
	private String value;
	private Boolean valuetype;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public AbstractTbSystemsettings() {
	}

	/** minimal constructor */
	public AbstractTbSystemsettings(String settingsid) {
		this.settingsid = settingsid;
	}

	/** full constructor */
	public AbstractTbSystemsettings(String settingsid, String mastertype1,
			String key1, String mastertype2, String key2, String value,
			Boolean valuetype, String createdby, Date createdtime,
			String modifiedby, Date modifiedtime) {
		this.settingsid = settingsid;
		this.mastertype1 = mastertype1;
		this.key1 = key1;
		this.mastertype2 = mastertype2;
		this.key2 = key2;
		this.value = value;
		this.valuetype = valuetype;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
	public String getSettingsid() {
		return this.settingsid;
	}

	public void setSettingsid(String settingsid) {
		this.settingsid = settingsid;
	}

	public String getMastertype1() {
		return this.mastertype1;
	}

	public void setMastertype1(String mastertype1) {
		this.mastertype1 = mastertype1;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public String getKey1() {
		return this.key1;
	}

	public void setKey1(String key1) {
		this.key1 = key1;
	}

<<<<<<< HEAD
	public String getMastertype2() {
		return this.mastertype2;
	}

	public void setMastertype2(String mastertype2) {
		this.mastertype2 = mastertype2;
=======
	public String getMasterType2() {
		return this.masterType2;
	}

	public void setMasterType2(String masterType2) {
		this.masterType2 = masterType2;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
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

<<<<<<< HEAD
	public Boolean getValuetype() {
		return this.valuetype;
	}

	public void setValuetype(Boolean valuetype) {
		this.valuetype = valuetype;
	}

	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getCreatedtime() {
		return this.createdtime;
	}

	public void setCreatedtime(Date createdtime) {
		this.createdtime = createdtime;
	}

	public String getModifiedby() {
		return this.modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}

	public Date getModifiedtime() {
		return this.modifiedtime;
	}

	public void setModifiedtime(Date modifiedtime) {
		this.modifiedtime = modifiedtime;
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}