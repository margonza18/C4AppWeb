package com.unab.g53sql.Entity;

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
@Table(name = "registro_facturas") 
public class RegistroFacturas {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "referencia_pago", nullable = false)
    private String ReferenciaPago;
    
    @Column(name = "valor_total", nullable = true, unique = true)
    private String ValorTotal;
    
    @Column(name = "mes", nullable = false)
    private String Mes;
    
    @Column(name = "estado", nullable = false)
    private String Estado;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "numero_inmueble_id", nullable = false)
    private Inmuebles InmueblesId;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "coste_administracion_id", nullable = false)
    private CostesAdministraciones CostesAdministracionesId;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "bitacora_factura_id", nullable = false)
    private BitacorasFacturas BitacorasFacturasId ;
    
    
    
  //Encapsulamiento

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

	public String getValorTotal() {
		return ValorTotal;
	}

	public void setValorTotal(String valorTotal) {
		ValorTotal = valorTotal;
	}

	public String getMes() {
		return Mes;
	}

	public void setMes(String mes) {
		Mes = mes;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public Inmuebles getInmueblesId() {
		return InmueblesId;
	}

	public void setInmueblesId(Inmuebles inmueblesId) {
		InmueblesId = inmueblesId;
	}

	public CostesAdministraciones getCostesAdministracionesId() {
		return CostesAdministracionesId;
	}

	public void setCostesAdministracionesId(CostesAdministraciones costesAdministracionesId) {
		CostesAdministracionesId = costesAdministracionesId;
	}

	public BitacorasFacturas getBitacorasFacturasId() {
		return BitacorasFacturasId;
	}

	public void setBitacorasFacturasId(BitacorasFacturas bitacorasFacturasId) {
		BitacorasFacturasId = bitacorasFacturasId;
	}
    
    
    


    


	
    

	
    
    
    
}
