package ppms.domain;

import java.util.Date;


/**
 * TbMonitorcheck entity. @author MyEclipse Persistence Tools
 */
public class TbMonitorcheck extends AbstractTbMonitorcheck implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public TbMonitorcheck() {
    }

	/** minimal constructor */
    public TbMonitorcheck(String monitorcheckid) {
        super(monitorcheckid);        
    }
    
    /** full constructor */
    public TbMonitorcheck(String monitorcheckid, OrganizationNj organizationNj, Date checkdate, String checktype, String detail, String createdby, Date createdtime, String modifiedby, Date modifiedtime) {
        super(monitorcheckid, organizationNj, checkdate, checktype, detail, createdby, createdtime, modifiedby, modifiedtime);        
    }
   
}
