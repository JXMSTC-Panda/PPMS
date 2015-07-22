package ppms.domain;

import java.util.Date;

/**
 * TbSystemSettings entity. @author MyEclipse Persistence Tools
 */
public class TbSystemSettings extends AbstractTbSystemSettings implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
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
	}

}
