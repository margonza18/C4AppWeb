package com.unab.BackendNoSqlG53.Colletion;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document ("inmuebles")
public class Inmuebles {
	@Id
    private String id;
    
    @Field(name = "matricula_inmobiliaria")
    private String matriculaInmobiliaria;

    @Field(name = "estado")
    private Boolean estado;
    
    @DBRef Usuarios usuarioId;
    @DBRef Ciudades ciudadId;
    @DBRef TiposInmuebles tipoInmuebleId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMatriculaInmobiliaria() {
		return matriculaInmobiliaria;
	}
	public void setMatriculaInmobiliaria(String matriculaInmobiliaria) {
		this.matriculaInmobiliaria = matriculaInmobiliaria;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public Usuarios getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(Usuarios usuarioId) {
		this.usuarioId = usuarioId;
	}
	public Ciudades getCiudadId() {
		return ciudadId;
	}
	public void setCiudadId(Ciudades ciudadId) {
		this.ciudadId = ciudadId;
	}
	public TiposInmuebles getTipoInmuebleId() {
		return tipoInmuebleId;
	}
	public void setTipoInmuebleId(TiposInmuebles tipoInmuebleId) {
		this.tipoInmuebleId = tipoInmuebleId;
	}
    
   
}
