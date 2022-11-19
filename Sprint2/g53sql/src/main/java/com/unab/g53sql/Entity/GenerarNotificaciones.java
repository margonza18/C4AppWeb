package com.unab.g53sql.Entity;




import java.sql.Date;

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
@Table(name = "generar_notificaciones") 
public class GenerarNotificaciones {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "titulo", nullable = false)
    private String Titulo;
    
    @Column(name = "contenido", nullable = true, unique = true)
    private String Contenido;
    
    @Column(name = "fecha_inicio", nullable = false)
    private Date  FechaInicio;
    
    @Column(name = "fecha_finalizacion", nullable = false )
    private Date  FechaFinalizacion;
    
    @Column(name = "estado", nullable = false)
    private boolean Estado;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "usuarios_id", nullable = false)
    private Usuarios UsuariosId;
    
    
    
  //Encapsulamiento

	

	
    
    
  


   
    
	
    
}
