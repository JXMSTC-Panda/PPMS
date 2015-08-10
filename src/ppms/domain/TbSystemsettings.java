package ppms.domain;

import java.util.Date;

import ppms.excel.template.BaseExcelObject;

/**
 * TbSystemsettings entity. @author MyEclipse Persistence Tools
 */

public class TbSystemsettings extends BaseExcelObject implements java.io.Serializable {

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

	// Constructors

	/** default constructor */
	public TbSystemsettings() {
	}

	/** minimal constructor */
	public TbSystemsettings(String settingsid) {
		this.settingsid = settingsid;
	}

	/** full constructor */
	public TbSystemsettings(String settingsid, String mastertype1, String key1,
			String mastertype2, String key2, String value, Boolean valuetype,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
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
	}

	// Property accessors

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
	}

	public String getKey1() {
		return this.key1;
	}

	public void setKey1(String key1) {
		this.key1 = key1;
	}

	public String getMastertype2() {
		return this.mastertype2;
	}

	public void setMastertype2(String mastertype2) {
		this.mastertype2 = mastertype2;
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
	}

}