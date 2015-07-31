package ppms.domain;

import java.util.Date;
import java.util.Set;


/**
 * TbRole entity. @author MyEclipse Persistence Tools
 */
public class TbRole extends AbstractTbRole implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public TbRole() {
    }

	/** minimal constructor */
    public TbRole(String roleid) {
        super(roleid);        
    }
    
    /** full constructor */
    public TbRole(String roleid, String rolename, Boolean administratorflag, String seq, String createdby, Date createdtime, String modifiedby, Date modifiedtime, Set tbEmployees, Set tbRolefunctions) {
        super(roleid, rolename, administratorflag, seq, createdby, createdtime, modifiedby, modifiedtime, tbEmployees, tbRolefunctions);        
    }
   
}
