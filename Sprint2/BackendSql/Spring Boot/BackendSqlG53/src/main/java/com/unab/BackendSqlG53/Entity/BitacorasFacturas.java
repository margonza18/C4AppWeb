package com.unab.BackendSqlG53.Entity;

import java.sql.Date;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bitacoras_facturas") 
public class BitacorasFacturas {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "referencia_pago", nullable = false, length = 45)
    private String ReferenciaPago;
    
    @Column(name = "estado_factura", nullable = true)
    private String EstadoFactura;
    
    @Column(name = "fecha_pago", nullable = false)
    private Date FechaPago;
    
    @Column(name = "referencia_codigo_banco", nullable = false)
    private Double ReferenciaCodigoBanco;
    
    
    @Column(name = "estado", nullable = false)
    private Boolean Estado;


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


	public String getEstadoFactura() {
		return EstadoFactura;
	}


	public void setEstadoFactura(String estadoFactura) {
		EstadoFactura = estadoFactura;
	}


	public Date getFechaPago() {
		return FechaPago;
	}


	public void setFechaPago(Date fechaPago) {
		FechaPago = fechaPago;
	}


	public Double getReferenciaCodigoBanco() {
		return ReferenciaCodigoBanco;
	}


	public void setReferenciaCodigoBanco(Double referenciaCodigoBanco) {
		ReferenciaCodigoBanco = referenciaCodigoBanco;
	}


	public Boolean getEstado() {
		return Estado;
	}


	public void setEstado(Boolean estado) {
		Estado = estado;
	}
    
  
    
    
    
    
    
  
	
    
    
    
}