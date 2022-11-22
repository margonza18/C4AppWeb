package com.unab.BackendSqlG53.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personas") 
public class Personas {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "tipo_documento", nullable = false)
    private String tipoDocumento;
    
    @Column(name = "documento", nullable = true, unique = true, length = 12)
    private String documento;
    
    @Column(name = "nombre_completo", nullable = false)
    private String nombreCompleto;
    
    @Column(name = "telefono", nullable = false, length = 20 )
    private String telefono;
    
    @Column(name = "correo", nullable = false)
    private String correo;
    
    @Column(name = "fecha_nacimiento", nullable = false)
    private Date  fechaNacimiento;
    
    @Column(name = "direccion", nullable = false)
    private String direccion;
    
    @Column(name = "estado", nullable = false)
    private boolean estado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
    
    
    
  
    
	
    
}
