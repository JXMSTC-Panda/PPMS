package ppms.domain;



/**
 * TbRolefunction entity. @author MyEclipse Persistence Tools
 */
public class TbRolefunction extends AbstractTbRolefunction implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public TbRolefunction() {
    }

	/** minimal constructor */
    public TbRolefunction(TbRolefunctionId id) {
        super(id);        
    }
    
    /** full constructor */
    public TbRolefunction(TbRolefunctionId id, String employeesearchscope, String orgsearchscope) {
        super(id, employeesearchscope, orgsearchscope);        
    }
   
}
