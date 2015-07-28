package ppms.domain;

import java.util.Date;


/**
 * TbVisitcheck entity. @author MyEclipse Persistence Tools
 */
public class TbVisitcheck extends AbstractTbVisitcheck implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public TbVisitcheck() {
    }

	/** minimal constructor */
    public TbVisitcheck(String visitcheckid) {
        super(visitcheckid);        
    }
    
    /** full constructor */
    public TbVisitcheck(String visitcheckid, OrganizationNj organizationNj, Date checkdate, Double firstscore, Double secondscore, Double consistencyscore, Double averagescore, String createdby, Date createdtime, String modifiedby, Date modifiedtime) {
        super(visitcheckid, organizationNj, checkdate, firstscore, secondscore, consistencyscore, averagescore, createdby, createdtime, modifiedby, modifiedtime);        
    }
   
}
