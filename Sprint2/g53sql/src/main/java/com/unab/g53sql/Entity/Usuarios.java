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
@Table(name = "usuarios") 
public class Usuarios {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "usuario", nullable = true)
    private String Usuario;
    
    @Column(name = "contrasenia", nullable = true, unique = true)
    private String Contrasenia;
    
   
    @Column(name = "estado", nullable = false)
    private boolean Estado;
    
    
    //Conexion llave foranea
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "persona_id", nullable = false)
    private Personas PersonasId;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "rol_id", nullable = false)
    private Roles RolesId;

    
    
  //Encapsulamiento


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUsuario() {
		return Usuario;
	}


	public void setUsuario(String usuario) {
		Usuario = usuario;
	}


	public String getContrasenia() {
		return Contrasenia;
	}


	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}


	public boolean isEstado() {
		return Estado;
	}


	public void setEstado(boolean estado) {
		Estado = estado;
	}
    
    
  

	
    
    
   
    
	
    
}