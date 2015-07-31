package ppms.domain;

import java.util.Date;


/**
 * AbstractTbVisitcheck entity provides the base persistence definition of the TbVisitcheck entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbVisitcheck  implements java.io.Serializable {


    // Fields    

     private String visitcheckid;
     private OrganizationNj organizationNj;
     private Date checkdate;
     private Double firstscore;
     private Double secondscore;
     private Double consistencyscore;
     private Double averagescore;
     private String createdby;
     private Date createdtime;
     private String modifiedby;
     private Date modifiedtime;


    // Constructors

    /** default constructor */
    public AbstractTbVisitcheck() {
    }

	/** minimal constructor */
    public AbstractTbVisitcheck(String visitcheckid) {
        this.visitcheckid = visitcheckid;
    }
    
    /** full constructor */
    public AbstractTbVisitcheck(String visitcheckid, OrganizationNj organizationNj, Date checkdate, Double firstscore, Double secondscore, Double consistencyscore, Double averagescore, String createdby, Date createdtime, String modifiedby, Date modifiedtime) {
        this.visitcheckid = visitcheckid;
        this.organizationNj = organizationNj;
        this.checkdate = checkdate;
        this.firstscore = firstscore;
        this.secondscore = secondscore;
        this.consistencyscore = consistencyscore;
        this.averagescore = averagescore;
        this.createdby = createdby;
        this.createdtime = createdtime;
        this.modifiedby = modifiedby;
        this.modifiedtime = modifiedtime;
    }

   
    // Property accessors

    public String getVisitcheckid() {
        return this.visitcheckid;
    }
    
    public void setVisitcheckid(String visitcheckid) {
        this.visitcheckid = visitcheckid;
    }

    public OrganizationNj getOrganizationNj() {
        return this.organizationNj;
    }
    
    public void setOrganizationNj(OrganizationNj organizationNj) {
        this.organizationNj = organizationNj;
    }

    public Date getCheckdate() {
        return this.checkdate;
    }
    
    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public Double getFirstscore() {
        return this.firstscore;
    }
    
    public void setFirstscore(Double firstscore) {
        this.firstscore = firstscore;
    }

    public Double getSecondscore() {
        return this.secondscore;
    }
    
    public void setSecondscore(Double secondscore) {
        this.secondscore = secondscore;
    }

    public Double getConsistencyscore() {
        return this.consistencyscore;
    }
    
    public void setConsistencyscore(Double consistencyscore) {
        this.consistencyscore = consistencyscore;
    }

    public Double getAveragescore() {
        return this.averagescore;
    }
    
    public void setAveragescore(Double averagescore) {
        this.averagescore = averagescore;
    }

    public String getCreatedby() {
        return this.createdby;
    }
    
    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Date getCreatedtime() {
        return this.createdtime;
    }
    
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public String getModifiedby() {
        return this.modifiedby;
    }
    
    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    public Date getModifiedtime() {
        return this.modifiedtime;
    }
    
    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }
   








}