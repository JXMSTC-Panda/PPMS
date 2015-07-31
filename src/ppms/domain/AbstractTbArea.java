package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * AbstractTbArea entity provides the base persistence definition of the TbArea entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbArea  implements java.io.Serializable {


    // Fields    

     private BigDecimal areaid;
     private TbSubarea tbSubarea;
     private String areadesc;
     private Boolean status;
     private String createdby;
     private Date createdtime;
     private String modifiedby;
     private Date modifiedtime;
     private Set tbAreaorgrelations = new HashSet(0);
     private Set COrganizationNjs = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractTbArea() {
    }

	/** minimal constructor */
    public AbstractTbArea(BigDecimal areaid) {
        this.areaid = areaid;
    }
    
    /** full constructor */
    public AbstractTbArea(BigDecimal areaid, TbSubarea tbSubarea, String areadesc, Boolean status, String createdby, Date createdtime, String modifiedby, Date modifiedtime, Set tbAreaorgrelations, Set COrganizationNjs) {
        this.areaid = areaid;
        this.tbSubarea = tbSubarea;
        this.areadesc = areadesc;
        this.status = status;
        this.createdby = createdby;
        this.createdtime = createdtime;
        this.modifiedby = modifiedby;
        this.modifiedtime = modifiedtime;
        this.tbAreaorgrelations = tbAreaorgrelations;
        this.COrganizationNjs = COrganizationNjs;
    }

   
    // Property accessors

    public BigDecimal getAreaid() {
        return this.areaid;
    }
    
    public void setAreaid(BigDecimal areaid) {
        this.areaid = areaid;
    }

    public TbSubarea getTbSubarea() {
        return this.tbSubarea;
    }
    
    public void setTbSubarea(TbSubarea tbSubarea) {
        this.tbSubarea = tbSubarea;
    }

    public String getAreadesc() {
        return this.areadesc;
    }
    
    public void setAreadesc(String areadesc) {
        this.areadesc = areadesc;
    }

    public Boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(Boolean status) {
        this.status = status;
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

    public Set getTbAreaorgrelations() {
        return this.tbAreaorgrelations;
    }
    
    public void setTbAreaorgrelations(Set tbAreaorgrelations) {
        this.tbAreaorgrelations = tbAreaorgrelations;
    }

    public Set getCOrganizationNjs() {
        return this.COrganizationNjs;
    }
    
    public void setCOrganizationNjs(Set COrganizationNjs) {
        this.COrganizationNjs = COrganizationNjs;
    }
   








}