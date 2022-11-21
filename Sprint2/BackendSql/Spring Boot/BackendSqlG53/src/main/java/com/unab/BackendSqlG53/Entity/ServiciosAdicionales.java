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
@Table(name = "servicios_adicionales") 
public class ServiciosAdicionales {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "mes_cobro")
    private String MesCobro;
    
    @Column(name = "valor_mes")
    private Double valorMes;
      
    @Column(name = "estado")
    private Boolean Estado;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "registro_servicio_id", nullable = false)
    private RegistrosServicios RegistrosServiciosId;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "tipo_inmueble_id", nullable = false)
    private TiposInmuebles TiposInmueblesId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMesCobro() {
		return MesCobro;
	}

	public void setMesCobro(String mesCobro) {
		MesCobro = mesCobro;
	}

	public Double getValorMes() {
		return valorMes;
	}

	public void setValorMes(Double valorMes) {
		this.valorMes = valorMes;
	}

	public Boolean getEstado() {
		return Estado;
	}

	public void setEstado(Boolean estado) {
		Estado = estado;
	}

	public RegistrosServicios getRegistrosServiciosId() {
		return RegistrosServiciosId;
	}

	public void setRegistrosServiciosId(RegistrosServicios registrosServiciosId) {
		RegistrosServiciosId = registrosServiciosId;
	}

	public TiposInmuebles getTiposInmueblesId() {
		return TiposInmueblesId;
	}

	public void setTiposInmueblesId(TiposInmuebles tiposInmueblesId) {
		TiposInmueblesId = tiposInmueblesId;
	}

	
    
 
    
    
    
    

    
    
  
	
    
    
    
}
