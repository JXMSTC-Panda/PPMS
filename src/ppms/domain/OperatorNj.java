package ppms.domain;

import java.util.Date;


/**
 * OperatorNj entity. @author MyEclipse Persistence Tools
 */
public class OperatorNj extends AbstractOperatorNj implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public OperatorNj() {
    }

	/** minimal constructor */
    public OperatorNj(Integer operatorid) {
        super(operatorid);        
    }
    
    /** full constructor */
    public OperatorNj(Integer operatorid, OrganizationNj organizationNj, String name, Boolean sex, String addr, String telephone, String office, Date createtime, Date invalidtime, Boolean statusid, Byte maxlogintimes, Byte currlogintimes, Integer empno, Boolean type, String mobile, Date changedate) {
        super(operatorid, organizationNj, name, sex, addr, telephone, office, createtime, invalidtime, statusid, maxlogintimes, currlogintimes, empno, type, mobile, changedate);        
    }
   
}
