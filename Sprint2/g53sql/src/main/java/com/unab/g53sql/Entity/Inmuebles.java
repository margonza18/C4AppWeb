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
@Table(name = "inmuebles") 
public class Inmuebles {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "matricula_inmobiliaria", nullable = false)
    private String MatriculaInmobiliaria;

    @Column(name = "estado", nullable = false)
    private String Estado;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "usuario_duenio", nullable = false)
    private Usuarios   UsuariosId;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "ciudad_id", nullable = false)
    private Ciudades CiudadesId;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "tipos_inmuebles_id", nullable = false)
    private TiposInmuebles TiposInmueblesId ;
    
    
    
  //Encapsulamiento

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMatriculaInmobiliaria() {
		return MatriculaInmobiliaria;
	}

	public void setMatriculaInmobiliaria(String matriculaInmobiliaria) {
		MatriculaInmobiliaria = matriculaInmobiliaria;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public Usuarios getUsuariosId() {
		return UsuariosId;
	}

	public void setUsuariosId(Usuarios usuariosId) {
		UsuariosId = usuariosId;
	}

	public Ciudades getCiudadesId() {
		return CiudadesId;
	}

	public void setCiudadesId(Ciudades ciudadesId) {
		CiudadesId = ciudadesId;
	}

	public TiposInmuebles getTiposInmueblesId() {
		return TiposInmueblesId;
	}

	public void setTiposInmueblesId(TiposInmuebles tiposInmueblesId) {
		TiposInmueblesId = tiposInmueblesId;
	}
    
    
  

	



    
    
}
