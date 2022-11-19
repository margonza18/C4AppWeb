package com.unab.g53sql.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "registros_facturas_registro_servicios") 
public class RegistrosFacturasRegistroServicios {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idregistros_facturas_registro_servicios;
	
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "registro_factura_id", nullable = false)
    private RegistroFacturas  RegistroFacturasId;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "valor_servicio_id", nullable = false)
    private RegistrarServicios RegistrarServiciosId;
    
    
    //Encapsulamiento
    
	
 

    

  
    
	

    
   
    
    
    
    



    
  

	
    
    
   
    
	
    
}
