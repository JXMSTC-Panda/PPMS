package ppms.domain;



/**
 * AbstractTbRolefunctionId entity provides the base persistence definition of the TbRolefunctionId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbRolefunctionId  implements java.io.Serializable {


    // Fields    

     private TbRole tbRole;
     private TbSystemfunction tbSystemfunction;


    // Constructors

    /** default constructor */
    public AbstractTbRolefunctionId() {
    }

    
    /** full constructor */
    public AbstractTbRolefunctionId(TbRole tbRole, TbSystemfunction tbSystemfunction) {
        this.tbRole = tbRole;
        this.tbSystemfunction = tbSystemfunction;
    }

   
    // Property accessors

    public TbRole getTbRole() {
        return this.tbRole;
    }
    
    public void setTbRole(TbRole tbRole) {
        this.tbRole = tbRole;
    }

    public TbSystemfunction getTbSystemfunction() {
        return this.tbSystemfunction;
    }
    
    public void setTbSystemfunction(TbSystemfunction tbSystemfunction) {
        this.tbSystemfunction = tbSystemfunction;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractTbRolefunctionId) ) return false;
		 AbstractTbRolefunctionId castOther = ( AbstractTbRolefunctionId ) other; 
         
		 return ( (this.getTbRole()==castOther.getTbRole()) || ( this.getTbRole()!=null && castOther.getTbRole()!=null && this.getTbRole().equals(castOther.getTbRole()) ) )
 && ( (this.getTbSystemfunction()==castOther.getTbSystemfunction()) || ( this.getTbSystemfunction()!=null && castOther.getTbSystemfunction()!=null && this.getTbSystemfunction().equals(castOther.getTbSystemfunction()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getTbRole() == null ? 0 : this.getTbRole().hashCode() );
         result = 37 * result + ( getTbSystemfunction() == null ? 0 : this.getTbSystemfunction().hashCode() );
         return result;
   }   





}