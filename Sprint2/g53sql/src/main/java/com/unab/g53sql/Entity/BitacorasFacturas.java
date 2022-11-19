package com.unab.g53sql.Entity;

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
    
    @Column(name = "referencia_pago", nullable = false)
    private String ReferenciaPago;
    
    @Column(name = "estado_factura", nullable = true, unique = true)
    private String EstadoFactura;
    
    @Column(name = "fecha_pago", nullable = false)
    private String FechaPago;
    
    @Column(name = "referencia_codigo_banco", nullable = false)
    private String ReferenciaCodigoBanco;
    
    @Column(name = "estado", nullable = false)
    private String Estado;
    
    
    
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

	public String getEstadoFactura() {
		return EstadoFactura;
	}

	public void setEstadoFactura(String estadoFactura) {
		EstadoFactura = estadoFactura;
	}

	public String getFechaPago() {
		return FechaPago;
	}

	public void setFechaPago(String fechaPago) {
		FechaPago = fechaPago;
	}

	public String getReferenciaCodigoBanco() {
		return ReferenciaCodigoBanco;
	}

	public void setReferenciaCodigoBanco(String referenciaCodigoBanco) {
		ReferenciaCodigoBanco = referenciaCodigoBanco;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}
   

 
    
    
    
  

    

	
    
    
    
}
