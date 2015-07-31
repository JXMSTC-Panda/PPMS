package ppms.domain;

import java.util.Date;


/**
 * AbstractOperatorNj entity provides the base persistence definition of the OperatorNj entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOperatorNj  implements java.io.Serializable {


    // Fields    

     private Integer operatorid;
     private OrganizationNj organizationNj;
     private String name;
     private Boolean sex;
     private String addr;
     private String telephone;
     private String office;
     private Date createtime;
     private Date invalidtime;
     private Boolean statusid;
     private Byte maxlogintimes;
     private Byte currlogintimes;
     private Integer empno;
     private Boolean type;
     private String mobile;
     private Date changedate;


    // Constructors

    /** default constructor */
    public AbstractOperatorNj() {
    }

	/** minimal constructor */
    public AbstractOperatorNj(Integer operatorid) {
        this.operatorid = operatorid;
    }
    
    /** full constructor */
    public AbstractOperatorNj(Integer operatorid, OrganizationNj organizationNj, String name, Boolean sex, String addr, String telephone, String office, Date createtime, Date invalidtime, Boolean statusid, Byte maxlogintimes, Byte currlogintimes, Integer empno, Boolean type, String mobile, Date changedate) {
        this.operatorid = operatorid;
        this.organizationNj = organizationNj;
        this.name = name;
        this.sex = sex;
        this.addr = addr;
        this.telephone = telephone;
        this.office = office;
        this.createtime = createtime;
        this.invalidtime = invalidtime;
        this.statusid = statusid;
        this.maxlogintimes = maxlogintimes;
        this.currlogintimes = currlogintimes;
        this.empno = empno;
        this.type = type;
        this.mobile = mobile;
        this.changedate = changedate;
    }

   
    // Property accessors

    public Integer getOperatorid() {
        return this.operatorid;
    }
    
    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    public OrganizationNj getOrganizationNj() {
        return this.organizationNj;
    }
    
    public void setOrganizationNj(OrganizationNj organizationNj) {
        this.organizationNj = organizationNj;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSex() {
        return this.sex;
    }
    
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getAddr() {
        return this.addr;
    }
    
    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getOffice() {
        return this.office;
    }
    
    public void setOffice(String office) {
        this.office = office;
    }

    public Date getCreatetime() {
        return this.createtime;
    }
    
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getInvalidtime() {
        return this.invalidtime;
    }
    
    public void setInvalidtime(Date invalidtime) {
        this.invalidtime = invalidtime;
    }

    public Boolean getStatusid() {
        return this.statusid;
    }
    
    public void setStatusid(Boolean statusid) {
        this.statusid = statusid;
    }

    public Byte getMaxlogintimes() {
        return this.maxlogintimes;
    }
    
    public void setMaxlogintimes(Byte maxlogintimes) {
        this.maxlogintimes = maxlogintimes;
    }

    public Byte getCurrlogintimes() {
        return this.currlogintimes;
    }
    
    public void setCurrlogintimes(Byte currlogintimes) {
        this.currlogintimes = currlogintimes;
    }

    public Integer getEmpno() {
        return this.empno;
    }
    
    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public Boolean getType() {
        return this.type;
    }
    
    public void setType(Boolean type) {
        this.type = type;
    }

    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getChangedate() {
        return this.changedate;
    }
    
    public void setChangedate(Date changedate) {
        this.changedate = changedate;
    }
   








}