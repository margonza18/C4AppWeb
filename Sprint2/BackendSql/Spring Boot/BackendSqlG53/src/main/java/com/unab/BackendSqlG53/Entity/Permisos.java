package com.unab.BackendSqlG53.Entity;

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
    
    @Column(name = "nombre", nullable = true, length = 45)
    private String Nombre;
    
    @Column(name = "descripcion", nullable = true, length = 100)
    private String Descripcion;
    
    @Column(name = "ruta", nullable = false, length = 100)
    private String Ruta;
   
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

	public String getRuta() {
		return Ruta;
	}

	public void setRuta(String ruta) {
		Ruta = ruta;
	}

	public boolean getEstado() {
		return Estado;
	}

	public void setEstado(boolean estado) {
		Estado = estado;
	}
    
    
    
    

	
    

  
    
	

    
   
    
    
    
    



    
  

	
    
    
   
    
	
    
}
