package com.unab.BackendSqlG53.Entity;



import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "permisos_roles") 
public class PermisosRoles {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
  
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "permiso_id", nullable = false)
    private Permisos  PermisosId;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "rol_id", nullable = false)
    private Roles RolesId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Permisos getPermisosId() {
		return PermisosId;
	}

	public void setPermisosId(Permisos permisosId) {
		PermisosId = permisosId;
	}

	public Roles getRolesId() {
		return RolesId;
	}

	public void setRolesId(Roles rolesId) {
		RolesId = rolesId;
	}
    
    
    
    
 
    
    
    
 

    

  
    
	

    
   
    
    
    
    



    
  

	
    
    
   
    
	
    
}
