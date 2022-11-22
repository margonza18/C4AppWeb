package com.unab.BackendNoSqlG53.Colletion;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document ("departamentos")
public class Departamentos {
	@Id
    private String id;
    
    @Field(name = "codigo")
    private String codigo;
    
    @Field(name = "nombre")
    private String nombre;
    
    @Field(name = "estado")
    private Boolean estado;

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

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

    

}
