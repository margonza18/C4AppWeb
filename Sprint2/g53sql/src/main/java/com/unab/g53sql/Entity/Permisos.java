package com.unab.g53sql.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "permisos") 
public class Permisos {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "nombre", nullable = true)
    private String Nombre;
    
    @Column(name = "descripcion", nullable = true)
    private String Descripcion;
    
    @Column(name = "ruta", nullable = false)
    private boolean Ruta;
   
    @Column(name = "estado", nullable = false)
    private boolean Estado;
    
    
    
    //Encapsulamiento

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public boolean isRuta() {
		return Ruta;
	}

	public void setRuta(boolean ruta) {
		Ruta = ruta;
	}

	public boolean isEstado() {
		return Estado;
	}

	public void setEstado(boolean estado) {
		Estado = estado;
	}
    
    

  
    
	

    
   
    
    
    
    



    
  

	
    
    
   
    
	
    
}
