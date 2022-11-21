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
@Table(name = "datos_conjuntos") 
public class DatosConjuntos {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "codigo", nullable = false,unique = true, length = 45)
    private String Codigo;
    
    @Column(name = "nombre", nullable = true, unique = true)
    private String Nombre;
    
    @Column(name = "direccion", nullable = false)
    private String Direccion;
    
    @Column(name = "telefono", nullable = false, length = 20 )
    private String Telefono;
    
    @Column(name = "correo", nullable = false)
    private String Correo;
    
    @Column(name = "estado", nullable = false)
    private boolean Estado;
    
    
    
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "ciudad_id", nullable = false)
    private Ciudades  CiudadesId;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "usuario_administrador_id", nullable = false)
    private Usuarios UsuariosId;
    
    
    
    
    //Encapsulamiento

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

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public boolean getEstado() {
		return Estado;
	}

	public void setEstado(boolean estado) {
		Estado = estado;
	}

	public Ciudades getCiudadesId() {
		return CiudadesId;
	}

	public void setCiudadesId(Ciudades ciudadesId) {
		CiudadesId = ciudadesId;
	}

	public Usuarios getUsuariosId() {
		return UsuariosId;
	}

	public void setUsuariosId(Usuarios usuariosId) {
		UsuariosId = usuariosId;
	}
    
    
    
 
    
    

	
    
  

    
	
    
}