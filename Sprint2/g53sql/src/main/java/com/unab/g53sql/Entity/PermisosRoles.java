package com.unab.g53sql.Entity;



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
    private Integer idpermisos_roles;
	
  
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "permiso_id", nullable = false)
    private Permisos  permisosId;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "tipos_inmueble_id", nullable = false)
    private TiposInmuebles tiposInmueblesId;
    
    
    //Encapsulamiento
    
	
    
    
    
 

    

  
    
	

    
   
    
    
    
    



    
  

	
    
    
   
    
	
    
}
