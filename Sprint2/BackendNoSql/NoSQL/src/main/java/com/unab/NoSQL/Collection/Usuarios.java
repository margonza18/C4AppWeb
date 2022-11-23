package com.unab.NoSQL.Collection;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document ("usuarios")
public class Usuarios {
	@Id
    private String id;
    
    @Field(name = "usuario")
    private String usuario;
    
    @Field(name = "contrasenia")
    private String contrasenia;
    
   
    @Field(name = "estado")
    private boolean estado;
    
    @DBRef Personas personaId;
    @DBRef Roles rolId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public boolean getEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public Personas getPersonaId() {
		return personaId;
	}
	public void setPersonaId(Personas personaId) {
		this.personaId = personaId;
	}
	public Roles getRolId() {
		return rolId;
	}
	public void setRolId(Roles rolId) {
		this.rolId = rolId;
	}
    
}
