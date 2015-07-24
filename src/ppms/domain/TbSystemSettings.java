package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * TbSystemsettings entity. @author MyEclipse Persistence Tools
 */
public class TbSystemsettings extends AbstractTbSystemsettings implements
=======
 * TbSystemSettings entity. @author MyEclipse Persistence Tools
 */
public class TbSystemSettings extends AbstractTbSystemSettings implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public TbSystemsettings() {
	}

	/** minimal constructor */
	public TbSystemsettings(String settingsid) {
		super(settingsid);
	}

	/** full constructor */
	public TbSystemsettings(String settingsid, String mastertype1, String key1,
			String mastertype2, String key2, String value, Boolean valuetype,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
		super(settingsid, mastertype1, key1, mastertype2, key2, value,
				valuetype, createdby, createdtime, modifiedby, modifiedtime);
=======
	public TbSystemSettings() {
	}

	/** minimal constructor */
	public TbSystemSettings(String settingsId) {
		super(settingsId);
	}

	/** full constructor */
	public TbSystemSettings(String settingsId, String masterType1, String key1,
			String masterType2, String key2, String value, Boolean valueType,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime) {
		super(settingsId, masterType1, key1, masterType2, key2, value,
				valueType, createdBy, createdTime, modifiedBy, modifiedTime);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
