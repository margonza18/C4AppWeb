package com.unab.BackendSqlG53.Entity;

import java.sql.Date;

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
@Table(name = "generar_notificaciones") 
public class GenerarNotificaciones {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "titulo")
    private String Titulo;
    
    @Column(name = "Contenido")
    private String Contenido;
    
    @Column(name = "fecha_inicio")
    private Date FechaInicio;
    
    @Column(name = "fecha_finalizacion")
    private Date FechaFinalizacion;
    
    @Column(name = "estado" )
    private Boolean Estado;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "usuario_administrador_id", nullable = false)
    private Usuarios UsuariosId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getContenido() {
		return Contenido;
	}

	public void setContenido(String contenido) {
		Contenido = contenido;
	}

	public Date getFechaInicio() {
		return FechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		FechaInicio = fechaInicio;
	}

	public Date getFechaFinalizacion() {
		return FechaFinalizacion;
	}

	public void setFechaFinalizacion(Date fechaFinalizacion) {
		FechaFinalizacion = fechaFinalizacion;
	}

	public Boolean getEstado() {
		return Estado;
	}

	public void setEstado(Boolean estado) {
		Estado = estado;
	}

	public Usuarios getUsuarioAdministradorId() {
		return UsuariosId;
	}

	public void setUsuarioAdministradorId(Usuarios usuarioAdministradorId) {
		UsuariosId = usuarioAdministradorId;
	}
    
    
    
    


	
    
  
	
    
    
    
}
