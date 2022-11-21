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
@Table(name = "costes_administraciones") 
public class CostesAdministraciones {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "codigo", nullable = false, unique = true)
    private String Codigo;
    
    @Column(name = "nombre")
    private String Nombre;
    
    @Column(name = "estado", nullable = false)
    private boolean Estado;
    
    @Column(name = "valorMes" )
    private double ValorMes;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "tipo_inmueble_id", nullable = false)
    private TiposInmuebles TiposInmueblesId;
    
    
    
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

	public boolean getEstado() {
		return Estado;
	}

	public void setEstado(boolean estado) {
		Estado = estado;
	}

	public double getValorMes() {
		return ValorMes;
	}

	public void setValorMes(double valorMes) {
		ValorMes = valorMes;
	}

	public TiposInmuebles getTiposInmueblesId() {
		return TiposInmueblesId;
	}

	public void setTiposInmueblesId(TiposInmuebles tiposInmueblesId) {
		TiposInmueblesId = tiposInmueblesId;
	}

	
    
}