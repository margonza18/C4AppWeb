package com.unab.BackendSqlG53.Entity;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "registros_servicios") 
public class RegistrosServicios {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "codigo", nullable = false, length = 45)
    private String Codigo;
    
    @Column(name = "nombre", nullable = false, length = 45)
    private String Nombre;
    
    @Column(name = "descripcion", nullable = true)
    private String Descripcion;
    
    @Column(name = "valor", nullable = false)
    private Double Valor;
    
    @Column(name = "estado", nullable = false)
    private Boolean Estado;

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

	public Double getValor() {
		return Valor;
	}

	public void setValor(Double valor) {
		Valor = valor;
	}

	public Boolean getEstado() {
		return Estado;
	}

	public void setEstado(Boolean estado) {
		Estado = estado;
	}
   
    
    
    
    

    
  
	
    
    
    
}