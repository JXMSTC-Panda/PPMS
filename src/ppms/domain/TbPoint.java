package ppms.domain;

import java.util.Date;
import java.util.Set;


/**
 * TbPoint entity. @author MyEclipse Persistence Tools
 */
public class TbPoint extends AbstractTbPoint implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public TbPoint() {
    }

	/** minimal constructor */
    public TbPoint(String pointid) {
        super(pointid);        
    }
    
    /** full constructor */
    public TbPoint(String pointid, TbEmployee tbEmployee, TbJob tbJob, Integer orgid, Date pointmonth, String orgtype, Double employeepoint, Double employeeperformance, Double orgperformance, Double regulatepoint, Integer rankseq, Double encouragementmoney, Double tax, Double netincome, Double orglevel, Double breachdeductpoint, Double lastpoint, Double deducttax, String createdby, Date createdtime, String modifiedby, Date modifiedtime, Set tbPointdetails) {
        super(pointid, tbEmployee, tbJob, orgid, pointmonth, orgtype, employeepoint, employeeperformance, orgperformance, regulatepoint, rankseq, encouragementmoney, tax, netincome, orglevel, breachdeductpoint, lastpoint, deducttax, createdby, createdtime, modifiedby, modifiedtime, tbPointdetails);        
    }
   
}
