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
@Table(name = "registros_facturas") 
public class RegistrosFacturas {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "referencia_pago", length = 100)
    private String ReferenciaPago;
    
        @Column(name = "valor_total")
    private Double ValorTotal;
        
    @Column(name = "mes")
    private String Mes;
   
    @Column(name = "estado")
    private Boolean Estado;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "coste_administracion_id", nullable = false)
    private CostesAdministraciones CostesAdministracionesId;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "inmueble_id", nullable = false)
    private Inmuebles InmueblesId;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "bitacora_factura_id", nullable = false)
    private BitacorasFacturas BitacorasFacturasId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getReferenciaPago() {
		return ReferenciaPago;
	}

	public void setReferenciaPago(String referenciaPago) {
		ReferenciaPago = referenciaPago;
	}

	public Double getValorTotal() {
		return ValorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		ValorTotal = valorTotal;
	}

	public String getMes() {
		return Mes;
	}

	public void setMes(String mes) {
		Mes = mes;
	}

	public Boolean getEstado() {
		return Estado;
	}

	public void setEstado(Boolean estado) {
		Estado = estado;
	}

	public CostesAdministraciones getCostesAdministracionesId() {
		return CostesAdministracionesId;
	}

	public void setCostesAdministracionesId(CostesAdministraciones costesAdministracionesId) {
		CostesAdministracionesId = costesAdministracionesId;
	}

	public Inmuebles getInmueblesId() {
		return InmueblesId;
	}

	public void setInmueblesId(Inmuebles inmueblesId) {
		InmueblesId = inmueblesId;
	}

	public BitacorasFacturas getBitacorasFacturasId() {
		return BitacorasFacturasId;
	}

	public void setBitacorasFacturasId(BitacorasFacturas bitacorasFacturasId) {
		BitacorasFacturasId = bitacorasFacturasId;
	}

	
    
    
 
    
    
    
    

    
    
  
	
    
    
    
}