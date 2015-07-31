package ppms.domain;

import java.util.Date;


/**
 * AbstractTbInnovation entity provides the base persistence definition of the TbInnovation entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbInnovation  implements java.io.Serializable {


    // Fields    

     private String innovationid;
     private OrganizationNj organizationNjByOrgid;
     private TbEmployee tbEmployee;
     private OrganizationNj organizationNjByEmployeeorgid;
     private String innovationcontent;
     private Date assessdate;
     private String assessresult;
     private String assesslevel;
     private String encouragement;
     private String createdby;
     private Date createdtime;
     private String modifiedby;
     private Date modifiedtime;


    // Constructors

    /** default constructor */
    public AbstractTbInnovation() {
    }

	/** minimal constructor */
    public AbstractTbInnovation(String innovationid) {
        this.innovationid = innovationid;
    }
    
    /** full constructor */
    public AbstractTbInnovation(String innovationid, OrganizationNj organizationNjByOrgid, TbEmployee tbEmployee, OrganizationNj organizationNjByEmployeeorgid, String innovationcontent, Date assessdate, String assessresult, String assesslevel, String encouragement, String createdby, Date createdtime, String modifiedby, Date modifiedtime) {
        this.innovationid = innovationid;
        this.organizationNjByOrgid = organizationNjByOrgid;
        this.tbEmployee = tbEmployee;
        this.organizationNjByEmployeeorgid = organizationNjByEmployeeorgid;
        this.innovationcontent = innovationcontent;
        this.assessdate = assessdate;
        this.assessresult = assessresult;
        this.assesslevel = assesslevel;
        this.encouragement = encouragement;
        this.createdby = createdby;
        this.createdtime = createdtime;
        this.modifiedby = modifiedby;
        this.modifiedtime = modifiedtime;
    }

   
    // Property accessors

    public String getInnovationid() {
        return this.innovationid;
    }
    
    public void setInnovationid(String innovationid) {
        this.innovationid = innovationid;
    }

    public OrganizationNj getOrganizationNjByOrgid() {
        return this.organizationNjByOrgid;
    }
    
    public void setOrganizationNjByOrgid(OrganizationNj organizationNjByOrgid) {
        this.organizationNjByOrgid = organizationNjByOrgid;
    }

    public TbEmployee getTbEmployee() {
        return this.tbEmployee;
    }
    
    public void setTbEmployee(TbEmployee tbEmployee) {
        this.tbEmployee = tbEmployee;
    }

    public OrganizationNj getOrganizationNjByEmployeeorgid() {
        return this.organizationNjByEmployeeorgid;
    }
    
    public void setOrganizationNjByEmployeeorgid(OrganizationNj organizationNjByEmployeeorgid) {
        this.organizationNjByEmployeeorgid = organizationNjByEmployeeorgid;
    }

    public String getInnovationcontent() {
        return this.innovationcontent;
    }
    
    public void setInnovationcontent(String innovationcontent) {
        this.innovationcontent = innovationcontent;
    }

    public Date getAssessdate() {
        return this.assessdate;
    }
    
    public void setAssessdate(Date assessdate) {
        this.assessdate = assessdate;
    }

    public String getAssessresult() {
        return this.assessresult;
    }
    
    public void setAssessresult(String assessresult) {
        this.assessresult = assessresult;
    }

    public String getAssesslevel() {
        return this.assesslevel;
    }
    
    public void setAssesslevel(String assesslevel) {
        this.assesslevel = assesslevel;
    }

    public String getEncouragement() {
        return this.encouragement;
    }
    
    public void setEncouragement(String encouragement) {
        this.encouragement = encouragement;
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