package com.unab.g53sql.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registrar_servicios") 
public class RegistrarServicios {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
    @Column(name = "codigo", nullable = true)
    private String Codigo;
    
    @Column(name = "nombre", nullable = true)
    private String Nombre;
    
    @Column(name = "descripcion", nullable = true)
    private String Descripcion;
    
    @Column(name = "estado", nullable = true)
    private Boolean Estado;
    
    
  //Encapsulamiento

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Boolean getEstado() {
		return Estado;
	}

	public void setEstado(Boolean estado) {
		Estado = estado;
	}
    
    
    
    
    
	
    
    
 

    

  
    
	

    
   
    
    
    
    



    
  

	
    
    
   
    
	
    
}
