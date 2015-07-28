package ppms.domain;

import java.util.Date;


/**
 * AbstractTbFreshemployeeexam entity provides the base persistence definition of the TbFreshemployeeexam entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbFreshemployeeexam  implements java.io.Serializable {


    // Fields    

     private String examid;
     private OrganizationNj organizationNj;
     private TbEmployee tbEmployee;
     private Date examdate;
     private String examstage;
     private Byte week;
     private Double examscore;
     private String createdby;
     private Date createdtime;
     private String modifiedby;
     private Date modifiedtime;


    // Constructors

    /** default constructor */
    public AbstractTbFreshemployeeexam() {
    }

	/** minimal constructor */
    public AbstractTbFreshemployeeexam(String examid) {
        this.examid = examid;
    }
    
    /** full constructor */
    public AbstractTbFreshemployeeexam(String examid, OrganizationNj organizationNj, TbEmployee tbEmployee, Date examdate, String examstage, Byte week, Double examscore, String createdby, Date createdtime, String modifiedby, Date modifiedtime) {
        this.examid = examid;
        this.organizationNj = organizationNj;
        this.tbEmployee = tbEmployee;
        this.examdate = examdate;
        this.examstage = examstage;
        this.week = week;
        this.examscore = examscore;
        this.createdby = createdby;
        this.createdtime = createdtime;
        this.modifiedby = modifiedby;
        this.modifiedtime = modifiedtime;
    }

   
    // Property accessors

    public String getExamid() {
        return this.examid;
    }
    
    public void setExamid(String examid) {
        this.examid = examid;
    }

    public OrganizationNj getOrganizationNj() {
        return this.organizationNj;
    }
    
    public void setOrganizationNj(OrganizationNj organizationNj) {
        this.organizationNj = organizationNj;
    }

    public TbEmployee getTbEmployee() {
        return this.tbEmployee;
    }
    
    public void setTbEmployee(TbEmployee tbEmployee) {
        this.tbEmployee = tbEmployee;
    }

    public Date getExamdate() {
        return this.examdate;
    }
    
    public void setExamdate(Date examdate) {
        this.examdate = examdate;
    }

    public String getExamstage() {
        return this.examstage;
    }
    
    public void setExamstage(String examstage) {
        this.examstage = examstage;
    }

    public Byte getWeek() {
        return this.week;
    }
    
    public void setWeek(Byte week) {
        this.week = week;
    }

    public Double getExamscore() {
        return this.examscore;
    }
    
    public void setExamscore(Double examscore) {
        this.examscore = examscore;
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