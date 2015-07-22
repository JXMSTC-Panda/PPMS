package ppms.domain;

import java.util.Date;

/**
 * TbSystemsettings entity. @author MyEclipse Persistence Tools
 */
public class TbSystemsettings extends AbstractTbSystemsettings implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
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
	}

}
