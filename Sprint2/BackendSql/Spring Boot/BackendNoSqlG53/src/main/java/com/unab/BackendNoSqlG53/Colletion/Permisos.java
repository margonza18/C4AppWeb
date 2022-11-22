package com.unab.BackendNoSqlG53.Colletion;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document ("permisos")
public class Permisos {
	@Id
    private String id;
    
    @Field(name = "nombre")
    private String nombre;
    
    @Field(name = "descripcion")
    private String descripcion;
    
    @Field(name = "ruta")
    private String ruta;
   
    @Field(name = "estado")
    private boolean estado;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	
}
