package com.unab.BackendSqlG53.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ciudades") 
public class Ciudades {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "codigo", nullable = false, length = 45)
    private String Codigo;
    
    @Column(name = "nombre", nullable = true)
    private String Nombre;
    
    @Column(name = "estado", nullable = false)
    private Boolean Estado;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "departamento_id", nullable = false)
    private Departamentos DepartamentosId;
    
    
    
    //

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

	public Boolean getEstado() {
		return Estado;
	}

	public void setEstado(Boolean estado) {
		Estado = estado;
	}

	public Departamentos getDepartamentosId() {
		return DepartamentosId;
	}

	public void setDepartamentosId(Departamentos departamentosId) {
		DepartamentosId = departamentosId;
	}
    
    
  
    

	
   
    
    
}