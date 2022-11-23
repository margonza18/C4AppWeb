 package com.unab.NoSQL.Collection;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document ("bitacoras")
public class Bitacoras {
	@Id
    private String id;
    
    @Field(name = "codigo")
    private String codigo;
    
    @Field(name = "descripcion")
    private String descripcion;
    
    @Field(name = "estado")
    private Boolean estado;
    
   @DBRef Inmuebles InmuebleId;

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

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public Boolean getEstado() {
	return estado;
}

public void setEstado(Boolean estado) {
	this.estado = estado;
}

public Inmuebles getInmuebleId() {
	return InmuebleId;
}

public void setInmuebleId(Inmuebles inmuebleId) {
	InmuebleId = inmuebleId;
}

}
