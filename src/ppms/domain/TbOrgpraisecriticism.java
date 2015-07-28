package ppms.domain;

import java.util.Date;


/**
 * TbOrgpraisecriticism entity. @author MyEclipse Persistence Tools
 */
public class TbOrgpraisecriticism extends AbstractTbOrgpraisecriticism implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public TbOrgpraisecriticism() {
    }

	/** minimal constructor */
    public TbOrgpraisecriticism(String praisecriticismid) {
        super(praisecriticismid);        
    }
    
    /** full constructor */
    public TbOrgpraisecriticism(String praisecriticismid, OrganizationNj organizationNj, String praisecriticismtype, String cause, Date praisecriticismdate, String praisecriticismlevel, String createdby, Date createdtime, String modifiedby, Date modifiedtime) {
        super(praisecriticismid, organizationNj, praisecriticismtype, cause, praisecriticismdate, praisecriticismlevel, createdby, createdtime, modifiedby, modifiedtime);        
    }
   
}
