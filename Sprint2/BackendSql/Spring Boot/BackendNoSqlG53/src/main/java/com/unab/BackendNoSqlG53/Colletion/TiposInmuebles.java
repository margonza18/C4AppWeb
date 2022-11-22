package com.unab.BackendNoSqlG53.Colletion;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document ("tipos_inmuebles")
public class TiposInmuebles {

	@Id
    private String id;
    
    @Field(name = "codigo")
    private String codigo;
    
    @Field(name = "nombre")
    private String nombre;																																													   
       
    @Field(name = "descripcion")
    private String descripcion;
    
    @Field(name = "estado")
    private boolean	estado;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	
}
