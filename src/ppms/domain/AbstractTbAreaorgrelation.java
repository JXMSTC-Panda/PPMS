package ppms.domain;

import java.util.Date;


/**
 * AbstractTbAreaorgrelation entity provides the base persistence definition of the TbAreaorgrelation entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbAreaorgrelation  implements java.io.Serializable {


    // Fields    

     private Integer areaorgid;
     private OrganizationNj organizationNj;
     private TbArea tbArea;
     private String createdby;
     private Date createdtime;
     private String modifiedby;
     private Date modifiedtime;


    // Constructors

    /** default constructor */
    public AbstractTbAreaorgrelation() {
    }

	/** minimal constructor */
    public AbstractTbAreaorgrelation(Integer areaorgid) {
        this.areaorgid = areaorgid;
    }
    
    /** full constructor */
    public AbstractTbAreaorgrelation(Integer areaorgid, OrganizationNj organizationNj, TbArea tbArea, String createdby, Date createdtime, String modifiedby, Date modifiedtime) {
        this.areaorgid = areaorgid;
        this.organizationNj = organizationNj;
        this.tbArea = tbArea;
        this.createdby = createdby;
        this.createdtime = createdtime;
        this.modifiedby = modifiedby;
        this.modifiedtime = modifiedtime;
    }

   
    // Property accessors

    public Integer getAreaorgid() {
        return this.areaorgid;
    }
    
    public void setAreaorgid(Integer areaorgid) {
        this.areaorgid = areaorgid;
    }

    public OrganizationNj getOrganizationNj() {
        return this.organizationNj;
    }
    
    public void setOrganizationNj(OrganizationNj organizationNj) {
        this.organizationNj = organizationNj;
    }

    public TbArea getTbArea() {
        return this.tbArea;
    }
    
    public void setTbArea(TbArea tbArea) {
        this.tbArea = tbArea;
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