package com.unab.BackendNoSqlG53.Colletion;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document ("datos_conjuntos")
public class DatosConjuntos {

	@Id
    private String id;
    
   @Field(name = "codigo")
    private String codigo;
    
   @Field(name = "nombre" )
    private String nombre;
    
   @Field(name = "direccion")
    private String direccion;
    
   @Field(name = "telefono" )
    private String telefono;
    
   @Field(name = "correo")
    private String correo;
    
   @Field(name = "estado")
    private boolean estado;
    
   
   
   
   
   @DBRef Ciudades ciudadId;
    @DBRef Usuarios usuarioId;
    
    
    
    
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public boolean getEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public Ciudades getCiudadId() {
		return ciudadId;
	}
	public void setCiudadId(Ciudades ciudadId) {
		this.ciudadId = ciudadId;
	}
	public Usuarios getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(Usuarios usuarioId) {
		this.usuarioId = usuarioId;
	}
    
    
   

	
}
